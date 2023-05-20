package com.intermedia.intermedia.ui.search;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 %2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001%B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001fH\u0017J\u001a\u0010 \u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\bR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u0012X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018\u00a8\u0006&"}, d2 = {"Lcom/intermedia/intermedia/ui/search/SearchUserFragment;", "Lcom/intermedia/intermedia/ui/base/BaseSwipeRecyclerViewFragment;", "Lcom/intermedia/intermedia/data/user/model/User;", "Lcom/intermedia/intermedia/ui/user/UserViewHolder;", "()V", "emptyStateSubtitle", "", "getEmptyStateSubtitle", "()Ljava/lang/String;", "emptyStateTitle", "getEmptyStateTitle", "itemEventCallback", "Lcom/intermedia/intermedia/ui/user/UserAdapter$ItemEventCallback;", "itemSpacing", "", "getItemSpacing", "()I", "pagedListAdapter", "Lcom/intermedia/intermedia/ui/user/UserAdapter;", "getPagedListAdapter", "()Lcom/intermedia/intermedia/ui/user/UserAdapter;", "sharedViewModel", "Lcom/intermedia/intermedia/ui/search/SearchViewModel;", "getSharedViewModel", "()Lcom/intermedia/intermedia/ui/search/SearchViewModel;", "sharedViewModel$delegate", "Lkotlin/Lazy;", "observeEvents", "", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_debug"})
public final class SearchUserFragment extends com.intermedia.intermedia.ui.base.BaseSwipeRecyclerViewFragment<com.intermedia.intermedia.data.user.model.User, com.intermedia.intermedia.ui.user.UserViewHolder> {
    private final kotlin.Lazy sharedViewModel$delegate = null;
    private final com.intermedia.intermedia.ui.user.UserAdapter.ItemEventCallback itemEventCallback = null;
    @org.jetbrains.annotations.NotNull
    private final com.intermedia.intermedia.ui.user.UserAdapter pagedListAdapter = null;
    @org.jetbrains.annotations.NotNull
    public static final com.intermedia.intermedia.ui.search.SearchUserFragment.Companion Companion = null;
    
    public SearchUserFragment() {
        super();
    }
    
    private final com.intermedia.intermedia.ui.search.SearchViewModel getSharedViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.intermedia.intermedia.ui.user.UserAdapter getPagedListAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String getEmptyStateTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String getEmptyStateSubtitle() {
        return null;
    }
    
    @java.lang.Override
    public int getItemSpacing() {
        return 0;
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    public void observeEvents() {
    }
    
    @android.annotation.SuppressLint(value = {"MissingSuperCall"})
    @java.lang.Override
    public void onConfigurationChanged(@org.jetbrains.annotations.NotNull
    android.content.res.Configuration newConfig) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/intermedia/intermedia/ui/search/SearchUserFragment$Companion;", "", "()V", "newInstance", "Lcom/intermedia/intermedia/ui/search/SearchUserFragment;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.intermedia.intermedia.ui.search.SearchUserFragment newInstance() {
            return null;
        }
    }
}