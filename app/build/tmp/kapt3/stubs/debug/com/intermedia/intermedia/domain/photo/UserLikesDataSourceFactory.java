package com.intermedia.intermedia.domain.photo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u00a2\u0006\u0002\u0010\rJ\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/intermedia/intermedia/domain/photo/UserLikesDataSourceFactory;", "Lcom/intermedia/intermedia/domain/BaseDataSourceFactory;", "Lcom/intermedia/intermedia/data/photo/model/Photo;", "userService", "Lcom/intermedia/intermedia/data/user/UserService;", "username", "", "order", "Lcom/intermedia/intermedia/domain/photo/UserLikesDataSource$Companion$Order;", "orientation", "Lcom/intermedia/intermedia/domain/photo/UserLikesDataSource$Companion$Orientation;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "(Lcom/intermedia/intermedia/data/user/UserService;Ljava/lang/String;Lcom/intermedia/intermedia/domain/photo/UserLikesDataSource$Companion$Order;Lcom/intermedia/intermedia/domain/photo/UserLikesDataSource$Companion$Orientation;Lkotlinx/coroutines/CoroutineScope;)V", "createDataSource", "Lcom/intermedia/intermedia/domain/photo/UserLikesDataSource;", "app_debug"})
public final class UserLikesDataSourceFactory extends com.intermedia.intermedia.domain.BaseDataSourceFactory<com.intermedia.intermedia.data.photo.model.Photo> {
    private final com.intermedia.intermedia.data.user.UserService userService = null;
    private final java.lang.String username = null;
    private final com.intermedia.intermedia.domain.photo.UserLikesDataSource.Companion.Order order;
    private final com.intermedia.intermedia.domain.photo.UserLikesDataSource.Companion.Orientation orientation;
    private final kotlinx.coroutines.CoroutineScope scope = null;
    
    public UserLikesDataSourceFactory(@org.jetbrains.annotations.NotNull
    com.intermedia.intermedia.data.user.UserService userService, @org.jetbrains.annotations.NotNull
    java.lang.String username, @org.jetbrains.annotations.Nullable
    com.intermedia.intermedia.domain.photo.UserLikesDataSource.Companion.Order order, @org.jetbrains.annotations.Nullable
    com.intermedia.intermedia.domain.photo.UserLikesDataSource.Companion.Orientation orientation, @org.jetbrains.annotations.NotNull
    kotlinx.coroutines.CoroutineScope scope) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.intermedia.intermedia.domain.photo.UserLikesDataSource createDataSource() {
        return null;
    }
}