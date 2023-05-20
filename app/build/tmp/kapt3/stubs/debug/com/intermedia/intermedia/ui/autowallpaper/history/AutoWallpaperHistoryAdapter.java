package com.intermedia.intermedia.ui.autowallpaper.history;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0015\u0016B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000fH\u0016J\u0010\u0010\u0014\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/intermedia/intermedia/ui/autowallpaper/history/AutoWallpaperHistoryAdapter;", "Landroidx/paging/PagedListAdapter;", "Lcom/intermedia/intermedia/data/autowallpaper/model/AutoWallpaperHistory;", "Lcom/intermedia/intermedia/ui/autowallpaper/history/AutoWallpaperHistoryViewHolder;", "callback", "Lcom/intermedia/intermedia/ui/autowallpaper/history/AutoWallpaperHistoryAdapter$ItemEventCallback;", "sharedPreferencesRepository", "Lcom/intermedia/intermedia/domain/SharedPreferencesRepository;", "(Lcom/intermedia/intermedia/ui/autowallpaper/history/AutoWallpaperHistoryAdapter$ItemEventCallback;Lcom/intermedia/intermedia/domain/SharedPreferencesRepository;)V", "prettyTime", "Lorg/ocpsoft/prettytime/PrettyTime;", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onViewRecycled", "Companion", "ItemEventCallback", "app_debug"})
public final class AutoWallpaperHistoryAdapter extends androidx.paging.PagedListAdapter<com.intermedia.intermedia.data.autowallpaper.model.AutoWallpaperHistory, com.intermedia.intermedia.ui.autowallpaper.history.AutoWallpaperHistoryViewHolder> {
    private final com.intermedia.intermedia.ui.autowallpaper.history.AutoWallpaperHistoryAdapter.ItemEventCallback callback = null;
    private final org.ocpsoft.prettytime.PrettyTime prettyTime = null;
    @org.jetbrains.annotations.NotNull
    public static final com.intermedia.intermedia.ui.autowallpaper.history.AutoWallpaperHistoryAdapter.Companion Companion = null;
    private static final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.intermedia.intermedia.data.autowallpaper.model.AutoWallpaperHistory> diffCallback = null;
    
    public AutoWallpaperHistoryAdapter(@org.jetbrains.annotations.NotNull
    com.intermedia.intermedia.ui.autowallpaper.history.AutoWallpaperHistoryAdapter.ItemEventCallback callback, @org.jetbrains.annotations.NotNull
    com.intermedia.intermedia.domain.SharedPreferencesRepository sharedPreferencesRepository) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.intermedia.intermedia.ui.autowallpaper.history.AutoWallpaperHistoryViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.intermedia.intermedia.ui.autowallpaper.history.AutoWallpaperHistoryViewHolder holder, int position) {
    }
    
    @java.lang.Override
    public void onViewRecycled(@org.jetbrains.annotations.NotNull
    com.intermedia.intermedia.ui.autowallpaper.history.AutoWallpaperHistoryViewHolder holder) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H&\u00a8\u0006\b"}, d2 = {"Lcom/intermedia/intermedia/ui/autowallpaper/history/AutoWallpaperHistoryAdapter$ItemEventCallback;", "", "onPhotoClick", "", "id", "", "onUserClick", "username", "app_debug"})
    public static abstract interface ItemEventCallback {
        
        public abstract void onPhotoClick(@org.jetbrains.annotations.NotNull
        java.lang.String id);
        
        public abstract void onUserClick(@org.jetbrains.annotations.NotNull
        java.lang.String username);
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/intermedia/intermedia/ui/autowallpaper/history/AutoWallpaperHistoryAdapter$Companion;", "", "()V", "diffCallback", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/intermedia/intermedia/data/autowallpaper/model/AutoWallpaperHistory;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}