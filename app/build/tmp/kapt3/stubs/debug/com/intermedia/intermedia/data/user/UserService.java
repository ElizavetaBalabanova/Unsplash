package com.intermedia.intermedia.data.user;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\bf\u0018\u00002\u00020\u0001J9\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJQ\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJu\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J\u001b\u0010\u0016\u001a\u00020\u00172\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018J\u0011\u0010\u0019\u001a\u00020\u001aH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ\u001b\u0010\u001c\u001a\u00020\u001d2\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018J3\u0010\u001e\u001a\u00020\u001f2\b\b\u0001\u0010\u0005\u001a\u00020\u00062\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010 Jq\u0010!\u001a\u00020\u001a2\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\"\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010#\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010$\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010%\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010&\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\'\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010(\u001a\u0004\u0018\u00010\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010)\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006*"}, d2 = {"Lcom/intermedia/intermedia/data/user/UserService;", "", "getUserCollections", "", "Lcom/intermedia/intermedia/data/collection/model/Collection;", "username", "", "page", "", "per_page", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUserLikes", "Lcom/intermedia/intermedia/data/photo/model/Photo;", "order_by", "orientation", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUserPhotos", "stats", "", "resolution", "quantity", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUserPortfolioLink", "Lokhttp3/ResponseBody;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUserPrivateProfile", "Lcom/intermedia/intermedia/data/user/model/Me;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUserPublicProfile", "Lcom/intermedia/intermedia/data/user/model/User;", "getUserStatistics", "Lcom/intermedia/intermedia/data/common/model/UserStatistics;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateUserPrivateProfile", "first_name", "last_name", "email", "url", "instagram_username", "location", "bio", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface UserService {
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "users/{username}")
    public abstract java.lang.Object getUserPublicProfile(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Path(value = "username")
    java.lang.String username, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.intermedia.intermedia.data.user.model.User> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "users/{username}/portfolio")
    public abstract java.lang.Object getUserPortfolioLink(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Path(value = "username")
    java.lang.String username, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super okhttp3.ResponseBody> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "users/{username}/photos")
    public abstract java.lang.Object getUserPhotos(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Path(value = "username")
    java.lang.String username, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Query(value = "page")
    java.lang.Integer page, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Query(value = "per_page")
    java.lang.Integer per_page, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Query(value = "order_by")
    java.lang.String order_by, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Query(value = "stats")
    java.lang.Boolean stats, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Query(value = "resolution")
    java.lang.String resolution, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Query(value = "quantity")
    java.lang.Integer quantity, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Query(value = "orientation")
    java.lang.String orientation, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.intermedia.intermedia.data.photo.model.Photo>> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "users/{username}/likes")
    public abstract java.lang.Object getUserLikes(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Path(value = "username")
    java.lang.String username, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Query(value = "page")
    java.lang.Integer page, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Query(value = "per_page")
    java.lang.Integer per_page, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Query(value = "order_by")
    java.lang.String order_by, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Query(value = "orientation")
    java.lang.String orientation, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.intermedia.intermedia.data.photo.model.Photo>> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "users/{username}/collections")
    public abstract java.lang.Object getUserCollections(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Path(value = "username")
    java.lang.String username, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Query(value = "page")
    java.lang.Integer page, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Query(value = "per_page")
    java.lang.Integer per_page, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.intermedia.intermedia.data.collection.model.Collection>> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "users/{username}/statistics")
    public abstract java.lang.Object getUserStatistics(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Path(value = "username")
    java.lang.String username, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Query(value = "resolution")
    java.lang.String resolution, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Query(value = "quantity")
    java.lang.Integer quantity, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.intermedia.intermedia.data.common.model.UserStatistics> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "me")
    public abstract java.lang.Object getUserPrivateProfile(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.intermedia.intermedia.data.user.model.Me> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.PUT(value = "me")
    public abstract java.lang.Object updateUserPrivateProfile(@org.jetbrains.annotations.Nullable
    @retrofit2.http.Query(value = "username")
    java.lang.String username, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Query(value = "first_name")
    java.lang.String first_name, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Query(value = "last_name")
    java.lang.String last_name, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Query(value = "email")
    java.lang.String email, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Query(value = "url")
    java.lang.String url, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Query(value = "instagram_username")
    java.lang.String instagram_username, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Query(value = "location")
    java.lang.String location, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Query(value = "bio")
    java.lang.String bio, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.intermedia.intermedia.data.user.model.Me> continuation);
}