package com.intermedia.intermedia.ui.search

import androidx.lifecycle.*
import com.intermedia.intermedia.data.collection.model.Collection
import com.intermedia.intermedia.data.photo.model.Photo
import com.intermedia.intermedia.data.user.model.User
import com.intermedia.intermedia.domain.Listing
import com.intermedia.intermedia.domain.collection.CollectionRepository
import com.intermedia.intermedia.domain.photo.PhotoRepository
import com.intermedia.intermedia.domain.photo.SearchPhotoDataSource
import com.intermedia.intermedia.domain.user.UserRepository
import com.intermedia.intermedia.util.NetworkState

class SearchViewModel(
    private val photoRepository: PhotoRepository,
    private val collectionRepository: CollectionRepository,
    private val userRepository: UserRepository
) : ViewModel() {

    private val _queryLiveData = MutableLiveData("")
    val queryLiveData: LiveData<String> = _queryLiveData

    private val _queryPhotoLiveData = MutableLiveData("")
    private val queryPhotoLiveData: LiveData<String> = _queryPhotoLiveData

    var order = SearchPhotoDataSource.Companion.Order.RELEVANT
    var contentFilter = SearchPhotoDataSource.Companion.ContentFilter.LOW
    var color = SearchPhotoDataSource.Companion.Color.ANY
    var orientation = SearchPhotoDataSource.Companion.Orientation.ANY

    private val photoListing: LiveData<Listing<Photo>?> = Transformations.map(queryPhotoLiveData) {
        if (it.isNotBlank()) {
            photoRepository.searchPhotos(
                it, order, null, contentFilter, color, orientation, viewModelScope)
        } else {
            null
        }
    }
    val photosLiveData = Transformations.switchMap(photoListing) { it?.pagedList }
    val photosNetworkStateLiveData = Transformations.switchMap(photoListing) { it?.networkState }
    val photosRefreshStateLiveData = Transformations.switchMap(photoListing) {
        it?.refreshState ?: MutableLiveData(NetworkState.EMPTY)
    }

    private val collectionListing: LiveData<Listing<Collection>?> = Transformations.map(queryLiveData) {
        if (it.isNotBlank()) {
            collectionRepository.searchCollections(it, viewModelScope)
        } else {
            null
        }
    }
    val collectionsLiveData = Transformations.switchMap(collectionListing) { it?.pagedList }
    val collectionsNetworkStateLiveData = Transformations.switchMap(collectionListing) { it?.networkState }
    val collectionsRefreshStateLiveData = Transformations.switchMap(collectionListing) {
        it?.refreshState ?: MutableLiveData(NetworkState.EMPTY)
    }

    private val userListing: LiveData<Listing<User>?> = Transformations.map(queryLiveData) {
        if (it.isNotBlank()) {
            userRepository.searchUsers(it, viewModelScope)
        } else {
            null
        }
    }
    val usersLiveData = Transformations.switchMap(userListing) { it?.pagedList }
    val usersNetworkStateLiveData = Transformations.switchMap(userListing) { it?.networkState }
    val usersRefreshStateLiveData = Transformations.switchMap(userListing) {
        it?.refreshState ?: MutableLiveData(NetworkState.EMPTY)
    }

    fun updateQuery(query: String) {
        _queryLiveData.postValue(query)
        _queryPhotoLiveData.postValue(query)
    }

    fun filterPhotoSearch() = _queryPhotoLiveData.postValue(queryPhotoLiveData.value)
}
