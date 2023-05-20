package com.intermedia.intermedia.data.search;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J3\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJo\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\u0004\u001a\u00020\u00052\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J3\u0010\u0012\u001a\u00020\u00132\b\b\u0001\u0010\u0004\u001a\u00020\u00052\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0014"}, d2 = {"Lcom/intermedia/intermedia/data/search/SearchService;", "", "searchCollections", "Lcom/intermedia/intermedia/data/search/model/SearchCollectionsResult;", "query", "", "page", "", "per_page", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "searchPhotos", "Lcom/intermedia/intermedia/data/search/model/SearchPhotosResult;", "order_by", "collections", "contentFilter", "color", "orientation", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "searchUsers", "Lcom/intermedia/intermedia/data/search/model/SearchUsersResult;", "app_debug"})
public abstract interface SearchService {
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "search/photos")
    public abstract java.lang.Object searchPhotos(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "query")
    java.lang.String query, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Query(value = "page")
    java.lang.Integer page, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Query(value = "per_page")
    java.lang.Integer per_page, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Query(value = "order_by")
    java.lang.String order_by, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Query(value = "collections")
    java.lang.String collections, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Query(value = "content_filter")
    java.lang.String contentFilter, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Query(value = "color")
    java.lang.String color, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Query(value = "orientation")
    java.lang.String orientation, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.intermedia.intermedia.data.search.model.SearchPhotosResult> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "search/collections")
    public abstract java.lang.Object searchCollections(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "query")
    java.lang.String query, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Query(value = "page")
    java.lang.Integer page, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Query(value = "per_page")
    java.lang.Integer per_page, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.intermedia.intermedia.data.search.model.SearchCollectionsResult> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "search/users")
    public abstract java.lang.Object searchUsers(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "query")
    java.lang.String query, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Query(value = "page")
    java.lang.Integer page, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Query(value = "per_page")
    java.lang.Integer per_page, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.intermedia.intermedia.data.search.model.SearchUsersResult> continuation);
}