package com.intermedia.intermedia.data.photo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\f\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J3\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\u0004\u001a\u00020\u00052\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u000bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ;\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012Jk\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u000bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cJ\u001b\u0010\u001d\u001a\u00020\u001e2\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J!\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 2\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u00c9\u0001\u0010\"\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\n\b\u0001\u0010#\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010$\u001a\u0004\u0018\u00010\u00162\u0010\b\u0001\u0010%\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010\u000e2\n\b\u0001\u0010\'\u001a\u0004\u0018\u00010(2\n\b\u0001\u0010)\u001a\u0004\u0018\u00010(2\n\b\u0001\u0010*\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010+\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010,\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010-\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010.\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010/\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u00100\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u00101\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u00102\u001a\u0004\u0018\u00010\u000bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00103\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u00064"}, d2 = {"Lcom/intermedia/intermedia/data/photo/PhotoService;", "", "getPhoto", "Lcom/intermedia/intermedia/data/photo/model/Photo;", "id", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPhotoStats", "Lcom/intermedia/intermedia/data/common/model/PhotoStatistics;", "resolution", "quantity", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPhotos", "", "page", "per_page", "order_by", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRandomPhotos", "collectionsId", "featured", "", "username", "query", "orientation", "contentFilter", "count", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "likeAPhoto", "Lokhttp3/ResponseBody;", "unlikeAPhoto", "Lretrofit2/Response;", "", "updatePhoto", "description", "show_on_profile", "tags", "Lcom/intermedia/intermedia/data/photo/model/Tag;", "latitude", "", "longitude", "name", "city", "country", "make", "model", "exposure_time", "aperture_value", "focal_length", "iso_speed_ratings", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface PhotoService {
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "photos")
    public abstract java.lang.Object getPhotos(@org.jetbrains.annotations.Nullable
    @retrofit2.http.Query(value = "page")
    java.lang.Integer page, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Query(value = "per_page")
    java.lang.Integer per_page, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Query(value = "order_by")
    java.lang.String order_by, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.intermedia.intermedia.data.photo.model.Photo>> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "photos/{id}")
    public abstract java.lang.Object getPhoto(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Path(value = "id")
    java.lang.String id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.intermedia.intermedia.data.photo.model.Photo> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "photos/random")
    public abstract java.lang.Object getRandomPhotos(@org.jetbrains.annotations.Nullable
    @retrofit2.http.Query(value = "collections")
    java.lang.String collectionsId, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Query(value = "featured")
    java.lang.Boolean featured, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Query(value = "username")
    java.lang.String username, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Query(value = "query")
    java.lang.String query, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Query(value = "orientation")
    java.lang.String orientation, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Query(value = "content_filter")
    java.lang.String contentFilter, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Query(value = "count")
    java.lang.Integer count, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.intermedia.intermedia.data.photo.model.Photo>> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "photos/{id}/statistics")
    public abstract java.lang.Object getPhotoStats(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Path(value = "id")
    java.lang.String id, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Query(value = "resolution")
    java.lang.String resolution, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Query(value = "quantity")
    java.lang.Integer quantity, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.intermedia.intermedia.data.common.model.PhotoStatistics> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.PUT(value = "photos/{id}")
    public abstract java.lang.Object updatePhoto(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Path(value = "id")
    java.lang.String id, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Query(value = "description")
    java.lang.String description, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Query(value = "show_on_profile")
    java.lang.Boolean show_on_profile, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Query(value = "tags")
    java.util.List<com.intermedia.intermedia.data.photo.model.Tag> tags, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Query(value = "location[latitude]")
    java.lang.Double latitude, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Query(value = "location[longitude]")
    java.lang.Double longitude, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Query(value = "location[name]")
    java.lang.String name, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Query(value = "location[city]")
    java.lang.String city, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Query(value = "location[country]")
    java.lang.String country, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Query(value = "exif[make]")
    java.lang.String make, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Query(value = "exif[model]")
    java.lang.String model, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Query(value = "exif[exposure_time]")
    java.lang.String exposure_time, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Query(value = "exif[aperture_value]")
    java.lang.String aperture_value, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Query(value = "exif[focal_length]")
    java.lang.String focal_length, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Query(value = "exif[iso_speed_ratings]")
    java.lang.Integer iso_speed_ratings, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.intermedia.intermedia.data.photo.model.Photo> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.POST(value = "photos/{id}/like")
    public abstract java.lang.Object likeAPhoto(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Path(value = "id")
    java.lang.String id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super okhttp3.ResponseBody> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.DELETE(value = "photos/{id}/like")
    public abstract java.lang.Object unlikeAPhoto(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Path(value = "id")
    java.lang.String id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<kotlin.Unit>> continuation);
}