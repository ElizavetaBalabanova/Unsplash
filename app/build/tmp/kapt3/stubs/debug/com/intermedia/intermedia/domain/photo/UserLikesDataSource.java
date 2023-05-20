package com.intermedia.intermedia.domain.photo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B1\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u00a2\u0006\u0002\u0010\rJ\'\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0015"}, d2 = {"Lcom/intermedia/intermedia/domain/photo/UserLikesDataSource;", "Lcom/intermedia/intermedia/domain/BaseDataSource;", "Lcom/intermedia/intermedia/data/photo/model/Photo;", "userService", "Lcom/intermedia/intermedia/data/user/UserService;", "username", "", "order", "Lcom/intermedia/intermedia/domain/photo/UserLikesDataSource$Companion$Order;", "orientation", "Lcom/intermedia/intermedia/domain/photo/UserLikesDataSource$Companion$Orientation;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "(Lcom/intermedia/intermedia/data/user/UserService;Ljava/lang/String;Lcom/intermedia/intermedia/domain/photo/UserLikesDataSource$Companion$Order;Lcom/intermedia/intermedia/domain/photo/UserLikesDataSource$Companion$Orientation;Lkotlinx/coroutines/CoroutineScope;)V", "getPage", "", "page", "", "perPage", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_debug"})
public final class UserLikesDataSource extends com.intermedia.intermedia.domain.BaseDataSource<com.intermedia.intermedia.data.photo.model.Photo> {
    private final com.intermedia.intermedia.data.user.UserService userService = null;
    private final java.lang.String username = null;
    private final com.intermedia.intermedia.domain.photo.UserLikesDataSource.Companion.Order order;
    private final com.intermedia.intermedia.domain.photo.UserLikesDataSource.Companion.Orientation orientation;
    @org.jetbrains.annotations.NotNull
    public static final com.intermedia.intermedia.domain.photo.UserLikesDataSource.Companion Companion = null;
    
    public UserLikesDataSource(@org.jetbrains.annotations.NotNull
    com.intermedia.intermedia.data.user.UserService userService, @org.jetbrains.annotations.NotNull
    java.lang.String username, @org.jetbrains.annotations.Nullable
    com.intermedia.intermedia.domain.photo.UserLikesDataSource.Companion.Order order, @org.jetbrains.annotations.Nullable
    com.intermedia.intermedia.domain.photo.UserLikesDataSource.Companion.Orientation orientation, @org.jetbrains.annotations.NotNull
    kotlinx.coroutines.CoroutineScope scope) {
        super(null);
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getPage(int page, int perPage, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.intermedia.intermedia.data.photo.model.Photo>> continuation) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0005"}, d2 = {"Lcom/intermedia/intermedia/domain/photo/UserLikesDataSource$Companion;", "", "()V", "Order", "Orientation", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t\u00a8\u0006\n"}, d2 = {"Lcom/intermedia/intermedia/domain/photo/UserLikesDataSource$Companion$Order;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "LATEST", "OLDEST", "POPULAR", "app_debug"})
        public static enum Order {
            /*public static final*/ LATEST /* = new LATEST(null) */,
            /*public static final*/ OLDEST /* = new OLDEST(null) */,
            /*public static final*/ POPULAR /* = new POPULAR(null) */;
            @org.jetbrains.annotations.NotNull
            private final java.lang.String value = null;
            
            Order(java.lang.String value) {
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String getValue() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n\u00a8\u0006\u000b"}, d2 = {"Lcom/intermedia/intermedia/domain/photo/UserLikesDataSource$Companion$Orientation;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "ALL", "LANDSCAPE", "PORTRAIT", "SQUARISH", "app_debug"})
        public static enum Orientation {
            /*public static final*/ ALL /* = new ALL(null) */,
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