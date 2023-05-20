package com.intermedia.intermedia.data.collection.model;

import java.lang.System;

@kotlinx.parcelize.Parcelize
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u000fH\u00d6\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u001c"}, d2 = {"Lcom/intermedia/intermedia/data/collection/model/CollectionPhotoResult;", "Landroid/os/Parcelable;", "photo", "Lcom/intermedia/intermedia/data/photo/model/Photo;", "collection", "Lcom/intermedia/intermedia/data/collection/model/Collection;", "(Lcom/intermedia/intermedia/data/photo/model/Photo;Lcom/intermedia/intermedia/data/collection/model/Collection;)V", "getCollection", "()Lcom/intermedia/intermedia/data/collection/model/Collection;", "getPhoto", "()Lcom/intermedia/intermedia/data/photo/model/Photo;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class CollectionPhotoResult implements android.os.Parcelable {
    @org.jetbrains.annotations.Nullable
    private final com.intermedia.intermedia.data.photo.model.Photo photo = null;
    @org.jetbrains.annotations.Nullable
    private final com.intermedia.intermedia.data.collection.model.Collection collection = null;
    public static final android.os.Parcelable.Creator<com.intermedia.intermedia.data.collection.model.CollectionPhotoResult> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.intermedia.intermedia.data.collection.model.CollectionPhotoResult copy(@org.jetbrains.annotations.Nullable
    com.intermedia.intermedia.data.photo.model.Photo photo, @org.jetbrains.annotations.Nullable
    com.intermedia.intermedia.data.collection.model.Collection collection) {
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
    
    public CollectionPhotoResult(@org.jetbrains.annotations.Nullable
    com.intermedia.intermedia.data.photo.model.Photo photo, @org.jetbrains.annotations.Nullable
    com.intermedia.intermedia.data.collection.model.Collection collection) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.intermedia.intermedia.data.photo.model.Photo component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.intermedia.intermedia.data.photo.model.Photo getPhoto() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.intermedia.intermedia.data.collection.model.Collection component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.intermedia.intermedia.data.collection.model.Collection getCollection() {
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
    public static final class Creator implements android.os.Parcelable.Creator<com.intermedia.intermedia.data.collection.model.CollectionPhotoResult> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public final com.intermedia.intermedia.data.collection.model.CollectionPhotoResult createFromParcel(@org.jetbrains.annotations.NotNull
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public final com.intermedia.intermedia.data.collection.model.CollectionPhotoResult[] newArray(int size) {
            return null;
        }
    }
}