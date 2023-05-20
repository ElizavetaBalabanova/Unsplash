package com.intermedia.intermedia.domain;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\'\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J\b\u0010\u0018\u001a\u00020\u0019H\u0016J*\u0010\u001a\u001a\u00020\u00192\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u001c2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u001eH\u0016J*\u0010\u001f\u001a\u00020\u00192\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u001c2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u001eH\u0016J*\u0010 \u001a\u00020\u00192\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030!2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\"H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u000e\u0010\u0010\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006#"}, d2 = {"Lcom/intermedia/intermedia/domain/BaseDataSource;", "T", "Landroidx/paging/PageKeyedDataSource;", "", "scope", "Lkotlinx/coroutines/CoroutineScope;", "(Lkotlinx/coroutines/CoroutineScope;)V", "initialCoroutineExceptionHandler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "initialLoadState", "Landroidx/lifecycle/MutableLiveData;", "Lcom/intermedia/intermedia/util/NetworkState;", "getInitialLoadState", "()Landroidx/lifecycle/MutableLiveData;", "networkState", "getNetworkState", "postCoroutineExceptionHandler", "supervisorJob", "Lkotlinx/coroutines/CompletableJob;", "getPage", "", "page", "perPage", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "invalidate", "", "loadAfter", "params", "Landroidx/paging/PageKeyedDataSource$LoadParams;", "callback", "Landroidx/paging/PageKeyedDataSource$LoadCallback;", "loadBefore", "loadInitial", "Landroidx/paging/PageKeyedDataSource$LoadInitialParams;", "Landroidx/paging/PageKeyedDataSource$LoadInitialCallback;", "app_debug"})
public abstract class BaseDataSource<T extends java.lang.Object> extends androidx.paging.PageKeyedDataSource<java.lang.Integer, T> {
    private final kotlinx.coroutines.CoroutineScope scope = null;
    private final kotlinx.coroutines.CoroutineExceptionHandler initialCoroutineExceptionHandler = null;
    private final kotlinx.coroutines.CoroutineExceptionHandler postCoroutineExceptionHandler = null;
    private final kotlinx.coroutines.CompletableJob supervisorJob = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<com.intermedia.intermedia.util.NetworkState> networkState = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<com.intermedia.intermedia.util.NetworkState> initialLoadState = null;
    
    public BaseDataSource(@org.jetbrains.annotations.NotNull
    kotlinx.coroutines.CoroutineScope scope) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<com.intermedia.intermedia.util.NetworkState> getNetworkState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<com.intermedia.intermedia.util.NetworkState> getInitialLoadState() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getPage(int page, int perPage, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<? extends T>> continuation);
    
    @java.lang.Override
    public void loadInitial(@org.jetbrains.annotations.NotNull
    androidx.paging.PageKeyedDataSource.LoadInitialParams<java.lang.Integer> params, @org.jetbrains.annotations.NotNull
    androidx.paging.PageKeyedDataSource.LoadInitialCallback<java.lang.Integer, T> callback) {
    }
    
    @java.lang.Override
    public void loadBefore(@org.jetbrains.annotations.NotNull
    androidx.paging.PageKeyedDataSource.LoadParams<java.lang.Integer> params, @org.jetbrains.annotations.NotNull
    androidx.paging.PageKeyedDataSource.LoadCallback<java.lang.Integer, T> callback) {
    }
    
    @java.lang.Override
    public void loadAfter(@org.jetbrains.annotations.NotNull
    androidx.paging.PageKeyedDataSource.LoadParams<java.lang.Integer> params, @org.jetbrains.annotations.NotNull
    androidx.paging.PageKeyedDataSource.LoadCallback<java.lang.Integer, T> callback) {
    }
    
    @java.lang.Override
    public void invalidate() {
    }
}