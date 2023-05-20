package com.intermedia.intermedia.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 2, d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u001a$\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u001a\u001c\u0010\t\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\n\u001a\u00020\b\u001a$\u0010\t\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u001a-\u0010\u000b\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\b2\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\u000e\u00a2\u0006\u0002\b\u0010\u001a&\u0010\u0011\u001a\u00020\u0001*\u00020\u00122\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00010\u000e\u00a2\u0006\u0002\b\u0010H\u0082\b\u00a8\u0006\u0014"}, d2 = {"addFragmentToActivity", "", "Landroidx/appcompat/app/AppCompatActivity;", "fragment", "Landroidx/fragment/app/Fragment;", "tag", "", "containerViewId", "", "replaceFragmentInActivity", "frameId", "setupActionBar", "toolbarId", "action", "Lkotlin/Function1;", "Landroidx/appcompat/app/ActionBar;", "Lkotlin/ExtensionFunctionType;", "transact", "Landroidx/fragment/app/FragmentManager;", "Landroidx/fragment/app/FragmentTransaction;", "app_debug"})
public final class ActivityExtKt {
    
    /**
     * The `fragment` is added to the container view with id `frameId`. The operation is
     * performed by the `fragmentManager`.
     */
    public static final void replaceFragmentInActivity(@org.jetbrains.annotations.NotNull
    androidx.appcompat.app.AppCompatActivity $this$replaceFragmentInActivity, @org.jetbrains.annotations.NotNull
    androidx.fragment.app.Fragment fragment, @androidx.annotation.IdRes
    int frameId) {
    }
    
    public static final void replaceFragmentInActivity(@org.jetbrains.annotations.NotNull
    androidx.appcompat.app.AppCompatActivity $this$replaceFragmentInActivity, @androidx.annotation.IdRes
    int containerViewId, @org.jetbrains.annotations.NotNull
    androidx.fragment.app.Fragment fragment, @org.jetbrains.annotations.NotNull
    java.lang.String tag) {
    }
    
    /**
     * The `fragment` is added to the container view with tag. The operation is
     * performed by the `fragmentManager`.
     */
    public static final void addFragmentToActivity(@org.jetbrains.annotations.NotNull
    androidx.appcompat.app.AppCompatActivity $this$addFragmentToActivity, @org.jetbrains.annotations.NotNull
    androidx.fragment.app.Fragment fragment, @org.jetbrains.annotations.NotNull
    java.lang.String tag) {
    }
    
    public static final void addFragmentToActivity(@org.jetbrains.annotations.NotNull
    androidx.appcompat.app.AppCompatActivity $this$addFragmentToActivity, @androidx.annotation.IdRes
    int containerViewId, @org.jetbrains.annotations.NotNull
    androidx.fragment.app.Fragment fragment, @org.jetbrains.annotations.NotNull
    java.lang.String tag) {
    }
    
    /**
     * Runs a FragmentTransaction, then calls commit().
     */
    private static final void transact(androidx.fragment.app.FragmentManager $this$transact, kotlin.jvm.functions.Function1<? super androidx.fragment.app.FragmentTransaction, kotlin.Unit> action) {
    }
    
    public static final void setupActionBar(@org.jetbrains.annotations.NotNull
    androidx.appcompat.app.AppCompatActivity $this$setupActionBar, @androidx.annotation.IdRes
    int toolbarId, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super androidx.appcompat.app.ActionBar, kotlin.Unit> action) {
    }
}