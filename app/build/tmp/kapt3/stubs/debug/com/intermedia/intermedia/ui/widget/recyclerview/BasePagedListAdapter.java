package com.intermedia.intermedia.ui.widget.recyclerview;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0005B\u0013\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u00a2\u0006\u0002\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/intermedia/intermedia/ui/widget/recyclerview/BasePagedListAdapter;", "T", "", "VH", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroidx/paging/PagedListAdapter;", "diffCallback", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "(Landroidx/recyclerview/widget/DiffUtil$ItemCallback;)V", "orientation", "", "getOrientation", "()I", "setOrientation", "(I)V", "app_debug"})
public abstract class BasePagedListAdapter<T extends java.lang.Object, VH extends androidx.recyclerview.widget.RecyclerView.ViewHolder> extends androidx.paging.PagedListAdapter<T, VH> {
    private int orientation = android.content.res.Configuration.ORIENTATION_PORTRAIT;
    
    public BasePagedListAdapter(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.DiffUtil.ItemCallback<T> diffCallback) {
        super(null);
    }
    
    public final int getOrientation() {
        return 0;
    }
    
    public final void setOrientation(int p0) {
    }
}