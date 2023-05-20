package com.intermedia.intermedia.domain.user;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/intermedia/intermedia/domain/user/SearchUserDataSourceFactory;", "Lcom/intermedia/intermedia/domain/BaseDataSourceFactory;", "Lcom/intermedia/intermedia/data/user/model/User;", "searchService", "Lcom/intermedia/intermedia/data/search/SearchService;", "query", "", "scope", "Lkotlinx/coroutines/CoroutineScope;", "(Lcom/intermedia/intermedia/data/search/SearchService;Ljava/lang/String;Lkotlinx/coroutines/CoroutineScope;)V", "createDataSource", "Lcom/intermedia/intermedia/domain/user/SearchUserDataSource;", "app_debug"})
public final class SearchUserDataSourceFactory extends com.intermedia.intermedia.domain.BaseDataSourceFactory<com.intermedia.intermedia.data.user.model.User> {
    private final com.intermedia.intermedia.data.search.SearchService searchService = null;
    private final java.lang.String query = null;
    private final kotlinx.coroutines.CoroutineScope scope = null;
    
    public SearchUserDataSourceFactory(@org.jetbrains.annotations.NotNull
    com.intermedia.intermedia.data.search.SearchService searchService, @org.jetbrains.annotations.NotNull
    java.lang.String query, @org.jetbrains.annotations.NotNull
    kotlinx.coroutines.CoroutineScope scope) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.intermedia.intermedia.domain.user.SearchUserDataSource createDataSource() {
        return null;
    }
}