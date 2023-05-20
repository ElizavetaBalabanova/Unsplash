package com.intermedia.intermedia.ui.autowallpaper.history

import android.annotation.SuppressLint
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import by.kirich1409.viewbindingdelegate.viewBinding
import com.intermedia.intermedia.data.autowallpaper.model.AutoWallpaperHistory
import com.intermedia.intermedia.databinding.ItemAutoWallpaperHistoryBinding
import com.intermedia.intermedia.util.loadPhotoUrl
import com.intermedia.intermedia.util.loadProfilePicture
import com.intermedia.intermedia.util.setAspectRatio
import org.ocpsoft.prettytime.PrettyTime
import java.util.*

class AutoWallpaperHistoryViewHolder(parent: View) : RecyclerView.ViewHolder(parent) {

    private val binding: ItemAutoWallpaperHistoryBinding by viewBinding()

    @SuppressLint("DefaultLocale")
    fun bind(
        wallpaper: AutoWallpaperHistory?,
        prettyTime: PrettyTime,
        callback: AutoWallpaperHistoryAdapter.ItemEventCallback
    ) {
        with(binding) {
            wallpaper?.let {
                wallpaper.thumbnail_url?.let {
                    photoImageView.loadPhotoUrl(it, colorString = wallpaper.color)
                }
                photoImageView.setAspectRatio(wallpaper.width, wallpaper.height)
                photoImageView.setOnClickListener {
                    wallpaper.photo_id?.let { callback.onPhotoClick(it) }
                }
                userTextView.text = wallpaper.name
                userImageView.loadProfilePicture(wallpaper.profile_picture)
                userContainer.setOnClickListener {
                    wallpaper.username?.let { username -> callback.onUserClick(username) }
                }
                wallpaper.date?.let { date ->
                    setDateTextView.text = prettyTime.format(Date(date)).replaceFirstChar {
                        if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString()
                    }
                }
            }
        }
    }
}
