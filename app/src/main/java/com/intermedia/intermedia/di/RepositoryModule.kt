package com.intermedia.intermedia.di

import com.intermedia.intermedia.domain.autowallpaper.AutoWallpaperRepository
import com.intermedia.intermedia.domain.collection.CollectionRepository
import com.intermedia.intermedia.domain.login.LoginRepository
import com.intermedia.intermedia.domain.photo.PhotoRepository
import com.intermedia.intermedia.domain.user.UserRepository
import org.koin.dsl.module

val repositoryModule = module {

    single(createdAtStart = true) { PhotoRepository(get(), get(), get(), get()) }
    single(createdAtStart = true) { CollectionRepository(get(), get(), get()) }
    single(createdAtStart = true) { UserRepository(get(), get()) }
    single(createdAtStart = true) { LoginRepository(get(), get(), get()) }

    single { AutoWallpaperRepository(get(), get()) }
}
