package com.intermedia.intermedia.ui.collection

import android.view.View
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import by.kirich1409.viewbindingdelegate.viewBinding
import com.intermedia.intermedia.R
import com.intermedia.intermedia.data.collection.model.Collection
import com.intermedia.intermedia.databinding.ItemCollectionDefaultBinding
import com.intermedia.intermedia.util.getPhotoUrl
import com.intermedia.intermedia.util.loadPhotoUrlWithThumbnail
import com.intermedia.intermedia.util.loadProfilePicture
import com.intermedia.intermedia.util.margin

class DefaultCollectionViewHolder(parent: View) : RecyclerView.ViewHolder(parent) {

    private val binding: ItemCollectionDefaultBinding by viewBinding()

    fun bind(
        collection: Collection?,
        loadQuality: String?,
        showUser: Boolean,
        callback: CollectionAdapter.ItemEventCallback
    ) {
        with(binding) {
            collection?.let {
                if (showUser) {
                    itemView.margin(bottom = itemView.resources.getDimensionPixelSize(R.dimen.keyline_6))
                    collection.user?.let { user ->
                        userContainer.isVisible = true
                        userContainer.setOnClickListener { callback.onUserClick(user) }
                        userImageView.loadProfilePicture(user)
                        userTextView.text = user.name ?: itemView.context.getString(R.string.unknown)
                    }
                }
                collection.cover_photo?.let { photo ->
                    val url = getPhotoUrl(photo, loadQuality)
                    collectionImageView.minimumHeight = itemView.resources.getDimensionPixelSize(R.dimen.collection_max_height)
                    collectionImageView.loadPhotoUrlWithThumbnail(url, photo.urls.thumb, photo.color, true)
                }
                collectionNameTextView.text = collection.title
                collectionCountTextView.text = itemView.resources.getQuantityString(
                    R.plurals.photos,
                    collection.total_photos,
                    collection.total_photos
                )
                collectionPrivateIcon.isVisible = collection.private ?: false
                itemView.setOnClickListener { callback.onCollectionClick(collection) }
            }
        }
    }
}
