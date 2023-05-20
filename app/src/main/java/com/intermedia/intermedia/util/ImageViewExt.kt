package com.intermedia.intermedia.util

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.Drawable
import android.widget.ImageView
import com.intermedia.intermedia.GlideApp
import com.intermedia.intermedia.R
import com.intermedia.intermedia.data.photo.model.Photo
import com.intermedia.intermedia.data.user.model.User
import com.intermedia.intermedia.ui.widget.AspectRatioImageView
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import com.bumptech.glide.request.RequestListener
import com.bumptech.glide.request.RequestOptions
import jp.wasabeef.glide.transformations.BlurTransformation

const val CROSS_FADE_DURATION = 350

fun ImageView.loadPhotoUrl(
    url: String,
    colorInt: Int? = null,
    colorString: String? = null,
    requestListener: RequestListener<Drawable>? = null
) {
    colorInt?.let { background = ColorDrawable(it) }
    colorString?.let { background = ColorDrawable(Color.parseColor(it)) }
    GlideApp.with(context)
        .load(url)
        .transition(DrawableTransitionOptions.withCrossFade(CROSS_FADE_DURATION))
        .addListener(requestListener)
        .into(this)
        .clearOnDetach()
}

fun ImageView.loadPhotoUrlWithThumbnail(
    url: String,
    thumbnailUrl: String,
    color: String?,
    centerCrop: Boolean = false,
    requestListener: RequestListener<Drawable>? = null
) {
    color?.let { background = ColorDrawable(Color.parseColor(it)) }
    GlideApp.with(context)
        .load(url)
        .thumbnail(
            if (centerCrop) {
                GlideApp.with(context).load(thumbnailUrl).centerCrop()
            } else {
                GlideApp.with(context).load(thumbnailUrl)
            }
        )
        .transition(DrawableTransitionOptions.withCrossFade(CROSS_FADE_DURATION))
        .addListener(requestListener)
        .into(this)
        .clearOnDetach()
}

fun ImageView.loadPhotoWithBlurHash(
    photo: Photo
) {
    if (photo.width != null && photo.height != null) {
        setImageBitmap(
            BlurHashDecoder.decode(photo.blur_hash, photo.width, photo.height, useCache = false)
        )
    }
}

fun ImageView.loadBlurredImage(
    url: String,
    color: String? = null,
    requestListener: RequestListener<Drawable>? = null
) {
    color?.let { background = ColorDrawable(Color.parseColor(it)) }
    GlideApp.with(context)
        .load(url)
        .transition(DrawableTransitionOptions.withCrossFade(CROSS_FADE_DURATION))
        .addListener(requestListener)
        .apply(RequestOptions.bitmapTransform(BlurTransformation()))
        .into(this)
        .clearOnDetach()
}

fun ImageView.loadProfilePicture(user: User) {
    loadProfilePicture(user.profile_image?.large)
}

fun ImageView.loadProfilePicture(url: String?) {
    GlideApp.with(context)
        .load(url)
        .placeholder(R.drawable.user_profile_picture_small_placeholder)
        .circleCrop()
        .transition(DrawableTransitionOptions.withCrossFade(CROSS_FADE_DURATION))
        .into(this)
        .clearOnDetach()
}

fun AspectRatioImageView.setAspectRatio(width: Int?, height: Int?) {
    if (width != null && height != null) {
        aspectRatio = height.toDouble() / width.toDouble()
    }
}
