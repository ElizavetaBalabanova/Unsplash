package com.intermedia.intermedia.worker;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 (2\u00020\u0001:\u0001(B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u0011\u0010\u0014\u001a\u00020\u0015H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\u0012H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J*\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001cH\u0002J\u0010\u0010 \u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0003J\u001f\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"2\u0006\u0010$\u001a\u00020%H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010&J\f\u0010\'\u001a\u00020\u0018*\u00020\u001aH\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006)"}, d2 = {"Lcom/intermedia/intermedia/worker/AutoWallpaperWorker;", "Landroidx/work/CoroutineWorker;", "context", "Landroid/content/Context;", "params", "Landroidx/work/WorkerParameters;", "photoRepository", "Lcom/intermedia/intermedia/domain/photo/PhotoRepository;", "autoWallpaperRepository", "Lcom/intermedia/intermedia/domain/autowallpaper/AutoWallpaperRepository;", "downloadService", "Lcom/intermedia/intermedia/data/download/DownloadService;", "notificationManager", "Lcom/intermedia/intermedia/util/NotificationManager;", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lcom/intermedia/intermedia/domain/photo/PhotoRepository;Lcom/intermedia/intermedia/domain/autowallpaper/AutoWallpaperRepository;Lcom/intermedia/intermedia/data/download/DownloadService;Lcom/intermedia/intermedia/util/NotificationManager;)V", "addWallpaperToHistory", "", "photo", "Lcom/intermedia/intermedia/data/photo/model/Photo;", "(Lcom/intermedia/intermedia/data/photo/model/Photo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "doWork", "Landroidx/work/ListenableWorker$Result;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "downloadAndSetWallpaper", "", "getCropHintRect", "Landroid/graphics/Rect;", "screenWidth", "", "screenHeight", "photoWidth", "photoHeight", "showNotification", "trackDownload", "Lcom/intermedia/intermedia/util/Result;", "Lokhttp3/ResponseBody;", "id", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isValid", "Companion", "app_debug"})
public final class AutoWallpaperWorker extends androidx.work.CoroutineWorker {
    private final android.content.Context context = null;
    private final com.intermedia.intermedia.domain.photo.PhotoRepository photoRepository = null;
    private final com.intermedia.intermedia.domain.autowallpaper.AutoWallpaperRepository autoWallpaperRepository = null;
    private final com.intermedia.intermedia.data.download.DownloadService downloadService = null;
    private final com.intermedia.intermedia.util.NotificationManager notificationManager = null;
    @org.jetbrains.annotations.NotNull
    public static final com.intermedia.intermedia.worker.AutoWallpaperWorker.Companion Companion = null;
    private static final java.lang.String AUTO_WALLPAPER_JOB_ID = "auto_wallpaper_job_id";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String AUTO_WALLPAPER_SINGLE_JOB_ID = "auto_wallpaper_single_job_id";
    private static final java.lang.String AUTO_WALLPAPER_FUTURE_JOB_ID = "auto_wallpaper_future_job_id";
    private static final java.lang.String KEY_AUTO_WALLPAPER_QUALITY = "key_auto_wallpaper_quality";
    private static final java.lang.String KEY_AUTO_WALLPAPER_THUMBNAIL_QUALITY = "key_auto_wallpaper_thumbnail_quality";
    private static final java.lang.String KEY_AUTO_WALLPAPER_SOURCE = "key_auto_wallpaper_source";
    private static final java.lang.String KEY_AUTO_WALLPAPER_USERNAME = "key_auto_wallpaper_username";
    private static final java.lang.String KEY_AUTO_WALLPAPER_SEARCH_TERMS = "key_auto_wallpaper_search_terms";
    private static final java.lang.String KEY_AUTO_WALLPAPER_CROP = "key_auto_wallpaper_crop";
    private static final java.lang.String KEY_AUTO_WALLPAPER_SHOW_NOTIFICATION = "key_auto_wallpaper_show_notification";
    private static final java.lang.String KEY_AUTO_WALLPAPER_PERSIST_NOTIFICATION = "key_auto_wallpaper_persist_notification";
    private static final java.lang.String KEY_AUTO_WALLPAPER_PORTRAIT_MODE_ONLY = "key_auto_wallpaper_portrait_mode_only";
    private static final java.lang.String KEY_AUTO_WALLPAPER_SELECT_SCREEN = "key_auto_wallpaper_select_screen";
    private static final java.lang.String KEY_AUTO_WALLPAPER_ORIENTATION = "key_auto_wallpaper_orientation";
    private static final java.lang.String KEY_AUTO_WALLPAPER_CONTENT_FILTER = "key_auto_wallpaper_content_filter";
    
    public AutoWallpaperWorker(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    androidx.work.WorkerParameters params, @org.jetbrains.annotations.NotNull
    com.intermedia.intermedia.domain.photo.PhotoRepository photoRepository, @org.jetbrains.annotations.NotNull
    com.intermedia.intermedia.domain.autowallpaper.AutoWallpaperRepository autoWallpaperRepository, @org.jetbrains.annotations.NotNull
    com.intermedia.intermedia.data.download.DownloadService downloadService, @org.jetbrains.annotations.NotNull
    com.intermedia.intermedia.util.NotificationManager notificationManager) {
        super(null, null);
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object doWork(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super androidx.work.ListenableWorker.Result> continuation) {
        return null;
    }
    
    private final java.lang.Object downloadAndSetWallpaper(com.intermedia.intermedia.data.photo.model.Photo photo, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return null;
    }
    
    private final android.graphics.Rect getCropHintRect(double screenWidth, double screenHeight, double photoWidth, double photoHeight) {
        return null;
    }
    
    private final boolean isValid(android.graphics.Rect $this$isValid) {
        return false;
    }
    
    private final java.lang.Object trackDownload(java.lang.String id, kotlin.coroutines.Continuation<? super com.intermedia.intermedia.util.Result<? extends okhttp3.ResponseBody>> continuation) {
        return null;
    }
    
    private final java.lang.Object addWallpaperToHistory(com.intermedia.intermedia.data.photo.model.Photo photo, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"DefaultLocale"})
    private final void showNotification(com.intermedia.intermedia.data.photo.model.Photo photo) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u001fB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u001e\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u0018J\u001e\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u0018R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/intermedia/intermedia/worker/AutoWallpaperWorker$Companion;", "", "()V", "AUTO_WALLPAPER_FUTURE_JOB_ID", "", "AUTO_WALLPAPER_JOB_ID", "AUTO_WALLPAPER_SINGLE_JOB_ID", "KEY_AUTO_WALLPAPER_CONTENT_FILTER", "KEY_AUTO_WALLPAPER_CROP", "KEY_AUTO_WALLPAPER_ORIENTATION", "KEY_AUTO_WALLPAPER_PERSIST_NOTIFICATION", "KEY_AUTO_WALLPAPER_PORTRAIT_MODE_ONLY", "KEY_AUTO_WALLPAPER_QUALITY", "KEY_AUTO_WALLPAPER_SEARCH_TERMS", "KEY_AUTO_WALLPAPER_SELECT_SCREEN", "KEY_AUTO_WALLPAPER_SHOW_NOTIFICATION", "KEY_AUTO_WALLPAPER_SOURCE", "KEY_AUTO_WALLPAPER_THUMBNAIL_QUALITY", "KEY_AUTO_WALLPAPER_USERNAME", "cancelAllWork", "", "context", "Landroid/content/Context;", "notificationManager", "Lcom/intermedia/intermedia/util/NotificationManager;", "getAutoWallpaperWorkData", "Landroidx/work/Data;", "sharedPreferencesRepository", "Lcom/intermedia/intermedia/domain/SharedPreferencesRepository;", "scheduleAutoWallpaperJob", "scheduleSingleAutoWallpaperJob", "Source", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void scheduleSingleAutoWallpaperJob(@org.jetbrains.annotations.NotNull
        android.content.Context context, @org.jetbrains.annotations.NotNull
        com.intermedia.intermedia.domain.SharedPreferencesRepository sharedPreferencesRepository, @org.jetbrains.annotations.NotNull
        com.intermedia.intermedia.util.NotificationManager notificationManager) {
        }
        
        public final void scheduleAutoWallpaperJob(@org.jetbrains.annotations.NotNull
        android.content.Context context, @org.jetbrains.annotations.NotNull
        com.intermedia.intermedia.domain.SharedPreferencesRepository sharedPreferencesRepository, @org.jetbrains.annotations.NotNull
        com.intermedia.intermedia.util.NotificationManager notificationManager) {
        }
        
        private final androidx.work.Data getAutoWallpaperWorkData(com.intermedia.intermedia.domain.SharedPreferencesRepository sharedPreferencesRepository) {
            return null;
        }
        
        private final void cancelAllWork(android.content.Context context, com.intermedia.intermedia.util.NotificationManager notificationManager) {
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/intermedia/intermedia/worker/AutoWallpaperWorker$Companion$Source;", "", "()V", "ALL", "", "COLLECTIONS", "FEATURED", "SEARCH", "SOURCE_ENTITLED", "", "getSOURCE_ENTITLED", "()Ljava/util/List;", "SOURCE_UNENTITLED", "getSOURCE_UNENTITLED", "USER", "app_debug"})
        public static final class Source {
            @org.jetbrains.annotations.NotNull
            public static final com.intermedia.intermedia.worker.AutoWallpaperWorker.Companion.Source INSTANCE = null;
            @org.jetbrains.annotations.NotNull
            public static final java.lang.String ALL = "all";
            @org.jetbrains.annotations.NotNull
            public static final java.lang.String FEATURED = "featured";
            @org.jetbrains.annotations.NotNull
            public static final java.lang.String COLLECTIONS = "collections";
            @org.jetbrains.annotations.NotNull
            public static final java.lang.String USER = "user";
            @org.jetbrains.annotations.NotNull
            public static final java.lang.String SEARCH = "search";
            @org.jetbrains.annotations.NotNull
            private static final java.util.List<java.lang.String> SOURCE_UNENTITLED = null;
            @org.jetbrains.annotations.NotNull
            private static final java.util.List<java.lang.String> SOURCE_ENTITLED = null;
            
            private Source() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.util.List<java.lang.String> getSOURCE_UNENTITLED() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.util.List<java.lang.String> getSOURCE_ENTITLED() {
                return null;
            }
        }
    }
}