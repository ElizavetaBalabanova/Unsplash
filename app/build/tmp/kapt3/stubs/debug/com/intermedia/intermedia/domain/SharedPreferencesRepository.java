package com.intermedia.intermedia.domain;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 K2\u00020\u0001:\u0001KB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\t\u001a\u0004\u0018\u00010\n8F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\r\u001a\u0004\u0018\u00010\n8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u000f\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\bR\u0011\u0010\u0011\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\bR\u0011\u0010\u0013\u001a\u00020\u00148F\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\bR\u0013\u0010\u0019\u001a\u0004\u0018\u00010\n8F\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\fR\u0011\u0010\u001b\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u001c\u0010\bR\u0011\u0010\u001d\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u001e\u0010\bR\u0013\u0010\u001f\u001a\u0004\u0018\u00010\n8F\u00a2\u0006\u0006\u001a\u0004\b \u0010\fR\u0011\u0010!\u001a\u00020\"8F\u00a2\u0006\u0006\u001a\u0004\b#\u0010$R\u0011\u0010%\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\b&\u0010\bR\u0013\u0010\'\u001a\u0004\u0018\u00010\n8F\u00a2\u0006\u0006\u001a\u0004\b(\u0010\fR\u0013\u0010)\u001a\u0004\u0018\u00010\n8F\u00a2\u0006\u0006\u001a\u0004\b*\u0010\fR\u0013\u0010+\u001a\u0004\u0018\u00010\n8F\u00a2\u0006\u0006\u001a\u0004\b,\u0010\fR\u0013\u0010-\u001a\u0004\u0018\u00010\n8F\u00a2\u0006\u0006\u001a\u0004\b.\u0010\fR$\u00100\u001a\u00020\u00142\u0006\u0010/\u001a\u00020\u00148F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b1\u0010\u0016\"\u0004\b2\u00103R$\u00104\u001a\u00020\u00142\u0006\u0010/\u001a\u00020\u00148F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b5\u0010\u0016\"\u0004\b6\u00103R\u0013\u00107\u001a\u0004\u0018\u00010\n8F\u00a2\u0006\u0006\u001a\u0004\b8\u0010\fR\u0013\u00109\u001a\u0004\u0018\u00010\n8F\u00a2\u0006\u0006\u001a\u0004\b:\u0010\fR\u0013\u0010;\u001a\u0004\u0018\u00010<8F\u00a2\u0006\u0006\u001a\u0004\b=\u0010>R\u0011\u0010?\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\b@\u0010\bR\u000e\u0010A\u001a\u00020BX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010C\u001a\u00020D\u00a2\u0006\b\n\u0000\u001a\u0004\bE\u0010FR\u0013\u0010G\u001a\u0004\u0018\u00010\n8F\u00a2\u0006\u0006\u001a\u0004\bH\u0010\fR\u0013\u0010I\u001a\u0004\u0018\u00010\n8F\u00a2\u0006\u0006\u001a\u0004\bJ\u0010\f\u00a8\u0006L"}, d2 = {"Lcom/intermedia/intermedia/domain/SharedPreferencesRepository;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "autoWallpaperCharging", "", "getAutoWallpaperCharging", "()Z", "autoWallpaperContentFilter", "", "getAutoWallpaperContentFilter", "()Ljava/lang/String;", "autoWallpaperCrop", "getAutoWallpaperCrop", "autoWallpaperEnabled", "getAutoWallpaperEnabled", "autoWallpaperIdle", "getAutoWallpaperIdle", "autoWallpaperInterval", "", "getAutoWallpaperInterval", "()J", "autoWallpaperOnWifi", "getAutoWallpaperOnWifi", "autoWallpaperOrientation", "getAutoWallpaperOrientation", "autoWallpaperPersistNotification", "getAutoWallpaperPersistNotification", "autoWallpaperPortraitModeOnly", "getAutoWallpaperPortraitModeOnly", "autoWallpaperSearchTerms", "getAutoWallpaperSearchTerms", "autoWallpaperSelectScreen", "", "getAutoWallpaperSelectScreen", "()I", "autoWallpaperShowNotification", "getAutoWallpaperShowNotification", "autoWallpaperSource", "getAutoWallpaperSource", "autoWallpaperUsername", "getAutoWallpaperUsername", "downloadQuality", "getDownloadQuality", "downloader", "getDownloader", "value", "lastFeaturedCollectionsFetch", "getLastFeaturedCollectionsFetch", "setLastFeaturedCollectionsFetch", "(J)V", "lastPopularCollectionsFetch", "getLastPopularCollectionsFetch", "setLastPopularCollectionsFetch", "layout", "getLayout", "loadQuality", "getLoadQuality", "locale", "Ljava/util/Locale;", "getLocale", "()Ljava/util/Locale;", "longPressDownload", "getLongPressDownload", "sharedPreferenceChangedListener", "Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;", "sharedPreferences", "Landroid/content/SharedPreferences;", "getSharedPreferences", "()Landroid/content/SharedPreferences;", "theme", "getTheme", "wallpaperQuality", "getWallpaperQuality", "Companion", "app_debug"})
public final class SharedPreferencesRepository {
    @org.jetbrains.annotations.NotNull
    private final android.content.SharedPreferences sharedPreferences = null;
    private final android.content.SharedPreferences.OnSharedPreferenceChangeListener sharedPreferenceChangedListener = null;
    @org.jetbrains.annotations.NotNull
    public static final com.intermedia.intermedia.domain.SharedPreferencesRepository.Companion Companion = null;
    private static final java.lang.String PREFERENCE_LANGUAGE_KEY = "language";
    private static final java.lang.String PREFERENCE_LANGUAGE_DEFAULT_VALUE = "default";
    private static final java.lang.String PREFERENCE_THEME_KEY = "theme";
    private static final java.lang.String PREFERENCE_THEME_DEFAULT_VALUE = "default";
    private static final java.lang.String PREFERENCE_LAYOUT_KEY = "layout";
    private static final java.lang.String PREFERENCE_LAYOUT_DEFAULT_VALUE = "default";
    private static final java.lang.String PREFERENCE_DOWNLOADER_KEY = "downloader";
    private static final java.lang.String PREFERENCE_DOWNLOADER_DEFAULT_VALUE = "default";
    private static final java.lang.String PREFERENCE_LOAD_QUALITY_KEY = "load_quality";
    private static final java.lang.String PREFERENCE_LOAD_QUALITY_DEFAULT_VALUE = "regular";
    private static final java.lang.String PREFERENCE_DOWNLOAD_QUALITY_KEY = "download_quality";
    private static final java.lang.String PREFERENCE_DOWNLOAD_QUALITY_DEFAULT_VALUE = "full";
    private static final java.lang.String PREFERENCE_WALLPAPER_QUALITY_KEY = "wallpaper_quality";
    private static final java.lang.String PREFERENCE_WALLPAPER_QUALITY_DEFAULT_VALUE = "full";
    private static final java.lang.String PREFERENCE_LONG_PRESS_DOWNLOAD_KEY = "long_press_download";
    private static final boolean PREFERENCE_LONG_PRESS_DOWNLOAD_DEFAULT_VALUE = true;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String PREFERENCE_AUTO_WALLPAPER_ENABLE_KEY = "auto_wallpaper_enable";
    public static final boolean PREFERENCE_AUTO_WALLPAPER_ENABLE_DEFAULT_VALUE = false;
    private static final java.lang.String PREFERENCE_AUTO_WALLPAPER_ON_WIFI_KEY = "auto_wallpaper_on_wifi";
    private static final boolean PREFERENCE_AUTO_WALLPAPER_ON_WIFI_DEFAULT_VALUE = true;
    private static final java.lang.String PREFERENCE_AUTO_WALLPAPER_CHARGING_KEY = "auto_wallpaper_charging";
    private static final boolean PREFERENCE_AUTO_WALLPAPER_CHARGING_DEFAULT_VALUE = false;
    private static final java.lang.String PREFERENCE_AUTO_WALLPAPER_IDLE_KEY = "auto_wallpaper_idle";
    private static final boolean PREFERENCE_AUTO_WALLPAPER_IDLE_DEFAULT_VALUE = false;
    private static final java.lang.String PREFERENCE_AUTO_WALLPAPER_INTERVAL_KEY = "auto_wallpaper_interval";
    private static final java.lang.String PREFERENCE_AUTO_WALLPAPER_INTERVAL_DEFAULT_VALUE = "1440";
    private static final java.lang.String PREFERENCE_AUTO_WALLPAPER_SOURCE_KEY = "auto_wallpaper_source";
    private static final java.lang.String PREFERENCE_AUTO_WALLPAPER_SOURCE_DEFAULT_VALUE = "featured";
    private static final java.lang.String PREFERENCE_AUTO_WALLPAPER_USERNAME_KEY = "auto_wallpaper_username";
    private static final java.lang.String PREFERENCE_AUTO_WALLPAPER_USERNAME_DEFAULT_VALUE = "";
    private static final java.lang.String PREFERENCE_AUTO_WALLPAPER_SEARCH_TERMS_KEY = "auto_wallpaper_search_terms";
    private static final java.lang.String PREFERENCE_AUTO_WALLPAPER_SEARCH_TERMS_DEFAULT_VALUE = "";
    private static final java.lang.String PREFERENCE_AUTO_WALLPAPER_CROP_KEY = "auto_wallpaper_crop";
    private static final java.lang.String PREFERENCE_AUTO_WALLPAPER_CROP_DEFAULT_VALUE = "center_crop";
    private static final java.lang.String PREFERENCE_AUTO_WALLPAPER_SHOW_NOTIFICATION_KEY = "auto_wallpaper_show_notification";
    private static final boolean PREFERENCE_AUTO_WALLPAPER_SHOW_NOTIFICATION_DEFAULT_VALUE = true;
    private static final java.lang.String PREFERENCE_AUTO_WALLPAPER_PERSIST_NOTIFICATION_KEY = "auto_wallpaper_persist_notification";
    private static final boolean PREFERENCE_AUTO_WALLPAPER_PERSIST_NOTIFICATION_DEFAULT_VALUE = false;
    private static final java.lang.String PREFERENCE_AUTO_WALLPAPER_PORTRAIT_MODE_ONLY_KEY = "auto_wallpaper_portrait_mode_only";
    private static final boolean PREFERENCE_AUTO_WALLPAPER_PORTRAIT_MODE_ONLY_DEFAULT_VALUE = false;
    private static final java.lang.String PREFERENCE_AUTO_WALLPAPER_SELECT_SCREEN_KEY = "auto_wallpaper_select_screen";
    private static final java.lang.String PREFERENCE_AUTO_WALLPAPER_SELECT_SCREEN_DEFAULT_VALUE = "both";
    private static final java.lang.String PREFERENCE_AUTO_WALLPAPER_ORIENTATION_KEY = "auto_wallpaper_orientation";
    private static final java.lang.String PREFERENCE_AUTO_WALLPAPER_ORIENTATION_DEFAULT_VALUE = "any";
    private static final java.lang.String PREFERENCE_AUTO_WALLPAPER_CONTENT_FILTER_KEY = "auto_wallpaper_content_filter";
    private static final java.lang.String PREFERENCE_AUTO_WALLPAPER_CONTENT_FILTER_DEFAULT_VALUE = "low";
    private static final java.lang.String PREFERENCE_LAST_FEATURED_COLLECTIONS_FETCH_KEY = "last_featured_collections_fetch";
    private static final long PREFERENCE_LAST_FEATURED_COLLECTIONS_FETCH_DEFAULT_VALUE = 0L;
    private static final java.lang.String PREFERENCE_LAST_POPULAR_COLLECTIONS_FETCH_KEY = "last_popular_collections_fetch";
    private static final long PREFERENCE_LAST_POPULAR_COLLECTIONS_FETCH_DEFAULT_VALUE = 0L;
    
    public SharedPreferencesRepository(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.content.SharedPreferences getSharedPreferences() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getTheme() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getLayout() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getDownloader() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getLoadQuality() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getDownloadQuality() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getWallpaperQuality() {
        return null;
    }
    
    public final boolean getLongPressDownload() {
        return false;
    }
    
    public final boolean getAutoWallpaperEnabled() {
        return false;
    }
    
    public final boolean getAutoWallpaperOnWifi() {
        return false;
    }
    
    public final boolean getAutoWallpaperCharging() {
        return false;
    }
    
    public final boolean getAutoWallpaperIdle() {
        return false;
    }
    
    public final long getAutoWallpaperInterval() {
        return 0L;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getAutoWallpaperSource() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getAutoWallpaperUsername() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getAutoWallpaperSearchTerms() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getAutoWallpaperCrop() {
        return null;
    }
    
    public final boolean getAutoWallpaperShowNotification() {
        return false;
    }
    
    public final boolean getAutoWallpaperPersistNotification() {
        return false;
    }
    
    public final boolean getAutoWallpaperPortraitModeOnly() {
        return false;
    }
    
    public final int getAutoWallpaperSelectScreen() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getAutoWallpaperOrientation() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getAutoWallpaperContentFilter() {
        return null;
    }
    
    public final long getLastFeaturedCollectionsFetch() {
        return 0L;
    }
    
    public final void setLastFeaturedCollectionsFetch(long value) {
    }
    
    public final long getLastPopularCollectionsFetch() {
        return 0L;
    }
    
    public final void setLastPopularCollectionsFetch(long value) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.Locale getLocale() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b#\n\u0002\u0010\t\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\'\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020*X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020*X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u00068"}, d2 = {"Lcom/intermedia/intermedia/domain/SharedPreferencesRepository$Companion;", "", "()V", "PREFERENCE_AUTO_WALLPAPER_CHARGING_DEFAULT_VALUE", "", "PREFERENCE_AUTO_WALLPAPER_CHARGING_KEY", "", "PREFERENCE_AUTO_WALLPAPER_CONTENT_FILTER_DEFAULT_VALUE", "PREFERENCE_AUTO_WALLPAPER_CONTENT_FILTER_KEY", "PREFERENCE_AUTO_WALLPAPER_CROP_DEFAULT_VALUE", "PREFERENCE_AUTO_WALLPAPER_CROP_KEY", "PREFERENCE_AUTO_WALLPAPER_ENABLE_DEFAULT_VALUE", "PREFERENCE_AUTO_WALLPAPER_ENABLE_KEY", "PREFERENCE_AUTO_WALLPAPER_IDLE_DEFAULT_VALUE", "PREFERENCE_AUTO_WALLPAPER_IDLE_KEY", "PREFERENCE_AUTO_WALLPAPER_INTERVAL_DEFAULT_VALUE", "PREFERENCE_AUTO_WALLPAPER_INTERVAL_KEY", "PREFERENCE_AUTO_WALLPAPER_ON_WIFI_DEFAULT_VALUE", "PREFERENCE_AUTO_WALLPAPER_ON_WIFI_KEY", "PREFERENCE_AUTO_WALLPAPER_ORIENTATION_DEFAULT_VALUE", "PREFERENCE_AUTO_WALLPAPER_ORIENTATION_KEY", "PREFERENCE_AUTO_WALLPAPER_PERSIST_NOTIFICATION_DEFAULT_VALUE", "PREFERENCE_AUTO_WALLPAPER_PERSIST_NOTIFICATION_KEY", "PREFERENCE_AUTO_WALLPAPER_PORTRAIT_MODE_ONLY_DEFAULT_VALUE", "PREFERENCE_AUTO_WALLPAPER_PORTRAIT_MODE_ONLY_KEY", "PREFERENCE_AUTO_WALLPAPER_SEARCH_TERMS_DEFAULT_VALUE", "PREFERENCE_AUTO_WALLPAPER_SEARCH_TERMS_KEY", "PREFERENCE_AUTO_WALLPAPER_SELECT_SCREEN_DEFAULT_VALUE", "PREFERENCE_AUTO_WALLPAPER_SELECT_SCREEN_KEY", "PREFERENCE_AUTO_WALLPAPER_SHOW_NOTIFICATION_DEFAULT_VALUE", "PREFERENCE_AUTO_WALLPAPER_SHOW_NOTIFICATION_KEY", "PREFERENCE_AUTO_WALLPAPER_SOURCE_DEFAULT_VALUE", "PREFERENCE_AUTO_WALLPAPER_SOURCE_KEY", "PREFERENCE_AUTO_WALLPAPER_USERNAME_DEFAULT_VALUE", "PREFERENCE_AUTO_WALLPAPER_USERNAME_KEY", "PREFERENCE_DOWNLOADER_DEFAULT_VALUE", "PREFERENCE_DOWNLOADER_KEY", "PREFERENCE_DOWNLOAD_QUALITY_DEFAULT_VALUE", "PREFERENCE_DOWNLOAD_QUALITY_KEY", "PREFERENCE_LANGUAGE_DEFAULT_VALUE", "PREFERENCE_LANGUAGE_KEY", "PREFERENCE_LAST_FEATURED_COLLECTIONS_FETCH_DEFAULT_VALUE", "", "PREFERENCE_LAST_FEATURED_COLLECTIONS_FETCH_KEY", "PREFERENCE_LAST_POPULAR_COLLECTIONS_FETCH_DEFAULT_VALUE", "PREFERENCE_LAST_POPULAR_COLLECTIONS_FETCH_KEY", "PREFERENCE_LAYOUT_DEFAULT_VALUE", "PREFERENCE_LAYOUT_KEY", "PREFERENCE_LOAD_QUALITY_DEFAULT_VALUE", "PREFERENCE_LOAD_QUALITY_KEY", "PREFERENCE_LONG_PRESS_DOWNLOAD_DEFAULT_VALUE", "PREFERENCE_LONG_PRESS_DOWNLOAD_KEY", "PREFERENCE_THEME_DEFAULT_VALUE", "PREFERENCE_THEME_KEY", "PREFERENCE_WALLPAPER_QUALITY_DEFAULT_VALUE", "PREFERENCE_WALLPAPER_QUALITY_KEY", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}