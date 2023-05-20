package com.intermedia.intermedia.data.search.model

import com.intermedia.intermedia.data.collection.model.Collection
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class SearchCollectionsResult(
    val total: Int,
    val total_pages: Int,
    val results: List<Collection>
)
