package com.intermedia.intermedia.util.download;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u001bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J \u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0016\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015J\u0016\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u001c"}, d2 = {"Lcom/intermedia/intermedia/util/download/DownloadManagerWrapper;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "downloadActionMap", "Landroidx/collection/LongSparseArray;", "Lcom/intermedia/intermedia/util/download/DownloadAction;", "downloadManager", "Landroid/app/DownloadManager;", "getDownloadManager", "()Landroid/app/DownloadManager;", "downloadManager$delegate", "Lkotlin/Lazy;", "cancelDownload", "", "downloadId", "", "createRequest", "Landroid/app/DownloadManager$Request;", "url", "", "fileName", "showCompletedNotification", "", "downloadPhoto", "downloadWallpaper", "DownloadStatusReceiver", "app_debug"})
public final class DownloadManagerWrapper {
    private final android.content.Context context = null;
    private final kotlin.Lazy downloadManager$delegate = null;
    private final androidx.collection.LongSparseArray<com.intermedia.intermedia.util.download.DownloadAction> downloadActionMap = null;
    
    public DownloadManagerWrapper(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super();
    }
    
    private final android.app.DownloadManager getDownloadManager() {
        return null;
    }
    
    public final long downloadPhoto(@org.jetbrains.annotations.NotNull
    java.lang.String url, @org.jetbrains.annotations.NotNull
    java.lang.String fileName) {
        return 0L;
    }
    
    public final long downloadWallpaper(@org.jetbrains.annotations.NotNull
    java.lang.String url, @org.jetbrains.annotations.NotNull
    java.lang.String fileName) {
        return 0L;
    }
    
    private final android.app.DownloadManager.Request createRequest(java.lang.String url, java.lang.String fileName, boolean showCompletedNotification) {
        return null;
    }
    
    public final void cancelDownload(long downloadId) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u001c\u0010\r\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J(\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002\u00a8\u0006\u0015"}, d2 = {"Lcom/intermedia/intermedia/util/download/DownloadManagerWrapper$DownloadStatusReceiver;", "Landroid/content/BroadcastReceiver;", "(Lcom/intermedia/intermedia/util/download/DownloadManagerWrapper;)V", "onError", "", "cursor", "Landroid/database/Cursor;", "id", "", "downloadAction", "Lcom/intermedia/intermedia/util/download/DownloadAction;", "errorMessage", "", "onReceive", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "onSuccess", "uri", "Landroid/net/Uri;", "app_debug"})
    final class DownloadStatusReceiver extends android.content.BroadcastReceiver {
        
        public DownloadStatusReceiver() {
            super();
        }
        
        @java.lang.Override
        public void onReceive(@org.jetbrains.annotations.Nullable
        android.content.Context context, @org.jetbrains.annotations.Nullable
        android.content.Intent intent) {
        }
        
        private final void onSuccess(android.database.Cursor cursor, long id, com.intermedia.intermedia.util.download.DownloadAction downloadAction, android.net.Uri uri) {
        }
        
        private final void onError(android.database.Cursor cursor, long id, com.intermedia.intermedia.util.download.DownloadAction downloadAction, java.lang.String errorMessage) {
        }
    }
}