package com.intermedia.intermedia.ui.user;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \'2\u00020\u0001:\u0002\'(B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0012\u0010\u0015\u001a\u00020\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0014J\u0012\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0012\u0010\u001f\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0010\u0010 \u001a\u00020\u00122\u0006\u0010!\u001a\u00020\"H\u0002J\u0017\u0010#\u001a\u0004\u0018\u00010\u00122\u0006\u0010$\u001a\u00020%H\u0002\u00a2\u0006\u0002\u0010&R\u001b\u0010\u0003\u001a\u00020\u00048VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e\u00a8\u0006)"}, d2 = {"Lcom/intermedia/intermedia/ui/user/UserActivity;", "Lcom/intermedia/intermedia/ui/base/BaseActivity;", "()V", "binding", "Lcom/intermedia/intermedia/databinding/ActivityUserBinding;", "getBinding", "()Lcom/intermedia/intermedia/databinding/ActivityUserBinding;", "binding$delegate", "Lby/kirich1409/viewbindingdelegate/ViewBindingProperty;", "fragmentPagerAdapter", "Lcom/intermedia/intermedia/ui/user/UserActivity$UserFragmentPagerAdapter;", "viewModel", "Lcom/intermedia/intermedia/ui/user/UserViewModel;", "getViewModel", "()Lcom/intermedia/intermedia/ui/user/UserViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "goToTab", "", "type", "Lcom/intermedia/intermedia/ui/user/UserActivity$UserFragmentPagerAdapter$UserFragment;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onPrepareOptionsMenu", "openUrlInBrowser", "url", "", "setup", "user", "Lcom/intermedia/intermedia/data/user/model/User;", "(Lcom/intermedia/intermedia/data/user/model/User;)Lkotlin/Unit;", "Companion", "UserFragmentPagerAdapter", "app_debug"})
public final class UserActivity extends com.intermedia.intermedia.ui.base.BaseActivity {
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final by.kirich1409.viewbindingdelegate.ViewBindingProperty binding$delegate = null;
    private com.intermedia.intermedia.ui.user.UserActivity.UserFragmentPagerAdapter fragmentPagerAdapter;
    @org.jetbrains.annotations.NotNull
    public static final com.intermedia.intermedia.ui.user.UserActivity.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String EXTRA_USER = "extra_user";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String EXTRA_USERNAME = "extra_username";
    
    public UserActivity() {
        super(0);
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.intermedia.intermedia.ui.user.UserViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.intermedia.intermedia.databinding.ActivityUserBinding getBinding() {
        return null;
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.Nullable
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override
    public boolean onPrepareOptionsMenu(@org.jetbrains.annotations.Nullable
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull
    android.view.MenuItem item) {
        return false;
    }
    
    private final kotlin.Unit setup(com.intermedia.intermedia.data.user.model.User user) {
        return null;
    }
    
    private final void openUrlInBrowser(java.lang.String url) {
    }
    
    private final void goToTab(com.intermedia.intermedia.ui.user.UserActivity.UserFragmentPagerAdapter.UserFragment type) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u001eB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u0010J\u000e\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u000eJ\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u0010H\u0016J\u000e\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0010J\u0010\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0010H\u0016J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0013\u001a\u00020\u0010H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/intermedia/intermedia/ui/user/UserActivity$UserFragmentPagerAdapter;", "Landroidx/fragment/app/FragmentPagerAdapter;", "context", "Landroid/content/Context;", "fm", "Landroidx/fragment/app/FragmentManager;", "user", "Lcom/intermedia/intermedia/data/user/model/User;", "(Landroid/content/Context;Landroidx/fragment/app/FragmentManager;Lcom/intermedia/intermedia/data/user/model/User;)V", "fragmentTags", "Landroid/util/SparseArray;", "", "fragmentTypes", "", "Lcom/intermedia/intermedia/ui/user/UserActivity$UserFragmentPagerAdapter$UserFragment;", "getCount", "", "getFragment", "Lcom/intermedia/intermedia/ui/base/BaseSwipeRecyclerViewFragment;", "position", "getFragmentIndexOfType", "type", "getItem", "Landroidx/fragment/app/Fragment;", "getItemType", "getPageTitle", "instantiateItem", "", "container", "Landroid/view/ViewGroup;", "UserFragment", "app_debug"})
    static final class UserFragmentPagerAdapter extends androidx.fragment.app.FragmentPagerAdapter {
        private final android.content.Context context = null;
        private final androidx.fragment.app.FragmentManager fm = null;
        private final java.util.List<com.intermedia.intermedia.ui.user.UserActivity.UserFragmentPagerAdapter.UserFragment> fragmentTypes = null;
        private final android.util.SparseArray<java.lang.String> fragmentTags = null;
        
        public UserFragmentPagerAdapter(@org.jetbrains.annotations.NotNull
        android.content.Context context, @org.jetbrains.annotations.NotNull
        androidx.fragment.app.FragmentManager fm, @org.jetbrains.annotations.NotNull
        com.intermedia.intermedia.data.user.model.User user) {
            super(null);
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.intermedia.intermedia.ui.base.BaseSwipeRecyclerViewFragment<?, ?> getFragment(int position) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.intermedia.intermedia.ui.user.UserActivity.UserFragmentPagerAdapter.UserFragment getItemType(int position) {
            return null;
        }
        
        public final int getFragmentIndexOfType(@org.jetbrains.annotations.NotNull
        com.intermedia.intermedia.ui.user.UserActivity.UserFragmentPagerAdapter.UserFragment type) {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public androidx.fragment.app.Fragment getItem(int position) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.Object instantiateItem(@org.jetbrains.annotations.NotNull
        android.view.ViewGroup container, int position) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String getPageTitle(int position) {
            return null;
        }
        
        @java.lang.Override
        public int getCount() {
            return 0;
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t\u00a8\u0006\n"}, d2 = {"Lcom/intermedia/intermedia/ui/user/UserActivity$UserFragmentPagerAdapter$UserFragment;", "", "titleRes", "", "(Ljava/lang/String;II)V", "getTitleRes", "()I", "PHOTO", "LIKES", "COLLECTION", "app_debug"})
        public static enum UserFragment {
            /*public static final*/ PHOTO /* = new PHOTO(0) */,
            /*public static final*/ LIKES /* = new LIKES(0) */,
            /*public static final*/ COLLECTION /* = new COLLECTION(0) */;
            private final int titleRes = 0;
            
            UserFragment(int titleRes) {
            }
            
            public final int getTitleRes() {
                return 0;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/intermedia/intermedia/ui/user/UserActivity$Companion;", "", "()V", "EXTRA_USER", "", "EXTRA_USERNAME", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}