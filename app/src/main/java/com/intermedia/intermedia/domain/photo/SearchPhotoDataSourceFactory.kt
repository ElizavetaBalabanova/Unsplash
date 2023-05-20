package com.intermedia.intermedia.domain.photo

import com.intermedia.intermedia.data.photo.model.Photo
import com.intermedia.intermedia.data.search.SearchService
import com.intermedia.intermedia.domain.BaseDataSourceFactory
import kotlinx.coroutines.CoroutineScope

class SearchPhotoDataSourceFactory(
    private val searchService: SearchService,
    private val query: String,
    private val order: SearchPhotoDataSource.Companion.Order?,
    private val collections: String?,
    private val contentFilter: SearchPhotoDataSource.Companion.ContentFilter?,
    private val color: SearchPhotoDataSource.Companion.Color?,
    private val orientation: SearchPhotoDataSource.Companion.Orientation?,
    private val scope: CoroutineScope
) : BaseDataSourceFactory<Photo>() {

    override fun createDataSource() =
        SearchPhotoDataSource(searchService, query, order, collections, contentFilter,
            color, orientation, scope)
}
