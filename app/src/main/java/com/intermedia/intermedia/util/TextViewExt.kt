package com.intermedia.intermedia.util

import android.widget.TextView
import androidx.core.view.isVisible

fun TextView.setTextAndVisibility(string: String?) {
    isVisible = !string.isNullOrBlank()
    text = string
}
