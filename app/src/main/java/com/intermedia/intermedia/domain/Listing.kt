package com.intermedia.intermedia.domain

import androidx.lifecycle.LiveData
import androidx.paging.PagedList
import com.intermedia.intermedia.util.NetworkState

data class Listing<T>(
    val pagedList: LiveData<PagedList<T>>,
    val networkState: LiveData<NetworkState>,
    val refresh: () -> Unit,
    val refreshState: LiveData<NetworkState>,
    val retry: () -> Unit
)
