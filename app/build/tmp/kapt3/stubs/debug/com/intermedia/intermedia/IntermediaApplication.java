package com.intermedia.intermedia;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\nH\u0016J\b\u0010\u000e\u001a\u00020\nH\u0016J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0012"}, d2 = {"Lcom/intermedia/intermedia/IntermediaApplication;", "Landroid/app/Application;", "()V", "sharedPreferencesRepository", "Lcom/intermedia/intermedia/domain/SharedPreferencesRepository;", "getSharedPreferencesRepository", "()Lcom/intermedia/intermedia/domain/SharedPreferencesRepository;", "sharedPreferencesRepository$delegate", "Lkotlin/Lazy;", "onConfigurationChanged", "", "newConfig", "Landroid/content/res/Configuration;", "onCreate", "onLowMemory", "onTrimMemory", "level", "", "app_debug"})
public final class IntermediaApplication extends android.app.Application {
    private final kotlin.Lazy sharedPreferencesRepository$delegate = null;
    
    public IntermediaApplication() {
        super();
    }
    
    private final com.intermedia.intermedia.domain.SharedPreferencesRepository getSharedPreferencesRepository() {
        return null;
    }
    
    @java.lang.Override
    public void onCreate() {
    }
    
    @java.lang.Override
    public void onConfigurationChanged(@org.jetbrains.annotations.NotNull
    android.content.res.Configuration newConfig) {
    }
    
    @java.lang.Override
    public void onLowMemory() {
    }
    
    @java.lang.Override
    public void onTrimMemory(int level) {
    }
}