package com.intermedia.intermedia.data.collection.model;

import java.lang.System;

@kotlinx.parcelize.Parcelize
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u00a1\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0010\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u00a2\u0006\u0002\u0010\u0019J\t\u00101\u001a\u00020\u0003H\u00c6\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u00103\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010H\u00c6\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003J\u0011\u00105\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0010H\u00c6\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0016H\u00c6\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0018H\u00c6\u0003J\t\u00108\u001a\u00020\u0003H\u00c6\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010<\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001dJ\u0010\u0010=\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001dJ\t\u0010>\u001a\u00020\fH\u00c6\u0003J\u0010\u0010?\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001dJ\u00c8\u0001\u0010@\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00102\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u00c6\u0001\u00a2\u0006\u0002\u0010AJ\t\u0010B\u001a\u00020\fH\u00d6\u0001J\u0013\u0010C\u001a\u00020\t2\b\u0010D\u001a\u0004\u0018\u00010EH\u00d6\u0003J\t\u0010F\u001a\u00020\fH\u00d6\u0001J\t\u0010G\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020\fH\u00d6\u0001R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0015\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0015\u0010\n\u001a\u0004\u0018\u00010\t\u00a2\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b!\u0010\u001dR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010 R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0019\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0015\u0010\r\u001a\u0004\u0018\u00010\t\u00a2\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\'\u0010\u001dR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010 R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010 R\u0019\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010&R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010 R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010 R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u00100\u00a8\u0006M"}, d2 = {"Lcom/intermedia/intermedia/data/collection/model/Collection;", "Landroid/os/Parcelable;", "id", "", "title", "description", "published_at", "updated_at", "curated", "", "featured", "total_photos", "", "private", "share_key", "tags", "", "Lcom/intermedia/intermedia/data/photo/model/Tag;", "cover_photo", "Lcom/intermedia/intermedia/data/photo/model/Photo;", "preview_photos", "user", "Lcom/intermedia/intermedia/data/user/model/User;", "links", "Lcom/intermedia/intermedia/data/collection/model/Links;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;ILjava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Lcom/intermedia/intermedia/data/photo/model/Photo;Ljava/util/List;Lcom/intermedia/intermedia/data/user/model/User;Lcom/intermedia/intermedia/data/collection/model/Links;)V", "getCover_photo", "()Lcom/intermedia/intermedia/data/photo/model/Photo;", "getCurated", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getDescription", "()Ljava/lang/String;", "getFeatured", "getId", "getLinks", "()Lcom/intermedia/intermedia/data/collection/model/Links;", "getPreview_photos", "()Ljava/util/List;", "getPrivate", "getPublished_at", "getShare_key", "getTags", "getTitle", "getTotal_photos", "()I", "getUpdated_at", "getUser", "()Lcom/intermedia/intermedia/data/user/model/User;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;ILjava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Lcom/intermedia/intermedia/data/photo/model/Photo;Ljava/util/List;Lcom/intermedia/intermedia/data/user/model/User;Lcom/intermedia/intermedia/data/collection/model/Links;)Lcom/intermedia/intermedia/data/collection/model/Collection;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class Collection implements android.os.Parcelable {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String id = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String title = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String description = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String published_at = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String updated_at = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Boolean curated = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Boolean featured = null;
    private final int total_photos = 0;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String share_key = null;
    @org.jetbrains.annotations.Nullable
    private final java.util.List<com.intermedia.intermedia.data.photo.model.Tag> tags = null;
    @org.jetbrains.annotations.Nullable
    private final com.intermedia.intermedia.data.photo.model.Photo cover_photo = null;
    @org.jetbrains.annotations.Nullable
    private final java.util.List<com.intermedia.intermedia.data.photo.model.Photo> preview_photos = null;
    @org.jetbrains.annotations.Nullable
    private final com.intermedia.intermedia.data.user.model.User user = null;
    @org.jetbrains.annotations.Nullable
    private final com.intermedia.intermedia.data.collection.model.Links links = null;
    public static final android.os.Parcelable.Creator<com.intermedia.intermedia.data.collection.model.Collection> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.intermedia.intermedia.data.collection.model.Collection copy(@org.jetbrains.annotations.NotNull
    java.lang.String id, @org.jetbrains.annotations.NotNull
    java.lang.String title, @org.jetbrains.annotations.Nullable
    java.lang.String description, @org.jetbrains.annotations.Nullable
    java.lang.String published_at, @org.jetbrains.annotations.Nullable
    java.lang.String updated_at, @org.jetbrains.annotations.Nullable
    java.lang.Boolean curated, @org.jetbrains.annotations.Nullable
    java.lang.Boolean featured, int total_photos, @org.jetbrains.annotations.Nullable
    java.lang.Boolean p8_1990234817, @org.jetbrains.annotations.Nullable
    java.lang.String share_key, @org.jetbrains.annotations.Nullable
    java.util.List<com.intermedia.intermedia.data.photo.model.Tag> tags, @org.jetbrains.annotations.Nullable
    com.intermedia.intermedia.data.photo.model.Photo cover_photo, @org.jetbrains.annotations.Nullable
    java.util.List<com.intermedia.intermedia.data.photo.model.Photo> preview_photos, @org.jetbrains.annotations.Nullable
    com.intermedia.intermedia.data.user.model.User user, @org.jetbrains.annotations.Nullable
    com.intermedia.intermedia.data.collection.model.Links links) {
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
    
    public Collection(@org.jetbrains.annotations.NotNull
    java.lang.String id, @org.jetbrains.annotations.NotNull
    java.lang.String title, @org.jetbrains.annotations.Nullable
    java.lang.String description, @org.jetbrains.annotations.Nullable
    java.lang.String published_at, @org.jetbrains.annotations.Nullable
    java.lang.String updated_at, @org.jetbrains.annotations.Nullable
    java.lang.Boolean curated, @org.jetbrains.annotations.Nullable
    java.lang.Boolean featured, int total_photos, @org.jetbrains.annotations.Nullable
    java.lang.Boolean p8_1990234817, @org.jetbrains.annotations.Nullable
    java.lang.String share_key, @org.jetbrains.annotations.Nullable
    java.util.List<com.intermedia.intermedia.data.photo.model.Tag> tags, @org.jetbrains.annotations.Nullable
    com.intermedia.intermedia.data.photo.model.Photo cover_photo, @org.jetbrains.annotations.Nullable
    java.util.List<com.intermedia.intermedia.data.photo.model.Photo> preview_photos, @org.jetbrains.annotations.Nullable
    com.intermedia.intermedia.data.user.model.User user, @org.jetbrains.annotations.Nullable
    com.intermedia.intermedia.data.collection.model.Links links) {
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
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getDescription() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getPublished_at() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getUpdated_at() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean getCurated() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean getFeatured() {
        return null;
    }
    
    public final int component8() {
        return 0;
    }
    
    public final int getTotal_photos() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean getPrivate() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getShare_key() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.intermedia.intermedia.data.photo.model.Tag> component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.intermedia.intermedia.data.photo.model.Tag> getTags() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.intermedia.intermedia.data.photo.model.Photo component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.intermedia.intermedia.data.photo.model.Photo getCover_photo() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.intermedia.intermedia.data.photo.model.Photo> component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.intermedia.intermedia.data.photo.model.Photo> getPreview_photos() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.intermedia.intermedia.data.user.model.User component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.intermedia.intermedia.data.user.model.User getUser() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.intermedia.intermedia.data.collection.model.Links component15() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.intermedia.intermedia.data.collection.model.Links getLinks() {
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
    public static final class Creator implements android.os.Parcelable.Creator<com.intermedia.intermedia.data.collection.model.Collection> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public final com.intermedia.intermedia.data.collection.model.Collection createFromParcel(@org.jetbrains.annotations.NotNull
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public final com.intermedia.intermedia.data.collection.model.Collection[] newArray(int size) {
            return null;
        }
    }
}