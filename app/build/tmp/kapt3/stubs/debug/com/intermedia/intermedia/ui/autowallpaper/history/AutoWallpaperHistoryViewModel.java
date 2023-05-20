package com.intermedia.intermedia.ui.autowallpaper.history;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\r"}, d2 = {"Lcom/intermedia/intermedia/ui/autowallpaper/history/AutoWallpaperHistoryViewModel;", "Landroidx/lifecycle/ViewModel;", "autoWallpaperRepository", "Lcom/intermedia/intermedia/domain/autowallpaper/AutoWallpaperRepository;", "(Lcom/intermedia/intermedia/domain/autowallpaper/AutoWallpaperRepository;)V", "wallpaperHistoryLiveData", "Landroidx/lifecycle/LiveData;", "Landroidx/paging/PagedList;", "Lcom/intermedia/intermedia/data/autowallpaper/model/AutoWallpaperHistory;", "getWallpaperHistoryLiveData", "()Landroidx/lifecycle/LiveData;", "clearAllWallpaperHistory", "", "app_debug"})
public final class AutoWallpaperHistoryViewModel extends androidx.lifecycle.ViewModel {
    private final com.intermedia.intermedia.domain.autowallpaper.AutoWallpaperRepository autoWallpaperRepository = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<androidx.paging.PagedList<com.intermedia.intermedia.data.autowallpaper.model.AutoWallpaperHistory>> wallpaperHistoryLiveData = null;
    
    public AutoWallpaperHistoryViewModel(@org.jetbrains.annotations.NotNull
    com.intermedia.intermedia.domain.autowallpaper.AutoWallpaperRepository autoWallpaperRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<androidx.paging.PagedList<com.intermedia.intermedia.data.autowallpaper.model.AutoWallpaperHistory>> getWallpaperHistoryLiveData() {
        return null;
    }
    
    public final void clearAllWallpaperHistory() {
    }
}