package com.intermedia.intermedia.ui.photo

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import by.kirich1409.viewbindingdelegate.viewBinding
import com.intermedia.intermedia.data.photo.model.Photo
import com.intermedia.intermedia.databinding.ItemPhotoMinimalBinding
import com.intermedia.intermedia.util.getPhotoUrl
import com.intermedia.intermedia.util.loadPhotoUrlWithThumbnail
import com.intermedia.intermedia.util.setAspectRatio

class MinimalPhotoViewHolder(parent: View) : RecyclerView.ViewHolder(parent) {

    private val binding: ItemPhotoMinimalBinding by viewBinding()

    fun bind(
        photo: Photo?,
        loadQuality: String?,
        longPressDownload: Boolean,
        callback: PhotoAdapter.ItemEventCallback
    ) {
        with(binding) {
            photo?.let {
                val url = getPhotoUrl(photo, loadQuality)
                photoImageView.setAspectRatio(photo.width, photo.height)
                photoImageView.loadPhotoUrlWithThumbnail(url, photo.urls.thumb, photo.color)
                photoImageView.setOnClickListener { callback.onPhotoClick(photo) }
                if (longPressDownload) {
                    photoImageView.setOnLongClickListener {
                        callback.onLongClick(photo, checkAnimationView)
                        true
                    }
                }
            }
        }
    }
}
