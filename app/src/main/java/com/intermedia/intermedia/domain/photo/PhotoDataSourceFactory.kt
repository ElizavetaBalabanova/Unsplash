package com.intermedia.intermedia.domain.photo

import com.intermedia.intermedia.data.photo.PhotoService
import com.intermedia.intermedia.data.photo.model.Photo
import com.intermedia.intermedia.domain.BaseDataSourceFactory
import kotlinx.coroutines.CoroutineScope

class PhotoDataSourceFactory(
    private val photoService: PhotoService,
    private val order: PhotoDataSource.Companion.Order,
    private val scope: CoroutineScope
) : BaseDataSourceFactory<Photo>() {

    override fun createDataSource() = PhotoDataSource(photoService, order, scope)
}
