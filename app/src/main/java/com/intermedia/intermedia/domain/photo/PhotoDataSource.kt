package com.intermedia.intermedia.domain.photo

import androidx.annotation.StringRes
import com.intermedia.intermedia.R
import com.intermedia.intermedia.data.photo.PhotoService
import com.intermedia.intermedia.data.photo.model.Photo
import com.intermedia.intermedia.domain.BaseDataSource
import kotlinx.coroutines.CoroutineScope

class PhotoDataSource(
    private val photoService: PhotoService,
    private val order: Order,
    scope: CoroutineScope
) : BaseDataSource<Photo>(scope) {

    override suspend fun getPage(page: Int, perPage: Int): List<Photo> {
        return photoService.getPhotos(
            page = page,
            per_page = perPage,
            order_by = order.value
        )
    }

    companion object {

        enum class Order(@StringRes val titleRes: Int, val value: String) {
            LATEST(R.string.order_latest, "latest"),
            OLDEST(R.string.order_oldest,"oldest"),
            POPULAR(R.string.order_popular, "popular")
        }
    }
}
