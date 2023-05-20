package com.intermedia.intermedia.ui.search

import android.annotation.SuppressLint
import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.view.View
import com.intermedia.intermedia.R
import com.intermedia.intermedia.data.photo.model.Photo
import com.intermedia.intermedia.data.user.model.User
import com.intermedia.intermedia.ui.base.BaseSwipeRecyclerViewFragment
import com.intermedia.intermedia.ui.photo.detail.PhotoDetailActivity
import com.intermedia.intermedia.ui.user.UserActivity
import com.intermedia.intermedia.ui.user.UserAdapter
import com.intermedia.intermedia.ui.user.UserViewHolder
import org.koin.androidx.viewmodel.ext.android.sharedViewModel

class SearchUserFragment : BaseSwipeRecyclerViewFragment<User, UserViewHolder>() {

    private val sharedViewModel: SearchViewModel by sharedViewModel()

    private val itemEventCallback = object : UserAdapter.ItemEventCallback {

        override fun onUserClick(user: User) {
            Intent(context, UserActivity::class.java).apply {
                putExtra(UserActivity.EXTRA_USER, user)
                startActivity(this)
            }
        }

        override fun onPhotoClick(photo: Photo) {
            Intent(context, PhotoDetailActivity::class.java).apply {
                putExtra(PhotoDetailActivity.EXTRA_PHOTO, photo)
                startActivity(this)
            }
        }
    }

    override val pagedListAdapter = UserAdapter(itemEventCallback)

    override val emptyStateTitle: String
        get() = getString(R.string.empty_state_title)

    override val emptyStateSubtitle: String
        get() = getString(R.string.no_search_results_subtitle)

    override val itemSpacing: Int
        get() = 0

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.swipeRefreshLayout.isEnabled = false
    }

    override fun observeEvents() {
        with(sharedViewModel) {
            usersRefreshStateLiveData.observe(viewLifecycleOwner) { updateRefreshState(it) }
            usersNetworkStateLiveData.observe(viewLifecycleOwner) { updateNetworkState(it) }
            usersLiveData.observe(viewLifecycleOwner) { updatePagedList(it) }
        }
    }

    @SuppressLint("MissingSuperCall")
    override fun onConfigurationChanged(newConfig: Configuration) {
        // Do nothing
    }

    companion object {

        fun newInstance() = SearchUserFragment()
    }
}
