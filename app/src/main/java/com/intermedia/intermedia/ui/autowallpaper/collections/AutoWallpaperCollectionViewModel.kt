package com.intermedia.intermedia.ui.autowallpaper.collections

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.intermedia.intermedia.data.autowallpaper.model.AutoWallpaperCollection
import com.intermedia.intermedia.data.autowallpaper.model.AutoWallpaperCollectionDocument
import com.intermedia.intermedia.data.collection.model.Collection
import com.intermedia.intermedia.domain.SharedPreferencesRepository
import com.intermedia.intermedia.domain.autowallpaper.AutoWallpaperRepository
import com.intermedia.intermedia.domain.collection.CollectionRepository
import com.intermedia.intermedia.util.Result
import com.intermedia.intermedia.util.error
import com.intermedia.intermedia.util.livedata.Event
import com.google.firebase.firestore.Source
import com.google.firebase.firestore.ktx.toObject
import kotlinx.coroutines.launch
import java.util.concurrent.TimeUnit

class AutoWallpaperCollectionViewModel(
    private val autoWallpaperRepository: AutoWallpaperRepository,
    private val collectionRepository: CollectionRepository,
    private val sharedPreferencesRepository: SharedPreferencesRepository
) : ViewModel() {

    val selectedAutoWallpaperCollections = autoWallpaperRepository.getSelectedAutoWallpaperCollections()

    val selectedAutoWallpaperCollectionIds = autoWallpaperRepository.getSelectedAutoWallpaperCollectionIds()

    val numCollectionsLiveData = autoWallpaperRepository.getNumberOfAutoWallpaperCollectionsLiveData()

    private val _addCollectionResultLiveData = MutableLiveData<Event<Result<Collection>>>()
    val addCollectionResultLiveData: LiveData<Event<Result<Collection>>> = _addCollectionResultLiveData

    private val _featuredCollectionLiveData by lazy {
        val liveData = MutableLiveData<List<AutoWallpaperCollection>>()
        val source = if (areSuggestedCollectionsStale(sharedPreferencesRepository.lastFeaturedCollectionsFetch)) {
            Source.DEFAULT
        } else {
            Source.CACHE
        }
        getFeaturedCollections(source, liveData)
        return@lazy liveData
    }
    val featuredCollectionLiveData: LiveData<List<AutoWallpaperCollection>> = _featuredCollectionLiveData

    private val _popularCollectionLiveData by lazy {
        val liveData = MutableLiveData<List<AutoWallpaperCollection>>()
        val source = if (areSuggestedCollectionsStale(sharedPreferencesRepository.lastPopularCollectionsFetch)) {
            Source.DEFAULT
        } else {
            Source.CACHE
        }
        getPopularCollections(source, liveData)
        return@lazy liveData
    }
    val popularCollectionLiveData: LiveData<List<AutoWallpaperCollection>> = _popularCollectionLiveData

    fun addAutoWallpaperCollection(collection: AutoWallpaperCollection) {
        viewModelScope.launch {
            autoWallpaperRepository.addCollectionToAutoWallpaper(collection)
        }
    }

    fun removeAutoWallpaperCollection(id: String) {
        viewModelScope.launch {
            autoWallpaperRepository.removeCollectionFromAutoWallpaper(id)
        }
    }

    fun getCollectionDetailsAndAdd(id: String) {
        viewModelScope.launch {
            val result = collectionRepository.getCollection(id)
            if (result is Result.Success) {
                autoWallpaperRepository.addCollectionToAutoWallpaper(result.value)
            }
            _addCollectionResultLiveData.postValue(Event(result))
        }
    }

    private fun getFeaturedCollections(
        source: Source,
        liveData: MutableLiveData<List<AutoWallpaperCollection>>,
        retryCount: Int = 0
    ) {
        if (retryCount <= MAX_RETRIES) {
            autoWallpaperRepository
                .getFeaturedCollections()
                .get(source)
                .addOnSuccessListener { documentSnapshot ->
                    if (!documentSnapshot.metadata.isFromCache)
                        sharedPreferencesRepository.lastFeaturedCollectionsFetch =
                            System.currentTimeMillis()
                    documentSnapshot.toObject<AutoWallpaperCollectionDocument>()?.collections?.let {
                        liveData.postValue(it)
                    }
                }
                .addOnFailureListener { exception ->
                    error("Error getting documents", exception)
                    getFeaturedCollections(Source.SERVER, liveData, retryCount + 1)
                }
        }
    }

    private fun getPopularCollections(
        source: Source,
        liveData: MutableLiveData<List<AutoWallpaperCollection>>,
        retryCount: Int = 0
    ) {
        if (retryCount <= MAX_RETRIES) {
            autoWallpaperRepository
                .getPopularCollections()
                .get(source)
                .addOnSuccessListener { documentSnapshot ->
                    if (!documentSnapshot.metadata.isFromCache)
                        sharedPreferencesRepository.lastPopularCollectionsFetch =
                            System.currentTimeMillis()
                    documentSnapshot.toObject<AutoWallpaperCollectionDocument>()?.collections?.let {
                        liveData.postValue(it)
                    }
                }
                .addOnFailureListener { exception ->
                    error("Error getting documents", exception)
                    getPopularCollections(Source.SERVER, liveData, retryCount + 1)
                }
        }
    }

    private fun areSuggestedCollectionsStale(lastFetch: Long) =
        System.currentTimeMillis() - lastFetch > ONE_DAY

    companion object {

        private const val MAX_RETRIES = 1
        private val ONE_DAY = TimeUnit.DAYS.toMillis(1)
    }
}
