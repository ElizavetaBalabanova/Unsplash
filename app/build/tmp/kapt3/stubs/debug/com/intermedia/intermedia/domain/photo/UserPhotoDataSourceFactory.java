package com.intermedia.intermedia.domain.photo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\u0002\u0010\u0013J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0014R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/intermedia/intermedia/domain/photo/UserPhotoDataSourceFactory;", "Lcom/intermedia/intermedia/domain/BaseDataSourceFactory;", "Lcom/intermedia/intermedia/data/photo/model/Photo;", "userService", "Lcom/intermedia/intermedia/data/user/UserService;", "username", "", "order", "Lcom/intermedia/intermedia/domain/photo/UserPhotoDataSource$Companion$Order;", "stats", "", "resolution", "Lcom/intermedia/intermedia/domain/photo/UserPhotoDataSource$Companion$Resolution;", "quantity", "", "orientation", "Lcom/intermedia/intermedia/domain/photo/UserPhotoDataSource$Companion$Orientation;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "(Lcom/intermedia/intermedia/data/user/UserService;Ljava/lang/String;Lcom/intermedia/intermedia/domain/photo/UserPhotoDataSource$Companion$Order;ZLcom/intermedia/intermedia/domain/photo/UserPhotoDataSource$Companion$Resolution;Ljava/lang/Integer;Lcom/intermedia/intermedia/domain/photo/UserPhotoDataSource$Companion$Orientation;Lkotlinx/coroutines/CoroutineScope;)V", "Ljava/lang/Integer;", "createDataSource", "Lcom/intermedia/intermedia/domain/photo/UserPhotoDataSource;", "app_debug"})
public final class UserPhotoDataSourceFactory extends com.intermedia.intermedia.domain.BaseDataSourceFactory<com.intermedia.intermedia.data.photo.model.Photo> {
    private final com.intermedia.intermedia.data.user.UserService userService = null;
    private final java.lang.String username = null;
    private final com.intermedia.intermedia.domain.photo.UserPhotoDataSource.Companion.Order order;
    private final boolean stats = false;
    private final com.intermedia.intermedia.domain.photo.UserPhotoDataSource.Companion.Resolution resolution;
    private final java.lang.Integer quantity = null;
    private final com.intermedia.intermedia.domain.photo.UserPhotoDataSource.Companion.Orientation orientation;
    private final kotlinx.coroutines.CoroutineScope scope = null;
    
    public UserPhotoDataSourceFactory(@org.jetbrains.annotations.NotNull
    com.intermedia.intermedia.data.user.UserService userService, @org.jetbrains.annotations.NotNull
    java.lang.String username, @org.jetbrains.annotations.Nullable
    com.intermedia.intermedia.domain.photo.UserPhotoDataSource.Companion.Order order, boolean stats, @org.jetbrains.annotations.Nullable
    com.intermedia.intermedia.domain.photo.UserPhotoDataSource.Companion.Resolution resolution, @org.jetbrains.annotations.Nullable
    java.lang.Integer quantity, @org.jetbrains.annotations.Nullable
    com.intermedia.intermedia.domain.photo.UserPhotoDataSource.Companion.Orientation orientation, @org.jetbrains.annotations.NotNull
    kotlinx.coroutines.CoroutineScope scope) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.intermedia.intermedia.domain.photo.UserPhotoDataSource createDataSource() {
        return null;
    }
}