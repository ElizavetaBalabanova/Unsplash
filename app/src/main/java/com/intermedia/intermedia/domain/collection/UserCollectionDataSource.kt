package com.intermedia.intermedia.domain.collection

import com.intermedia.intermedia.data.collection.model.Collection
import com.intermedia.intermedia.data.user.UserService
import com.intermedia.intermedia.domain.BaseDataSource
import kotlinx.coroutines.CoroutineScope

class UserCollectionDataSource(
    private val userService: UserService,
    private val username: String,
    scope: CoroutineScope
) : BaseDataSource<Collection>(scope) {

    override suspend fun getPage(page: Int, perPage: Int): List<Collection> {
        return userService.getUserCollections(
            username = username,
            page = page,
            per_page = perPage
        )
    }
}
