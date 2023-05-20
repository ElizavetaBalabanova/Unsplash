package com.intermedia.intermedia.domain;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u0002H\u00010\u0002B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u000bH\u0016J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\tH&J\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/intermedia/intermedia/domain/BaseDataSourceFactory;", "T", "Landroidx/paging/DataSource$Factory;", "", "()V", "config", "Landroidx/paging/PagedList$Config;", "sourceLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/intermedia/intermedia/domain/BaseDataSource;", "create", "Landroidx/paging/DataSource;", "createDataSource", "createListing", "Lcom/intermedia/intermedia/domain/Listing;", "app_debug"})
public abstract class BaseDataSourceFactory<T extends java.lang.Object> extends androidx.paging.DataSource.Factory<java.lang.Integer, T> {
    private final androidx.lifecycle.MutableLiveData<com.intermedia.intermedia.domain.BaseDataSource<T>> sourceLiveData = null;
    private final androidx.paging.PagedList.Config config = null;
    
    public BaseDataSourceFactory() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract com.intermedia.intermedia.domain.BaseDataSource<T> createDataSource();
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public androidx.paging.DataSource<java.lang.Integer, T> create() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.intermedia.intermedia.domain.Listing<T> createListing() {
        return null;
    }
}