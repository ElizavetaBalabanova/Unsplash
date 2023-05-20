package com.intermedia.intermedia.ui.widget

import android.content.Context
import android.util.AttributeSet
import com.intermedia.intermedia.R
import com.google.android.material.tabs.TabLayout

class AutoSizeTabLayout(context: Context, attrs: AttributeSet) : TabLayout(context, attrs) {

    override fun newTab(): Tab {
        return super.newTab().apply {
            setCustomView(R.layout.auto_size_tab_text)
        }
    }
}
