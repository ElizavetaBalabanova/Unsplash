package com.intermedia.intermedia.domain.photo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\'\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/intermedia/intermedia/domain/photo/CollectionPhotoDataSource;", "Lcom/intermedia/intermedia/domain/BaseDataSource;", "Lcom/intermedia/intermedia/data/photo/model/Photo;", "collectionService", "Lcom/intermedia/intermedia/data/collection/CollectionService;", "collectionId", "", "scope", "Lkotlinx/coroutines/CoroutineScope;", "(Lcom/intermedia/intermedia/data/collection/CollectionService;Ljava/lang/String;Lkotlinx/coroutines/CoroutineScope;)V", "getPage", "", "page", "", "perPage", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class CollectionPhotoDataSource extends com.intermedia.intermedia.domain.BaseDataSource<com.intermedia.intermedia.data.photo.model.Photo> {
    private final com.intermedia.intermedia.data.collection.CollectionService collectionService = null;
    private final java.lang.String collectionId = null;
    
    public CollectionPhotoDataSource(@org.jetbrains.annotations.NotNull
    com.intermedia.intermedia.data.collection.CollectionService collectionService, @org.jetbrains.annotations.NotNull
    java.lang.String collectionId, @org.jetbrains.annotations.NotNull
    kotlinx.coroutines.CoroutineScope scope) {
        super(null);
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getPage(int page, int perPage, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.intermedia.intermedia.data.photo.model.Photo>> continuation) {
        return null;
    }
}