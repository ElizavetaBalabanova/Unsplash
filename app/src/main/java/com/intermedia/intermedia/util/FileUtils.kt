package com.intermedia.intermedia.util

import android.content.ContentUris
import android.content.Context
import android.net.Uri
import android.os.Build
import android.os.Environment
import android.provider.MediaStore
import androidx.core.content.FileProvider
import com.intermedia.intermedia.BuildConfig
import com.intermedia.intermedia.R
import com.intermedia.intermedia.util.download.DOWNLOADER_SYSTEM
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import java.io.File

const val INTERMEDIA_DIRECTORY = "Intermedia"

const val FILE_PROVIDER_AUTHORITY = "${BuildConfig.APPLICATION_ID}.fileprovider"

val INTERMEDIA_RELATIVE_PATH = "${Environment.DIRECTORY_PICTURES}${File.separator}$INTERMEDIA_DIRECTORY"

val INTERMEDIA_LEGACY_PATH = "${Environment.getExternalStoragePublicDirectory(
    Environment.DIRECTORY_PICTURES)}${File.separator}$INTERMEDIA_DIRECTORY"

fun Context.fileExists(fileName: String, downloader: String?): Boolean {
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
        val projection = arrayOf(MediaStore.MediaColumns.DISPLAY_NAME)
        val selection = "${MediaStore.MediaColumns.RELATIVE_PATH} like ? and " +
                "${MediaStore.MediaColumns.DISPLAY_NAME} = ?"
        val relativePath = if (downloader == DOWNLOADER_SYSTEM) {
            Environment.DIRECTORY_DOWNLOADS
        } else {
            INTERMEDIA_RELATIVE_PATH
        }
        val selectionArgs = arrayOf("%$relativePath%", fileName)
        val uri = if (downloader == DOWNLOADER_SYSTEM) {
            MediaStore.Downloads.EXTERNAL_CONTENT_URI
        } else {
            MediaStore.Images.Media.EXTERNAL_CONTENT_URI
        }
        contentResolver.query(uri, projection, selection, selectionArgs, null)?.use {
            return it.count > 0
        } ?: return false
    } else {
        return File(INTERMEDIA_LEGACY_PATH, fileName).exists()
    }
}

fun Context.getUriForPhoto(fileName: String, downloader: String?): Uri? {
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
        val projection = arrayOf(MediaStore.MediaColumns._ID)
        val selection = "${MediaStore.MediaColumns.RELATIVE_PATH} like ? and " +
                "${MediaStore.MediaColumns.DISPLAY_NAME} = ?"
        val relativePath = if (downloader == DOWNLOADER_SYSTEM) {
            Environment.DIRECTORY_DOWNLOADS
        } else {
            INTERMEDIA_RELATIVE_PATH
        }
        val selectionArgs = arrayOf("%$relativePath%", fileName)
        val uri = if (downloader == DOWNLOADER_SYSTEM) {
            MediaStore.Downloads.EXTERNAL_CONTENT_URI
        } else {
            MediaStore.Images.Media.EXTERNAL_CONTENT_URI
        }
        contentResolver.query(uri, projection, selection, selectionArgs, null)?.use {
            return if (it.moveToFirst()) {
                ContentUris.withAppendedId(uri, it.getLong(
                    it.getColumnIndexOrThrow(MediaStore.MediaColumns._ID)))
            } else {
                null
            }
        } ?: return null
    } else {
        val file = File(INTERMEDIA_LEGACY_PATH, fileName)
        return FileProvider.getUriForFile(this, FILE_PROVIDER_AUTHORITY, file)
    }
}

fun showFileExistsDialog(context: Context, action: () -> Unit) {
    MaterialAlertDialogBuilder(context)
        .setTitle(R.string.file_exists_title)
        .setMessage(R.string.file_exists_message)
        .setPositiveButton(R.string.yes) { _, _ -> action.invoke() }
        .setNegativeButton(R.string.no, null)
        .show()
}
