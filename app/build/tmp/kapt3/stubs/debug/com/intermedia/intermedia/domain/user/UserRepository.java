package com.intermedia.intermedia.domain.user;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00102\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0013R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0014"}, d2 = {"Lcom/intermedia/intermedia/domain/user/UserRepository;", "", "userService", "Lcom/intermedia/intermedia/data/user/UserService;", "searchService", "Lcom/intermedia/intermedia/data/search/SearchService;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lcom/intermedia/intermedia/data/user/UserService;Lcom/intermedia/intermedia/data/search/SearchService;Lkotlinx/coroutines/CoroutineDispatcher;)V", "getUserPublicProfile", "Lcom/intermedia/intermedia/util/Result;", "Lcom/intermedia/intermedia/data/user/model/User;", "username", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "searchUsers", "Lcom/intermedia/intermedia/domain/Listing;", "query", "scope", "Lkotlinx/coroutines/CoroutineScope;", "app_debug"})
public final class UserRepository {
    private final com.intermedia.intermedia.data.user.UserService userService = null;
    private final com.intermedia.intermedia.data.search.SearchService searchService = null;
    private final kotlinx.coroutines.CoroutineDispatcher dispatcher = null;
    
    public UserRepository(@org.jetbrains.annotations.NotNull
    com.intermedia.intermedia.data.user.UserService userService, @org.jetbrains.annotations.NotNull
    com.intermedia.intermedia.data.search.SearchService searchService, @org.jetbrains.annotations.NotNull
    kotlinx.coroutines.CoroutineDispatcher dispatcher) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getUserPublicProfile(@org.jetbrains.annotations.NotNull
    java.lang.String username, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.intermedia.intermedia.util.Result<com.intermedia.intermedia.data.user.model.User>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.intermedia.intermedia.domain.Listing<com.intermedia.intermedia.data.user.model.User> searchUsers(@org.jetbrains.annotations.NotNull
    java.lang.String query, @org.jetbrains.annotations.NotNull
    kotlinx.coroutines.CoroutineScope scope) {
        return null;
    }
}