package com.intermedia.intermedia.ui.collection.add;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 /2\u00020\u00012\u00020\u0002:\u0001/B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0014\u001a\u00020\u0015H\u0002J \u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0012\u0010\u001e\u001a\u00020\u00172\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u0012\u0010!\u001a\u00020\"2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J$\u0010#\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\'2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u001a\u0010(\u001a\u00020\u00172\u0006\u0010)\u001a\u00020\u001b2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\b\u0010*\u001a\u00020\u0017H\u0002J\b\u0010+\u001a\u00020\u0017H\u0002J\b\u0010,\u001a\u00020\u0017H\u0002J\b\u0010-\u001a\u00020\u0017H\u0002J\b\u0010.\u001a\u00020\u0017H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011\u00a8\u00060"}, d2 = {"Lcom/intermedia/intermedia/ui/collection/add/AddCollectionBottomSheet;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "Lcom/intermedia/intermedia/ui/collection/add/AddCollectionAdapter$ItemEventCallback;", "()V", "binding", "Lcom/intermedia/intermedia/databinding/BottomSheetAddCollectionBinding;", "getBinding", "()Lcom/intermedia/intermedia/databinding/BottomSheetAddCollectionBinding;", "binding$delegate", "Lby/kirich1409/viewbindingdelegate/ViewBindingProperty;", "collectionAdapter", "Lcom/intermedia/intermedia/ui/collection/add/AddCollectionAdapter;", "photoId", "", "sharedViewModel", "Lcom/intermedia/intermedia/ui/photo/detail/PhotoDetailViewModel;", "getSharedViewModel", "()Lcom/intermedia/intermedia/ui/photo/detail/PhotoDetailViewModel;", "sharedViewModel$delegate", "Lkotlin/Lazy;", "isInputValid", "", "onCollectionClick", "", "collection", "Lcom/intermedia/intermedia/data/collection/model/Collection;", "itemView", "Landroid/view/View;", "position", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateDialog", "Landroid/app/Dialog;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "resetInput", "setupEmptyState", "showAddLayout", "showCreateLayout", "showErrorMessage", "Companion", "app_debug"})
public final class AddCollectionBottomSheet extends com.google.android.material.bottomsheet.BottomSheetDialogFragment implements com.intermedia.intermedia.ui.collection.add.AddCollectionAdapter.ItemEventCallback {
    private final kotlin.Lazy sharedViewModel$delegate = null;
    private final by.kirich1409.viewbindingdelegate.ViewBindingProperty binding$delegate = null;
    private final com.intermedia.intermedia.ui.collection.add.AddCollectionAdapter collectionAdapter = null;
    private java.lang.String photoId;
    @org.jetbrains.annotations.NotNull
    public static final com.intermedia.intermedia.ui.collection.add.AddCollectionBottomSheet.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String TAG = null;
    private static final java.lang.String ARGUMENT_PHOTO_ID = "argument_photo_id";
    
    public AddCollectionBottomSheet() {
        super();
    }
    
    private final com.intermedia.intermedia.ui.photo.detail.PhotoDetailViewModel getSharedViewModel() {
        return null;
    }
    
    private final com.intermedia.intermedia.databinding.BottomSheetAddCollectionBinding getBinding() {
        return null;
    }
    
    @java.lang.Override
    public void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public android.app.Dialog onCreateDialog(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    public void onCollectionClick(@org.jetbrains.annotations.NotNull
    com.intermedia.intermedia.data.collection.model.Collection collection, @org.jetbrains.annotations.NotNull
    android.view.View itemView, int position) {
    }
    
    private final boolean isInputValid() {
        return false;
    }
    
    private final void showErrorMessage() {
    }
    
    private final void showAddLayout() {
    }
    
    private final void showCreateLayout() {
    }
    
    private final void resetInput() {
    }
    
    private final void setupEmptyState() {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u000b"}, d2 = {"Lcom/intermedia/intermedia/ui/collection/add/AddCollectionBottomSheet$Companion;", "", "()V", "ARGUMENT_PHOTO_ID", "", "TAG", "getTAG", "()Ljava/lang/String;", "newInstance", "Lcom/intermedia/intermedia/ui/collection/add/AddCollectionBottomSheet;", "id", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getTAG() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.intermedia.intermedia.ui.collection.add.AddCollectionBottomSheet newInstance(@org.jetbrains.annotations.NotNull
        java.lang.String id) {
            return null;
        }
    }
}