package com.intermedia.intermedia.ui.photo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0019\u001aB\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0018\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0010H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/intermedia/intermedia/ui/photo/PhotoAdapter;", "Lcom/intermedia/intermedia/ui/widget/recyclerview/BasePagedListAdapter;", "Lcom/intermedia/intermedia/data/photo/model/Photo;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "callback", "Lcom/intermedia/intermedia/ui/photo/PhotoAdapter$ItemEventCallback;", "showUser", "", "sharedPreferencesRepository", "Lcom/intermedia/intermedia/domain/SharedPreferencesRepository;", "(Lcom/intermedia/intermedia/ui/photo/PhotoAdapter$ItemEventCallback;ZLcom/intermedia/intermedia/domain/SharedPreferencesRepository;)V", "layout", "", "loadQuality", "longPressDownload", "getItemViewType", "", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "ItemEventCallback", "app_debug"})
public final class PhotoAdapter extends com.intermedia.intermedia.ui.widget.recyclerview.BasePagedListAdapter<com.intermedia.intermedia.data.photo.model.Photo, androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    private final com.intermedia.intermedia.ui.photo.PhotoAdapter.ItemEventCallback callback = null;
    private final boolean showUser = false;
    private final java.lang.String layout = null;
    private final java.lang.String loadQuality = null;
    private final boolean longPressDownload = false;
    @org.jetbrains.annotations.NotNull
    public static final com.intermedia.intermedia.ui.photo.PhotoAdapter.Companion Companion = null;
    private static final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.intermedia.intermedia.data.photo.model.Photo> diffCallback = null;
    
    public PhotoAdapter(@org.jetbrains.annotations.NotNull
    com.intermedia.intermedia.ui.photo.PhotoAdapter.ItemEventCallback callback, boolean showUser, @org.jetbrains.annotations.NotNull
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
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&\u00a8\u0006\f"}, d2 = {"Lcom/intermedia/intermedia/ui/photo/PhotoAdapter$ItemEventCallback;", "", "onLongClick", "", "photo", "Lcom/intermedia/intermedia/data/photo/model/Photo;", "animationView", "Lcom/airbnb/lottie/LottieAnimationView;", "onPhotoClick", "onUserClick", "user", "Lcom/intermedia/intermedia/data/user/model/User;", "app_debug"})
    public static abstract interface ItemEventCallback {
        
        public abstract void onPhotoClick(@org.jetbrains.annotations.NotNull
        com.intermedia.intermedia.data.photo.model.Photo photo);
        
        public abstract void onUserClick(@org.jetbrains.annotations.NotNull
        com.intermedia.intermedia.data.user.model.User user);
        
        public abstract void onLongClick(@org.jetbrains.annotations.NotNull
        com.intermedia.intermedia.data.photo.model.Photo photo, @org.jetbrains.annotations.NotNull
        com.airbnb.lottie.LottieAnimationView animationView);
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/intermedia/intermedia/ui/photo/PhotoAdapter$Companion;", "", "()V", "diffCallback", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/intermedia/intermedia/data/photo/model/Photo;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}