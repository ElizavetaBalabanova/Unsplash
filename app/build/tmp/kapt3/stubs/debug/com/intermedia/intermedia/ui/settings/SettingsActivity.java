package com.intermedia.intermedia.ui.settings;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00132\u00020\u0001:\u0002\u0013\u0014B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014R\u001b\u0010\u0003\u001a\u00020\u00048VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0015"}, d2 = {"Lcom/intermedia/intermedia/ui/settings/SettingsActivity;", "Lcom/intermedia/intermedia/ui/base/BaseActivity;", "()V", "binding", "Lcom/intermedia/intermedia/databinding/ActivitySettingsBinding;", "getBinding", "()Lcom/intermedia/intermedia/databinding/ActivitySettingsBinding;", "binding$delegate", "Lby/kirich1409/viewbindingdelegate/ViewBindingProperty;", "viewModel", "Lcom/intermedia/intermedia/ui/settings/SettingsViewModel;", "getViewModel", "()Lcom/intermedia/intermedia/ui/settings/SettingsViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "SettingsFragment", "app_debug"})
public final class SettingsActivity extends com.intermedia.intermedia.ui.base.BaseActivity {
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final by.kirich1409.viewbindingdelegate.ViewBindingProperty binding$delegate = null;
    @org.jetbrains.annotations.NotNull
    public static final com.intermedia.intermedia.ui.settings.SettingsActivity.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String EXTRA_SHOULD_RESTART = "extra_should_restart";
    
    public SettingsActivity() {
        super(0);
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.intermedia.intermedia.ui.settings.SettingsViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.intermedia.intermedia.databinding.ActivitySettingsBinding getBinding() {
        return null;
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u001c\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000bH\u0016J\b\u0010\u0011\u001a\u00020\u000bH\u0016J\u001c\u0010\u0012\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u000fH\u0016J\u001a\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0019"}, d2 = {"Lcom/intermedia/intermedia/ui/settings/SettingsActivity$SettingsFragment;", "Landroidx/preference/PreferenceFragmentCompat;", "Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;", "()V", "sharedViewModel", "Lcom/intermedia/intermedia/ui/settings/SettingsViewModel;", "getSharedViewModel", "()Lcom/intermedia/intermedia/ui/settings/SettingsViewModel;", "sharedViewModel$delegate", "Lkotlin/Lazy;", "onCreatePreferences", "", "savedInstanceState", "Landroid/os/Bundle;", "rootKey", "", "onPause", "onResume", "onSharedPreferenceChanged", "sharedPreferences", "Landroid/content/SharedPreferences;", "key", "onViewCreated", "view", "Landroid/view/View;", "app_debug"})
    public static final class SettingsFragment extends androidx.preference.PreferenceFragmentCompat implements android.content.SharedPreferences.OnSharedPreferenceChangeListener {
        private final kotlin.Lazy sharedViewModel$delegate = null;
        
        public SettingsFragment() {
            super();
        }
        
        private final com.intermedia.intermedia.ui.settings.SettingsViewModel getSharedViewModel() {
            return null;
        }
        
        @java.lang.Override
        public void onCreatePreferences(@org.jetbrains.annotations.Nullable
        android.os.Bundle savedInstanceState, @org.jetbrains.annotations.Nullable
        java.lang.String rootKey) {
        }
        
        @java.lang.Override
        public void onViewCreated(@org.jetbrains.annotations.NotNull
        android.view.View view, @org.jetbrains.annotations.Nullable
        android.os.Bundle savedInstanceState) {
        }
        
        @java.lang.Override
        public void onSharedPreferenceChanged(@org.jetbrains.annotations.Nullable
        android.content.SharedPreferences sharedPreferences, @org.jetbrains.annotations.Nullable
        java.lang.String key) {
        }
        
        @java.lang.Override
        public void onResume() {
        }
        
        @java.lang.Override
        public void onPause() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/intermedia/intermedia/ui/settings/SettingsActivity$Companion;", "", "()V", "EXTRA_SHOULD_RESTART", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}