package com.intermedia.intermedia.ui.user.edit;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004JV\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00172\b\u0010\u001b\u001a\u0004\u0018\u00010\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\u00172\b\u0010\u001d\u001a\u0004\u0018\u00010\u00172\b\u0010\u001e\u001a\u0004\u0018\u00010\u0017R\'\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011\u00a8\u0006\u001f"}, d2 = {"Lcom/intermedia/intermedia/ui/user/edit/EditProfileViewModel;", "Landroidx/lifecycle/ViewModel;", "loginRepository", "Lcom/intermedia/intermedia/domain/login/LoginRepository;", "(Lcom/intermedia/intermedia/domain/login/LoginRepository;)V", "_initialUserLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/intermedia/intermedia/util/Result;", "Lcom/intermedia/intermedia/data/user/model/Me;", "get_initialUserLiveData", "()Landroidx/lifecycle/MutableLiveData;", "_initialUserLiveData$delegate", "Lkotlin/Lazy;", "_updatedUserLiveData", "updatedUserLiveData", "Landroidx/lifecycle/LiveData;", "getUpdatedUserLiveData", "()Landroidx/lifecycle/LiveData;", "userLiveData", "getUserLiveData", "updateUserProfile", "", "username", "", "firstName", "lastName", "email", "url", "instagramUsername", "location", "bio", "app_debug"})
public final class EditProfileViewModel extends androidx.lifecycle.ViewModel {
    private final com.intermedia.intermedia.domain.login.LoginRepository loginRepository = null;
    private final kotlin.Lazy _initialUserLiveData$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<com.intermedia.intermedia.util.Result<com.intermedia.intermedia.data.user.model.Me>> userLiveData = null;
    private final androidx.lifecycle.MutableLiveData<com.intermedia.intermedia.util.Result<com.intermedia.intermedia.data.user.model.Me>> _updatedUserLiveData = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<com.intermedia.intermedia.util.Result<com.intermedia.intermedia.data.user.model.Me>> updatedUserLiveData = null;
    
    public EditProfileViewModel(@org.jetbrains.annotations.NotNull
    com.intermedia.intermedia.domain.login.LoginRepository loginRepository) {
        super();
    }
    
    private final androidx.lifecycle.MutableLiveData<com.intermedia.intermedia.util.Result<com.intermedia.intermedia.data.user.model.Me>> get_initialUserLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.intermedia.intermedia.util.Result<com.intermedia.intermedia.data.user.model.Me>> getUserLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.intermedia.intermedia.util.Result<com.intermedia.intermedia.data.user.model.Me>> getUpdatedUserLiveData() {
        return null;
    }
    
    public final void updateUserProfile(@org.jetbrains.annotations.Nullable
    java.lang.String username, @org.jetbrains.annotations.Nullable
    java.lang.String firstName, @org.jetbrains.annotations.Nullable
    java.lang.String lastName, @org.jetbrains.annotations.Nullable
    java.lang.String email, @org.jetbrains.annotations.Nullable
    java.lang.String url, @org.jetbrains.annotations.Nullable
    java.lang.String instagramUsername, @org.jetbrains.annotations.Nullable
    java.lang.String location, @org.jetbrains.annotations.Nullable
    java.lang.String bio) {
    }
}