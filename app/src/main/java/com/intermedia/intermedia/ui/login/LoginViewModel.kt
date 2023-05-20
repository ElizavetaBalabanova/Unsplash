package com.intermedia.intermedia.ui.login

import androidx.lifecycle.*
import com.intermedia.intermedia.data.photo.model.Photo
import com.intermedia.intermedia.domain.login.LoginRepository
import com.intermedia.intermedia.domain.photo.PhotoRepository
import com.intermedia.intermedia.util.Result
import kotlinx.coroutines.launch

class LoginViewModel(
    private val loginRepository: LoginRepository,
    private val photoRepository: PhotoRepository
) : ViewModel() {

    private val _bannerPhotoLiveData by lazy {
        val liveData = MutableLiveData<Photo>()
        viewModelScope.launch {
            val result = photoRepository.getRandomPhoto(featured = true)
            if (result is Result.Success) liveData.value = result.value
        }
        return@lazy liveData
    }
    val bannerPhotoLiveData: LiveData<Photo> = _bannerPhotoLiveData

    val loginUrl = loginRepository.loginUrl

    fun getAccessToken(code: String) = liveData(viewModelScope.coroutineContext) {
        emit(Result.Loading)

        val accessTokenResult = loginRepository.getAccessToken(code)
        if (accessTokenResult is Result.Success) { loginRepository.getMe() }

        emit(accessTokenResult)
    }
}
