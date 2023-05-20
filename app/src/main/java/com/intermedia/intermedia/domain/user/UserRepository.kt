package com.intermedia.intermedia.domain.user

import com.intermedia.intermedia.data.search.SearchService
import com.intermedia.intermedia.data.user.UserService
import com.intermedia.intermedia.data.user.model.User
import com.intermedia.intermedia.domain.Listing
import com.intermedia.intermedia.util.safeApiCall
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers

class UserRepository(
    private val userService: UserService,
    private val searchService: SearchService,
    private val dispatcher: CoroutineDispatcher = Dispatchers.IO
) {

    suspend fun getUserPublicProfile(username: String) =
        safeApiCall(dispatcher) { userService.getUserPublicProfile(username) }

    fun searchUsers(
        query: String,
        scope: CoroutineScope
    ): Listing<User> {
        return SearchUserDataSourceFactory(searchService, query, scope).createListing()
    }
}
