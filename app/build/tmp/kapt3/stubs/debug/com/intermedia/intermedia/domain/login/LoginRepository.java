package com.intermedia.intermedia.domain.login;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\u0018\u0000 (2\u00020\u0001:\u0001(B\'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\b\u0010\u0014\u001a\u0004\u0018\u00010\fJ\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0010H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J\b\u0010\u0018\u001a\u0004\u0018\u00010\fJ\b\u0010\u0019\u001a\u0004\u0018\u00010\fJ\u0006\u0010\u001a\u001a\u00020\u001bJ\u0006\u0010\u001c\u001a\u00020\u001dJg\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00160\u00102\b\u0010\u001f\u001a\u0004\u0018\u00010\f2\b\u0010 \u001a\u0004\u0018\u00010\f2\b\u0010!\u001a\u0004\u0018\u00010\f2\b\u0010\"\u001a\u0004\u0018\u00010\f2\b\u0010#\u001a\u0004\u0018\u00010\f2\b\u0010$\u001a\u0004\u0018\u00010\f2\b\u0010%\u001a\u0004\u0018\u00010\f2\b\u0010&\u001a\u0004\u0018\u00010\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\'R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\f8F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006)"}, d2 = {"Lcom/intermedia/intermedia/domain/login/LoginRepository;", "", "authorizationService", "Lcom/intermedia/intermedia/data/authorization/AuthorizationService;", "accessTokenProvider", "Lcom/intermedia/intermedia/domain/login/AccessTokenProvider;", "userService", "Lcom/intermedia/intermedia/data/user/UserService;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lcom/intermedia/intermedia/data/authorization/AuthorizationService;Lcom/intermedia/intermedia/domain/login/AccessTokenProvider;Lcom/intermedia/intermedia/data/user/UserService;Lkotlinx/coroutines/CoroutineDispatcher;)V", "loginUrl", "", "getLoginUrl", "()Ljava/lang/String;", "getAccessToken", "Lcom/intermedia/intermedia/util/Result;", "Lcom/intermedia/intermedia/data/authorization/model/AccessToken;", "code", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getEmail", "getMe", "Lcom/intermedia/intermedia/data/user/model/Me;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getProfilePicture", "getUsername", "isAuthorized", "", "logout", "", "updateMe", "username", "firstName", "lastName", "email", "url", "instagramUsername", "location", "bio", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_debug"})
public final class LoginRepository {
    private final com.intermedia.intermedia.data.authorization.AuthorizationService authorizationService = null;
    private final com.intermedia.intermedia.domain.login.AccessTokenProvider accessTokenProvider = null;
    private final com.intermedia.intermedia.data.user.UserService userService = null;
    private final kotlinx.coroutines.CoroutineDispatcher dispatcher = null;
    @org.jetbrains.annotations.NotNull
    public static final com.intermedia.intermedia.domain.login.LoginRepository.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String unsplashAuthCallback = "skillbox";
    private static final java.lang.String redirectUri = "com.example.intermediateproject://skillbox/unsplash-auth-callback";
    private static final java.lang.String grantType = "authorization_code";
    
    public LoginRepository(@org.jetbrains.annotations.NotNull
    com.intermedia.intermedia.data.authorization.AuthorizationService authorizationService, @org.jetbrains.annotations.NotNull
    com.intermedia.intermedia.domain.login.AccessTokenProvider accessTokenProvider, @org.jetbrains.annotations.NotNull
    com.intermedia.intermedia.data.user.UserService userService, @org.jetbrains.annotations.NotNull
    kotlinx.coroutines.CoroutineDispatcher dispatcher) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getLoginUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getAccessToken(@org.jetbrains.annotations.NotNull
    java.lang.String code, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.intermedia.intermedia.util.Result<com.intermedia.intermedia.data.authorization.model.AccessToken>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getMe(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.intermedia.intermedia.util.Result<com.intermedia.intermedia.data.user.model.Me>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object updateMe(@org.jetbrains.annotations.Nullable
    java.lang.String username, @org.jetbrains.annotations.Nullable
    java.lang.String firstName, @org.jetbrains.annotations.Nullable
    java.lang.String lastName, @org.jetbrains.annotations.Nullable
    java.lang.String email, @org.jetbrains.annotations.Nullable
    java.lang.String url, @org.jetbrains.annotations.Nullable
    java.lang.String instagramUsername, @org.jetbrains.annotations.Nullable
    java.lang.String location, @org.jetbrains.annotations.Nullable
    java.lang.String bio, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.intermedia.intermedia.util.Result<com.intermedia.intermedia.data.user.model.Me>> continuation) {
        return null;
    }
    
    public final boolean isAuthorized() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getUsername() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getEmail() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getProfilePicture() {
        return null;
    }
    
    public final void logout() {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/intermedia/intermedia/domain/login/LoginRepository$Companion;", "", "()V", "grantType", "", "redirectUri", "unsplashAuthCallback", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}