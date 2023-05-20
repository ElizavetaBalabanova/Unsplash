package com.intermedia.intermedia.ui.photo.detail

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import by.kirich1409.viewbindingdelegate.viewBinding
import com.intermedia.intermedia.data.photo.model.Tag
import com.intermedia.intermedia.databinding.ItemPhotoTagBinding

class TagViewHolder(parent: View) : RecyclerView.ViewHolder(parent) {

    private val binding: ItemPhotoTagBinding by viewBinding()

    fun bind(
        tag: Tag?,
        callback: TagAdapter.ItemEventCallback
    ) {
        with(binding) {
            tag?.title?.let { title ->
                tagChip.text = title
                itemView.setOnClickListener { callback.onTagClick(title) }
            }
        }
    }
}
