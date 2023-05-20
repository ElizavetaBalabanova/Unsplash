package com.intermedia.intermedia.data.autowallpaper.model

import androidx.annotation.Keep

@Keep
data class AutoWallpaperCollectionDocument(
    val collections: List<AutoWallpaperCollection>? = null
)
