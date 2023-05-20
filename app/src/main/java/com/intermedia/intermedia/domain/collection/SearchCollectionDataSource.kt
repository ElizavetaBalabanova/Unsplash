package com.intermedia.intermedia.domain.collection

import com.intermedia.intermedia.data.collection.model.Collection
import com.intermedia.intermedia.data.search.SearchService
import com.intermedia.intermedia.domain.BaseDataSource
import kotlinx.coroutines.CoroutineScope

class SearchCollectionDataSource(
    private val searchService: SearchService,
    private val query: String,
    scope: CoroutineScope
) : BaseDataSource<Collection>(scope) {

    override suspend fun getPage(page: Int, perPage: Int): List<Collection> {
        return searchService.searchCollections(
            query = query,
            page = page,
            per_page = perPage
        ).results
    }
}
