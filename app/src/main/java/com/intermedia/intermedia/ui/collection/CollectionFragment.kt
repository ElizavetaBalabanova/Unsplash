package com.intermedia.intermedia.ui.collection

import android.content.Intent
import androidx.recyclerview.widget.RecyclerView
import com.intermedia.intermedia.R
import com.intermedia.intermedia.data.collection.model.Collection
import com.intermedia.intermedia.data.user.model.User
import com.intermedia.intermedia.ui.base.BaseSwipeRecyclerViewFragment
import com.intermedia.intermedia.ui.collection.detail.CollectionDetailActivity
import com.intermedia.intermedia.ui.user.UserActivity
import com.intermedia.intermedia.ui.user.UserCollectionFragment

abstract class CollectionFragment : BaseSwipeRecyclerViewFragment<Collection, RecyclerView.ViewHolder>() {

    abstract override val pagedListAdapter: CollectionAdapter

    val itemEventCallback = object : CollectionAdapter.ItemEventCallback {

        override fun onCollectionClick(collection: Collection) {
            val intent = Intent(context, CollectionDetailActivity::class.java).apply {
                putExtra(CollectionDetailActivity.EXTRA_COLLECTION, collection)
            }
            startActivityForResult(intent, UserCollectionFragment.RESULT_CODE_USER_COLLECTION_UPDATE)
        }

        override fun onUserClick(user: User) {
            Intent(context, UserActivity::class.java).apply {
                putExtra(UserActivity.EXTRA_USER, user)
                startActivity(this)
            }
        }
    }
    override val emptyStateTitle: String
        get() = getString(R.string.empty_state_title)

    override val emptyStateSubtitle: String
        get() = ""

    override val itemSpacing: Int
        get() = resources.getDimensionPixelSize(R.dimen.keyline_7)
}
