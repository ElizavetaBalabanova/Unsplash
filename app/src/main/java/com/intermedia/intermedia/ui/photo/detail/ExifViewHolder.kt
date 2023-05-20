package com.intermedia.intermedia.ui.photo.detail

import android.text.SpannableStringBuilder
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import by.kirich1409.viewbindingdelegate.viewBinding
import com.intermedia.intermedia.databinding.ItemPhotoExifBinding

class ExifViewHolder(parent: View) : RecyclerView.ViewHolder(parent) {

    private val binding: ItemPhotoExifBinding by viewBinding()

    fun bind(
        titleRes: Int,
        value: SpannableStringBuilder
    ) {
        with(binding) {
            exifTitleTextView.setText(titleRes)
            exifValueTextView.text = value
        }
    }
}
