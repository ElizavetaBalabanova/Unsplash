package com.intermedia.intermedia.ui.photo

import android.Manifest
import android.animation.Animator
import android.content.Intent
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import com.airbnb.lottie.LottieAnimationView
import com.intermedia.intermedia.R
import com.intermedia.intermedia.data.photo.model.Photo
import com.intermedia.intermedia.data.user.model.User
import com.intermedia.intermedia.ui.base.BaseSwipeRecyclerViewFragment
import com.intermedia.intermedia.ui.photo.detail.PhotoDetailActivity
import com.intermedia.intermedia.ui.user.UserActivity
import com.intermedia.intermedia.util.*
import com.intermedia.intermedia.util.download.DOWNLOADER_SYSTEM
import com.intermedia.intermedia.util.download.DownloadAction
import com.intermedia.intermedia.util.download.DownloadManagerWrapper
import com.intermedia.intermedia.worker.DownloadWorker
import org.koin.android.ext.android.inject

abstract class PhotoFragment : BaseSwipeRecyclerViewFragment<Photo, RecyclerView.ViewHolder>() {

    abstract override val pagedListAdapter: PhotoAdapter

    val itemEventCallback = object : PhotoAdapter.ItemEventCallback {

        override fun onPhotoClick(photo: Photo) {
            Intent(context, PhotoDetailActivity::class.java).apply {
                putExtra(PhotoDetailActivity.EXTRA_PHOTO, photo)
                startActivity(this)
            }
        }

        override fun onUserClick(user: User) {
            Intent(context, UserActivity::class.java).apply {
                putExtra(UserActivity.EXTRA_USER, user)
                startActivity(this)
            }
        }

        override fun onLongClick(photo: Photo, animationView: LottieAnimationView) {
            if (requireContext().fileExists(photo.fileName, sharedPreferencesRepository.downloader)) {
                showFileExistsDialog(requireContext()) { downloadPhoto(photo, animationView) }
            } else {
                downloadPhoto(photo, animationView)
            }
        }
    }

    private fun downloadPhoto(photo: Photo, animationView: LottieAnimationView) {
        if (requireContext().hasWritePermission()) {
            context.toast(R.string.download_started)
            animateLongClickDownload(animationView)
            val url = getPhotoUrl(photo, sharedPreferencesRepository.downloadQuality)
            if (sharedPreferencesRepository.downloader == DOWNLOADER_SYSTEM) {
                val downloadManagerWrapper: DownloadManagerWrapper by inject()
                downloadManagerWrapper.downloadPhoto(url, photo.fileName)
            } else {
                DownloadWorker.enqueueDownload(requireActivity().applicationContext,
                    DownloadAction.DOWNLOAD, url, photo.fileName, photo.id)
            }
        } else {
            requestPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE, requestCode = 0)
        }
    }

    private fun animateLongClickDownload(animationView: LottieAnimationView) {
        animationView.isVisible = true
        animationView.playAnimation()
        animationView.addAnimatorListener(object : Animator.AnimatorListener {
            override fun onAnimationRepeat(animation: Animator) {}
            override fun onAnimationCancel(animation: Animator) {}
            override fun onAnimationStart(animation: Animator) {}
            override fun onAnimationEnd(animation: Animator) {
                animationView.removeAnimatorListener(this)
                animationView.isVisible = false
            }
        })
    }

    override val emptyStateTitle: String
        get() = getString(R.string.empty_state_title)

    override val emptyStateSubtitle: String
        get() = ""

    override val itemSpacing: Int
        get() = resources.getDimensionPixelSize(R.dimen.keyline_7)
}
