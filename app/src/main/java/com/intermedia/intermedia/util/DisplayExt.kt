package com.intermedia.intermedia.util

import android.content.res.Resources

val Int.pxToDp: Int
    get() = this / Resources.getSystem().displayMetrics.density.toInt()

val Int.dpToPx: Int
    get() = (this * Resources.getSystem().displayMetrics.density).toInt()

val screenWidth = Resources.getSystem().displayMetrics.widthPixels

val screenHeight = Resources.getSystem().displayMetrics.heightPixels
