package com.intermedia.intermedia.ui.widget;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006JP\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J8\u0010\u0017\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0010H\u0016\u00a8\u0006\u001b"}, d2 = {"Lcom/intermedia/intermedia/ui/widget/ScrollAwareFabBehavior;", "Lcom/google/android/material/floatingactionbutton/FloatingActionButton$Behavior;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "onNestedScroll", "", "coordinatorLayout", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "child", "Lcom/google/android/material/floatingactionbutton/FloatingActionButton;", "target", "Landroid/view/View;", "dxConsumed", "", "dyConsumed", "dxUnconsumed", "dyUnconsumed", "type", "consumed", "", "onStartNestedScroll", "", "directTargetChild", "axes", "app_debug"})
public final class ScrollAwareFabBehavior extends com.google.android.material.floatingactionbutton.FloatingActionButton.Behavior {
    
    public ScrollAwareFabBehavior(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    android.util.AttributeSet attrs) {
        super();
    }
    
    @java.lang.Override
    public boolean onStartNestedScroll(@org.jetbrains.annotations.NotNull
    androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, @org.jetbrains.annotations.NotNull
    com.google.android.material.floatingactionbutton.FloatingActionButton child, @org.jetbrains.annotations.NotNull
    android.view.View directTargetChild, @org.jetbrains.annotations.NotNull
    android.view.View target, int axes, int type) {
        return false;
    }
    
    @java.lang.Override
    public void onNestedScroll(@org.jetbrains.annotations.NotNull
    androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, @org.jetbrains.annotations.NotNull
    com.google.android.material.floatingactionbutton.FloatingActionButton child, @org.jetbrains.annotations.NotNull
    android.view.View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type, @org.jetbrains.annotations.NotNull
    int[] consumed) {
    }
}