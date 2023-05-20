package com.intermedia.intermedia.di

import com.intermedia.intermedia.ui.autowallpaper.collections.AutoWallpaperCollectionViewModel
import com.intermedia.intermedia.ui.autowallpaper.history.AutoWallpaperHistoryViewModel
import com.intermedia.intermedia.ui.collection.detail.CollectionDetailViewModel
import com.intermedia.intermedia.ui.login.LoginViewModel
import com.intermedia.intermedia.ui.main.MainViewModel
import com.intermedia.intermedia.ui.photo.detail.PhotoDetailViewModel
import com.intermedia.intermedia.ui.search.SearchViewModel
import com.intermedia.intermedia.ui.settings.SettingsViewModel
import com.intermedia.intermedia.ui.user.UserViewModel
import com.intermedia.intermedia.ui.user.edit.EditProfileViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {

    viewModel { MainViewModel(get(), get(), get()) }
    viewModel { PhotoDetailViewModel(get(), get(), get()) }
    viewModel { CollectionDetailViewModel(get(), get(), get(), get()) }
    viewModel { SearchViewModel(get(), get(), get()) }
    viewModel { UserViewModel(get(), get(), get(), get()) }
    viewModel { EditProfileViewModel(get()) }
    viewModel { LoginViewModel(get(), get()) }
    viewModel { SettingsViewModel(androidContext()) }
    viewModel { AutoWallpaperHistoryViewModel(get()) }
    viewModel { AutoWallpaperCollectionViewModel(get(), get(), get()) }
}
