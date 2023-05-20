package com.intermedia.intermedia.domain.login

import okhttp3.Interceptor
import okhttp3.Response

class AccessTokenInterceptor(private val accessTokenProvider: AccessTokenProvider) : Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {
        return if (accessTokenProvider.isAuthorized) {
            val token = accessTokenProvider.accessToken
            val authenticatedRequest = chain.request()
                .newBuilder()
                .addHeader("Authorization", "Bearer $token")
                .build()
            chain.proceed(authenticatedRequest)
        } else {
            val clientId = accessTokenProvider.clientId
            val authenticatedRequest = chain.request()
                .newBuilder()
                .addHeader("Authorization", "Client-ID $clientId")
                .build()
            chain.proceed(authenticatedRequest)
        }
    }
}
