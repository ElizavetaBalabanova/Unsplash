package com.intermedia.intermedia.domain.photo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019BO\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\u0002\u0010\u0012J\'\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001a"}, d2 = {"Lcom/intermedia/intermedia/domain/photo/SearchPhotoDataSource;", "Lcom/intermedia/intermedia/domain/BaseDataSource;", "Lcom/intermedia/intermedia/data/photo/model/Photo;", "searchService", "Lcom/intermedia/intermedia/data/search/SearchService;", "query", "", "order", "Lcom/intermedia/intermedia/domain/photo/SearchPhotoDataSource$Companion$Order;", "collections", "contentFilter", "Lcom/intermedia/intermedia/domain/photo/SearchPhotoDataSource$Companion$ContentFilter;", "color", "Lcom/intermedia/intermedia/domain/photo/SearchPhotoDataSource$Companion$Color;", "orientation", "Lcom/intermedia/intermedia/domain/photo/SearchPhotoDataSource$Companion$Orientation;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "(Lcom/intermedia/intermedia/data/search/SearchService;Ljava/lang/String;Lcom/intermedia/intermedia/domain/photo/SearchPhotoDataSource$Companion$Order;Ljava/lang/String;Lcom/intermedia/intermedia/domain/photo/SearchPhotoDataSource$Companion$ContentFilter;Lcom/intermedia/intermedia/domain/photo/SearchPhotoDataSource$Companion$Color;Lcom/intermedia/intermedia/domain/photo/SearchPhotoDataSource$Companion$Orientation;Lkotlinx/coroutines/CoroutineScope;)V", "getPage", "", "page", "", "perPage", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_debug"})
public final class SearchPhotoDataSource extends com.intermedia.intermedia.domain.BaseDataSource<com.intermedia.intermedia.data.photo.model.Photo> {
    private final com.intermedia.intermedia.data.search.SearchService searchService = null;
    private final java.lang.String query = null;
    private final com.intermedia.intermedia.domain.photo.SearchPhotoDataSource.Companion.Order order;
    private final java.lang.String collections = null;
    private final com.intermedia.intermedia.domain.photo.SearchPhotoDataSource.Companion.ContentFilter contentFilter;
    private final com.intermedia.intermedia.domain.photo.SearchPhotoDataSource.Companion.Color color;
    private final com.intermedia.intermedia.domain.photo.SearchPhotoDataSource.Companion.Orientation orientation;
    @org.jetbrains.annotations.NotNull
    public static final com.intermedia.intermedia.domain.photo.SearchPhotoDataSource.Companion Companion = null;
    
    public SearchPhotoDataSource(@org.jetbrains.annotations.NotNull
    com.intermedia.intermedia.data.search.SearchService searchService, @org.jetbrains.annotations.NotNull
    java.lang.String query, @org.jetbrains.annotations.Nullable
    com.intermedia.intermedia.domain.photo.SearchPhotoDataSource.Companion.Order order, @org.jetbrains.annotations.Nullable
    java.lang.String collections, @org.jetbrains.annotations.Nullable
    com.intermedia.intermedia.domain.photo.SearchPhotoDataSource.Companion.ContentFilter contentFilter, @org.jetbrains.annotations.Nullable
    com.intermedia.intermedia.domain.photo.SearchPhotoDataSource.Companion.Color color, @org.jetbrains.annotations.Nullable
    com.intermedia.intermedia.domain.photo.SearchPhotoDataSource.Companion.Orientation orientation, @org.jetbrains.annotations.NotNull
    kotlinx.coroutines.CoroutineScope scope) {
        super(null);
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getPage(int page, int perPage, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.intermedia.intermedia.data.photo.model.Photo>> continuation) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0007"}, d2 = {"Lcom/intermedia/intermedia/domain/photo/SearchPhotoDataSource$Companion;", "", "()V", "Color", "ContentFilter", "Order", "Orientation", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b\u00a8\u0006\t"}, d2 = {"Lcom/intermedia/intermedia/domain/photo/SearchPhotoDataSource$Companion$Order;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "LATEST", "RELEVANT", "app_debug"})
        public static enum Order {
            /*public static final*/ LATEST /* = new LATEST(null) */,
            /*public static final*/ RELEVANT /* = new RELEVANT(null) */;
            @org.jetbrains.annotations.NotNull
            private final java.lang.String value = null;
            
            Order(java.lang.String value) {
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String getValue() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b\u00a8\u0006\t"}, d2 = {"Lcom/intermedia/intermedia/domain/photo/SearchPhotoDataSource$Companion$ContentFilter;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "LOW", "HIGH", "app_debug"})
        public static enum ContentFilter {
            /*public static final*/ LOW /* = new LOW(null) */,
            /*public static final*/ HIGH /* = new HIGH(null) */;
            @org.jetbrains.annotations.NotNull
            private final java.lang.String value = null;
            
            ContentFilter(java.lang.String value) {
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String getValue() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001b\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016\u00a8\u0006\u0017"}, d2 = {"Lcom/intermedia/intermedia/domain/photo/SearchPhotoDataSource$Companion$Color;", "", "titleRes", "", "value", "", "(Ljava/lang/String;IILjava/lang/String;)V", "getTitleRes", "()I", "getValue", "()Ljava/lang/String;", "ANY", "BLACK_AND_WHITE", "BLACK", "WHITE", "YELLOW", "ORANGE", "RED", "PURPLE", "MAGENTA", "GREEN", "TEAL", "BLUE", "app_debug"})
        public static enum Color {
            /*public static final*/ ANY /* = new ANY(0, null) */,
            /*public static final*/ BLACK_AND_WHITE /* = new BLACK_AND_WHITE(0, null) */,
            /*public static final*/ BLACK /* = new BLACK(0, null) */,
            /*public static final*/ WHITE /* = new WHITE(0, null) */,
            /*public static final*/ YELLOW /* = new YELLOW(0, null) */,
            /*public static final*/ ORANGE /* = new ORANGE(0, null) */,
            /*public static final*/ RED /* = new RED(0, null) */,
            /*public static final*/ PURPLE /* = new PURPLE(0, null) */,
            /*public static final*/ MAGENTA /* = new MAGENTA(0, null) */,
            /*public static final*/ GREEN /* = new GREEN(0, null) */,
            /*public static final*/ TEAL /* = new TEAL(0, null) */,
            /*public static final*/ BLUE /* = new BLUE(0, null) */;
            private final int titleRes = 0;
            @org.jetbrains.annotations.Nullable
            private final java.lang.String value = null;
            
            Color(@androidx.annotation.StringRes
            int titleRes, java.lang.String value) {
            }
            
            public final int getTitleRes() {
                return 0;
            }
            
            @org.jetbrains.annotations.Nullable
            public final java.lang.String getValue() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n\u00a8\u0006\u000b"}, d2 = {"Lcom/intermedia/intermedia/domain/photo/SearchPhotoDataSource$Companion$Orientation;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "ANY", "LANDSCAPE", "PORTRAIT", "SQUARISH", "app_debug"})
        public static enum Orientation {
            /*public static final*/ ANY /* = new ANY(null) */,
            /*public static final*/ LANDSCAPE /* = new LANDSCAPE(null) */,
            /*public static final*/ PORTRAIT /* = new PORTRAIT(null) */,
            /*public static final*/ SQUARISH /* = new SQUARISH(null) */;
            @org.jetbrains.annotations.Nullable
            private final java.lang.String value = null;
            
            Orientation(java.lang.String value) {
            }
            
            @org.jetbrains.annotations.Nullable
            public final java.lang.String getValue() {
                return null;
            }
        }
    }
}