package com.intermedia.intermedia.ui.user.edit;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 &2\u00020\u0001:\u0001&B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0012H\u0002J\u0010\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0012H\u0002J\b\u0010\u0017\u001a\u00020\u0010H\u0002J\u0010\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0012H\u0002J\u0012\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0014J\u0010\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0014J\u0010\u0010\u001f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u001dH\u0014J\u0010\u0010!\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020#H\u0002J\f\u0010$\u001a\u00020\u001b*\u00020%H\u0002R\u001b\u0010\u0003\u001a\u00020\u00048VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\'"}, d2 = {"Lcom/intermedia/intermedia/ui/user/edit/EditProfileActivity;", "Lcom/intermedia/intermedia/ui/base/BaseActivity;", "()V", "binding", "Lcom/intermedia/intermedia/databinding/ActivityEditProfileBinding;", "getBinding", "()Lcom/intermedia/intermedia/databinding/ActivityEditProfileBinding;", "binding$delegate", "Lby/kirich1409/viewbindingdelegate/ViewBindingProperty;", "viewModel", "Lcom/intermedia/intermedia/ui/user/edit/EditProfileViewModel;", "getViewModel", "()Lcom/intermedia/intermedia/ui/user/edit/EditProfileViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "isBioValid", "", "bio", "", "isEmailValid", "email", "isFirstNameValid", "firstName", "isInputValid", "isUsernameValid", "username", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onRestoreInstanceState", "onSaveInstanceState", "outState", "setUserInfo", "me", "Lcom/intermedia/intermedia/data/user/model/Me;", "scrollToView", "Landroid/view/View;", "Companion", "app_debug"})
public final class EditProfileActivity extends com.intermedia.intermedia.ui.base.BaseActivity {
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final by.kirich1409.viewbindingdelegate.ViewBindingProperty binding$delegate = null;
    @org.jetbrains.annotations.NotNull
    public static final com.intermedia.intermedia.ui.user.edit.EditProfileActivity.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String EXTRA_USERNAME = "extra_username";
    private static final java.lang.String USERNAME_KEY = "username_key";
    private static final java.lang.String FIRST_NAME_KEY = "first_name_key";
    private static final java.lang.String LAST_NAME_KEY = "last_name_key";
    private static final java.lang.String EMAIL_KEY = "email_key";
    private static final java.lang.String PORTFOLIO_KEY = "portfolio_key";
    private static final java.lang.String INSTAGRAM_USERNAME_KEY = "instagram_username_key";
    private static final java.lang.String LOCATION_KEY = "location_key";
    private static final java.lang.String BIO_KEY = "bio_key";
    
    public EditProfileActivity() {
        super(0);
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.intermedia.intermedia.ui.user.edit.EditProfileViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.intermedia.intermedia.databinding.ActivityEditProfileBinding getBinding() {
        return null;
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    protected void onSaveInstanceState(@org.jetbrains.annotations.NotNull
    android.os.Bundle outState) {
    }
    
    @java.lang.Override
    protected void onRestoreInstanceState(@org.jetbrains.annotations.NotNull
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setUserInfo(com.intermedia.intermedia.data.user.model.Me me) {
    }
    
    private final boolean isInputValid() {
        return false;
    }
    
    private final boolean isUsernameValid(java.lang.String username) {
        return false;
    }
    
    private final boolean isFirstNameValid(java.lang.String firstName) {
        return false;
    }
    
    private final boolean isEmailValid(java.lang.String email) {
        return false;
    }
    
    private final boolean isBioValid(java.lang.String bio) {
        return false;
    }
    
    private final void scrollToView(android.view.View $this$scrollToView) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/intermedia/intermedia/ui/user/edit/EditProfileActivity$Companion;", "", "()V", "BIO_KEY", "", "EMAIL_KEY", "EXTRA_USERNAME", "FIRST_NAME_KEY", "INSTAGRAM_USERNAME_KEY", "LAST_NAME_KEY", "LOCATION_KEY", "PORTFOLIO_KEY", "USERNAME_KEY", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}