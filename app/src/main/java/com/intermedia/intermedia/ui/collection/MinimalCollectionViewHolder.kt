package com.intermedia.intermedia.ui.collection

import android.view.View
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import by.kirich1409.viewbindingdelegate.viewBinding
import com.intermedia.intermedia.R
import com.intermedia.intermedia.data.collection.model.Collection
import com.intermedia.intermedia.databinding.ItemCollectionMinimalBinding
import com.intermedia.intermedia.util.getPhotoUrl
import com.intermedia.intermedia.util.loadPhotoUrlWithThumbnail

class MinimalCollectionViewHolder(parent: View) : RecyclerView.ViewHolder(parent) {

    private val binding: ItemCollectionMinimalBinding by viewBinding()

    fun bind(
        collection: Collection?,
        loadQuality: String?,
        callback: CollectionAdapter.ItemEventCallback
    ) {
        with(binding) {
            collection?.let {
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
