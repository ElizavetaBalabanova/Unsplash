package com.intermedia.intermedia.ui.autowallpaper.collections

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import by.kirich1409.viewbindingdelegate.viewBinding
import com.intermedia.intermedia.R
import com.intermedia.intermedia.data.autowallpaper.model.AutoWallpaperCollection
import com.intermedia.intermedia.databinding.FragmentDiscoverAutoWallpaperCollectionBinding
import com.intermedia.intermedia.ui.collection.detail.CollectionDetailActivity
import com.intermedia.intermedia.ui.widget.recyclerview.SpacingItemDecoration
import com.intermedia.intermedia.util.showSnackBar
import cz.intik.overflowindicator.SimpleSnapHelper
import org.koin.androidx.viewmodel.ext.android.sharedViewModel

class DiscoverAutoWallpaperCollectionFragment :
    Fragment(R.layout.fragment_discover_auto_wallpaper_collection),
    AutoWallpaperCollectionListAdapter.ItemEventCallback {

    private val sharedViewModel: AutoWallpaperCollectionViewModel by sharedViewModel()

    private val binding: FragmentDiscoverAutoWallpaperCollectionBinding by viewBinding()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val featuredCollectionsAdapter =
            AutoWallpaperCollectionListAdapter(AutoWallpaperCollectionListAdapter.ItemType.FEATURED, this)

        binding.featuredCollectionRecyclerView.apply {
            adapter = featuredCollectionsAdapter
            layoutManager = LinearLayoutManager(context, RecyclerView.HORIZONTAL, false)
            binding.pageIndicator.attachToRecyclerView(this)
            SimpleSnapHelper(binding.pageIndicator).attachToRecyclerView(this)
        }

        val popularCollectionsAdapter =
            AutoWallpaperCollectionListAdapter(AutoWallpaperCollectionListAdapter.ItemType.POPULAR, this)

        binding.popularCollectionsRecyclerView.apply {
            adapter = popularCollectionsAdapter
            layoutManager = LinearLayoutManager(context).apply {
                addItemDecoration(SpacingItemDecoration(context, R.dimen.keyline_7))
            }
        }

        with(sharedViewModel) {
            featuredCollectionLiveData.observe(viewLifecycleOwner) {
                featuredCollectionsAdapter.submitList(it)
            }
            popularCollectionLiveData.observe(viewLifecycleOwner) {
                binding.popularTitleTextView.isVisible = it.isNotEmpty()
                popularCollectionsAdapter.submitList(it)
            }
            selectedAutoWallpaperCollectionIds.observe(viewLifecycleOwner) {
                featuredCollectionsAdapter.setSelectedCollectionIds(it)
                popularCollectionsAdapter.setSelectedCollectionIds(it)
            }
        }
    }

    override fun onCollectionClick(id: String) {
        Intent(context, CollectionDetailActivity::class.java).apply {
            putExtra(CollectionDetailActivity.EXTRA_COLLECTION_ID, id)
            startActivity(this)
        }
    }

    override fun onAddClick(collection: AutoWallpaperCollection) {
        sharedViewModel.addAutoWallpaperCollection(collection)
        binding.root.showSnackBar(R.string.auto_wallpaper_collection_added)
    }

    override fun onRemoveClick(id: String) {
        sharedViewModel.removeAutoWallpaperCollection(id)
        binding.root.showSnackBar(R.string.auto_wallpaper_collection_removed)
    }

    companion object {

        fun newInstance() = DiscoverAutoWallpaperCollectionFragment()
    }
}
