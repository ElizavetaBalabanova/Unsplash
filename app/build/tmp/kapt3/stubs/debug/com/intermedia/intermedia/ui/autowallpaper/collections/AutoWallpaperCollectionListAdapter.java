package com.intermedia.intermedia.ui.autowallpaper.collections;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0017\u0018\u0019B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0018\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\rH\u0016J\u0014\u0010\u0016\u001a\u00020\u00102\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/intermedia/intermedia/ui/autowallpaper/collections/AutoWallpaperCollectionListAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/intermedia/intermedia/data/autowallpaper/model/AutoWallpaperCollection;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemType", "Lcom/intermedia/intermedia/ui/autowallpaper/collections/AutoWallpaperCollectionListAdapter$ItemType;", "callback", "Lcom/intermedia/intermedia/ui/autowallpaper/collections/AutoWallpaperCollectionListAdapter$ItemEventCallback;", "(Lcom/intermedia/intermedia/ui/autowallpaper/collections/AutoWallpaperCollectionListAdapter$ItemType;Lcom/intermedia/intermedia/ui/autowallpaper/collections/AutoWallpaperCollectionListAdapter$ItemEventCallback;)V", "selectedCollectionIds", "", "", "getItemViewType", "", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setSelectedCollectionIds", "Companion", "ItemEventCallback", "ItemType", "app_debug"})
public final class AutoWallpaperCollectionListAdapter extends androidx.recyclerview.widget.ListAdapter<com.intermedia.intermedia.data.autowallpaper.model.AutoWallpaperCollection, androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    private final com.intermedia.intermedia.ui.autowallpaper.collections.AutoWallpaperCollectionListAdapter.ItemType itemType = null;
    private final com.intermedia.intermedia.ui.autowallpaper.collections.AutoWallpaperCollectionListAdapter.ItemEventCallback callback = null;
    private java.util.List<java.lang.String> selectedCollectionIds;
    @org.jetbrains.annotations.NotNull
    public static final com.intermedia.intermedia.ui.autowallpaper.collections.AutoWallpaperCollectionListAdapter.Companion Companion = null;
    private static final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.intermedia.intermedia.data.autowallpaper.model.AutoWallpaperCollection> diffCallback = null;
    
    public AutoWallpaperCollectionListAdapter(@org.jetbrains.annotations.NotNull
    com.intermedia.intermedia.ui.autowallpaper.collections.AutoWallpaperCollectionListAdapter.ItemType itemType, @org.jetbrains.annotations.NotNull
    com.intermedia.intermedia.ui.autowallpaper.collections.AutoWallpaperCollectionListAdapter.ItemEventCallback callback) {
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
    
    public final void setSelectedCollectionIds(@org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> selectedCollectionIds) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/intermedia/intermedia/ui/autowallpaper/collections/AutoWallpaperCollectionListAdapter$ItemType;", "", "(Ljava/lang/String;I)V", "SELECTED", "FEATURED", "POPULAR", "app_debug"})
    public static enum ItemType {
        /*public static final*/ SELECTED /* = new SELECTED() */,
        /*public static final*/ FEATURED /* = new FEATURED() */,
        /*public static final*/ POPULAR /* = new POPULAR() */;
        
        ItemType() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\n"}, d2 = {"Lcom/intermedia/intermedia/ui/autowallpaper/collections/AutoWallpaperCollectionListAdapter$ItemEventCallback;", "", "onAddClick", "", "collection", "Lcom/intermedia/intermedia/data/autowallpaper/model/AutoWallpaperCollection;", "onCollectionClick", "id", "", "onRemoveClick", "app_debug"})
    public static abstract interface ItemEventCallback {
        
        public abstract void onCollectionClick(@org.jetbrains.annotations.NotNull
        java.lang.String id);
        
        public abstract void onAddClick(@org.jetbrains.annotations.NotNull
        com.intermedia.intermedia.data.autowallpaper.model.AutoWallpaperCollection collection);
        
        public abstract void onRemoveClick(@org.jetbrains.annotations.NotNull
        java.lang.String id);
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/intermedia/intermedia/ui/autowallpaper/collections/AutoWallpaperCollectionListAdapter$Companion;", "", "()V", "diffCallback", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/intermedia/intermedia/data/autowallpaper/model/AutoWallpaperCollection;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}