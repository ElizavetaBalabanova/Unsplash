package com.intermedia.intermedia.data.collection.model

import android.os.Parcelable
import com.intermedia.intermedia.data.photo.model.Photo
import com.squareup.moshi.JsonClass
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
data class CollectionPhotoResult(
    val photo: Photo?,
    val collection: Collection?
) : Parcelable
