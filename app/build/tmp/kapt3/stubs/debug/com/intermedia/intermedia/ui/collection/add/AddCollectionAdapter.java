package com.intermedia.intermedia.ui.collection.add;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0014\u0015B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000eH\u0016J\u0016\u0010\u0013\u001a\u00020\u000b2\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/intermedia/intermedia/ui/collection/add/AddCollectionAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/intermedia/intermedia/data/collection/model/Collection;", "Lcom/intermedia/intermedia/ui/collection/add/MiniCollectionViewHolder;", "callback", "Lcom/intermedia/intermedia/ui/collection/add/AddCollectionAdapter$ItemEventCallback;", "(Lcom/intermedia/intermedia/ui/collection/add/AddCollectionAdapter$ItemEventCallback;)V", "currentUserCollectionIds", "", "", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setCurrentUserCollectionIds", "Companion", "ItemEventCallback", "app_debug"})
public final class AddCollectionAdapter extends androidx.recyclerview.widget.ListAdapter<com.intermedia.intermedia.data.collection.model.Collection, com.intermedia.intermedia.ui.collection.add.MiniCollectionViewHolder> {
    private final com.intermedia.intermedia.ui.collection.add.AddCollectionAdapter.ItemEventCallback callback = null;
    private java.util.List<java.lang.String> currentUserCollectionIds;
    @org.jetbrains.annotations.NotNull
    public static final com.intermedia.intermedia.ui.collection.add.AddCollectionAdapter.Companion Companion = null;
    private static final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.intermedia.intermedia.data.collection.model.Collection> diffCallback = null;
    
    public AddCollectionAdapter(@org.jetbrains.annotations.NotNull
    com.intermedia.intermedia.ui.collection.add.AddCollectionAdapter.ItemEventCallback callback) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.intermedia.intermedia.ui.collection.add.MiniCollectionViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.intermedia.intermedia.ui.collection.add.MiniCollectionViewHolder holder, int position) {
    }
    
    public final void setCurrentUserCollectionIds(@org.jetbrains.annotations.Nullable
    java.util.List<java.lang.String> currentUserCollectionIds) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&\u00a8\u0006\n"}, d2 = {"Lcom/intermedia/intermedia/ui/collection/add/AddCollectionAdapter$ItemEventCallback;", "", "onCollectionClick", "", "collection", "Lcom/intermedia/intermedia/data/collection/model/Collection;", "itemView", "Landroid/view/View;", "position", "", "app_debug"})
    public static abstract interface ItemEventCallback {
        
        public abstract void onCollectionClick(@org.jetbrains.annotations.NotNull
        com.intermedia.intermedia.data.collection.model.Collection collection, @org.jetbrains.annotations.NotNull
        android.view.View itemView, int position);
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/intermedia/intermedia/ui/collection/add/AddCollectionAdapter$Companion;", "", "()V", "diffCallback", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/intermedia/intermedia/data/collection/model/Collection;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}