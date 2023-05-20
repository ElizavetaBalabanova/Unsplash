package com.intermedia.intermedia.ui.autowallpaper.collections

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import by.kirich1409.viewbindingdelegate.viewBinding
import com.intermedia.intermedia.data.autowallpaper.model.AutoWallpaperCollection
import com.intermedia.intermedia.databinding.ItemAutoWallpaperSelectedCollectionBinding
import com.intermedia.intermedia.util.loadPhotoUrl

class SelectedAutoWallpaperCollectionViewHolder(parent: View) : RecyclerView.ViewHolder(parent) {

    private val binding: ItemAutoWallpaperSelectedCollectionBinding by viewBinding()

    fun bind(
        collection: AutoWallpaperCollection?,
        callback: AutoWallpaperCollectionListAdapter.ItemEventCallback
    ) {
        with(binding) {
            collection?.let {
                collectionNameTextView.text = collection.title
                collection.cover_photo?.let { collectionImageView.loadPhotoUrl(it) }
                collectionCardView.setOnClickListener {
                    callback.onCollectionClick(collection.id)
                }
                removeButton.setOnClickListener {
                    callback.onRemoveClick(collection.id)
                }
            }
        }
    }
}
