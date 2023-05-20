package com.intermedia.intermedia.domain.collection

import com.intermedia.intermedia.data.collection.CollectionService
import com.intermedia.intermedia.data.collection.model.Collection
import com.intermedia.intermedia.data.search.SearchService
import com.intermedia.intermedia.data.user.UserService
import com.intermedia.intermedia.di.Properties
import com.intermedia.intermedia.domain.Listing
import com.intermedia.intermedia.util.Result
import com.intermedia.intermedia.util.safeApiCall
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import retrofit2.Response

class CollectionRepository(
    private val collectionService: CollectionService,
    private val searchService: SearchService,
    private val userService: UserService,
    private val dispatcher: CoroutineDispatcher = Dispatchers.IO
) {

    fun getCollections(
        order: CollectionDataSource.Companion.Order,
        scope: CoroutineScope
    ): Listing<Collection> {
        return CollectionDataSourceFactory(collectionService, order, scope).createListing()
    }

    fun searchCollections(
        query: String,
        scope: CoroutineScope
    ): Listing<Collection> {
        return SearchCollectionDataSourceFactory(searchService, query, scope).createListing()
    }

    fun getUserCollections(
        username: String,
        scope: CoroutineScope
    ): Listing<Collection> {
        return UserCollectionDataSourceFactory(userService, username, scope).createListing()
    }

    suspend fun getUserCollections(username: String, page: Int) =
        safeApiCall(dispatcher) {
            userService.getUserCollections(username, page, Properties.DEFAULT_PAGE_SIZE)
        }

    suspend fun getCollection(collectionId: String) =
        safeApiCall(dispatcher) { collectionService.getCollection(collectionId) }

    suspend fun createCollection(title: String, description: String?, private: Boolean?) =
        safeApiCall(dispatcher) { collectionService.createCollection(title, description, private) }

    suspend fun updateCollection(id: String, title: String, description: String?, private: Boolean?) =
        safeApiCall(dispatcher) { collectionService.updateCollection(id, title, description, private) }

    suspend fun deleteCollection(id: String): Result<Response<Unit>> =
        safeApiCall(dispatcher) { collectionService.deleteCollection(id) }

    suspend fun addPhotoToCollection(collectionId: String, photoId: String) =
        safeApiCall(dispatcher) { collectionService.addPhotoToCollection(collectionId, photoId) }

    suspend fun removePhotoFromCollection(collectionId: String, photoId: String) =
        safeApiCall(dispatcher) { collectionService.removePhotoFromCollection(collectionId, photoId) }
}
