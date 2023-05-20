package com.intermedia.intermedia.ui.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0014J\u0010\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0012\u0010\u001f\u001a\u00020\u00192\b\u0010 \u001a\u0004\u0018\u00010!H\u0014J\u0010\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0016J\f\u0010&\u001a\u00020\u0019*\u00020\u0001H\u0002R\u0012\u0010\u0005\u001a\u00020\u0006X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\t\u001a\u00020\n8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000f\u001a\u00020\u00108FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017\u00a8\u0006\'"}, d2 = {"Lcom/intermedia/intermedia/ui/base/BaseActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "contentLayoutId", "", "(I)V", "binding", "Landroidx/viewbinding/ViewBinding;", "getBinding", "()Landroidx/viewbinding/ViewBinding;", "notificationManager", "Lcom/intermedia/intermedia/util/NotificationManager;", "getNotificationManager", "()Lcom/intermedia/intermedia/util/NotificationManager;", "notificationManager$delegate", "Lkotlin/Lazy;", "sharedPreferencesRepository", "Lcom/intermedia/intermedia/domain/SharedPreferencesRepository;", "getSharedPreferencesRepository", "()Lcom/intermedia/intermedia/domain/SharedPreferencesRepository;", "sharedPreferencesRepository$delegate", "viewModel", "Landroidx/lifecycle/ViewModel;", "getViewModel", "()Landroidx/lifecycle/ViewModel;", "attachBaseContext", "", "newBase", "Landroid/content/Context;", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "setRecentAppsHeaderColor", "app_debug"})
public abstract class BaseActivity extends androidx.appcompat.app.AppCompatActivity {
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy sharedPreferencesRepository$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy notificationManager$delegate = null;
    
    public BaseActivity(@androidx.annotation.LayoutRes
    int contentLayoutId) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public abstract androidx.lifecycle.ViewModel getViewModel();
    
    @org.jetbrains.annotations.NotNull
    public abstract androidx.viewbinding.ViewBinding getBinding();
    
    @org.jetbrains.annotations.NotNull
    public final com.intermedia.intermedia.domain.SharedPreferencesRepository getSharedPreferencesRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.intermedia.intermedia.util.NotificationManager getNotificationManager() {
        return null;
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    public void onConfigurationChanged(@org.jetbrains.annotations.NotNull
    android.content.res.Configuration newConfig) {
    }
    
    @java.lang.Override
    protected void attachBaseContext(@org.jetbrains.annotations.Nullable
    android.content.Context newBase) {
    }
    
    @java.lang.Override
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull
    android.view.MenuItem item) {
        return false;
    }
    
    private final void setRecentAppsHeaderColor(androidx.appcompat.app.AppCompatActivity $this$setRecentAppsHeaderColor) {
    }
}