package com.intermedia.intermedia.ui.collection.detail;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 $2\u00020\u0001:\u0001$B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\u0012\u0010\u0017\u001a\u00020\u00122\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0014J\u0012\u0010\u001a\u001a\u00020\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0012\u0010 \u001a\u00020\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010!\u001a\u00020\u0012H\u0002J\u0010\u0010\"\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010#\u001a\u00020\u0012H\u0002R\u001b\u0010\u0003\u001a\u00020\u00048VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e\u00a8\u0006%"}, d2 = {"Lcom/intermedia/intermedia/ui/collection/detail/CollectionDetailActivity;", "Lcom/intermedia/intermedia/ui/base/BaseActivity;", "()V", "binding", "Lcom/intermedia/intermedia/databinding/ActivityCollectionDetailBinding;", "getBinding", "()Lcom/intermedia/intermedia/databinding/ActivityCollectionDetailBinding;", "binding$delegate", "Lby/kirich1409/viewbindingdelegate/ViewBindingProperty;", "providerClient", "Lcom/google/android/apps/muzei/api/provider/ProviderClient;", "viewModel", "Lcom/intermedia/intermedia/ui/collection/detail/CollectionDetailViewModel;", "getViewModel", "()Lcom/intermedia/intermedia/ui/collection/detail/CollectionDetailViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "initialSetup", "", "collection", "Lcom/intermedia/intermedia/data/collection/model/Collection;", "isAutoWallpaperCollectionsEnabled", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onPrepareOptionsMenu", "openCollectionInBrowser", "setupToolbar", "shareCollection", "Companion", "app_debug"})
public final class CollectionDetailActivity extends com.intermedia.intermedia.ui.base.BaseActivity {
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final by.kirich1409.viewbindingdelegate.ViewBindingProperty binding$delegate = null;
    private com.google.android.apps.muzei.api.provider.ProviderClient providerClient;
    @org.jetbrains.annotations.NotNull
    public static final com.intermedia.intermedia.ui.collection.detail.CollectionDetailActivity.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String EXTRA_COLLECTION = "extra_collection";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String EXTRA_COLLECTION_ID = "extra_collection_id";
    
    public CollectionDetailActivity() {
        super(0);
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.intermedia.intermedia.ui.collection.detail.CollectionDetailViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.intermedia.intermedia.databinding.ActivityCollectionDetailBinding getBinding() {
        return null;
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.Nullable
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override
    public boolean onPrepareOptionsMenu(@org.jetbrains.annotations.Nullable
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull
    android.view.MenuItem item) {
        return false;
    }
    
    private final void initialSetup(com.intermedia.intermedia.data.collection.model.Collection collection) {
    }
    
    private final void setupToolbar(com.intermedia.intermedia.data.collection.model.Collection collection) {
    }
    
    private final void openCollectionInBrowser() {
    }
    
    private final void shareCollection() {
    }
    
    private final boolean isAutoWallpaperCollectionsEnabled() {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/intermedia/intermedia/ui/collection/detail/CollectionDetailActivity$Companion;", "", "()V", "EXTRA_COLLECTION", "", "EXTRA_COLLECTION_ID", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}