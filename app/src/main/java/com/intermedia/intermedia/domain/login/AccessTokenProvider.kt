package com.intermedia.intermedia.domain.login

import android.content.Context
import android.content.SharedPreferences
import androidx.core.content.edit
import androidx.preference.PreferenceManager
import com.intermedia.intermedia.BuildConfig
import com.intermedia.intermedia.data.authorization.model.AccessToken
import com.intermedia.intermedia.data.user.model.Me

class AccessTokenProvider(context: Context) {

    private val sharedPreferences: SharedPreferences =
        PreferenceManager.getDefaultSharedPreferences(context)

    val clientId = BuildConfig.DEV_APP_ID

    val clientSecret = BuildConfig.DEV_SECRET

    val accessToken: String?
        get() = sharedPreferences.getString(ACCESS_TOKEN_KEY, null)

    val username: String?
        get() = sharedPreferences.getString(USERNAME_KEY, null)

    val email: String?
        get() = sharedPreferences.getString(EMAIL_KEY, null)

    val profilePicture: String?
        get() = sharedPreferences.getString(PROFILE_PICTURE_KEY, null)

    val isAuthorized: Boolean
        get() = !accessToken.isNullOrEmpty()

    fun saveAccessToken(accessToken: AccessToken) = sharedPreferences.edit {
        putString(ACCESS_TOKEN_KEY, accessToken.access_token)
    }

    fun saveUserProfile(me: Me) = sharedPreferences.edit {
        putString(USERNAME_KEY, me.username)
        putString(EMAIL_KEY, me.email)
        putString(PROFILE_PICTURE_KEY, me.profile_image?.large)
    }

    fun reset() = sharedPreferences.edit {
        putString(ACCESS_TOKEN_KEY, null)
        putString(USERNAME_KEY, null)
        putString(EMAIL_KEY, null)
        putString(PROFILE_PICTURE_KEY, null)
    }

    companion object {

        private const val ACCESS_TOKEN_KEY = "access_token"

        private const val USERNAME_KEY = "user_username"
        private const val EMAIL_KEY = "user_email"
        private const val PROFILE_PICTURE_KEY = "user_profile_picture"

        const val DEBUG_APP_ID_KEY = "debug_app_id"
        const val DEBUG_APP_SECRET_KEY = "debug_app_secret"
    }
}
