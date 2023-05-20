package com.intermedia.intermedia.data.search.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0003J-\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f\u00a8\u0006\u0018"}, d2 = {"Lcom/intermedia/intermedia/data/search/model/SearchPhotosResult;", "", "total", "", "total_pages", "results", "", "Lcom/intermedia/intermedia/data/photo/model/Photo;", "(IILjava/util/List;)V", "getResults", "()Ljava/util/List;", "getTotal", "()I", "getTotal_pages", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "app_debug"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class SearchPhotosResult {
    private final int total = 0;
    private final int total_pages = 0;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.intermedia.intermedia.data.photo.model.Photo> results = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.intermedia.intermedia.data.search.model.SearchPhotosResult copy(int total, int total_pages, @org.jetbrains.annotations.NotNull
    java.util.List<com.intermedia.intermedia.data.photo.model.Photo> results) {
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
    
    public SearchPhotosResult(int total, int total_pages, @org.jetbrains.annotations.NotNull
    java.util.List<com.intermedia.intermedia.data.photo.model.Photo> results) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getTotal() {
        return 0;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int getTotal_pages() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.intermedia.intermedia.data.photo.model.Photo> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.intermedia.intermedia.data.photo.model.Photo> getResults() {
        return null;
    }
}