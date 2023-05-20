package com.intermedia.intermedia.ui.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u00020\u0005B\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010!\u001a\u00020\"H&J\u0010\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020%H\u0016J\u001a\u0010&\u001a\u00020\"2\u0006\u0010\'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\u0006\u0010+\u001a\u00020\"J\u0018\u0010,\u001a\u00020\"2\u0006\u0010-\u001a\u00020\u000e2\u0006\u0010.\u001a\u00020\u000eH\u0002J\b\u0010/\u001a\u00020\"H\u0002J\b\u00100\u001a\u00020\"H\u0002J\b\u00101\u001a\u00020\"H\u0002J\b\u00102\u001a\u00020\"H\u0002J\u000e\u00103\u001a\u00020\"2\u0006\u00104\u001a\u000205J\u0014\u00106\u001a\u00020\"2\f\u00107\u001a\b\u0012\u0004\u0012\u00028\u000008J\u000e\u00109\u001a\u00020\"2\u0006\u0010:\u001a\u000205R\u001b\u0010\u0007\u001a\u00020\b8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u0012\u0010\r\u001a\u00020\u000eX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0012\u0010\u0011\u001a\u00020\u000eX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u0012\u0010\u0013\u001a\u00020\u0014X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0018X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001b\u001a\u00020\u001c8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001e\u00a8\u0006;"}, d2 = {"Lcom/intermedia/intermedia/ui/base/BaseSwipeRecyclerViewFragment;", "T", "", "VH", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroidx/fragment/app/Fragment;", "()V", "binding", "Lcom/intermedia/intermedia/databinding/FragmentSwipeRecyclerViewBinding;", "getBinding", "()Lcom/intermedia/intermedia/databinding/FragmentSwipeRecyclerViewBinding;", "binding$delegate", "Lby/kirich1409/viewbindingdelegate/ViewBindingProperty;", "emptyStateSubtitle", "", "getEmptyStateSubtitle", "()Ljava/lang/String;", "emptyStateTitle", "getEmptyStateTitle", "itemSpacing", "", "getItemSpacing", "()I", "pagedListAdapter", "Lcom/intermedia/intermedia/ui/widget/recyclerview/BasePagedListAdapter;", "getPagedListAdapter", "()Lcom/intermedia/intermedia/ui/widget/recyclerview/BasePagedListAdapter;", "sharedPreferencesRepository", "Lcom/intermedia/intermedia/domain/SharedPreferencesRepository;", "getSharedPreferencesRepository", "()Lcom/intermedia/intermedia/domain/SharedPreferencesRepository;", "sharedPreferencesRepository$delegate", "Lkotlin/Lazy;", "observeEvents", "", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "scrollToTop", "setEmptyStateText", "title", "subtitle", "showEmptyState", "showErrorState", "showLoadingState", "showSuccessState", "updateNetworkState", "networkState", "Lcom/intermedia/intermedia/util/NetworkState;", "updatePagedList", "pagedList", "Landroidx/paging/PagedList;", "updateRefreshState", "refreshState", "app_debug"})
public abstract class BaseSwipeRecyclerViewFragment<T extends java.lang.Object, VH extends androidx.recyclerview.widget.RecyclerView.ViewHolder> extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull
    private final by.kirich1409.viewbindingdelegate.ViewBindingProperty binding$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy sharedPreferencesRepository$delegate = null;
    
    public BaseSwipeRecyclerViewFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.intermedia.intermedia.databinding.FragmentSwipeRecyclerViewBinding getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.intermedia.intermedia.domain.SharedPreferencesRepository getSharedPreferencesRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract com.intermedia.intermedia.ui.widget.recyclerview.BasePagedListAdapter<T, VH> getPagedListAdapter();
    
    @org.jetbrains.annotations.NotNull
    public abstract java.lang.String getEmptyStateTitle();
    
    @org.jetbrains.annotations.NotNull
    public abstract java.lang.String getEmptyStateSubtitle();
    
    public abstract int getItemSpacing();
    
    public abstract void observeEvents();
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    public void onConfigurationChanged(@org.jetbrains.annotations.NotNull
    android.content.res.Configuration newConfig) {
    }
    
    public final void scrollToTop() {
    }
    
    public final void updateRefreshState(@org.jetbrains.annotations.NotNull
    com.intermedia.intermedia.util.NetworkState refreshState) {
    }
    
    public final void updateNetworkState(@org.jetbrains.annotations.NotNull
    com.intermedia.intermedia.util.NetworkState networkState) {
    }
    
    public final void updatePagedList(@org.jetbrains.annotations.NotNull
    androidx.paging.PagedList<T> pagedList) {
    }
    
    private final void setEmptyStateText(java.lang.String title, java.lang.String subtitle) {
    }
    
    private final void showSuccessState() {
    }
    
    private final void showErrorState() {
    }
    
    private final void showEmptyState() {
    }
    
    private final void showLoadingState() {
    }
}