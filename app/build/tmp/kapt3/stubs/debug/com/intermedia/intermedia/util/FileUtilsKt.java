package com.intermedia.intermedia.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 2, d1 = {"\u0000*\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\r\u001a\u001c\u0010\u000e\u001a\u00020\u000f*\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001\u001a\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u0013*\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u0011\u0010\u0003\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0011\u0010\u0006\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0005\u00a8\u0006\u0014"}, d2 = {"FILE_PROVIDER_AUTHORITY", "", "INTERMEDIA_DIRECTORY", "INTERMEDIA_LEGACY_PATH", "getINTERMEDIA_LEGACY_PATH", "()Ljava/lang/String;", "INTERMEDIA_RELATIVE_PATH", "getINTERMEDIA_RELATIVE_PATH", "showFileExistsDialog", "", "context", "Landroid/content/Context;", "action", "Lkotlin/Function0;", "fileExists", "", "fileName", "downloader", "getUriForPhoto", "Landroid/net/Uri;", "app_debug"})
public final class FileUtilsKt {
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String INTERMEDIA_DIRECTORY = "Intermedia";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String FILE_PROVIDER_AUTHORITY = "com.b_lam.intermedia.debug.fileprovider";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String INTERMEDIA_RELATIVE_PATH = null;
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String INTERMEDIA_LEGACY_PATH = null;
    
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String getINTERMEDIA_RELATIVE_PATH() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String getINTERMEDIA_LEGACY_PATH() {
        return null;
    }
    
    public static final boolean fileExists(@org.jetbrains.annotations.NotNull
    android.content.Context $this$fileExists, @org.jetbrains.annotations.NotNull
    java.lang.String fileName, @org.jetbrains.annotations.Nullable
    java.lang.String downloader) {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable
    public static final android.net.Uri getUriForPhoto(@org.jetbrains.annotations.NotNull
    android.content.Context $this$getUriForPhoto, @org.jetbrains.annotations.NotNull
    java.lang.String fileName, @org.jetbrains.annotations.Nullable
    java.lang.String downloader) {
        return null;
    }
    
    public static final void showFileExistsDialog(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> action) {
    }
}