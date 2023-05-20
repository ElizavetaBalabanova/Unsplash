package com.intermedia.intermedia.data.common.model;

import java.lang.System;

@kotlinx.parcelize.Parcelize
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\tH\u00c6\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u00c6\u0001J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u00d6\u0003J\t\u0010\u001e\u001a\u00020\u0019H\u00d6\u0001J\t\u0010\u001f\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0019H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006%"}, d2 = {"Lcom/intermedia/intermedia/data/common/model/PhotoStatistics;", "Landroid/os/Parcelable;", "id", "", "downloads", "Lcom/intermedia/intermedia/data/common/model/Downloads;", "views", "Lcom/intermedia/intermedia/data/common/model/Views;", "likes", "Lcom/intermedia/intermedia/data/common/model/Likes;", "(Ljava/lang/String;Lcom/intermedia/intermedia/data/common/model/Downloads;Lcom/intermedia/intermedia/data/common/model/Views;Lcom/intermedia/intermedia/data/common/model/Likes;)V", "getDownloads", "()Lcom/intermedia/intermedia/data/common/model/Downloads;", "getId", "()Ljava/lang/String;", "getLikes", "()Lcom/intermedia/intermedia/data/common/model/Likes;", "getViews", "()Lcom/intermedia/intermedia/data/common/model/Views;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class PhotoStatistics implements android.os.Parcelable {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String id = null;
    @org.jetbrains.annotations.NotNull
    private final com.intermedia.intermedia.data.common.model.Downloads downloads = null;
    @org.jetbrains.annotations.NotNull
    private final com.intermedia.intermedia.data.common.model.Views views = null;
    @org.jetbrains.annotations.NotNull
    private final com.intermedia.intermedia.data.common.model.Likes likes = null;
    public static final android.os.Parcelable.Creator<com.intermedia.intermedia.data.common.model.PhotoStatistics> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.intermedia.intermedia.data.common.model.PhotoStatistics copy(@org.jetbrains.annotations.NotNull
    java.lang.String id, @org.jetbrains.annotations.NotNull
    com.intermedia.intermedia.data.common.model.Downloads downloads, @org.jetbrains.annotations.NotNull
    com.intermedia.intermedia.data.common.model.Views views, @org.jetbrains.annotations.NotNull
    com.intermedia.intermedia.data.common.model.Likes likes) {
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
    
    public PhotoStatistics(@org.jetbrains.annotations.NotNull
    java.lang.String id, @org.jetbrains.annotations.NotNull
    com.intermedia.intermedia.data.common.model.Downloads downloads, @org.jetbrains.annotations.NotNull
    com.intermedia.intermedia.data.common.model.Views views, @org.jetbrains.annotations.NotNull
    com.intermedia.intermedia.data.common.model.Likes likes) {
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
    public final com.intermedia.intermedia.data.common.model.Downloads component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.intermedia.intermedia.data.common.model.Downloads getDownloads() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.intermedia.intermedia.data.common.model.Views component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.intermedia.intermedia.data.common.model.Views getViews() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.intermedia.intermedia.data.common.model.Likes component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.intermedia.intermedia.data.common.model.Likes getLikes() {
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
    public static final class Creator implements android.os.Parcelable.Creator<com.intermedia.intermedia.data.common.model.PhotoStatistics> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public final com.intermedia.intermedia.data.common.model.PhotoStatistics createFromParcel(@org.jetbrains.annotations.NotNull
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public final com.intermedia.intermedia.data.common.model.PhotoStatistics[] newArray(int size) {
            return null;
        }
    }
}