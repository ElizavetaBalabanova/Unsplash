package com.intermedia.intermedia.ui.routing

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.intermedia.intermedia.R
import com.intermedia.intermedia.ui.collection.detail.CollectionDetailActivity
import com.intermedia.intermedia.ui.main.MainActivity
import com.intermedia.intermedia.ui.photo.detail.PhotoDetailActivity
import com.intermedia.intermedia.ui.user.UserActivity
import com.intermedia.intermedia.util.toast

class RoutingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        routeIntent(intent)
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        routeIntent(intent)
    }

    private fun routeIntent(intent: Intent?) {
        intent?.data?.let {
            val firstPathSegment = it.pathSegments.firstOrNull()
            when {
                firstPathSegment == "photos" && it.pathSegments.size > 1 -> {
                    Intent(this, PhotoDetailActivity::class.java).apply {
                        putExtra(PhotoDetailActivity.EXTRA_PHOTO_ID, it.pathSegments[1])
                        startActivity(this)
                    }
                }
                firstPathSegment == "collections" && it.pathSegments.size > 1 -> {
                    Intent(this, CollectionDetailActivity::class.java).apply {
                        putExtra(CollectionDetailActivity.EXTRA_COLLECTION_ID, it.pathSegments[1])
                        startActivity(this)
                    }
                }
                firstPathSegment?.startsWith("@") ?: false -> {
                    Intent(this, UserActivity::class.java).apply {
                        putExtra(UserActivity.EXTRA_USERNAME, firstPathSegment?.removePrefix("@"))
                        startActivity(this)
                    }
                }
                else -> {
                    Intent(this, MainActivity::class.java).apply {
                        addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
                        startActivity(this)
                    }
                }
            }
        } ?: run {
            toast(R.string.oops)
        }

        finish()
    }
}
