package com.intermedia.intermedia.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 )2\u00020\u0001:\u0001)B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\fJ\u0010\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u0018\u001a\u00020\u0017J\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001aJ\u0016\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u000eJ4\u0010\u001e\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u000e2\b\u0010 \u001a\u0004\u0018\u00010\u000e2\b\u0010!\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\"\u001a\u00020\u001aJ\u0006\u0010#\u001a\u00020\u0017J\b\u0010$\u001a\u00020\u0017H\u0007J\u0016\u0010%\u001a\u00020\u00102\u0006\u0010&\u001a\u00020\u00102\u0006\u0010\'\u001a\u00020(R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b\u00a8\u0006*"}, d2 = {"Lcom/intermedia/intermedia/util/NotificationManager;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "notificationManager", "Landroidx/core/app/NotificationManagerCompat;", "getNotificationManager", "()Landroidx/core/app/NotificationManagerCompat;", "notificationManager$delegate", "Lkotlin/Lazy;", "getCurrentWallpaperPendingIntent", "Landroid/app/PendingIntent;", "id", "", "getProgressNotificationBuilder", "Landroidx/core/app/NotificationCompat$Builder;", "fileName", "cancelIntent", "getViewPendingIntent", "uri", "Landroid/net/Uri;", "hideNewAutoWallpaperNotification", "", "hideTileServiceNotification", "isNewAutoWallpaperNotificationEnabled", "", "preferenceValue", "showDownloadCompleteNotification", "showDownloadErrorNotification", "showNewAutoWallpaperNotification", "title", "subtitle", "previewUrl", "persist", "showTileServiceDownloadingNotification", "showTileServiceErrorNotification", "updateProgressNotification", "builder", "progress", "", "Companion", "app_debug"})
public final class NotificationManager {
    private final android.content.Context context = null;
    private final kotlin.Lazy notificationManager$delegate = null;
    @org.jetbrains.annotations.NotNull
    public static final com.intermedia.intermedia.util.NotificationManager.Companion Companion = null;
    private static final java.lang.String DOWNLOADS_CHANNEL_ID = "downloads_channel_id";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String NEW_AUTO_WALLPAPER_CHANNEL_ID = "new_auto_wallpaper_channel_id";
    private static final java.lang.String NEXT_AUTO_WALLPAPER_CHANNEL_ID = "next_auto_wallpaper_channel_id";
    private static final java.util.List<java.lang.String> OLD_CHANNEL_IDS = null;
    private static final int AUTO_WALLPAPER_TILE_NOTIFICATION_ID = 981;
    private static final int NEW_AUTO_WALLPAPER_NOTIFICATION_ID = 423;
    
    public NotificationManager(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super();
    }
    
    private final androidx.core.app.NotificationManagerCompat getNotificationManager() {
        return null;
    }
    
    public final void showTileServiceDownloadingNotification() {
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    public final void showTileServiceErrorNotification() {
    }
    
    public final void hideTileServiceNotification() {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.core.app.NotificationCompat.Builder getProgressNotificationBuilder(@org.jetbrains.annotations.NotNull
    java.lang.String fileName, @org.jetbrains.annotations.NotNull
    android.app.PendingIntent cancelIntent) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.core.app.NotificationCompat.Builder updateProgressNotification(@org.jetbrains.annotations.NotNull
    androidx.core.app.NotificationCompat.Builder builder, int progress) {
        return null;
    }
    
    public final void showDownloadCompleteNotification(@org.jetbrains.annotations.NotNull
    java.lang.String fileName, @org.jetbrains.annotations.NotNull
    android.net.Uri uri) {
    }
    
    public final void showDownloadErrorNotification(@org.jetbrains.annotations.NotNull
    java.lang.String fileName) {
    }
    
    public final void showNewAutoWallpaperNotification(@org.jetbrains.annotations.NotNull
    java.lang.String id, @org.jetbrains.annotations.Nullable
    java.lang.String title, @org.jetbrains.annotations.Nullable
    java.lang.String subtitle, @org.jetbrains.annotations.Nullable
    java.lang.String previewUrl, boolean persist) {
    }
    
    public final void hideNewAutoWallpaperNotification() {
    }
    
    public final boolean isNewAutoWallpaperNotificationEnabled(boolean preferenceValue) {
        return false;
    }
    
    private final android.app.PendingIntent getCurrentWallpaperPendingIntent(java.lang.String id) {
        return null;
    }
    
    private final android.app.PendingIntent getViewPendingIntent(android.net.Uri uri) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/intermedia/intermedia/util/NotificationManager$Companion;", "", "()V", "AUTO_WALLPAPER_TILE_NOTIFICATION_ID", "", "DOWNLOADS_CHANNEL_ID", "", "NEW_AUTO_WALLPAPER_CHANNEL_ID", "NEW_AUTO_WALLPAPER_NOTIFICATION_ID", "NEXT_AUTO_WALLPAPER_CHANNEL_ID", "OLD_CHANNEL_IDS", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}