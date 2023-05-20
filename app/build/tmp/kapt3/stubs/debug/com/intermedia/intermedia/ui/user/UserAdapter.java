package com.intermedia.intermedia.ui.user;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0011\u0012B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016J\u0010\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/intermedia/intermedia/ui/user/UserAdapter;", "Lcom/intermedia/intermedia/ui/widget/recyclerview/BasePagedListAdapter;", "Lcom/intermedia/intermedia/data/user/model/User;", "Lcom/intermedia/intermedia/ui/user/UserViewHolder;", "callback", "Lcom/intermedia/intermedia/ui/user/UserAdapter$ItemEventCallback;", "(Lcom/intermedia/intermedia/ui/user/UserAdapter$ItemEventCallback;)V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onViewRecycled", "Companion", "ItemEventCallback", "app_debug"})
public final class UserAdapter extends com.intermedia.intermedia.ui.widget.recyclerview.BasePagedListAdapter<com.intermedia.intermedia.data.user.model.User, com.intermedia.intermedia.ui.user.UserViewHolder> {
    private final com.intermedia.intermedia.ui.user.UserAdapter.ItemEventCallback callback = null;
    @org.jetbrains.annotations.NotNull
    public static final com.intermedia.intermedia.ui.user.UserAdapter.Companion Companion = null;
    private static final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.intermedia.intermedia.data.user.model.User> diffCallback = null;
    
    public UserAdapter(@org.jetbrains.annotations.NotNull
    com.intermedia.intermedia.ui.user.UserAdapter.ItemEventCallback callback) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.intermedia.intermedia.ui.user.UserViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.intermedia.intermedia.ui.user.UserViewHolder holder, int position) {
    }
    
    @java.lang.Override
    public void onViewRecycled(@org.jetbrains.annotations.NotNull
    com.intermedia.intermedia.ui.user.UserViewHolder holder) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"Lcom/intermedia/intermedia/ui/user/UserAdapter$ItemEventCallback;", "", "onPhotoClick", "", "photo", "Lcom/intermedia/intermedia/data/photo/model/Photo;", "onUserClick", "user", "Lcom/intermedia/intermedia/data/user/model/User;", "app_debug"})
    public static abstract interface ItemEventCallback {
        
        public abstract void onUserClick(@org.jetbrains.annotations.NotNull
        com.intermedia.intermedia.data.user.model.User user);
        
        public abstract void onPhotoClick(@org.jetbrains.annotations.NotNull
        com.intermedia.intermedia.data.photo.model.Photo photo);
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/intermedia/intermedia/ui/user/UserAdapter$Companion;", "", "()V", "diffCallback", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/intermedia/intermedia/data/user/model/User;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}