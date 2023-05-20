package com.intermedia.intermedia.provider;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 \u00142\u00020\u00012\u00020\u0002:\u0001\u0014B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u001c\u0010\b\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J \u0010\f\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J \u0010\u0011\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002\u00a8\u0006\u0015"}, d2 = {"Lcom/intermedia/intermedia/provider/AutoWallpaperAppWidgetProvider;", "Landroid/appwidget/AppWidgetProvider;", "Lorg/koin/core/component/KoinComponent;", "()V", "getNextAutoWallpaperPendingIntent", "Landroid/app/PendingIntent;", "context", "Landroid/content/Context;", "onReceive", "", "intent", "Landroid/content/Intent;", "onUpdate", "appWidgetManager", "Landroid/appwidget/AppWidgetManager;", "appWidgetIds", "", "updateAppWidget", "appWidgetId", "", "Companion", "app_debug"})
public final class AutoWallpaperAppWidgetProvider extends android.appwidget.AppWidgetProvider implements org.koin.core.component.KoinComponent {
    @org.jetbrains.annotations.NotNull
    public static final com.intermedia.intermedia.provider.AutoWallpaperAppWidgetProvider.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String ACTION_WIDGET_NEXT = "com.b_lam.resplash.ACTION_WIDGET_NEXT";
    
    public AutoWallpaperAppWidgetProvider() {
        super();
    }
    
    @java.lang.Override
    public void onReceive(@org.jetbrains.annotations.Nullable
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.content.Intent intent) {
    }
    
    @java.lang.Override
    public void onUpdate(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    android.appwidget.AppWidgetManager appWidgetManager, @org.jetbrains.annotations.NotNull
    int[] appWidgetIds) {
    }
    
    private final void updateAppWidget(android.content.Context context, android.appwidget.AppWidgetManager appWidgetManager, int appWidgetId) {
    }
    
    private final android.app.PendingIntent getNextAutoWallpaperPendingIntent(android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public org.koin.core.Koin getKoin() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/intermedia/intermedia/provider/AutoWallpaperAppWidgetProvider$Companion;", "", "()V", "ACTION_WIDGET_NEXT", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}