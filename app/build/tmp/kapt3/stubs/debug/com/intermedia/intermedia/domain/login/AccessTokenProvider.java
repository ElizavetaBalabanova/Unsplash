package com.intermedia.intermedia.domain.login;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0018\u001a\u00020\u0019J\u000e\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u001bJ\u000e\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u0006X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\u0006X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\bR\u0013\u0010\r\u001a\u0004\u0018\u00010\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\bR\u0011\u0010\u000f\u001a\u00020\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0011R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\bR\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\b\u00a8\u0006 "}, d2 = {"Lcom/intermedia/intermedia/domain/login/AccessTokenProvider;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "accessToken", "", "getAccessToken", "()Ljava/lang/String;", "clientId", "getClientId", "clientSecret", "getClientSecret", "email", "getEmail", "isAuthorized", "", "()Z", "profilePicture", "getProfilePicture", "sharedPreferences", "Landroid/content/SharedPreferences;", "username", "getUsername", "reset", "", "saveAccessToken", "Lcom/intermedia/intermedia/data/authorization/model/AccessToken;", "saveUserProfile", "me", "Lcom/intermedia/intermedia/data/user/model/Me;", "Companion", "app_debug"})
public final class AccessTokenProvider {
    private final android.content.SharedPreferences sharedPreferences = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String clientId = "ZtLghkiQKbaGRtafxSa9Nyot9Ryn1uWH8u7oMm6fYv4";
    @org.jetbrains.annotations.NotNull
    private final java.lang.String clientSecret = "j9XWF2lOA_IGBTnMZ0I27y--8W-B4O4kbhDWUrgaC8I";
    @org.jetbrains.annotations.NotNull
    public static final com.intermedia.intermedia.domain.login.AccessTokenProvider.Companion Companion = null;
    private static final java.lang.String ACCESS_TOKEN_KEY = "access_token";
    private static final java.lang.String USERNAME_KEY = "user_username";
    private static final java.lang.String EMAIL_KEY = "user_email";
    private static final java.lang.String PROFILE_PICTURE_KEY = "user_profile_picture";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String DEBUG_APP_ID_KEY = "debug_app_id";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String DEBUG_APP_SECRET_KEY = "debug_app_secret";
    
    public AccessTokenProvider(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getClientId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getClientSecret() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getAccessToken() {
        return null;
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
    
    public final boolean isAuthorized() {
        return false;
    }
    
    public final void saveAccessToken(@org.jetbrains.annotations.NotNull
    com.intermedia.intermedia.data.authorization.model.AccessToken accessToken) {
    }
    
    public final void saveUserProfile(@org.jetbrains.annotations.NotNull
    com.intermedia.intermedia.data.user.model.Me me) {
    }
    
    public final void reset() {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/intermedia/intermedia/domain/login/AccessTokenProvider$Companion;", "", "()V", "ACCESS_TOKEN_KEY", "", "DEBUG_APP_ID_KEY", "DEBUG_APP_SECRET_KEY", "EMAIL_KEY", "PROFILE_PICTURE_KEY", "USERNAME_KEY", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}