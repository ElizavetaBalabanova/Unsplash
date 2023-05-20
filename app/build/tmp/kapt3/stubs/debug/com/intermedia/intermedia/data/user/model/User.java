package com.intermedia.intermedia.data.user.model;

import java.lang.System;

@kotlinx.parcelize.Parcelize
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b;\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u00e5\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e\u00a2\u0006\u0002\u0010 J\t\u0010@\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010C\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003\u00a2\u0006\u0002\u0010&J\u0010\u0010D\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003\u00a2\u0006\u0002\u0010&J\u0010\u0010E\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003\u00a2\u0006\u0002\u0010&J\u0010\u0010F\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003\u00a2\u0006\u0002\u0010*J\u0010\u0010G\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003\u00a2\u0006\u0002\u0010&J\u0010\u0010H\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003\u00a2\u0006\u0002\u0010&J\u0010\u0010I\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003\u00a2\u0006\u0002\u0010&J\u000b\u0010J\u001a\u0004\u0018\u00010\u0018H\u00c6\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u001aH\u00c6\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u001cH\u00c6\u0003J\u0011\u0010N\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001eH\u00c6\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u009a\u0002\u0010V\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001eH\u00c6\u0001\u00a2\u0006\u0002\u0010WJ\t\u0010X\u001a\u00020\u000fH\u00d6\u0001J\u0013\u0010Y\u001a\u00020\u00132\b\u0010Z\u001a\u0004\u0018\u00010[H\u00d6\u0003J\t\u0010\\\u001a\u00020\u000fH\u00d6\u0001J\t\u0010]\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010^\u001a\u00020_2\u0006\u0010`\u001a\u00020a2\u0006\u0010b\u001a\u00020\u000fH\u00d6\u0001R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\n\n\u0002\u0010\'\u001a\u0004\b%\u0010&R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010$R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\n\n\u0002\u0010+\u001a\u0004\b)\u0010*R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\n\n\u0002\u0010\'\u001a\u0004\b,\u0010&R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\n\n\u0002\u0010\'\u001a\u0004\b-\u0010&R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010$R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010$R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010$R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u0010$R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010$R\u0019\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u0010$R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\n\n\u0002\u0010\'\u001a\u0004\b:\u0010&R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\n\n\u0002\u0010\'\u001a\u0004\b;\u0010&R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\n\n\u0002\u0010\'\u001a\u0004\b<\u0010&R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b=\u0010$R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u0010$R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b?\u0010$\u00a8\u0006c"}, d2 = {"Lcom/intermedia/intermedia/data/user/model/User;", "Landroid/os/Parcelable;", "id", "", "updated_at", "username", "name", "first_name", "last_name", "instagram_username", "twitter_username", "portfolio_url", "bio", "location", "total_likes", "", "total_photos", "total_collections", "followed_by_user", "", "followers_count", "following_count", "downloads", "profile_image", "Lcom/intermedia/intermedia/data/user/model/ProfileImage;", "badge", "Lcom/intermedia/intermedia/data/user/model/Badge;", "links", "Lcom/intermedia/intermedia/data/user/model/Links;", "photos", "", "Lcom/intermedia/intermedia/data/photo/model/Photo;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/intermedia/intermedia/data/user/model/ProfileImage;Lcom/intermedia/intermedia/data/user/model/Badge;Lcom/intermedia/intermedia/data/user/model/Links;Ljava/util/List;)V", "getBadge", "()Lcom/intermedia/intermedia/data/user/model/Badge;", "getBio", "()Ljava/lang/String;", "getDownloads", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getFirst_name", "getFollowed_by_user", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getFollowers_count", "getFollowing_count", "getId", "getInstagram_username", "getLast_name", "getLinks", "()Lcom/intermedia/intermedia/data/user/model/Links;", "getLocation", "getName", "getPhotos", "()Ljava/util/List;", "getPortfolio_url", "getProfile_image", "()Lcom/intermedia/intermedia/data/user/model/ProfileImage;", "getTotal_collections", "getTotal_likes", "getTotal_photos", "getTwitter_username", "getUpdated_at", "getUsername", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/intermedia/intermedia/data/user/model/ProfileImage;Lcom/intermedia/intermedia/data/user/model/Badge;Lcom/intermedia/intermedia/data/user/model/Links;Ljava/util/List;)Lcom/intermedia/intermedia/data/user/model/User;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class User implements android.os.Parcelable {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String id = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String updated_at = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String username = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String name = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String first_name = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String last_name = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String instagram_username = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String twitter_username = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String portfolio_url = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String bio = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String location = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer total_likes = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer total_photos = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer total_collections = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Boolean followed_by_user = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer followers_count = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer following_count = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer downloads = null;
    @org.jetbrains.annotations.Nullable
    private final com.intermedia.intermedia.data.user.model.ProfileImage profile_image = null;
    @org.jetbrains.annotations.Nullable
    private final com.intermedia.intermedia.data.user.model.Badge badge = null;
    @org.jetbrains.annotations.Nullable
    private final com.intermedia.intermedia.data.user.model.Links links = null;
    @org.jetbrains.annotations.Nullable
    private final java.util.List<com.intermedia.intermedia.data.photo.model.Photo> photos = null;
    public static final android.os.Parcelable.Creator<com.intermedia.intermedia.data.user.model.User> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.intermedia.intermedia.data.user.model.User copy(@org.jetbrains.annotations.NotNull
    java.lang.String id, @org.jetbrains.annotations.Nullable
    java.lang.String updated_at, @org.jetbrains.annotations.Nullable
    java.lang.String username, @org.jetbrains.annotations.Nullable
    java.lang.String name, @org.jetbrains.annotations.Nullable
    java.lang.String first_name, @org.jetbrains.annotations.Nullable
    java.lang.String last_name, @org.jetbrains.annotations.Nullable
    java.lang.String instagram_username, @org.jetbrains.annotations.Nullable
    java.lang.String twitter_username, @org.jetbrains.annotations.Nullable
    java.lang.String portfolio_url, @org.jetbrains.annotations.Nullable
    java.lang.String bio, @org.jetbrains.annotations.Nullable
    java.lang.String location, @org.jetbrains.annotations.Nullable
    java.lang.Integer total_likes, @org.jetbrains.annotations.Nullable
    java.lang.Integer total_photos, @org.jetbrains.annotations.Nullable
    java.lang.Integer total_collections, @org.jetbrains.annotations.Nullable
    java.lang.Boolean followed_by_user, @org.jetbrains.annotations.Nullable
    java.lang.Integer followers_count, @org.jetbrains.annotations.Nullable
    java.lang.Integer following_count, @org.jetbrains.annotations.Nullable
    java.lang.Integer downloads, @org.jetbrains.annotations.Nullable
    com.intermedia.intermedia.data.user.model.ProfileImage profile_image, @org.jetbrains.annotations.Nullable
    com.intermedia.intermedia.data.user.model.Badge badge, @org.jetbrains.annotations.Nullable
    com.intermedia.intermedia.data.user.model.Links links, @org.jetbrains.annotations.Nullable
    java.util.List<com.intermedia.intermedia.data.photo.model.Photo> photos) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public User(@org.jetbrains.annotations.NotNull
    java.lang.String id, @org.jetbrains.annotations.Nullable
    java.lang.String updated_at, @org.jetbrains.annotations.Nullable
    java.lang.String username, @org.jetbrains.annotations.Nullable
    java.lang.String name, @org.jetbrains.annotations.Nullable
    java.lang.String first_name, @org.jetbrains.annotations.Nullable
    java.lang.String last_name, @org.jetbrains.annotations.Nullable
    java.lang.String instagram_username, @org.jetbrains.annotations.Nullable
    java.lang.String twitter_username, @org.jetbrains.annotations.Nullable
    java.lang.String portfolio_url, @org.jetbrains.annotations.Nullable
    java.lang.String bio, @org.jetbrains.annotations.Nullable
    java.lang.String location, @org.jetbrains.annotations.Nullable
    java.lang.Integer total_likes, @org.jetbrains.annotations.Nullable
    java.lang.Integer total_photos, @org.jetbrains.annotations.Nullable
    java.lang.Integer total_collections, @org.jetbrains.annotations.Nullable
    java.lang.Boolean followed_by_user, @org.jetbrains.annotations.Nullable
    java.lang.Integer followers_count, @org.jetbrains.annotations.Nullable
    java.lang.Integer following_count, @org.jetbrains.annotations.Nullable
    java.lang.Integer downloads, @org.jetbrains.annotations.Nullable
    com.intermedia.intermedia.data.user.model.ProfileImage profile_image, @org.jetbrains.annotations.Nullable
    com.intermedia.intermedia.data.user.model.Badge badge, @org.jetbrains.annotations.Nullable
    com.intermedia.intermedia.data.user.model.Links links, @org.jetbrains.annotations.Nullable
    java.util.List<com.intermedia.intermedia.data.photo.model.Photo> photos) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getUpdated_at() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getUsername() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getFirst_name() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getLast_name() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getInstagram_username() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getTwitter_username() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getPortfolio_url() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getBio() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getLocation() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getTotal_likes() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getTotal_photos() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getTotal_collections() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean component15() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean getFollowed_by_user() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component16() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getFollowers_count() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component17() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getFollowing_count() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component18() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getDownloads() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.intermedia.intermedia.data.user.model.ProfileImage component19() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.intermedia.intermedia.data.user.model.ProfileImage getProfile_image() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.intermedia.intermedia.data.user.model.Badge component20() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.intermedia.intermedia.data.user.model.Badge getBadge() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.intermedia.intermedia.data.user.model.Links component21() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.intermedia.intermedia.data.user.model.Links getLinks() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.intermedia.intermedia.data.photo.model.Photo> component22() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.intermedia.intermedia.data.photo.model.Photo> getPhotos() {
        return null;
    }
    
    @java.lang.Override
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override
    public void writeToParcel(@org.jetbrains.annotations.NotNull
    android.os.Parcel parcel, int flags) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 3)
    public static final class Creator implements android.os.Parcelable.Creator<com.intermedia.intermedia.data.user.model.User> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public final com.intermedia.intermedia.data.user.model.User createFromParcel(@org.jetbrains.annotations.NotNull
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public final com.intermedia.intermedia.data.user.model.User[] newArray(int size) {
            return null;
        }
    }
}