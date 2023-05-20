package com.intermedia.intermedia.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 2, d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001\u001a\u0010\u0010\b\u001a\u00020\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001\u001a\u001a\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\r\u001a\u00020\tH\u0007\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"BATTERY", "", "DARK", "DEFAULT", "LIGHT", "applyTheme", "", "theme", "getCustomTabsColorScheme", "", "getThemeAttrColor", "context", "Landroid/content/Context;", "colorAttr", "app_debug"})
public final class ThemeUtilsKt {
    private static final java.lang.String LIGHT = "light";
    private static final java.lang.String DARK = "dark";
    private static final java.lang.String BATTERY = "battery";
    private static final java.lang.String DEFAULT = "default";
    
    public static final void applyTheme(@org.jetbrains.annotations.Nullable
    java.lang.String theme) {
    }
    
    @androidx.browser.customtabs.CustomTabsIntent.ColorScheme
    public static final int getCustomTabsColorScheme(@org.jetbrains.annotations.Nullable
    java.lang.String theme) {
        return 0;
    }
    
    @androidx.annotation.ColorInt
    public static final int getThemeAttrColor(@org.jetbrains.annotations.NotNull
    android.content.Context context, @androidx.annotation.AttrRes
    int colorAttr) {
        return 0;
    }
}