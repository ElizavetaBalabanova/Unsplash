package com.intermedia.intermedia.ui.user

import androidx.lifecycle.*
import com.intermedia.intermedia.data.collection.model.Collection
import com.intermedia.intermedia.data.photo.model.Photo
import com.intermedia.intermedia.data.user.model.User
import com.intermedia.intermedia.domain.Listing
import com.intermedia.intermedia.domain.collection.CollectionRepository
import com.intermedia.intermedia.domain.login.LoginRepository
import com.intermedia.intermedia.domain.photo.PhotoRepository
import com.intermedia.intermedia.domain.photo.UserLikesDataSource
import com.intermedia.intermedia.domain.photo.UserPhotoDataSource
import com.intermedia.intermedia.domain.user.UserRepository
import com.intermedia.intermedia.util.Result
import com.intermedia.intermedia.util.livedata.Event
import kotlinx.coroutines.launch

class UserViewModel(
    private val userRepository: UserRepository,
    private val photoRepository: PhotoRepository,
    private val collectionRepository: CollectionRepository,
    private val loginRepository: LoginRepository
) : ViewModel() {

    private val _getUserResultLiveData = MutableLiveData<Event<Result<User>>>()
    val getUserResultLiveData: LiveData<Event<Result<User>>> = _getUserResultLiveData

    private val _userLiveData = MutableLiveData<User>()
    val userLiveData: LiveData<User> = _userLiveData

    private val photoListing = MutableLiveData<Listing<Photo>>()

    val photosLiveData = Transformations.switchMap(photoListing) { it.pagedList }
    val photosNetworkStateLiveData = Transformations.switchMap(photoListing) { it.networkState }
    val photosRefreshStateLiveData = Transformations.switchMap(photoListing) { it.refreshState }

    private val likesListing = MutableLiveData<Listing<Photo>>()

    val likesLiveData = Transformations.switchMap(likesListing) { it.pagedList }
    val likesNetworkStateLiveData = Transformations.switchMap(likesListing) { it.networkState }
    val likesRefreshStateLiveData = Transformations.switchMap(likesListing) { it.refreshState }

    private val collectionListing = MutableLiveData<Listing<Collection>>()

    val collectionsLiveData = Transformations.switchMap(collectionListing) { it.pagedList }
    val collectionsNetworkStateLiveData = Transformations.switchMap(collectionListing) { it.networkState }
    val collectionsRefreshStateLiveData = Transformations.switchMap(collectionListing) { it.refreshState }

    fun getUser(username: String) {
        viewModelScope.launch {
            val result = userRepository.getUserPublicProfile(username)
            if (result is Result.Success) {
                setUser(result.value)
            }
            _getUserResultLiveData.postValue(Event(result))
        }
    }

    fun setUser(user: User) = _userLiveData.postValue(user)

    fun getUserListings(username: String) {
        photoListing.postValue(
            photoRepository.getUserPhotos(
                username,
                UserPhotoDataSource.Companion.Order.LATEST,
                false,
                null,
                null,
                UserPhotoDataSource.Companion.Orientation.ALL,
                viewModelScope)
        )
        likesListing.postValue(
            photoRepository.getUserLikes(
                username,
                UserLikesDataSource.Companion.Order.LATEST,
                UserLikesDataSource.Companion.Orientation.ALL,
                viewModelScope
            )
        )
        collectionListing.postValue(
            collectionRepository.getUserCollections(
                username,
                viewModelScope
            )
        )
    }

    fun refreshPhotos() = photoListing.value?.refresh?.invoke()

    fun refreshLikes() = likesListing.value?.refresh?.invoke()

    fun refreshCollections() = collectionListing.value?.refresh?.invoke()

    fun isOwnProfile() = userLiveData.value?.username == loginRepository.getUsername()
}
