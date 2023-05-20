package com.intermedia.intermedia.data.autowallpaper;

import java.lang.System;

@androidx.room.Database(entities = {com.intermedia.intermedia.data.autowallpaper.model.AutoWallpaperHistory.class, com.intermedia.intermedia.data.autowallpaper.model.AutoWallpaperCollection.class}, version = 2, exportSchema = true)
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\b"}, d2 = {"Lcom/intermedia/intermedia/data/autowallpaper/AutoWallpaperDatabase;", "Landroidx/room/RoomDatabase;", "()V", "autoWallpaperCollectionDao", "Lcom/intermedia/intermedia/data/autowallpaper/AutoWallpaperCollectionDao;", "autoWallpaperHistoryDao", "Lcom/intermedia/intermedia/data/autowallpaper/AutoWallpaperHistoryDao;", "Companion", "app_debug"})
public abstract class AutoWallpaperDatabase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull
    public static final com.intermedia.intermedia.data.autowallpaper.AutoWallpaperDatabase.Companion Companion = null;
    
    /**
     * Migrate from:
     * version 1 - using Room where the {@link AutoWallpaperCollection#id} is an Int
     * to
     * version 2 - using Room where the {@link AutoWallpaperCollection#id} is a String
     *
     * SQLite supports a limited operations for ALTER. Changing the type of a column is not
     * directly supported, so this is what we need to do:
     */
    @org.jetbrains.annotations.NotNull
    private static final androidx.room.migration.Migration MIGRATION_1_2 = null;
    
    public AutoWallpaperDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract com.intermedia.intermedia.data.autowallpaper.AutoWallpaperHistoryDao autoWallpaperHistoryDao();
    
    @org.jetbrains.annotations.NotNull
    public abstract com.intermedia.intermedia.data.autowallpaper.AutoWallpaperCollectionDao autoWallpaperCollectionDao();
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/intermedia/intermedia/data/autowallpaper/AutoWallpaperDatabase$Companion;", "", "()V", "MIGRATION_1_2", "Landroidx/room/migration/Migration;", "getMIGRATION_1_2", "()Landroidx/room/migration/Migration;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final androidx.room.migration.Migration getMIGRATION_1_2() {
            return null;
        }
    }
}