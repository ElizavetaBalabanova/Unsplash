package com.intermedia.intermedia.ui.photo.detail;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00122\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0012\u0013B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\rH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0014"}, d2 = {"Lcom/intermedia/intermedia/ui/photo/detail/TagAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/intermedia/intermedia/data/photo/model/Tag;", "Lcom/intermedia/intermedia/ui/photo/detail/TagViewHolder;", "callback", "Lcom/intermedia/intermedia/ui/photo/detail/TagAdapter$ItemEventCallback;", "(Lcom/intermedia/intermedia/ui/photo/detail/TagAdapter$ItemEventCallback;)V", "getCallback", "()Lcom/intermedia/intermedia/ui/photo/detail/TagAdapter$ItemEventCallback;", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "ItemEventCallback", "app_debug"})
public final class TagAdapter extends androidx.recyclerview.widget.ListAdapter<com.intermedia.intermedia.data.photo.model.Tag, com.intermedia.intermedia.ui.photo.detail.TagViewHolder> {
    @org.jetbrains.annotations.NotNull
    private final com.intermedia.intermedia.ui.photo.detail.TagAdapter.ItemEventCallback callback = null;
    @org.jetbrains.annotations.NotNull
    public static final com.intermedia.intermedia.ui.photo.detail.TagAdapter.Companion Companion = null;
    private static final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.intermedia.intermedia.data.photo.model.Tag> diffCallback = null;
    
    public TagAdapter(@org.jetbrains.annotations.NotNull
    com.intermedia.intermedia.ui.photo.detail.TagAdapter.ItemEventCallback callback) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.intermedia.intermedia.ui.photo.detail.TagAdapter.ItemEventCallback getCallback() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.intermedia.intermedia.ui.photo.detail.TagViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.intermedia.intermedia.ui.photo.detail.TagViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/intermedia/intermedia/ui/photo/detail/TagAdapter$ItemEventCallback;", "", "onTagClick", "", "tag", "", "app_debug"})
    public static abstract interface ItemEventCallback {
        
        public abstract void onTagClick(@org.jetbrains.annotations.NotNull
        java.lang.String tag);
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/intermedia/intermedia/ui/photo/detail/TagAdapter$Companion;", "", "()V", "diffCallback", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/intermedia/intermedia/data/photo/model/Tag;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}