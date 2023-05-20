package com.intermedia.intermedia.worker;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/intermedia/intermedia/worker/FutureAutoWallpaperWorker;", "Landroidx/work/Worker;", "context", "Landroid/content/Context;", "params", "Landroidx/work/WorkerParameters;", "sharedPreferencesRepository", "Lcom/intermedia/intermedia/domain/SharedPreferencesRepository;", "notificationManager", "Lcom/intermedia/intermedia/util/NotificationManager;", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lcom/intermedia/intermedia/domain/SharedPreferencesRepository;Lcom/intermedia/intermedia/util/NotificationManager;)V", "doWork", "Landroidx/work/ListenableWorker$Result;", "app_debug"})
public final class FutureAutoWallpaperWorker extends androidx.work.Worker {
    private final android.content.Context context = null;
    private final com.intermedia.intermedia.domain.SharedPreferencesRepository sharedPreferencesRepository = null;
    private final com.intermedia.intermedia.util.NotificationManager notificationManager = null;
    
    public FutureAutoWallpaperWorker(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    androidx.work.WorkerParameters params, @org.jetbrains.annotations.NotNull
    com.intermedia.intermedia.domain.SharedPreferencesRepository sharedPreferencesRepository, @org.jetbrains.annotations.NotNull
    com.intermedia.intermedia.util.NotificationManager notificationManager) {
        super(null, null);
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public androidx.work.ListenableWorker.Result doWork() {
        return null;
    }
}