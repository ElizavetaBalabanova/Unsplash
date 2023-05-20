package com.intermedia.intermedia.ui.photo.zoom;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\nH\u0002R\u001b\u0010\u0003\u001a\u00020\u00048VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0016"}, d2 = {"Lcom/intermedia/intermedia/ui/photo/zoom/PhotoZoomActivity;", "Lcom/intermedia/intermedia/ui/base/BaseActivity;", "()V", "binding", "Lcom/intermedia/intermedia/databinding/ActivityPhotoZoomBinding;", "getBinding", "()Lcom/intermedia/intermedia/databinding/ActivityPhotoZoomBinding;", "binding$delegate", "Lby/kirich1409/viewbindingdelegate/ViewBindingProperty;", "isSystemUiVisible", "", "viewModel", "Landroidx/lifecycle/ViewModel;", "getViewModel", "()Landroidx/lifecycle/ViewModel;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "toggleSystemUi", "showSystemUi", "Companion", "app_debug"})
public final class PhotoZoomActivity extends com.intermedia.intermedia.ui.base.BaseActivity {
    @org.jetbrains.annotations.Nullable
    private final androidx.lifecycle.ViewModel viewModel = null;
    @org.jetbrains.annotations.NotNull
    private final by.kirich1409.viewbindingdelegate.ViewBindingProperty binding$delegate = null;
    private boolean isSystemUiVisible = false;
    @org.jetbrains.annotations.NotNull
    public static final com.intermedia.intermedia.ui.photo.zoom.PhotoZoomActivity.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String EXTRA_PHOTO_URL = "extra_photo_url";
    
    public PhotoZoomActivity() {
        super(0);
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public androidx.lifecycle.ViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.intermedia.intermedia.databinding.ActivityPhotoZoomBinding getBinding() {
        return null;
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void toggleSystemUi(boolean showSystemUi) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/intermedia/intermedia/ui/photo/zoom/PhotoZoomActivity$Companion;", "", "()V", "EXTRA_PHOTO_URL", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}