package com.intermedia.intermedia.domain.photo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0010B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\'\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/intermedia/intermedia/domain/photo/PhotoDataSource;", "Lcom/intermedia/intermedia/domain/BaseDataSource;", "Lcom/intermedia/intermedia/data/photo/model/Photo;", "photoService", "Lcom/intermedia/intermedia/data/photo/PhotoService;", "order", "Lcom/intermedia/intermedia/domain/photo/PhotoDataSource$Companion$Order;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "(Lcom/intermedia/intermedia/data/photo/PhotoService;Lcom/intermedia/intermedia/domain/photo/PhotoDataSource$Companion$Order;Lkotlinx/coroutines/CoroutineScope;)V", "getPage", "", "page", "", "perPage", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_debug"})
public final class PhotoDataSource extends com.intermedia.intermedia.domain.BaseDataSource<com.intermedia.intermedia.data.photo.model.Photo> {
    private final com.intermedia.intermedia.data.photo.PhotoService photoService = null;
    private final com.intermedia.intermedia.domain.photo.PhotoDataSource.Companion.Order order;
    @org.jetbrains.annotations.NotNull
    public static final com.intermedia.intermedia.domain.photo.PhotoDataSource.Companion Companion = null;
    
    public PhotoDataSource(@org.jetbrains.annotations.NotNull
    com.intermedia.intermedia.data.photo.PhotoService photoService, @org.jetbrains.annotations.NotNull
    com.intermedia.intermedia.domain.photo.PhotoDataSource.Companion.Order order, @org.jetbrains.annotations.NotNull
    kotlinx.coroutines.CoroutineScope scope) {
        super(null);
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getPage(int page, int perPage, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.intermedia.intermedia.data.photo.model.Photo>> continuation) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/intermedia/intermedia/domain/photo/PhotoDataSource$Companion;", "", "()V", "Order", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r\u00a8\u0006\u000e"}, d2 = {"Lcom/intermedia/intermedia/domain/photo/PhotoDataSource$Companion$Order;", "", "titleRes", "", "value", "", "(Ljava/lang/String;IILjava/lang/String;)V", "getTitleRes", "()I", "getValue", "()Ljava/lang/String;", "LATEST", "OLDEST", "POPULAR", "app_debug"})
        public static enum Order {
            /*public static final*/ LATEST /* = new LATEST(0, null) */,
            /*public static final*/ OLDEST /* = new OLDEST(0, null) */,
            /*public static final*/ POPULAR /* = new POPULAR(0, null) */;
            private final int titleRes = 0;
            @org.jetbrains.annotations.NotNull
            private final java.lang.String value = null;
            
            Order(@androidx.annotation.StringRes
            int titleRes, java.lang.String value) {
            }
            
            public final int getTitleRes() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String getValue() {
                return null;
            }
        }
    }
}