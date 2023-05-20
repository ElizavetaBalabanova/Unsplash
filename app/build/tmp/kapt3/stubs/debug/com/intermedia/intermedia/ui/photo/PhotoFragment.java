package com.intermedia.intermedia.ui.photo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0018\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u001aH\u0002R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\bR\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00108VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0012\u0010\u0013\u001a\u00020\u0014X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006\u001d"}, d2 = {"Lcom/intermedia/intermedia/ui/photo/PhotoFragment;", "Lcom/intermedia/intermedia/ui/base/BaseSwipeRecyclerViewFragment;", "Lcom/intermedia/intermedia/data/photo/model/Photo;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "()V", "emptyStateSubtitle", "", "getEmptyStateSubtitle", "()Ljava/lang/String;", "emptyStateTitle", "getEmptyStateTitle", "itemEventCallback", "Lcom/intermedia/intermedia/ui/photo/PhotoAdapter$ItemEventCallback;", "getItemEventCallback", "()Lcom/intermedia/intermedia/ui/photo/PhotoAdapter$ItemEventCallback;", "itemSpacing", "", "getItemSpacing", "()I", "pagedListAdapter", "Lcom/intermedia/intermedia/ui/photo/PhotoAdapter;", "getPagedListAdapter", "()Lcom/intermedia/intermedia/ui/photo/PhotoAdapter;", "animateLongClickDownload", "", "animationView", "Lcom/airbnb/lottie/LottieAnimationView;", "downloadPhoto", "photo", "app_debug"})
public abstract class PhotoFragment extends com.intermedia.intermedia.ui.base.BaseSwipeRecyclerViewFragment<com.intermedia.intermedia.data.photo.model.Photo, androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    @org.jetbrains.annotations.NotNull
    private final com.intermedia.intermedia.ui.photo.PhotoAdapter.ItemEventCallback itemEventCallback = null;
    
    public PhotoFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public abstract com.intermedia.intermedia.ui.photo.PhotoAdapter getPagedListAdapter();
    
    @org.jetbrains.annotations.NotNull
    public final com.intermedia.intermedia.ui.photo.PhotoAdapter.ItemEventCallback getItemEventCallback() {
        return null;
    }
    
    private final void downloadPhoto(com.intermedia.intermedia.data.photo.model.Photo photo, com.airbnb.lottie.LottieAnimationView animationView) {
    }
    
    private final void animateLongClickDownload(com.airbnb.lottie.LottieAnimationView animationView) {
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