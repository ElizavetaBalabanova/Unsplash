package com.intermedia.intermedia.domain.collection

import com.intermedia.intermedia.data.collection.model.Collection
import com.intermedia.intermedia.data.search.SearchService
import com.intermedia.intermedia.domain.BaseDataSourceFactory
import kotlinx.coroutines.CoroutineScope

class SearchCollectionDataSourceFactory(
    private val searchService: SearchService,
    private val query: String,
    private val scope: CoroutineScope
) : BaseDataSourceFactory<Collection>() {

    override fun createDataSource() = SearchCollectionDataSource(searchService, query, scope)
}
