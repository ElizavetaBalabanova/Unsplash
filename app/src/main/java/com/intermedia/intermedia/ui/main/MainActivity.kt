package com.intermedia.intermedia.ui.main

import android.content.Context
import android.content.Intent
import android.graphics.Insets.add
import android.net.Uri
import android.os.Bundle
import android.util.SparseArray
import android.view.Menu
import android.view.MenuItem
import android.view.ViewGroup
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import by.kirich1409.viewbindingdelegate.viewBinding
import com.intermedia.intermedia.BuildConfig
import com.intermedia.intermedia.R
import com.intermedia.intermedia.databinding.ActivityMainBinding
import com.intermedia.intermedia.domain.collection.CollectionDataSource
import com.intermedia.intermedia.domain.photo.PhotoDataSource
import com.intermedia.intermedia.ui.base.BaseActivity
import com.intermedia.intermedia.ui.base.BaseSwipeRecyclerViewFragment
import com.intermedia.intermedia.ui.debug.DebugActivity
import com.intermedia.intermedia.ui.login.LoginActivity
import com.intermedia.intermedia.ui.search.SearchActivity
import com.intermedia.intermedia.ui.settings.SettingsActivity
import com.intermedia.intermedia.ui.user.UserActivity
import com.intermedia.intermedia.ui.user.edit.EditProfileActivity
import com.intermedia.intermedia.util.CustomTabsHelper
import com.intermedia.intermedia.util.livedata.observeEvent
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.google.android.material.tabs.TabLayout
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : BaseActivity(R.layout.activity_main) {

    override val viewModel: MainViewModel by viewModel()

    override val binding: ActivityMainBinding by viewBinding()

    override fun onCreate(savedInstanceState: Bundle?) {
        installSplashScreen()
        super.onCreate(savedInstanceState)

        with(binding) {
            setSupportActionBar(bottomAppBar)

            val fragmentPagerAdapter =
                MainFragmentPagerAdapter(this@MainActivity, supportFragmentManager)
            viewPager.adapter = fragmentPagerAdapter
            tabLayout.apply {
                setupWithViewPager(viewPager)
                addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
                    override fun onTabSelected(tab: TabLayout.Tab?) {}
                    override fun onTabUnselected(tab: TabLayout.Tab?) {}
                    override fun onTabReselected(tab: TabLayout.Tab?) {
                        fragmentPagerAdapter.getFragment(tab?.position ?: 0)?.scrollToTop()
                    }
                })
            }

//            uploadFab.setOnClickListener { openUnsplashSubmitTab() }
        }

        viewModel.navigationItemSelectedLiveData.observeEvent(this) {
            onBottomNavigationDrawerItemSelected(it)
        }
    }

    override fun onStart() {
        super.onStart()
        viewModel.refreshUserProfile()
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onPrepareOptionsMenu(menu: Menu?): Boolean {
        menu?.findItem(R.id.action_debug)?.isVisible = BuildConfig.DEBUG
        return super.onPrepareOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            android.R.id.home -> {
                showBottomDrawer()
                true
            }
            R.id.action_search -> {
                startActivity(Intent(this, SearchActivity::class.java))
                true
            }
            R.id.action_order -> {
                when (binding.tabLayout.selectedTabPosition) {
                    0 -> showPhotoOrderDialog()
                    1 -> showCollectionOrderDialog()
                }
                true
            }
            R.id.action_debug -> {
                startActivity(Intent(this, DebugActivity::class.java))
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun showBottomDrawer() {
        MainBottomNavigationDrawer
            .newInstance()
            .show(supportFragmentManager, MainBottomNavigationDrawer.TAG)
    }

    private fun onBottomNavigationDrawerItemSelected(actionId: Int) {
        when (actionId) {
            R.id.action_add_account -> startActivity(Intent(this, LoginActivity::class.java))
            R.id.action_view_profile -> {
                Intent(this, UserActivity::class.java).apply {
                    putExtra(UserActivity.EXTRA_USERNAME, viewModel.usernameLiveData.value)
                    startActivity(this)
                }
            }
            R.id.action_edit_profile -> {
                Intent(this, EditProfileActivity::class.java).apply {
                    putExtra(EditProfileActivity.EXTRA_USERNAME, viewModel.usernameLiveData.value)
                    startActivity(this)
                }
            }
            R.id.action_log_out -> viewModel.logout()
            R.id.action_settings -> startActivity(Intent(this, SettingsActivity::class.java))
        }
        (supportFragmentManager.findFragmentByTag(MainBottomNavigationDrawer.TAG)
                as? MainBottomNavigationDrawer)?.dismiss()
    }

    private fun showPhotoOrderDialog() {
        val orderOptions = enumValues<PhotoDataSource.Companion.Order>()
            .map { getString(it.titleRes) }.toTypedArray()
        val currentSelection = viewModel.photoOrderLiveData.value?.ordinal ?: 0
        MaterialAlertDialogBuilder(this)
            .setTitle(R.string.sort_by)
            .setSingleChoiceItems(orderOptions, currentSelection) { dialog, which ->
                if (which != currentSelection) viewModel.orderPhotosBy(which)
                dialog.dismiss()
            }
            .create()
            .show()
    }

    private fun showCollectionOrderDialog() {
        val orderOptions = enumValues<CollectionDataSource.Companion.Order>()
            .map { getString(it.titleRes) }.toTypedArray()
        val currentSelection = viewModel.collectionOrderLiveData.value?.ordinal ?: 0
        MaterialAlertDialogBuilder(this)
            .setTitle(R.string.sort_by)
            .setSingleChoiceItems(orderOptions, currentSelection) { dialog, which ->
                if (which != currentSelection) viewModel.orderCollectionsBy(which)
                dialog.dismiss()
            }
            .create()
            .show()
    }

    private fun openUnsplashSubmitTab() {
        val uri = if (viewModel.isUserLoggedIn()) {
            Uri.parse(getString(R.string.unsplash_authed_submit_url))
        } else {
            Uri.parse(getString(R.string.unsplash_unauthed_submit_url))
        }
        CustomTabsHelper.openCustomTab(this, uri, sharedPreferencesRepository.theme)
    }

    private class MainFragmentPagerAdapter(
        private val context: Context,
        private val fm: FragmentManager
    ) : FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

        private val fragmentTags = SparseArray<String>()

        enum class MainFragment(val titleRes: Int) {
            HOME(R.string.home),
            COLLECTION(R.string.collections)
        }

        fun getFragment(position: Int) =
            fm.findFragmentByTag(fragmentTags.get(position)) as? BaseSwipeRecyclerViewFragment<*, *>

        private fun getItemType(position: Int) = MainFragment.values()[position]

        override fun getItem(position: Int): Fragment {
            return when (getItemType(position)) {
                MainFragment.HOME -> MainPhotoFragment.newInstance()
                MainFragment.COLLECTION -> MainCollectionFragment.newInstance()
            }
        }

        override fun instantiateItem(container: ViewGroup, position: Int): Any {
            val fragment = super.instantiateItem(container, position)
            (fragment as? Fragment)?.tag?.let { fragmentTags.put(position, it) }
            return fragment
        }

        override fun getPageTitle(position: Int) = context.getString(getItemType(position).titleRes)

        override fun getCount() = MainFragment.values().size
    }
}
