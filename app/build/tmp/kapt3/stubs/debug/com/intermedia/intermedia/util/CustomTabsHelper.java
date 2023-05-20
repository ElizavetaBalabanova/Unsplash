package com.intermedia.intermedia.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\u000fJ\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\"\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\n8F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u001a"}, d2 = {"Lcom/intermedia/intermedia/util/CustomTabsHelper;", "", "()V", "BETA_PACKAGE", "", "DEV_PACKAGE", "LOCAL_PACKAGE", "STABLE_PACKAGE", "packageNameToUse", "packages", "", "getPackages", "()Ljava/util/List;", "getPackageNameToUse", "context", "Landroid/content/Context;", "hasSpecializedHandlerIntents", "", "intent", "Landroid/content/Intent;", "launchFallback", "", "uri", "Landroid/net/Uri;", "openCustomTab", "theme", "app_debug"})
public final class CustomTabsHelper {
    @org.jetbrains.annotations.NotNull
    public static final com.intermedia.intermedia.util.CustomTabsHelper INSTANCE = null;
    private static final java.lang.String STABLE_PACKAGE = "com.android.chrome";
    private static final java.lang.String BETA_PACKAGE = "com.chrome.beta";
    private static final java.lang.String DEV_PACKAGE = "com.chrome.dev";
    private static final java.lang.String LOCAL_PACKAGE = "com.google.android.apps.chrome";
    private static java.lang.String packageNameToUse;
    
    private CustomTabsHelper() {
        super();
    }
    
    /**
     * Opens the URL on a Custom Tab if possible.
     * Otherwise falls back to opening it in the default browser
     *
     * @param context          The host activity
     * @param uri              The Uri to be opened
     * @param theme            The theme use to set color scheme
     */
    public final void openCustomTab(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    android.net.Uri uri, @org.jetbrains.annotations.Nullable
    java.lang.String theme) {
    }
    
    private final void launchFallback(android.content.Context context, android.net.Uri uri) {
    }
    
    /**
     * Goes through all apps that handle VIEW intents and have a warmup service. Picks
     * the one chosen by the user if there is one, otherwise makes a best effort to return a
     * valid package name.
     *
     * This is **not** threadsafe.
     *
     * @param context [Context] to use for accessing [PackageManager].
     * @return The package name recommended to use for connecting to custom tabs related components.
     */
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getPackageNameToUse(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return null;
    }
    
    /**
     * Used to check whether there is a specialized handler for a given intent.
     *
     * @param intent The intent to check with.
     * @return Whether there is a specialized handler for the given intent.
     */
    private final boolean hasSpecializedHandlerIntents(android.content.Context context, android.content.Intent intent) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> getPackages() {
        return null;
    }
}