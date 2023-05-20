package com.intermedia.intermedia.worker;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0011\u0010\u000b\u001a\u00020\fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\f\u0010\u000e\u001a\u00020\u000f*\u00020\u0010H\u0003R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lcom/intermedia/intermedia/worker/MuzeiWorker;", "Landroidx/work/CoroutineWorker;", "context", "Landroid/content/Context;", "params", "Landroidx/work/WorkerParameters;", "photoRepository", "Lcom/intermedia/intermedia/domain/photo/PhotoRepository;", "autoWallpaperRepository", "Lcom/intermedia/intermedia/domain/autowallpaper/AutoWallpaperRepository;", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lcom/intermedia/intermedia/domain/photo/PhotoRepository;Lcom/intermedia/intermedia/domain/autowallpaper/AutoWallpaperRepository;)V", "doWork", "Landroidx/work/ListenableWorker$Result;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toArtwork", "Lcom/google/android/apps/muzei/api/provider/Artwork;", "Lcom/intermedia/intermedia/data/photo/model/Photo;", "Companion", "app_debug"})
public final class MuzeiWorker extends androidx.work.CoroutineWorker {
    private final com.intermedia.intermedia.domain.photo.PhotoRepository photoRepository = null;
    private final com.intermedia.intermedia.domain.autowallpaper.AutoWallpaperRepository autoWallpaperRepository = null;
    @org.jetbrains.annotations.NotNull
    public static final com.intermedia.intermedia.worker.MuzeiWorker.Companion Companion = null;
    private static final java.lang.String KEY_MUZEI_QUALITY = "key_muzei_quality";
    private static final java.lang.String KEY_MUZEI_SOURCE = "key_muzei_source";
    private static final java.lang.String KEY_MUZEI_USERNAME = "key_muzei_username";
    private static final java.lang.String KEY_MUZEI_SEARCH_TERMS = "key_muzei_search_terms";
    
    public MuzeiWorker(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    androidx.work.WorkerParameters params, @org.jetbrains.annotations.NotNull
    com.intermedia.intermedia.domain.photo.PhotoRepository photoRepository, @org.jetbrains.annotations.NotNull
    com.intermedia.intermedia.domain.autowallpaper.AutoWallpaperRepository autoWallpaperRepository) {
        super(null, null);
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object doWork(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super androidx.work.ListenableWorker.Result> continuation) {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"DefaultLocale"})
    private final com.google.android.apps.muzei.api.provider.Artwork toArtwork(com.intermedia.intermedia.data.photo.model.Photo $this$toArtwork) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\rH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/intermedia/intermedia/worker/MuzeiWorker$Companion;", "", "()V", "KEY_MUZEI_QUALITY", "", "KEY_MUZEI_SEARCH_TERMS", "KEY_MUZEI_SOURCE", "KEY_MUZEI_USERNAME", "enqueueWork", "", "context", "Landroid/content/Context;", "sharedPreferencesRepository", "Lcom/intermedia/intermedia/domain/SharedPreferencesRepository;", "getMuzeiWorkData", "Landroidx/work/Data;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void enqueueWork(@org.jetbrains.annotations.NotNull
        android.content.Context context, @org.jetbrains.annotations.NotNull
        com.intermedia.intermedia.domain.SharedPreferencesRepository sharedPreferencesRepository) {
        }
        
        private final androidx.work.Data getMuzeiWorkData(com.intermedia.intermedia.domain.SharedPreferencesRepository sharedPreferencesRepository) {
            return null;
        }
    }
}