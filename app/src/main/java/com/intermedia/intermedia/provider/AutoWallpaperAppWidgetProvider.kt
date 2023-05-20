package com.intermedia.intermedia.provider

import android.app.PendingIntent
import android.appwidget.AppWidgetManager
import android.appwidget.AppWidgetProvider
import android.content.Context
import android.content.Intent
import android.os.Build
import android.widget.RemoteViews
import com.intermedia.intermedia.R
import com.intermedia.intermedia.domain.SharedPreferencesRepository
import com.intermedia.intermedia.util.NotificationManager
import com.intermedia.intermedia.util.toast
import com.intermedia.intermedia.worker.AutoWallpaperWorker
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class AutoWallpaperAppWidgetProvider : AppWidgetProvider(), KoinComponent {

    override fun onReceive(context: Context?, intent: Intent?) {
        super.onReceive(context, intent)

        val sharedPreferencesRepository: SharedPreferencesRepository by inject()
        val notificationManager: NotificationManager by inject()

        if (context != null && intent?.action == ACTION_WIDGET_NEXT) {
            with(context) {
                if (sharedPreferencesRepository.autoWallpaperEnabled) {
                    toast(R.string.setting_wallpaper)
                    AutoWallpaperWorker.scheduleSingleAutoWallpaperJob(this, sharedPreferencesRepository, notificationManager)
                } else {
                    toast("Auto Wallpaper is not enabled")
                }
            }
        }
    }

    override fun onUpdate(
        context: Context,
        appWidgetManager: AppWidgetManager,
        appWidgetIds: IntArray
    ) {
        for (appWidgetId in appWidgetIds) {
            updateAppWidget(context, appWidgetManager, appWidgetId)
        }
    }

    private fun updateAppWidget(
        context: Context,
        appWidgetManager: AppWidgetManager,
        appWidgetId: Int
    ) {
        val views = RemoteViews(context.packageName, R.layout.auto_wallpaper_app_widget)
        views.setOnClickPendingIntent(R.id.auto_wallpaper_next_button,
            getNextAutoWallpaperPendingIntent(context))
        appWidgetManager.updateAppWidget(appWidgetId, views)
    }

    private fun getNextAutoWallpaperPendingIntent(context: Context): PendingIntent {
        val intent = Intent(context, AutoWallpaperAppWidgetProvider::class.java).apply {
            action = ACTION_WIDGET_NEXT
        }
        val flags = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
            PendingIntent.FLAG_IMMUTABLE or PendingIntent.FLAG_UPDATE_CURRENT
        } else {
            PendingIntent.FLAG_UPDATE_CURRENT
        }
        return PendingIntent.getBroadcast(context, 0, intent, flags)
    }

    companion object {

        const val ACTION_WIDGET_NEXT = "com.b_lam.resplash.ACTION_WIDGET_NEXT"
    }
}
