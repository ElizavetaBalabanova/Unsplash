package com.intermedia.intermedia.domain.photo

import com.intermedia.intermedia.data.photo.model.Photo
import com.intermedia.intermedia.data.user.UserService
import com.intermedia.intermedia.domain.BaseDataSourceFactory
import kotlinx.coroutines.CoroutineScope

class UserLikesDataSourceFactory(
    private val userService: UserService,
    private val username: String,
    private val order: UserLikesDataSource.Companion.Order?,
    private val orientation: UserLikesDataSource.Companion.Orientation?,
    private val scope: CoroutineScope
) : BaseDataSourceFactory<Photo>() {

    override fun createDataSource() = UserLikesDataSource(userService, username, order,
        orientation, scope)
}
