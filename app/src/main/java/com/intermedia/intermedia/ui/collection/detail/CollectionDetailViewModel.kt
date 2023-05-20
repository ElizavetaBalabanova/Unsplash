package com.intermedia.intermedia.ui.collection.detail

import androidx.lifecycle.*
import com.intermedia.intermedia.data.collection.model.Collection
import com.intermedia.intermedia.data.photo.model.Photo
import com.intermedia.intermedia.domain.Listing
import com.intermedia.intermedia.domain.autowallpaper.AutoWallpaperRepository
import com.intermedia.intermedia.domain.collection.CollectionRepository
import com.intermedia.intermedia.domain.login.LoginRepository
import com.intermedia.intermedia.domain.photo.PhotoRepository
import com.intermedia.intermedia.util.Result
import com.intermedia.intermedia.util.livedata.Event
import kotlinx.coroutines.launch
import retrofit2.Response

class CollectionDetailViewModel(
    private val photoRepository: PhotoRepository,
    private val collectionRepository: CollectionRepository,
    private val loginRepository: LoginRepository,
    private val autoWallpaperRepository: AutoWallpaperRepository
) : ViewModel() {

    private val _getCollectionResultLiveData = MutableLiveData<Event<Result<Collection>>>()
    val getCollectionResultLiveData: LiveData<Event<Result<Collection>>> = _getCollectionResultLiveData

    private val _updateCollectionResultLiveData = MutableLiveData<Event<Result<Collection>>>()
    val updateCollectionResultLiveData: LiveData<Event<Result<Collection>>> = _updateCollectionResultLiveData

    private val _deleteCollectionResultLiveData = MutableLiveData<Event<Result<Response<Unit>>>>()
    val deleteCollectionResultLiveData: LiveData<Event<Result<Response<Unit>>>> = _deleteCollectionResultLiveData

    private val _collectionLiveData = MutableLiveData<Collection>()
    val collectionLiveData: LiveData<Collection> = _collectionLiveData

    var isCollectionUsedForAutoWallpaper = false

    private val photoListing = MutableLiveData<Listing<Photo>>()

    val photosLiveData = Transformations.switchMap(photoListing) { it.pagedList }
    val networkStateLiveData = Transformations.switchMap(photoListing) { it.networkState }
    val refreshStateLiveData = Transformations.switchMap(photoListing) { it.refreshState }

    fun getPhotoListing(collectionId: String) {
        photoListing.postValue(photoRepository.getCollectionPhotos(collectionId, viewModelScope))
    }

    fun refreshPhotos() = photoListing.value?.refresh?.invoke()

    fun getCollection(collectionId: String) {
        viewModelScope.launch {
            val result = collectionRepository.getCollection(collectionId)
            if (result is Result.Success) {
                setCollection(result.value)
            }
            _getCollectionResultLiveData.postValue(Event(result))
        }
    }

    fun setCollection(collection: Collection) = _collectionLiveData.postValue(collection)

    fun isOwnCollection() = collectionLiveData.value?.user?.username == loginRepository.getUsername()

    fun isCollectionUsedForAutoWallpaper(id: String) =
        autoWallpaperRepository.isCollectionUsedForAutoWallpaper(id)

    fun addCollectionToAutoWallpaper() {
        viewModelScope.launch {
            collectionLiveData.value?.let { autoWallpaperRepository.addCollectionToAutoWallpaper(it) }
        }
    }

    fun removeCollectionFromAutoWallpaper() {
        viewModelScope.launch {
            collectionLiveData.value?.let { autoWallpaperRepository.removeCollectionFromAutoWallpaper(it) }
        }
    }

    fun updateCollection(
        title: String,
        description: String?,
        private: Boolean?
    ) {
        collectionLiveData.value?.id?.let {
            viewModelScope.launch {
                val result = collectionRepository.updateCollection(it, title, description, private)
                if (result is Result.Success) {
                    val collection = result.value
                    _collectionLiveData.postValue(collection)
                }
                _updateCollectionResultLiveData.postValue(Event(result))
            }
        }
    }

    fun deleteCollection() {
        collectionLiveData.value?.id?.let {
            viewModelScope.launch {
                val result = collectionRepository.deleteCollection(it)
                _deleteCollectionResultLiveData.postValue(Event(result))
            }
        }
    }
}
