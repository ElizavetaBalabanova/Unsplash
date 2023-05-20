package com.intermedia.intermedia.ui.main

import com.intermedia.intermedia.ui.photo.PhotoAdapter
import com.intermedia.intermedia.ui.photo.PhotoFragment
import org.koin.androidx.viewmodel.ext.android.sharedViewModel

class MainPhotoFragment : PhotoFragment() {

    private val sharedViewModel: MainViewModel by sharedViewModel()

    override val pagedListAdapter =
        PhotoAdapter(itemEventCallback, true, sharedPreferencesRepository)

    override fun observeEvents() {
        with(sharedViewModel) {
            binding.swipeRefreshLayout.setOnRefreshListener { refreshPhotos() }
            photosRefreshStateLiveData.observe(viewLifecycleOwner) { updateRefreshState(it) }
            photosNetworkStateLiveData.observe(viewLifecycleOwner) { updateNetworkState(it) }
            photosLiveData.observe(viewLifecycleOwner) { updatePagedList(it) }
        }
    }

    companion object {

        fun newInstance() = MainPhotoFragment()
    }
}
