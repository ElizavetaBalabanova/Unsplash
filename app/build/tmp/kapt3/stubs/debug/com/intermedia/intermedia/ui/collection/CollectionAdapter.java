package com.intermedia.intermedia.ui.collection;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0018\u0019B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0018\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/intermedia/intermedia/ui/collection/CollectionAdapter;", "Lcom/intermedia/intermedia/ui/widget/recyclerview/BasePagedListAdapter;", "Lcom/intermedia/intermedia/data/collection/model/Collection;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "callback", "Lcom/intermedia/intermedia/ui/collection/CollectionAdapter$ItemEventCallback;", "showUser", "", "sharedPreferencesRepository", "Lcom/intermedia/intermedia/domain/SharedPreferencesRepository;", "(Lcom/intermedia/intermedia/ui/collection/CollectionAdapter$ItemEventCallback;ZLcom/intermedia/intermedia/domain/SharedPreferencesRepository;)V", "layout", "", "loadQuality", "getItemViewType", "", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "ItemEventCallback", "app_debug"})
public final class CollectionAdapter extends com.intermedia.intermedia.ui.widget.recyclerview.BasePagedListAdapter<com.intermedia.intermedia.data.collection.model.Collection, androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    private final com.intermedia.intermedia.ui.collection.CollectionAdapter.ItemEventCallback callback = null;
    private final boolean showUser = false;
    private final java.lang.String layout = null;
    private final java.lang.String loadQuality = null;
    @org.jetbrains.annotations.NotNull
    public static final com.intermedia.intermedia.ui.collection.CollectionAdapter.Companion Companion = null;
    private static final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.intermedia.intermedia.data.collection.model.Collection> diffCallback = null;
    
    public CollectionAdapter(@org.jetbrains.annotations.NotNull
    com.intermedia.intermedia.ui.collection.CollectionAdapter.ItemEventCallback callback, boolean showUser, @org.jetbrains.annotations.NotNull
    com.intermedia.intermedia.domain.SharedPreferencesRepository sharedPreferencesRepository) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    @java.lang.Override
    public int getItemViewType(int position) {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"Lcom/intermedia/intermedia/ui/collection/CollectionAdapter$ItemEventCallback;", "", "onCollectionClick", "", "collection", "Lcom/intermedia/intermedia/data/collection/model/Collection;", "onUserClick", "user", "Lcom/intermedia/intermedia/data/user/model/User;", "app_debug"})
    public static abstract interface ItemEventCallback {
        
        public abstract void onCollectionClick(@org.jetbrains.annotations.NotNull
        com.intermedia.intermedia.data.collection.model.Collection collection);
        
        public abstract void onUserClick(@org.jetbrains.annotations.NotNull
        com.intermedia.intermedia.data.user.model.User user);
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/intermedia/intermedia/ui/collection/CollectionAdapter$Companion;", "", "()V", "diffCallback", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/intermedia/intermedia/data/collection/model/Collection;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}