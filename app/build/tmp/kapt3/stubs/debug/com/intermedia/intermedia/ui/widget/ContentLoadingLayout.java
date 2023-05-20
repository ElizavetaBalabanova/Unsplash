package com.intermedia.intermedia.ui.widget;

import java.lang.System;

/**
 * Modified version of ContentLoadingProgressBar that waits a minimum time to be
 * dismissed before showing. Once visible, the progress bar will be visible for
 * a minimum amount of time to avoid "flashes" in the UI when an event could take
 * a largely variable time to complete (from none, to a user perceivable amount)
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u001c\u001a\u00020\u001dJ\b\u0010\u001e\u001a\u00020\u001dH\u0014J\b\u0010\u001f\u001a\u00020\u001dH\u0014J\b\u0010 \u001a\u00020\u001dH\u0002J\u0006\u0010!\u001a\u00020\u001dR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b\u00a8\u0006#"}, d2 = {"Lcom/intermedia/intermedia/ui/widget/ContentLoadingLayout;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "mDelayedHide", "Ljava/lang/Runnable;", "mDelayedShow", "mDismissed", "", "getMDismissed", "()Z", "setMDismissed", "(Z)V", "mPostedHide", "getMPostedHide", "setMPostedHide", "mPostedShow", "getMPostedShow", "setMPostedShow", "mStartTime", "", "getMStartTime", "()J", "setMStartTime", "(J)V", "hide", "", "onAttachedToWindow", "onDetachedFromWindow", "removeCallbacks", "show", "Companion", "app_debug"})
public final class ContentLoadingLayout extends android.widget.FrameLayout {
    private long mStartTime = -1L;
    private boolean mPostedHide = false;
    private boolean mPostedShow = false;
    private boolean mDismissed = false;
    private final java.lang.Runnable mDelayedHide = null;
    private final java.lang.Runnable mDelayedShow = null;
    @org.jetbrains.annotations.NotNull
    public static final com.intermedia.intermedia.ui.widget.ContentLoadingLayout.Companion Companion = null;
    private static final int MIN_SHOW_TIME = 500;
    private static final int MIN_DELAY = 500;
    
    @kotlin.jvm.JvmOverloads
    public ContentLoadingLayout(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads
    public ContentLoadingLayout(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public final long getMStartTime() {
        return 0L;
    }
    
    public final void setMStartTime(long p0) {
    }
    
    public final boolean getMPostedHide() {
        return false;
    }
    
    public final void setMPostedHide(boolean p0) {
    }
    
    public final boolean getMPostedShow() {
        return false;
    }
    
    public final void setMPostedShow(boolean p0) {
    }
    
    public final boolean getMDismissed() {
        return false;
    }
    
    public final void setMDismissed(boolean p0) {
    }
    
    @java.lang.Override
    protected void onAttachedToWindow() {
    }
    
    @java.lang.Override
    protected void onDetachedFromWindow() {
    }
    
    private final void removeCallbacks() {
    }
    
    /**
     * Hide the progress view if it is visible. The progress view will not be
     * hidden until it has been shown for at least a minimum show time. If the
     * progress view was not yet visible, cancels showing the progress view.
     */
    @kotlin.jvm.Synchronized
    public final synchronized void hide() {
    }
    
    /**
     * Show the progress view after waiting for a minimum delay. If
     * during that time, hide() is called, the view is never made visible.
     */
    @kotlin.jvm.Synchronized
    public final synchronized void show() {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/intermedia/intermedia/ui/widget/ContentLoadingLayout$Companion;", "", "()V", "MIN_DELAY", "", "MIN_SHOW_TIME", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}