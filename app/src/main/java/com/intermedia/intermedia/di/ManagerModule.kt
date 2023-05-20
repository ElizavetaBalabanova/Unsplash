package com.intermedia.intermedia.di

import android.app.WallpaperManager
import com.intermedia.intermedia.util.NotificationManager
import com.intermedia.intermedia.util.download.DownloadManagerWrapper
import org.koin.android.ext.koin.androidApplication
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val managerModule = module {

    single(createdAtStart = true) { NotificationManager(androidContext()) }
    single { DownloadManagerWrapper(androidContext()) }
    single { WallpaperManager.getInstance(androidApplication()) }
}
