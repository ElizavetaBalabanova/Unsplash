package com.intermedia.intermedia.domain.photo

import com.intermedia.intermedia.data.collection.CollectionService
import com.intermedia.intermedia.data.photo.model.Photo
import com.intermedia.intermedia.domain.BaseDataSourceFactory
import kotlinx.coroutines.CoroutineScope

class CollectionPhotoDataSourceFactory(
    private val collectionService: CollectionService,
    private val collectionId: String,
    private val scope: CoroutineScope
) : BaseDataSourceFactory<Photo>() {

    override fun createDataSource() = CollectionPhotoDataSource(collectionService, collectionId, scope)
}
