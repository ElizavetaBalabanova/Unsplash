package com.intermedia.intermedia.domain.photo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\u0002\u0010\u0012J\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/intermedia/intermedia/domain/photo/SearchPhotoDataSourceFactory;", "Lcom/intermedia/intermedia/domain/BaseDataSourceFactory;", "Lcom/intermedia/intermedia/data/photo/model/Photo;", "searchService", "Lcom/intermedia/intermedia/data/search/SearchService;", "query", "", "order", "Lcom/intermedia/intermedia/domain/photo/SearchPhotoDataSource$Companion$Order;", "collections", "contentFilter", "Lcom/intermedia/intermedia/domain/photo/SearchPhotoDataSource$Companion$ContentFilter;", "color", "Lcom/intermedia/intermedia/domain/photo/SearchPhotoDataSource$Companion$Color;", "orientation", "Lcom/intermedia/intermedia/domain/photo/SearchPhotoDataSource$Companion$Orientation;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "(Lcom/intermedia/intermedia/data/search/SearchService;Ljava/lang/String;Lcom/intermedia/intermedia/domain/photo/SearchPhotoDataSource$Companion$Order;Ljava/lang/String;Lcom/intermedia/intermedia/domain/photo/SearchPhotoDataSource$Companion$ContentFilter;Lcom/intermedia/intermedia/domain/photo/SearchPhotoDataSource$Companion$Color;Lcom/intermedia/intermedia/domain/photo/SearchPhotoDataSource$Companion$Orientation;Lkotlinx/coroutines/CoroutineScope;)V", "createDataSource", "Lcom/intermedia/intermedia/domain/photo/SearchPhotoDataSource;", "app_debug"})
public final class SearchPhotoDataSourceFactory extends com.intermedia.intermedia.domain.BaseDataSourceFactory<com.intermedia.intermedia.data.photo.model.Photo> {
    private final com.intermedia.intermedia.data.search.SearchService searchService = null;
    private final java.lang.String query = null;
    private final com.intermedia.intermedia.domain.photo.SearchPhotoDataSource.Companion.Order order;
    private final java.lang.String collections = null;
    private final com.intermedia.intermedia.domain.photo.SearchPhotoDataSource.Companion.ContentFilter contentFilter;
    private final com.intermedia.intermedia.domain.photo.SearchPhotoDataSource.Companion.Color color;
    private final com.intermedia.intermedia.domain.photo.SearchPhotoDataSource.Companion.Orientation orientation;
    private final kotlinx.coroutines.CoroutineScope scope = null;
    
    public SearchPhotoDataSourceFactory(@org.jetbrains.annotations.NotNull
    com.intermedia.intermedia.data.search.SearchService searchService, @org.jetbrains.annotations.NotNull
    java.lang.String query, @org.jetbrains.annotations.Nullable
    com.intermedia.intermedia.domain.photo.SearchPhotoDataSource.Companion.Order order, @org.jetbrains.annotations.Nullable
    java.lang.String collections, @org.jetbrains.annotations.Nullable
    com.intermedia.intermedia.domain.photo.SearchPhotoDataSource.Companion.ContentFilter contentFilter, @org.jetbrains.annotations.Nullable
    com.intermedia.intermedia.domain.photo.SearchPhotoDataSource.Companion.Color color, @org.jetbrains.annotations.Nullable
    com.intermedia.intermedia.domain.photo.SearchPhotoDataSource.Companion.Orientation orientation, @org.jetbrains.annotations.NotNull
    kotlinx.coroutines.CoroutineScope scope) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.intermedia.intermedia.domain.photo.SearchPhotoDataSource createDataSource() {
        return null;
    }
}