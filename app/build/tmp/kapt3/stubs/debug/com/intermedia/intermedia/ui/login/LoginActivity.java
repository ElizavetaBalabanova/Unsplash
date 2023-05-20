package com.intermedia.intermedia.ui.login;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0014J\b\u0010\u001b\u001a\u00020\u0018H\u0014J\u0012\u0010\u001c\u001a\u00020\u00182\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0014J\u0010\u0010\u001f\u001a\u00020\u00182\u0006\u0010 \u001a\u00020!H\u0002J\b\u0010\"\u001a\u00020\u0018H\u0002J\b\u0010#\u001a\u00020\u0018H\u0002J\b\u0010$\u001a\u00020\u0018H\u0002R\u001b\u0010\u0003\u001a\u00020\u00048VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0011\u001a\u00020\u00128VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006%"}, d2 = {"Lcom/intermedia/intermedia/ui/login/LoginActivity;", "Lcom/intermedia/intermedia/ui/base/BaseActivity;", "()V", "binding", "Lcom/intermedia/intermedia/databinding/ActivityLoginBinding;", "getBinding", "()Lcom/intermedia/intermedia/databinding/ActivityLoginBinding;", "binding$delegate", "Lby/kirich1409/viewbindingdelegate/ViewBindingProperty;", "customTabsClient", "Landroidx/browser/customtabs/CustomTabsClient;", "customTabsServiceConnection", "Landroidx/browser/customtabs/CustomTabsServiceConnection;", "customTabsSession", "Landroidx/browser/customtabs/CustomTabsSession;", "shouldUnbindCustomTabService", "", "viewModel", "Lcom/intermedia/intermedia/ui/login/LoginViewModel;", "getViewModel", "()Lcom/intermedia/intermedia/ui/login/LoginViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onNewIntent", "intent", "Landroid/content/Intent;", "openCustomTab", "uriString", "", "openUnsplashJoinTab", "openUnsplashLoginTab", "setupCustomTabs", "app_debug"})
public final class LoginActivity extends com.intermedia.intermedia.ui.base.BaseActivity {
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final by.kirich1409.viewbindingdelegate.ViewBindingProperty binding$delegate = null;
    private androidx.browser.customtabs.CustomTabsClient customTabsClient;
    private androidx.browser.customtabs.CustomTabsSession customTabsSession;
    private boolean shouldUnbindCustomTabService = false;
    private final androidx.browser.customtabs.CustomTabsServiceConnection customTabsServiceConnection = null;
    
    public LoginActivity() {
        super(0);
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.intermedia.intermedia.ui.login.LoginViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.intermedia.intermedia.databinding.ActivityLoginBinding getBinding() {
        return null;
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    protected void onDestroy() {
    }
    
    @java.lang.Override
    protected void onNewIntent(@org.jetbrains.annotations.Nullable
    android.content.Intent intent) {
    }
    
    private final void setupCustomTabs() {
    }
    
    private final void openUnsplashJoinTab() {
    }
    
    private final void openUnsplashLoginTab() {
    }
    
    private final void openCustomTab(java.lang.String uriString) {
    }
}