package com.intermedia.intermedia.provider

import com.intermedia.intermedia.data.download.DownloadService
import com.intermedia.intermedia.util.safeApiCall
import com.intermedia.intermedia.util.warn
import com.intermedia.intermedia.worker.MuzeiWorker
import com.google.android.apps.muzei.api.provider.Artwork
import com.google.android.apps.muzei.api.provider.MuzeiArtProvider
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import org.koin.android.ext.android.get
import org.koin.android.ext.android.inject
import java.io.InputStream

class IntermediaMuzeiArtProvider : MuzeiArtProvider() {

    override fun onLoadRequested(initial: Boolean) {
        val context = context ?: return
        MuzeiWorker.enqueueWork(context, get())
    }

    override fun openFile(artwork: Artwork): InputStream {
        return super.openFile(artwork).also {
            artwork.token?.run {
                try {
                    val downloadService: DownloadService by inject()
                    CoroutineScope(Job() + Dispatchers.IO).launch {
                        safeApiCall(Dispatchers.IO) { downloadService.trackDownload(this@run) }
                    }
                } catch (e: Exception) {
                    warn("Error reporting download to Unsplash", e)
                }
            }
        }
    }
}
