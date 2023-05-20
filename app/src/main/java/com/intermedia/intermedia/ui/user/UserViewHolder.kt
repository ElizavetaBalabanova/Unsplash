package com.intermedia.intermedia.ui.user

import android.view.View
import androidx.core.content.ContextCompat
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import by.kirich1409.viewbindingdelegate.viewBinding
import com.intermedia.intermedia.GlideApp
import com.intermedia.intermedia.R
import com.intermedia.intermedia.data.user.model.User
import com.intermedia.intermedia.databinding.ItemUserDefaultBinding
import com.intermedia.intermedia.util.loadPhotoUrl
import com.intermedia.intermedia.util.loadProfilePicture

class UserViewHolder(parent: View) : RecyclerView.ViewHolder(parent) {

    private val binding: ItemUserDefaultBinding by viewBinding()

    fun bind(
        user: User?,
        callback: UserAdapter.ItemEventCallback
    ) {
        with(binding) {
            user?.let {
                userImageView.loadProfilePicture(user)
                fullNameTextView.text = user.name ?: itemView.context.getString(R.string.unknown)
                usernameTextView.text =
                    itemView.context.getString(R.string.username_template,
                        user.username ?: itemView.context.getString(R.string.unknown))
                itemView.setOnClickListener { callback.onUserClick(user) }
                user.photos?.let { photos ->
                    val imageViews =
                        listOf(photoOneImageView, photoTwoImageView, photoThreeImageView)
                    val cardViews =
                        listOf(photoOneCardView, photoTwoCardView, photoThreeCardView)
                    if (photos.isNotEmpty()) {
                        imageViews.forEachIndexed { index, imageView ->
                            photos.getOrNull(index)?.let { photo ->
                                imageView.loadPhotoUrl(
                                    photo.urls.small,
                                    ContextCompat.getColor(itemView.context, R.color.grey_400)
                                )
                                imageView.setOnClickListener { callback.onPhotoClick(photo) }
                            } ?: run {
                                GlideApp.with(itemView.context).clear(imageView)
                                imageView.setOnClickListener(null)
                            }
                        }
                    }
                    cardViews.forEach { it.isVisible = photos.isNotEmpty() }
                }
            }
        }
    }
}
