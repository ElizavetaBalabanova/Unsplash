package com.intermedia.intermedia.data.search.model

import com.intermedia.intermedia.data.photo.model.Photo
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class SearchPhotosResult(
    val total: Int,
    val total_pages: Int,
    val results: List<Photo>
)
