package com.intermedia.intermedia.domain.collection

import com.intermedia.intermedia.data.collection.CollectionService
import com.intermedia.intermedia.data.collection.model.Collection
import com.intermedia.intermedia.domain.BaseDataSourceFactory
import kotlinx.coroutines.CoroutineScope

class CollectionDataSourceFactory(
    private val collectionService: CollectionService,
    private val order: CollectionDataSource.Companion.Order,
    private val scope: CoroutineScope
) : BaseDataSourceFactory<Collection>() {

    override fun createDataSource() = CollectionDataSource(collectionService, order, scope)
}
