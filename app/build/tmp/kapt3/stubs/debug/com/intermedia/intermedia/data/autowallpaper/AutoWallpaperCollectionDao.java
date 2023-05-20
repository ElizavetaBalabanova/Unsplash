package com.intermedia.intermedia.data.autowallpaper;

import java.lang.System;

@androidx.room.Dao
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0011\u0010\f\u001a\u00020\u000bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\'J\u001b\u0010\u000f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0010\u001a\u00020\u000bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0014\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00130\nH\'J\u0014\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00130\nH\'J\u0019\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0018"}, d2 = {"Lcom/intermedia/intermedia/data/autowallpaper/AutoWallpaperCollectionDao;", "", "delete", "", "id", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAutoWallpaperCollection", "Lcom/intermedia/intermedia/data/autowallpaper/model/AutoWallpaperCollection;", "getCountById", "Landroidx/lifecycle/LiveData;", "", "getNumberOfAutoWallpaperCollections", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNumberOfAutoWallpaperCollectionsLiveData", "getRandomAutoWallpaperCollectionId", "offset", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSelectedAutoWallpaperCollectionIds", "", "getSelectedAutoWallpaperCollections", "insert", "collection", "(Lcom/intermedia/intermedia/data/autowallpaper/model/AutoWallpaperCollection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface AutoWallpaperCollectionDao {
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM auto_wallpaper_collections ORDER BY date_added DESC")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.intermedia.intermedia.data.autowallpaper.model.AutoWallpaperCollection>> getSelectedAutoWallpaperCollections();
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT id FROM auto_wallpaper_collections")
    public abstract androidx.lifecycle.LiveData<java.util.List<java.lang.String>> getSelectedAutoWallpaperCollectionIds();
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "SELECT id FROM auto_wallpaper_collections LIMIT 1 OFFSET :offset")
    public abstract java.lang.Object getRandomAutoWallpaperCollectionId(int offset, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.String> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "SELECT COUNT(*) FROM auto_wallpaper_collections")
    public abstract java.lang.Object getNumberOfAutoWallpaperCollections(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Integer> continuation);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT COUNT(*) FROM auto_wallpaper_collections")
    public abstract androidx.lifecycle.LiveData<java.lang.Integer> getNumberOfAutoWallpaperCollectionsLiveData();
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT COUNT(*) FROM auto_wallpaper_collections WHERE id = :id")
    public abstract androidx.lifecycle.LiveData<java.lang.Integer> getCountById(@org.jetbrains.annotations.NotNull
    java.lang.String id);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Insert(onConflict = 1)
    public abstract java.lang.Object insert(@org.jetbrains.annotations.NotNull
    com.intermedia.intermedia.data.autowallpaper.model.AutoWallpaperCollection collection, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "DELETE FROM auto_wallpaper_collections WHERE id = :id")
    public abstract java.lang.Object delete(@org.jetbrains.annotations.NotNull
    java.lang.String id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM auto_wallpaper_collections WHERE id = :id")
    public abstract com.intermedia.intermedia.data.autowallpaper.model.AutoWallpaperCollection getAutoWallpaperCollection(@org.jetbrains.annotations.NotNull
    java.lang.String id);
}