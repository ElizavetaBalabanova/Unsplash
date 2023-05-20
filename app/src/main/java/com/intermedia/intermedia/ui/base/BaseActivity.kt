package com.intermedia.intermedia.ui.base

import android.app.ActivityManager.TaskDescription
import android.content.Context
import android.content.Intent
import android.content.res.Configuration
import android.graphics.BitmapFactory
import android.os.Build
import android.os.Bundle
import android.view.MenuItem
import androidx.activity.OnBackPressedCallback
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModel
import androidx.viewbinding.ViewBinding
import com.intermedia.intermedia.R
import com.intermedia.intermedia.domain.SharedPreferencesRepository
import com.intermedia.intermedia.ui.main.MainActivity
import com.intermedia.intermedia.util.NotificationManager
import com.intermedia.intermedia.util.applyLanguage
import com.intermedia.intermedia.util.getThemeAttrColor
import org.koin.android.ext.android.inject

abstract class BaseActivity(@LayoutRes contentLayoutId: Int) : AppCompatActivity(contentLayoutId) {

    abstract val viewModel: ViewModel?

    abstract val binding: ViewBinding

    val sharedPreferencesRepository: SharedPreferencesRepository by inject()
    val notificationManager: NotificationManager by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setRecentAppsHeaderColor()
        applyLanguage(sharedPreferencesRepository.locale)

        onBackPressedDispatcher.addCallback(this, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                if (isTaskRoot && this@BaseActivity !is MainActivity) {
                    startActivity(Intent(this@BaseActivity, MainActivity::class.java))
                }
                finish()
            }
        })
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        applyLanguage(sharedPreferencesRepository.locale)
    }

    override fun attachBaseContext(newBase: Context?) {
        super.attachBaseContext(newBase?.applyLanguage(sharedPreferencesRepository.locale))
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            android.R.id.home -> {
                onBackPressedDispatcher.onBackPressed()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun AppCompatActivity.setRecentAppsHeaderColor() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
            val taskDescription = TaskDescription(
                getString(R.string.app_name),
                R.mipmap.ic_launcher,
                getThemeAttrColor(this, R.attr.colorSurface)
            )
            setTaskDescription(taskDescription)
        } else {
            val icon = BitmapFactory.decodeResource(resources, R.mipmap.ic_launcher)
            val taskDescription = TaskDescription(
                getString(R.string.app_name),
                icon,
                getThemeAttrColor(this, R.attr.colorSurface)
            )
            setTaskDescription(taskDescription)
            icon?.recycle()
        }
    }
}
