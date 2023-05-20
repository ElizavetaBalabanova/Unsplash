package com.intermedia.intermedia.domain.photo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u00ac\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u001f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00152\u0006\u0010\u0016\u001a\u00020\u0011H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u0013J_\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00152\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0011H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\"Jo\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0$0\u00152\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010%\u001a\u00020&H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\'J0\u0010(\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u001e\u001a\u00020\u00112\b\u0010\u0019\u001a\u0004\u0018\u00010)2\b\u0010 \u001a\u0004\u0018\u00010*2\u0006\u0010\u0012\u001a\u00020\u0013JQ\u0010+\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u001e\u001a\u00020\u00112\b\u0010\u0019\u001a\u0004\u0018\u00010,2\u0006\u0010-\u001a\u00020\u001d2\b\u0010.\u001a\u0004\u0018\u00010/2\b\u00100\u001a\u0004\u0018\u00010&2\b\u0010 \u001a\u0004\u0018\u0001012\u0006\u0010\u0012\u001a\u00020\u0013\u00a2\u0006\u0002\u00102J\u001f\u00103\u001a\b\u0012\u0004\u0012\u0002040\u00152\u0006\u0010\u0016\u001a\u00020\u0011H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017JN\u00105\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u001f\u001a\u00020\u00112\b\u0010\u0019\u001a\u0004\u0018\u0001062\b\u00107\u001a\u0004\u0018\u00010\u00112\b\u0010!\u001a\u0004\u0018\u0001082\b\u00109\u001a\u0004\u0018\u00010:2\b\u0010 \u001a\u0004\u0018\u00010;2\u0006\u0010\u0012\u001a\u00020\u0013J%\u0010<\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020>0=0\u00152\u0006\u0010\u0016\u001a\u00020\u0011H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006?"}, d2 = {"Lcom/intermedia/intermedia/domain/photo/PhotoRepository;", "", "photoService", "Lcom/intermedia/intermedia/data/photo/PhotoService;", "collectionService", "Lcom/intermedia/intermedia/data/collection/CollectionService;", "searchService", "Lcom/intermedia/intermedia/data/search/SearchService;", "userService", "Lcom/intermedia/intermedia/data/user/UserService;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lcom/intermedia/intermedia/data/photo/PhotoService;Lcom/intermedia/intermedia/data/collection/CollectionService;Lcom/intermedia/intermedia/data/search/SearchService;Lcom/intermedia/intermedia/data/user/UserService;Lkotlinx/coroutines/CoroutineDispatcher;)V", "getCollectionPhotos", "Lcom/intermedia/intermedia/domain/Listing;", "Lcom/intermedia/intermedia/data/photo/model/Photo;", "collectionId", "", "scope", "Lkotlinx/coroutines/CoroutineScope;", "getPhotoDetails", "Lcom/intermedia/intermedia/util/Result;", "id", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPhotos", "order", "Lcom/intermedia/intermedia/domain/photo/PhotoDataSource$Companion$Order;", "getRandomPhoto", "featured", "", "username", "query", "orientation", "contentFilter", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRandomPhotos", "", "count", "", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUserLikes", "Lcom/intermedia/intermedia/domain/photo/UserLikesDataSource$Companion$Order;", "Lcom/intermedia/intermedia/domain/photo/UserLikesDataSource$Companion$Orientation;", "getUserPhotos", "Lcom/intermedia/intermedia/domain/photo/UserPhotoDataSource$Companion$Order;", "stats", "resolution", "Lcom/intermedia/intermedia/domain/photo/UserPhotoDataSource$Companion$Resolution;", "quantity", "Lcom/intermedia/intermedia/domain/photo/UserPhotoDataSource$Companion$Orientation;", "(Ljava/lang/String;Lcom/intermedia/intermedia/domain/photo/UserPhotoDataSource$Companion$Order;ZLcom/intermedia/intermedia/domain/photo/UserPhotoDataSource$Companion$Resolution;Ljava/lang/Integer;Lcom/intermedia/intermedia/domain/photo/UserPhotoDataSource$Companion$Orientation;Lkotlinx/coroutines/CoroutineScope;)Lcom/intermedia/intermedia/domain/Listing;", "likePhoto", "Lokhttp3/ResponseBody;", "searchPhotos", "Lcom/intermedia/intermedia/domain/photo/SearchPhotoDataSource$Companion$Order;", "collections", "Lcom/intermedia/intermedia/domain/photo/SearchPhotoDataSource$Companion$ContentFilter;", "color", "Lcom/intermedia/intermedia/domain/photo/SearchPhotoDataSource$Companion$Color;", "Lcom/intermedia/intermedia/domain/photo/SearchPhotoDataSource$Companion$Orientation;", "unlikePhoto", "Lretrofit2/Response;", "", "app_debug"})
public final class PhotoRepository {
    private final com.intermedia.intermedia.data.photo.PhotoService photoService = null;
    private final com.intermedia.intermedia.data.collection.CollectionService collectionService = null;
    private final com.intermedia.intermedia.data.search.SearchService searchService = null;
    private final com.intermedia.intermedia.data.user.UserService userService = null;
    private final kotlinx.coroutines.CoroutineDispatcher dispatcher = null;
    
    public PhotoRepository(@org.jetbrains.annotations.NotNull
    com.intermedia.intermedia.data.photo.PhotoService photoService, @org.jetbrains.annotations.NotNull
    com.intermedia.intermedia.data.collection.CollectionService collectionService, @org.jetbrains.annotations.NotNull
    com.intermedia.intermedia.data.search.SearchService searchService, @org.jetbrains.annotations.NotNull
    com.intermedia.intermedia.data.user.UserService userService, @org.jetbrains.annotations.NotNull
    kotlinx.coroutines.CoroutineDispatcher dispatcher) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.intermedia.intermedia.domain.Listing<com.intermedia.intermedia.data.photo.model.Photo> getPhotos(@org.jetbrains.annotations.NotNull
    com.intermedia.intermedia.domain.photo.PhotoDataSource.Companion.Order order, @org.jetbrains.annotations.NotNull
    kotlinx.coroutines.CoroutineScope scope) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.intermedia.intermedia.domain.Listing<com.intermedia.intermedia.data.photo.model.Photo> getCollectionPhotos(@org.jetbrains.annotations.NotNull
    java.lang.String collectionId, @org.jetbrains.annotations.NotNull
    kotlinx.coroutines.CoroutineScope scope) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.intermedia.intermedia.domain.Listing<com.intermedia.intermedia.data.photo.model.Photo> searchPhotos(@org.jetbrains.annotations.NotNull
    java.lang.String query, @org.jetbrains.annotations.Nullable
    com.intermedia.intermedia.domain.photo.SearchPhotoDataSource.Companion.Order order, @org.jetbrains.annotations.Nullable
    java.lang.String collections, @org.jetbrains.annotations.Nullable
    com.intermedia.intermedia.domain.photo.SearchPhotoDataSource.Companion.ContentFilter contentFilter, @org.jetbrains.annotations.Nullable
    com.intermedia.intermedia.domain.photo.SearchPhotoDataSource.Companion.Color color, @org.jetbrains.annotations.Nullable
    com.intermedia.intermedia.domain.photo.SearchPhotoDataSource.Companion.Orientation orientation, @org.jetbrains.annotations.NotNull
    kotlinx.coroutines.CoroutineScope scope) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.intermedia.intermedia.domain.Listing<com.intermedia.intermedia.data.photo.model.Photo> getUserPhotos(@org.jetbrains.annotations.NotNull
    java.lang.String username, @org.jetbrains.annotations.Nullable
    com.intermedia.intermedia.domain.photo.UserPhotoDataSource.Companion.Order order, boolean stats, @org.jetbrains.annotations.Nullable
    com.intermedia.intermedia.domain.photo.UserPhotoDataSource.Companion.Resolution resolution, @org.jetbrains.annotations.Nullable
    java.lang.Integer quantity, @org.jetbrains.annotations.Nullable
    com.intermedia.intermedia.domain.photo.UserPhotoDataSource.Companion.Orientation orientation, @org.jetbrains.annotations.NotNull
    kotlinx.coroutines.CoroutineScope scope) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.intermedia.intermedia.domain.Listing<com.intermedia.intermedia.data.photo.model.Photo> getUserLikes(@org.jetbrains.annotations.NotNull
    java.lang.String username, @org.jetbrains.annotations.Nullable
    com.intermedia.intermedia.domain.photo.UserLikesDataSource.Companion.Order order, @org.jetbrains.annotations.Nullable
    com.intermedia.intermedia.domain.photo.UserLikesDataSource.Companion.Orientation orientation, @org.jetbrains.annotations.NotNull
    kotlinx.coroutines.CoroutineScope scope) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getPhotoDetails(@org.jetbrains.annotations.NotNull
    java.lang.String id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.intermedia.intermedia.util.Result<com.intermedia.intermedia.data.photo.model.Photo>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getRandomPhoto(@org.jetbrains.annotations.Nullable
    java.lang.String collectionId, @org.jetbrains.annotations.Nullable
    java.lang.Boolean featured, @org.jetbrains.annotations.Nullable
    java.lang.String username, @org.jetbrains.annotations.Nullable
    java.lang.String query, @org.jetbrains.annotations.Nullable
    java.lang.String orientation, @org.jetbrains.annotations.Nullable
    java.lang.String contentFilter, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.intermedia.intermedia.util.Result<com.intermedia.intermedia.data.photo.model.Photo>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getRandomPhotos(@org.jetbrains.annotations.Nullable
    java.lang.String collectionId, @org.jetbrains.annotations.Nullable
    java.lang.Boolean featured, @org.jetbrains.annotations.Nullable
    java.lang.String username, @org.jetbrains.annotations.Nullable
    java.lang.String query, @org.jetbrains.annotations.Nullable
    java.lang.String orientation, @org.jetbrains.annotations.Nullable
    java.lang.String contentFilter, int count, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.intermedia.intermedia.util.Result<? extends java.util.List<com.intermedia.intermedia.data.photo.model.Photo>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object likePhoto(@org.jetbrains.annotations.NotNull
    java.lang.String id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.intermedia.intermedia.util.Result<? extends okhttp3.ResponseBody>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object unlikePhoto(@org.jetbrains.annotations.NotNull
    java.lang.String id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.intermedia.intermedia.util.Result<retrofit2.Response<kotlin.Unit>>> continuation) {
        return null;
    }
}