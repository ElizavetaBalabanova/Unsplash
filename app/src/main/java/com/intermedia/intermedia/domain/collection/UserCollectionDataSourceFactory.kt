package com.intermedia.intermedia.domain.collection

import com.intermedia.intermedia.data.collection.model.Collection
import com.intermedia.intermedia.data.user.UserService
import com.intermedia.intermedia.domain.BaseDataSourceFactory
import kotlinx.coroutines.CoroutineScope

class UserCollectionDataSourceFactory(
    private val userService: UserService,
    private val username: String,
    private val scope: CoroutineScope
) : BaseDataSourceFactory<Collection>() {

    override fun createDataSource() = UserCollectionDataSource(userService, username, scope)
}
