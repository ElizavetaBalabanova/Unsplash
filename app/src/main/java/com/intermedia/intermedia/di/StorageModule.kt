package com.intermedia.intermedia.di

import android.app.Application
import androidx.room.Room
import com.intermedia.intermedia.data.autowallpaper.AutoWallpaperDatabase
import com.intermedia.intermedia.domain.SharedPreferencesRepository
import org.koin.android.ext.koin.androidApplication
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val storageModule = module {

    single(createdAtStart = true) {
        SharedPreferencesRepository(
            androidContext()
        )
    }

    single { createWallpaperDatabase(androidApplication()) }
    single { get<AutoWallpaperDatabase>().autoWallpaperHistoryDao() }
    single { get<AutoWallpaperDatabase>().autoWallpaperCollectionDao() }
}

private fun createWallpaperDatabase(application: Application) =
    Room.databaseBuilder(application, AutoWallpaperDatabase::class.java, "auto_wallpaper_db")
        .addMigrations(AutoWallpaperDatabase.MIGRATION_1_2)
        .fallbackToDestructiveMigration()
        .build()
