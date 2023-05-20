package com.intermedia.intermedia.data.autowallpaper;

import java.lang.System;

@androidx.room.Dao
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bg\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0011\u0010\u0007\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ%\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0014\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00050\u000fH\'J\u0019\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0014"}, d2 = {"Lcom/intermedia/intermedia/data/autowallpaper/AutoWallpaperHistoryDao;", "", "delete", "", "wallpaper", "Lcom/intermedia/intermedia/data/autowallpaper/model/AutoWallpaperHistory;", "(Lcom/intermedia/intermedia/data/autowallpaper/model/AutoWallpaperHistory;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAllAutoWallpaperHistory", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteOldAutoWallpaperHistory", "now", "", "threshold", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllAutoWallpaperHistory", "Landroidx/paging/DataSource$Factory;", "", "insert", "update", "Companion", "app_debug"})
public abstract interface AutoWallpaperHistoryDao {
    @org.jetbrains.annotations.NotNull
    public static final com.intermedia.intermedia.data.autowallpaper.AutoWallpaperHistoryDao.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM auto_wallpaper_history ORDER BY date DESC")
    public abstract androidx.paging.DataSource.Factory<java.lang.Integer, com.intermedia.intermedia.data.autowallpaper.model.AutoWallpaperHistory> getAllAutoWallpaperHistory();
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "DELETE FROM auto_wallpaper_history")
    public abstract java.lang.Object deleteAllAutoWallpaperHistory(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "DELETE FROM auto_wallpaper_history WHERE :now - date > :threshold")
    public abstract java.lang.Object deleteOldAutoWallpaperHistory(long now, long threshold, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Insert(onConflict = 1)
    public abstract java.lang.Object insert(@org.jetbrains.annotations.NotNull
    com.intermedia.intermedia.data.autowallpaper.model.AutoWallpaperHistory wallpaper, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Update
    public abstract java.lang.Object update(@org.jetbrains.annotations.NotNull
    com.intermedia.intermedia.data.autowallpaper.model.AutoWallpaperHistory wallpaper, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Delete
    public abstract java.lang.Object delete(@org.jetbrains.annotations.NotNull
    com.intermedia.intermedia.data.autowallpaper.model.AutoWallpaperHistory wallpaper, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 3)
    public final class DefaultImpls {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/intermedia/intermedia/data/autowallpaper/AutoWallpaperHistoryDao$Companion;", "", "()V", "ONE_MONTH", "", "app_debug"})
    public static final class Companion {
        private static final long ONE_MONTH = 0L;
        
        private Companion() {
            super();
        }
    }
}