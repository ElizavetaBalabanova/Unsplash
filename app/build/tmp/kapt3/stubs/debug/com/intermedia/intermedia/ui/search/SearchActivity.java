package com.intermedia.intermedia.ui.search;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 \u00182\u00020\u0001:\u0002\u0018\u0019B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014J\b\u0010\u0013\u001a\u00020\u0010H\u0002J\u0014\u0010\u0014\u001a\u00020\u0010*\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002R\u001b\u0010\u0003\u001a\u00020\u00048VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u001a"}, d2 = {"Lcom/intermedia/intermedia/ui/search/SearchActivity;", "Lcom/intermedia/intermedia/ui/base/BaseActivity;", "()V", "binding", "Lcom/intermedia/intermedia/databinding/ActivitySearchBinding;", "getBinding", "()Lcom/intermedia/intermedia/databinding/ActivitySearchBinding;", "binding$delegate", "Lby/kirich1409/viewbindingdelegate/ViewBindingProperty;", "viewModel", "Lcom/intermedia/intermedia/ui/search/SearchViewModel;", "getViewModel", "()Lcom/intermedia/intermedia/ui/search/SearchViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "showFilterBottomSheet", "setVisibility", "Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;", "visible", "", "Companion", "SearchFragmentPagerAdapter", "app_debug"})
public final class SearchActivity extends com.intermedia.intermedia.ui.base.BaseActivity {
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final by.kirich1409.viewbindingdelegate.ViewBindingProperty binding$delegate = null;
    @org.jetbrains.annotations.NotNull
    public static final com.intermedia.intermedia.ui.search.SearchActivity.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String EXTRA_SEARCH_QUERY = "extra_search_query";
    
    public SearchActivity() {
        super(0);
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.intermedia.intermedia.ui.search.SearchViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.intermedia.intermedia.databinding.ActivitySearchBinding getBinding() {
        return null;
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void showFilterBottomSheet() {
    }
    
    private final void setVisibility(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton $this$setVisibility, boolean visible) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0018B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000bJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u000bH\u0016J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u000bJ\u0010\u0010\u0013\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000bH\u0016J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u000e\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/intermedia/intermedia/ui/search/SearchActivity$SearchFragmentPagerAdapter;", "Landroidx/fragment/app/FragmentPagerAdapter;", "context", "Landroid/content/Context;", "fm", "Landroidx/fragment/app/FragmentManager;", "(Landroid/content/Context;Landroidx/fragment/app/FragmentManager;)V", "fragmentTags", "Landroid/util/SparseArray;", "", "getCount", "", "getFragment", "Lcom/intermedia/intermedia/ui/base/BaseSwipeRecyclerViewFragment;", "position", "getItem", "Landroidx/fragment/app/Fragment;", "getItemType", "Lcom/intermedia/intermedia/ui/search/SearchActivity$SearchFragmentPagerAdapter$SearchFragment;", "getPageTitle", "instantiateItem", "", "container", "Landroid/view/ViewGroup;", "SearchFragment", "app_debug"})
    static final class SearchFragmentPagerAdapter extends androidx.fragment.app.FragmentPagerAdapter {
        private final android.content.Context context = null;
        private final androidx.fragment.app.FragmentManager fm = null;
        private final android.util.SparseArray<java.lang.String> fragmentTags = null;
        
        public SearchFragmentPagerAdapter(@org.jetbrains.annotations.NotNull
        android.content.Context context, @org.jetbrains.annotations.NotNull
        androidx.fragment.app.FragmentManager fm) {
            super(null);
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.intermedia.intermedia.ui.base.BaseSwipeRecyclerViewFragment<?, ?> getFragment(int position) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.intermedia.intermedia.ui.search.SearchActivity.SearchFragmentPagerAdapter.SearchFragment getItemType(int position) {
            return null;
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
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t\u00a8\u0006\n"}, d2 = {"Lcom/intermedia/intermedia/ui/search/SearchActivity$SearchFragmentPagerAdapter$SearchFragment;", "", "titleRes", "", "(Ljava/lang/String;II)V", "getTitleRes", "()I", "PHOTO", "COLLECTION", "USER", "app_debug"})
        public static enum SearchFragment {
            /*public static final*/ PHOTO /* = new PHOTO(0) */,
            /*public static final*/ COLLECTION /* = new COLLECTION(0) */,
            /*public static final*/ USER /* = new USER(0) */;
            private final int titleRes = 0;
            
            SearchFragment(int titleRes) {
            }
            
            public final int getTitleRes() {
                return 0;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/intermedia/intermedia/ui/search/SearchActivity$Companion;", "", "()V", "EXTRA_SEARCH_QUERY", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}