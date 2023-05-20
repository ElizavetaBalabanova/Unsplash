package com.intermedia.intermedia.service;

import java.lang.System;

@androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.N)
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0017J\b\u0010\u001a\u001a\u00020\u0015H\u0016J\b\u0010\u001b\u001a\u00020\u0015H\u0017J\b\u0010\u001c\u001a\u00020\u0015H\u0017J\u001a\u0010\u001d\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001e\u001a\u00020\u001fH\u0017J\"\u0010 \u001a\u00020\u001f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010!\u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001fH\u0017J\b\u0010\"\u001a\u00020\u0015H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006#"}, d2 = {"Lcom/intermedia/intermedia/service/AutoWallpaperTileService;", "Landroid/service/quicksettings/TileService;", "Landroidx/lifecycle/LifecycleOwner;", "Lorg/koin/core/component/KoinComponent;", "()V", "dispatcher", "Landroidx/lifecycle/ServiceLifecycleDispatcher;", "notificationManager", "Lcom/intermedia/intermedia/util/NotificationManager;", "getNotificationManager", "()Lcom/intermedia/intermedia/util/NotificationManager;", "notificationManager$delegate", "Lkotlin/Lazy;", "sharedPreferencesRepository", "Lcom/intermedia/intermedia/domain/SharedPreferencesRepository;", "getSharedPreferencesRepository", "()Lcom/intermedia/intermedia/domain/SharedPreferencesRepository;", "sharedPreferencesRepository$delegate", "getLifecycle", "Landroidx/lifecycle/Lifecycle;", "observeAutoWallpaperWorker", "", "onBind", "Landroid/os/IBinder;", "intent", "Landroid/content/Intent;", "onClick", "onCreate", "onDestroy", "onStart", "startId", "", "onStartCommand", "flags", "onStartListening", "app_debug"})
public final class AutoWallpaperTileService extends android.service.quicksettings.TileService implements androidx.lifecycle.LifecycleOwner, org.koin.core.component.KoinComponent {
    private final androidx.lifecycle.ServiceLifecycleDispatcher dispatcher = null;
    private final kotlin.Lazy sharedPreferencesRepository$delegate = null;
    private final kotlin.Lazy notificationManager$delegate = null;
    
    public AutoWallpaperTileService() {
        super();
    }
    
    private final com.intermedia.intermedia.domain.SharedPreferencesRepository getSharedPreferencesRepository() {
        return null;
    }
    
    private final com.intermedia.intermedia.util.NotificationManager getNotificationManager() {
        return null;
    }
    
    @java.lang.Override
    public void onClick() {
    }
    
    @java.lang.Override
    public void onStartListening() {
    }
    
    private final void observeAutoWallpaperWorker() {
    }
    
    @androidx.annotation.CallSuper
    @java.lang.Override
    public void onCreate() {
    }
    
    @org.jetbrains.annotations.Nullable
    @androidx.annotation.CallSuper
    @java.lang.Override
    public android.os.IBinder onBind(@org.jetbrains.annotations.NotNull
    android.content.Intent intent) {
        return null;
    }
    
    @androidx.annotation.CallSuper
    @java.lang.Override
    @java.lang.Deprecated
    public void onStart(@org.jetbrains.annotations.Nullable
    android.content.Intent intent, int startId) {
    }
    
    @androidx.annotation.CallSuper
    @java.lang.Override
    public int onStartCommand(@org.jetbrains.annotations.Nullable
    android.content.Intent intent, int flags, int startId) {
        return 0;
    }
    
    @androidx.annotation.CallSuper
    @java.lang.Override
    public void onDestroy() {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public androidx.lifecycle.Lifecycle getLifecycle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public org.koin.core.Koin getKoin() {
        return null;
    }
}