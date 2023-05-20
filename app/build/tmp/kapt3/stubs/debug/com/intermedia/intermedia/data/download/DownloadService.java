package com.intermedia.intermedia.data.download;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u001b\u0010\u0007\u001a\u00020\u00032\b\b\u0001\u0010\b\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\t"}, d2 = {"Lcom/intermedia/intermedia/data/download/DownloadService;", "", "downloadFile", "Lokhttp3/ResponseBody;", "fileUrl", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "trackDownload", "id", "app_debug"})
public abstract interface DownloadService {
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET
    @retrofit2.http.Streaming
    public abstract java.lang.Object downloadFile(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Url
    java.lang.String fileUrl, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super okhttp3.ResponseBody> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "photos/{id}/download")
    public abstract java.lang.Object trackDownload(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Path(value = "id")
    java.lang.String id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super okhttp3.ResponseBody> continuation);
}