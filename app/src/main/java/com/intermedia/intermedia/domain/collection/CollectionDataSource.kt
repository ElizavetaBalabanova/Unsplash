package com.intermedia.intermedia.domain.collection

import androidx.annotation.StringRes
import com.intermedia.intermedia.R
import com.intermedia.intermedia.data.collection.CollectionService
import com.intermedia.intermedia.data.collection.model.Collection
import com.intermedia.intermedia.domain.BaseDataSource
import kotlinx.coroutines.CoroutineScope

class CollectionDataSource(
    private val collectionService: CollectionService,
    private val order: Order,
    scope: CoroutineScope
) : BaseDataSource<Collection>(scope) {

    override suspend fun getPage(page: Int, perPage: Int): List<Collection> {
        return when (order) {
            Order.ALL -> collectionService.getCollections(page, perPage)
        }
    }

    companion object {

        enum class Order(@StringRes val titleRes: Int, val value: String) {
            ALL(R.string.order_all, "all"),
        }
    }
}
