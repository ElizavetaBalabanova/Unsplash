package com.intermedia.intermedia.ui.login;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001a\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u000f2\u0006\u0010\u0019\u001a\u00020\u0013R!\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0012\u001a\u00020\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/intermedia/intermedia/ui/login/LoginViewModel;", "Landroidx/lifecycle/ViewModel;", "loginRepository", "Lcom/intermedia/intermedia/domain/login/LoginRepository;", "photoRepository", "Lcom/intermedia/intermedia/domain/photo/PhotoRepository;", "(Lcom/intermedia/intermedia/domain/login/LoginRepository;Lcom/intermedia/intermedia/domain/photo/PhotoRepository;)V", "_bannerPhotoLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/intermedia/intermedia/data/photo/model/Photo;", "get_bannerPhotoLiveData", "()Landroidx/lifecycle/MutableLiveData;", "_bannerPhotoLiveData$delegate", "Lkotlin/Lazy;", "bannerPhotoLiveData", "Landroidx/lifecycle/LiveData;", "getBannerPhotoLiveData", "()Landroidx/lifecycle/LiveData;", "loginUrl", "", "getLoginUrl", "()Ljava/lang/String;", "getAccessToken", "Lcom/intermedia/intermedia/util/Result;", "Lcom/intermedia/intermedia/data/authorization/model/AccessToken;", "code", "app_debug"})
public final class LoginViewModel extends androidx.lifecycle.ViewModel {
    private final com.intermedia.intermedia.domain.login.LoginRepository loginRepository = null;
    private final com.intermedia.intermedia.domain.photo.PhotoRepository photoRepository = null;
    private final kotlin.Lazy _bannerPhotoLiveData$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<com.intermedia.intermedia.data.photo.model.Photo> bannerPhotoLiveData = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String loginUrl = null;
    
    public LoginViewModel(@org.jetbrains.annotations.NotNull
    com.intermedia.intermedia.domain.login.LoginRepository loginRepository, @org.jetbrains.annotations.NotNull
    com.intermedia.intermedia.domain.photo.PhotoRepository photoRepository) {
        super();
    }
    
    private final androidx.lifecycle.MutableLiveData<com.intermedia.intermedia.data.photo.model.Photo> get_bannerPhotoLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.intermedia.intermedia.data.photo.model.Photo> getBannerPhotoLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getLoginUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.intermedia.intermedia.util.Result<com.intermedia.intermedia.data.authorization.model.AccessToken>> getAccessToken(@org.jetbrains.annotations.NotNull
    java.lang.String code) {
        return null;
    }
}