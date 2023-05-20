package com.intermedia.intermedia.ui.search;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u0010F\u001a\u00020GJ\u000e\u0010H\u001a\u00020G2\u0006\u0010I\u001a\u00020\u000bR\u001c\u0010\t\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00100\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010\u0012\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0011 \f*\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00130\u00130\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001f\u0010\u0016\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u00170\u00170\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u001f\u0010\u0019\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u00170\u00170\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u001a\u0010\u001b\u001a\u00020\u001cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\"X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010\'\u001a\u00020(X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001a\u0010-\u001a\u00020.X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001c\u00103\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u000204\u0018\u00010\u00100\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u00105\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u000204 \f*\n\u0012\u0004\u0012\u000204\u0018\u00010\u00130\u00130\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u0010\u0015R\u001f\u00107\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u00170\u00170\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u0010\u0015R\u001f\u00109\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u00170\u00170\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u0010\u0015R\u0017\u0010;\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u0010\u0015R\u0014\u0010=\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010>\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020?\u0018\u00010\u00100\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010@\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020? \f*\n\u0012\u0004\u0012\u00020?\u0018\u00010\u00130\u00130\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\bA\u0010\u0015R\u001f\u0010B\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u00170\u00170\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\bC\u0010\u0015R\u001f\u0010D\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u00170\u00170\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\bE\u0010\u0015\u00a8\u0006J"}, d2 = {"Lcom/intermedia/intermedia/ui/search/SearchViewModel;", "Landroidx/lifecycle/ViewModel;", "photoRepository", "Lcom/intermedia/intermedia/domain/photo/PhotoRepository;", "collectionRepository", "Lcom/intermedia/intermedia/domain/collection/CollectionRepository;", "userRepository", "Lcom/intermedia/intermedia/domain/user/UserRepository;", "(Lcom/intermedia/intermedia/domain/photo/PhotoRepository;Lcom/intermedia/intermedia/domain/collection/CollectionRepository;Lcom/intermedia/intermedia/domain/user/UserRepository;)V", "_queryLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "kotlin.jvm.PlatformType", "_queryPhotoLiveData", "collectionListing", "Landroidx/lifecycle/LiveData;", "Lcom/intermedia/intermedia/domain/Listing;", "Lcom/intermedia/intermedia/data/collection/model/Collection;", "collectionsLiveData", "Landroidx/paging/PagedList;", "getCollectionsLiveData", "()Landroidx/lifecycle/LiveData;", "collectionsNetworkStateLiveData", "Lcom/intermedia/intermedia/util/NetworkState;", "getCollectionsNetworkStateLiveData", "collectionsRefreshStateLiveData", "getCollectionsRefreshStateLiveData", "color", "Lcom/intermedia/intermedia/domain/photo/SearchPhotoDataSource$Companion$Color;", "getColor", "()Lcom/intermedia/intermedia/domain/photo/SearchPhotoDataSource$Companion$Color;", "setColor", "(Lcom/intermedia/intermedia/domain/photo/SearchPhotoDataSource$Companion$Color;)V", "contentFilter", "Lcom/intermedia/intermedia/domain/photo/SearchPhotoDataSource$Companion$ContentFilter;", "getContentFilter", "()Lcom/intermedia/intermedia/domain/photo/SearchPhotoDataSource$Companion$ContentFilter;", "setContentFilter", "(Lcom/intermedia/intermedia/domain/photo/SearchPhotoDataSource$Companion$ContentFilter;)V", "order", "Lcom/intermedia/intermedia/domain/photo/SearchPhotoDataSource$Companion$Order;", "getOrder", "()Lcom/intermedia/intermedia/domain/photo/SearchPhotoDataSource$Companion$Order;", "setOrder", "(Lcom/intermedia/intermedia/domain/photo/SearchPhotoDataSource$Companion$Order;)V", "orientation", "Lcom/intermedia/intermedia/domain/photo/SearchPhotoDataSource$Companion$Orientation;", "getOrientation", "()Lcom/intermedia/intermedia/domain/photo/SearchPhotoDataSource$Companion$Orientation;", "setOrientation", "(Lcom/intermedia/intermedia/domain/photo/SearchPhotoDataSource$Companion$Orientation;)V", "photoListing", "Lcom/intermedia/intermedia/data/photo/model/Photo;", "photosLiveData", "getPhotosLiveData", "photosNetworkStateLiveData", "getPhotosNetworkStateLiveData", "photosRefreshStateLiveData", "getPhotosRefreshStateLiveData", "queryLiveData", "getQueryLiveData", "queryPhotoLiveData", "userListing", "Lcom/intermedia/intermedia/data/user/model/User;", "usersLiveData", "getUsersLiveData", "usersNetworkStateLiveData", "getUsersNetworkStateLiveData", "usersRefreshStateLiveData", "getUsersRefreshStateLiveData", "filterPhotoSearch", "", "updateQuery", "query", "app_debug"})
public final class SearchViewModel extends androidx.lifecycle.ViewModel {
    private final com.intermedia.intermedia.domain.photo.PhotoRepository photoRepository = null;
    private final com.intermedia.intermedia.domain.collection.CollectionRepository collectionRepository = null;
    private final com.intermedia.intermedia.domain.user.UserRepository userRepository = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _queryLiveData = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.lang.String> queryLiveData = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _queryPhotoLiveData = null;
    private final androidx.lifecycle.LiveData<java.lang.String> queryPhotoLiveData = null;
    @org.jetbrains.annotations.NotNull
    private com.intermedia.intermedia.domain.photo.SearchPhotoDataSource.Companion.Order order;
    @org.jetbrains.annotations.NotNull
    private com.intermedia.intermedia.domain.photo.SearchPhotoDataSource.Companion.ContentFilter contentFilter;
    @org.jetbrains.annotations.NotNull
    private com.intermedia.intermedia.domain.photo.SearchPhotoDataSource.Companion.Color color;
    @org.jetbrains.annotations.NotNull
    private com.intermedia.intermedia.domain.photo.SearchPhotoDataSource.Companion.Orientation orientation;
    private final androidx.lifecycle.LiveData<com.intermedia.intermedia.domain.Listing<com.intermedia.intermedia.data.photo.model.Photo>> photoListing = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<androidx.paging.PagedList<com.intermedia.intermedia.data.photo.model.Photo>> photosLiveData = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<com.intermedia.intermedia.util.NetworkState> photosNetworkStateLiveData = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<com.intermedia.intermedia.util.NetworkState> photosRefreshStateLiveData = null;
    private final androidx.lifecycle.LiveData<com.intermedia.intermedia.domain.Listing<com.intermedia.intermedia.data.collection.model.Collection>> collectionListing = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<androidx.paging.PagedList<com.intermedia.intermedia.data.collection.model.Collection>> collectionsLiveData = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<com.intermedia.intermedia.util.NetworkState> collectionsNetworkStateLiveData = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<com.intermedia.intermedia.util.NetworkState> collectionsRefreshStateLiveData = null;
    private final androidx.lifecycle.LiveData<com.intermedia.intermedia.domain.Listing<com.intermedia.intermedia.data.user.model.User>> userListing = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<androidx.paging.PagedList<com.intermedia.intermedia.data.user.model.User>> usersLiveData = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<com.intermedia.intermedia.util.NetworkState> usersNetworkStateLiveData = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<com.intermedia.intermedia.util.NetworkState> usersRefreshStateLiveData = null;
    
    public SearchViewModel(@org.jetbrains.annotations.NotNull
    com.intermedia.intermedia.domain.photo.PhotoRepository photoRepository, @org.jetbrains.annotations.NotNull
    com.intermedia.intermedia.domain.collection.CollectionRepository collectionRepository, @org.jetbrains.annotations.NotNull
    com.intermedia.intermedia.domain.user.UserRepository userRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.lang.String> getQueryLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.intermedia.intermedia.domain.photo.SearchPhotoDataSource.Companion.Order getOrder() {
        return null;
    }
    
    public final void setOrder(@org.jetbrains.annotations.NotNull
    com.intermedia.intermedia.domain.photo.SearchPhotoDataSource.Companion.Order p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.intermedia.intermedia.domain.photo.SearchPhotoDataSource.Companion.ContentFilter getContentFilter() {
        return null;
    }
    
    public final void setContentFilter(@org.jetbrains.annotations.NotNull
    com.intermedia.intermedia.domain.photo.SearchPhotoDataSource.Companion.ContentFilter p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.intermedia.intermedia.domain.photo.SearchPhotoDataSource.Companion.Color getColor() {
        return null;
    }
    
    public final void setColor(@org.jetbrains.annotations.NotNull
    com.intermedia.intermedia.domain.photo.SearchPhotoDataSource.Companion.Color p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.intermedia.intermedia.domain.photo.SearchPhotoDataSource.Companion.Orientation getOrientation() {
        return null;
    }
    
    public final void setOrientation(@org.jetbrains.annotations.NotNull
    com.intermedia.intermedia.domain.photo.SearchPhotoDataSource.Companion.Orientation p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<androidx.paging.PagedList<com.intermedia.intermedia.data.photo.model.Photo>> getPhotosLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.intermedia.intermedia.util.NetworkState> getPhotosNetworkStateLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.intermedia.intermedia.util.NetworkState> getPhotosRefreshStateLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<androidx.paging.PagedList<com.intermedia.intermedia.data.collection.model.Collection>> getCollectionsLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.intermedia.intermedia.util.NetworkState> getCollectionsNetworkStateLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.intermedia.intermedia.util.NetworkState> getCollectionsRefreshStateLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<androidx.paging.PagedList<com.intermedia.intermedia.data.user.model.User>> getUsersLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.intermedia.intermedia.util.NetworkState> getUsersNetworkStateLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.intermedia.intermedia.util.NetworkState> getUsersRefreshStateLiveData() {
        return null;
    }
    
    public final void updateQuery(@org.jetbrains.annotations.NotNull
    java.lang.String query) {
    }
    
    public final void filterPhotoSearch() {
    }
}