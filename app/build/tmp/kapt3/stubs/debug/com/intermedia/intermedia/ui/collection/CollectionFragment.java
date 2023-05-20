package com.intermedia.intermedia.ui.collection;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\bR\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00108VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0012\u0010\u0013\u001a\u00020\u0014X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006\u0017"}, d2 = {"Lcom/intermedia/intermedia/ui/collection/CollectionFragment;", "Lcom/intermedia/intermedia/ui/base/BaseSwipeRecyclerViewFragment;", "Lcom/intermedia/intermedia/data/collection/model/Collection;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "()V", "emptyStateSubtitle", "", "getEmptyStateSubtitle", "()Ljava/lang/String;", "emptyStateTitle", "getEmptyStateTitle", "itemEventCallback", "Lcom/intermedia/intermedia/ui/collection/CollectionAdapter$ItemEventCallback;", "getItemEventCallback", "()Lcom/intermedia/intermedia/ui/collection/CollectionAdapter$ItemEventCallback;", "itemSpacing", "", "getItemSpacing", "()I", "pagedListAdapter", "Lcom/intermedia/intermedia/ui/collection/CollectionAdapter;", "getPagedListAdapter", "()Lcom/intermedia/intermedia/ui/collection/CollectionAdapter;", "app_debug"})
public abstract class CollectionFragment extends com.intermedia.intermedia.ui.base.BaseSwipeRecyclerViewFragment<com.intermedia.intermedia.data.collection.model.Collection, androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    @org.jetbrains.annotations.NotNull
    private final com.intermedia.intermedia.ui.collection.CollectionAdapter.ItemEventCallback itemEventCallback = null;
    
    public CollectionFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public abstract com.intermedia.intermedia.ui.collection.CollectionAdapter getPagedListAdapter();
    
    @org.jetbrains.annotations.NotNull
    public final com.intermedia.intermedia.ui.collection.CollectionAdapter.ItemEventCallback getItemEventCallback() {
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
}