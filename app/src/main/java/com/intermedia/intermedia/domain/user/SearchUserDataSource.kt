package com.intermedia.intermedia.domain.user

import com.intermedia.intermedia.data.search.SearchService
import com.intermedia.intermedia.data.user.model.User
import com.intermedia.intermedia.domain.BaseDataSource
import kotlinx.coroutines.CoroutineScope

class SearchUserDataSource(
    private val searchService: SearchService,
    private val query: String,
    scope: CoroutineScope
) : BaseDataSource<User>(scope) {

    override suspend fun getPage(page: Int, perPage: Int): List<User> {
        return searchService.searchUsers(
            query = query,
            page = page,
            per_page = perPage
        ).results
    }
}
