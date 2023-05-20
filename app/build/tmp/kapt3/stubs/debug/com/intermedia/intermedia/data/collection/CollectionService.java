package com.intermedia.intermedia.data.collection;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J%\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J3\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u00052\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\rH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ!\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\b\u0001\u0010\u0012\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u001b\u0010\u0014\u001a\u00020\t2\b\b\u0001\u0010\u0012\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J9\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\b\b\u0001\u0010\u0012\u001a\u00020\u00052\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ/\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\t0\u00162\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001dJ!\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\u00162\b\b\u0001\u0010\u0012\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J%\u0010\u001f\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J?\u0010 \u001a\u00020\t2\b\b\u0001\u0010\u0012\u001a\u00020\u00052\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\rH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010!\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\""}, d2 = {"Lcom/intermedia/intermedia/data/collection/CollectionService;", "", "addPhotoToCollection", "Lcom/intermedia/intermedia/data/collection/model/CollectionPhotoResult;", "collection_id", "", "photo_id", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createCollection", "Lcom/intermedia/intermedia/data/collection/model/Collection;", "title", "description", "private", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteCollection", "Lretrofit2/Response;", "", "id", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCollection", "getCollectionPhotos", "", "Lcom/intermedia/intermedia/data/photo/model/Photo;", "page", "", "per_page", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCollections", "(Ljava/lang/Integer;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRelatedCollections", "removePhotoFromCollection", "updateCollection", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface CollectionService {
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "collections")
    public abstract java.lang.Object getCollections(@org.jetbrains.annotations.Nullable
    @retrofit2.http.Query(value = "page")
    java.lang.Integer page, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Query(value = "per_page")
    java.lang.Integer per_page, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.intermedia.intermedia.data.collection.model.Collection>> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "collections/{id}")
    public abstract java.lang.Object getCollection(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Path(value = "id")
    java.lang.String id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.intermedia.intermedia.data.collection.model.Collection> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "collections/{id}/photos")
    public abstract java.lang.Object getCollectionPhotos(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Path(value = "id")
    java.lang.String id, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Query(value = "page")
    java.lang.Integer page, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Query(value = "per_page")
    java.lang.Integer per_page, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.intermedia.intermedia.data.photo.model.Photo>> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "collections/{id}/related")
    public abstract java.lang.Object getRelatedCollections(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Path(value = "id")
    java.lang.String id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.intermedia.intermedia.data.collection.model.Collection>> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.POST(value = "collections")
    public abstract java.lang.Object createCollection(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "title")
    java.lang.String title, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Query(value = "description")
    java.lang.String description, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Query(value = "private")
    java.lang.Boolean p2_1990234817, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.intermedia.intermedia.data.collection.model.Collection> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.PUT(value = "collections/{id}")
    public abstract java.lang.Object updateCollection(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Path(value = "id")
    java.lang.String id, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Query(value = "title")
    java.lang.String title, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Query(value = "description")
    java.lang.String description, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Query(value = "private")
    java.lang.Boolean p3_1990234817, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.intermedia.intermedia.data.collection.model.Collection> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.DELETE(value = "collections/{id}")
    public abstract java.lang.Object deleteCollection(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Path(value = "id")
    java.lang.String id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<kotlin.Unit>> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.POST(value = "collections/{collection_id}/add")
    public abstract java.lang.Object addPhotoToCollection(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Path(value = "collection_id")
    java.lang.String collection_id, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "photo_id")
    java.lang.String photo_id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.intermedia.intermedia.data.collection.model.CollectionPhotoResult> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.DELETE(value = "collections/{collection_id}/remove")
    public abstract java.lang.Object removePhotoFromCollection(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Path(value = "collection_id")
    java.lang.String collection_id, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "photo_id")
    java.lang.String photo_id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.intermedia.intermedia.data.collection.model.CollectionPhotoResult> continuation);
}