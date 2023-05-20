package com.intermedia.intermedia.ui.widget.recyclerview;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B3\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rJ\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0002R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\tR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/intermedia/intermedia/ui/widget/recyclerview/RecyclerViewPaginator;", "", "onLoadMore", "Lkotlin/Function0;", "", "isLoading", "", "onLastPage", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "()Lkotlin/jvm/functions/Function0;", "getOnLastPage", "attach", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "findLastVisibleItemPosition", "", "layoutManager", "Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "app_debug"})
public final class RecyclerViewPaginator {
    private final kotlin.jvm.functions.Function0<kotlin.Unit> onLoadMore = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function0<java.lang.Boolean> isLoading = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function0<java.lang.Boolean> onLastPage = null;
    
    public RecyclerViewPaginator(@org.jetbrains.annotations.Nullable
    kotlin.jvm.functions.Function0<kotlin.Unit> onLoadMore, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<java.lang.Boolean> isLoading, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<java.lang.Boolean> onLastPage) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlin.jvm.functions.Function0<java.lang.Boolean> isLoading() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlin.jvm.functions.Function0<java.lang.Boolean> getOnLastPage() {
        return null;
    }
    
    public final void attach(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView recyclerView) {
    }
    
    private final int findLastVisibleItemPosition(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager) {
        return 0;
    }
}