package com.intermedia.intermedia.domain.user

import com.intermedia.intermedia.data.search.SearchService
import com.intermedia.intermedia.data.user.model.User
import com.intermedia.intermedia.domain.BaseDataSourceFactory
import kotlinx.coroutines.CoroutineScope

class SearchUserDataSourceFactory(
    private val searchService: SearchService,
    private val query: String,
    private val scope: CoroutineScope
) : BaseDataSourceFactory<User>() {

    override fun createDataSource() = SearchUserDataSource(searchService, query, scope)
}
