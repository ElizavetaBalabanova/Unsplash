package com.intermedia.intermedia.worker;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 02\u00020\u0001:\u00010B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0011\u0010\u000b\u001a\u00020\fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ;\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019J4\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\n\u0010\u001c\u001a\u00060\u001dj\u0002`\u001e2\u0006\u0010\u001f\u001a\u00020\u00162\u0006\u0010 \u001a\u00020!H\u0002J)\u0010\"\u001a\u00020\u001b2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010#\u001a\u00020\u00182\u0006\u0010$\u001a\u00020\u0016H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010%J \u0010&\u001a\u00020\u001b2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\'\u001a\u00020(H\u0002J4\u0010)\u001a\u0004\u0018\u00010(*\u00020*2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00112\u0014\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u001b\u0018\u00010+H\u0003J4\u0010,\u001a\u0004\u0018\u00010(*\u00020*2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00112\u0014\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u001b\u0018\u00010+H\u0002J*\u0010-\u001a\u00020!*\u00020*2\u0006\u0010.\u001a\u00020/2\u0014\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u001b\u0018\u00010+H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u00061"}, d2 = {"Lcom/intermedia/intermedia/worker/DownloadWorker;", "Landroidx/work/CoroutineWorker;", "context", "Landroid/content/Context;", "params", "Landroidx/work/WorkerParameters;", "downloadService", "Lcom/intermedia/intermedia/data/download/DownloadService;", "notificationManager", "Lcom/intermedia/intermedia/util/NotificationManager;", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lcom/intermedia/intermedia/data/download/DownloadService;Lcom/intermedia/intermedia/util/NotificationManager;)V", "doWork", "Landroidx/work/ListenableWorker$Result;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "download", "", "url", "", "fileName", "downloadAction", "Lcom/intermedia/intermedia/util/download/DownloadAction;", "notificationId", "", "notificationBuilder", "Landroidx/core/app/NotificationCompat$Builder;", "(Ljava/lang/String;Ljava/lang/String;Lcom/intermedia/intermedia/util/download/DownloadAction;ILandroidx/core/app/NotificationCompat$Builder;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onError", "", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "status", "showNotification", "", "onProgress", "builder", "progress", "(ILandroidx/core/app/NotificationCompat$Builder;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onSuccess", "uri", "Landroid/net/Uri;", "saveImage", "Lokhttp3/ResponseBody;", "Lkotlin/Function1;", "saveImageLegacy", "writeToSink", "sink", "Lokio/BufferedSink;", "Companion", "app_debug"})
public final class DownloadWorker extends androidx.work.CoroutineWorker {
    private final android.content.Context context = null;
    private final com.intermedia.intermedia.data.download.DownloadService downloadService = null;
    private final com.intermedia.intermedia.util.NotificationManager notificationManager = null;
    @org.jetbrains.annotations.NotNull
    public static final com.intermedia.intermedia.worker.DownloadWorker.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_DOWNLOAD_ACTION = "KEY_DOWNLOAD_ACTION";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_INPUT_URL = "KEY_INPUT_URL";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_OUTPUT_FILE_NAME = "KEY_OUTPUT_FILE_NAME";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_PHOTO_ID = "KEY_PHOTO_ID";
    
    public DownloadWorker(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    androidx.work.WorkerParameters params, @org.jetbrains.annotations.NotNull
    com.intermedia.intermedia.data.download.DownloadService downloadService, @org.jetbrains.annotations.NotNull
    com.intermedia.intermedia.util.NotificationManager notificationManager) {
        super(null, null);
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object doWork(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super androidx.work.ListenableWorker.Result> continuation) {
        return null;
    }
    
    private final java.lang.Object download(java.lang.String url, java.lang.String fileName, com.intermedia.intermedia.util.download.DownloadAction downloadAction, int notificationId, androidx.core.app.NotificationCompat.Builder notificationBuilder, kotlin.coroutines.Continuation<java.lang.Object> continuation) {
        return null;
    }
    
    private final java.lang.Object onProgress(int notificationId, androidx.core.app.NotificationCompat.Builder builder, int progress, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final void onSuccess(com.intermedia.intermedia.util.download.DownloadAction downloadAction, java.lang.String fileName, android.net.Uri uri) {
    }
    
    private final void onError(com.intermedia.intermedia.util.download.DownloadAction downloadAction, java.lang.String fileName, java.lang.Exception exception, int status, boolean showNotification) {
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.Q)
    private final android.net.Uri saveImage(okhttp3.ResponseBody $this$saveImage, android.content.Context context, java.lang.String fileName, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onProgress) {
        return null;
    }
    
    private final android.net.Uri saveImageLegacy(okhttp3.ResponseBody $this$saveImageLegacy, android.content.Context context, java.lang.String fileName, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onProgress) {
        return null;
    }
    
    private final boolean writeToSink(okhttp3.ResponseBody $this$writeToSink, okio.BufferedSink sink, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onProgress) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J0\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/intermedia/intermedia/worker/DownloadWorker$Companion;", "", "()V", "KEY_DOWNLOAD_ACTION", "", "KEY_INPUT_URL", "KEY_OUTPUT_FILE_NAME", "KEY_PHOTO_ID", "enqueueDownload", "Ljava/util/UUID;", "context", "Landroid/content/Context;", "downloadAction", "Lcom/intermedia/intermedia/util/download/DownloadAction;", "url", "fileName", "photoId", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.UUID enqueueDownload(@org.jetbrains.annotations.NotNull
        android.content.Context context, @org.jetbrains.annotations.NotNull
        com.intermedia.intermedia.util.download.DownloadAction downloadAction, @org.jetbrains.annotations.NotNull
        java.lang.String url, @org.jetbrains.annotations.NotNull
        java.lang.String fileName, @org.jetbrains.annotations.Nullable
        java.lang.String photoId) {
            return null;
        }
    }
}