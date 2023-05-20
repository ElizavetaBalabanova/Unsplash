package com.intermedia.intermedia.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 2, d1 = {"\u0000<\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002\u001a\b\u0010\u000e\u001a\u00020\u000fH\u0002\u001a\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000fH\u0002\u001a\b\u0010\u0014\u001a\u00020\u0015H\u0002\u001a\b\u0010\u0016\u001a\u00020\u0015H\u0002\u001a\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u000bH\u0002\u001a0\u0010\u0019\u001a\u0002H\u001a\"\u0006\b\u0000\u0010\u001a\u0018\u00012\u0006\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u000f2\b\b\u0002\u0010\u001c\u001a\u00020\u0001H\u0082\b\u00a2\u0006\u0002\u0010\u001d\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\u001e"}, d2 = {"ACCEPT_VERSION", "", "APPLICATION_JSON", "CONTENT_TYPE", "UNSPLASH_API_BASE_URL", "UNSPLASH_BASE_URL", "networkModule", "Lorg/koin/core/module/Module;", "getNetworkModule", "()Lorg/koin/core/module/Module;", "createAccessTokenInterceptor", "Lcom/intermedia/intermedia/domain/login/AccessTokenInterceptor;", "accessTokenProvider", "Lcom/intermedia/intermedia/domain/login/AccessTokenProvider;", "createConverterFactory", "Lretrofit2/converter/moshi/MoshiConverterFactory;", "createDownloadService", "Lcom/intermedia/intermedia/data/download/DownloadService;", "accessTokenInterceptor", "converterFactory", "createHeaderInterceptor", "Lokhttp3/Interceptor;", "createHttpLoggingInterceptor", "createOkHttpClient", "Lokhttp3/OkHttpClient;", "createService", "T", "okHttpClient", "baseUrl", "(Lokhttp3/OkHttpClient;Lretrofit2/converter/moshi/MoshiConverterFactory;Ljava/lang/String;)Ljava/lang/Object;", "app_debug"})
public final class NetworkModuleKt {
    private static final java.lang.String CONTENT_TYPE = "Content-Type";
    private static final java.lang.String APPLICATION_JSON = "application/json";
    private static final java.lang.String ACCEPT_VERSION = "Accept-Version";
    private static final java.lang.String UNSPLASH_BASE_URL = "https://unsplash.com/";
    private static final java.lang.String UNSPLASH_API_BASE_URL = "https://api.unsplash.com/";
    @org.jetbrains.annotations.NotNull
    private static final org.koin.core.module.Module networkModule = null;
    
    @org.jetbrains.annotations.NotNull
    public static final org.koin.core.module.Module getNetworkModule() {
        return null;
    }
    
    private static final okhttp3.OkHttpClient createOkHttpClient(com.intermedia.intermedia.domain.login.AccessTokenInterceptor accessTokenInterceptor) {
        return null;
    }
    
    private static final okhttp3.Interceptor createHeaderInterceptor() {
        return null;
    }
    
    private static final okhttp3.Interceptor createHttpLoggingInterceptor() {
        return null;
    }
    
    private static final com.intermedia.intermedia.domain.login.AccessTokenInterceptor createAccessTokenInterceptor(com.intermedia.intermedia.domain.login.AccessTokenProvider accessTokenProvider) {
        return null;
    }
    
    private static final retrofit2.converter.moshi.MoshiConverterFactory createConverterFactory() {
        return null;
    }
    
    private static final com.intermedia.intermedia.data.download.DownloadService createDownloadService(com.intermedia.intermedia.domain.login.AccessTokenInterceptor accessTokenInterceptor, retrofit2.converter.moshi.MoshiConverterFactory converterFactory) {
        return null;
    }
}