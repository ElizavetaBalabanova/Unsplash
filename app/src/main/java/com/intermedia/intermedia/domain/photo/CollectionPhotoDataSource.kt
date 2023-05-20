package com.intermedia.intermedia.domain.photo

import com.intermedia.intermedia.data.collection.CollectionService
import com.intermedia.intermedia.data.photo.model.Photo
import com.intermedia.intermedia.domain.BaseDataSource
import kotlinx.coroutines.CoroutineScope

class CollectionPhotoDataSource(
    private val collectionService: CollectionService,
    private val collectionId: String,
    scope: CoroutineScope
) : BaseDataSource<Photo>(scope) {

    override suspend fun getPage(page: Int, perPage: Int): List<Photo> {
        return collectionService.getCollectionPhotos(
            id = collectionId,
            page = page,
            per_page = perPage
        )
    }
}
