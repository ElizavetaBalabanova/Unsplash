package com.intermedia.intermedia.ui.autowallpaper.history

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import by.kirich1409.viewbindingdelegate.viewBinding
import com.intermedia.intermedia.R
import com.intermedia.intermedia.databinding.ActivityAutoWallpaperHistoryBinding
import com.intermedia.intermedia.ui.base.BaseActivity
import com.intermedia.intermedia.ui.photo.detail.PhotoDetailActivity
import com.intermedia.intermedia.ui.user.UserActivity
import com.intermedia.intermedia.ui.widget.recyclerview.SpacingItemDecoration
import com.intermedia.intermedia.util.RECYCLER_VIEW_CACHE_SIZE
import com.intermedia.intermedia.util.setupActionBar
import org.koin.androidx.viewmodel.ext.android.viewModel

class AutoWallpaperHistoryActivity :
    BaseActivity(R.layout.activity_auto_wallpaper_history),
    AutoWallpaperHistoryAdapter.ItemEventCallback {

    override val viewModel: AutoWallpaperHistoryViewModel by viewModel()

    override val binding: ActivityAutoWallpaperHistoryBinding by viewBinding()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setupActionBar(R.id.toolbar) {
            setTitle(R.string.auto_wallpaper_history_title)
            setDisplayHomeAsUpEnabled(true)
        }

        val wallpaperHistoryAdapter = AutoWallpaperHistoryAdapter(this, sharedPreferencesRepository)

        binding.recyclerView.apply {
            adapter = wallpaperHistoryAdapter
            layoutManager = LinearLayoutManager(this@AutoWallpaperHistoryActivity).apply {
                addItemDecoration(SpacingItemDecoration(this@AutoWallpaperHistoryActivity, R.dimen.keyline_7))
            }
            setItemViewCacheSize(RECYCLER_VIEW_CACHE_SIZE)
        }

        viewModel.wallpaperHistoryLiveData.observe(this) {
            wallpaperHistoryAdapter.submitList(it)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_auto_wallpaper_history, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_clear_history -> {
                viewModel.clearAllWallpaperHistory()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun onPhotoClick(id: String) {
        Intent(this, PhotoDetailActivity::class.java).apply {
            putExtra(PhotoDetailActivity.EXTRA_PHOTO_ID, id)
            startActivity(this)
        }
    }

    override fun onUserClick(username: String) {
        Intent(this, UserActivity::class.java).apply {
            putExtra(UserActivity.EXTRA_USERNAME, username)
            startActivity(this)
        }
    }
}
