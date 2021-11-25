package com.example.mtip

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Context
import android.content.Intent
import android.content.pm.ShortcutInfo
import android.content.pm.ShortcutManager
import android.graphics.drawable.Icon
import android.net.Uri
import androidx.core.content.ContextCompat

class WebsiteActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_website)
        handleIntent(intent)
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        handleIntent(intent)

    }

    private fun handleIntent(intent: Intent?) {
        val appLinkAction = intent?.action
        val appLinkData: Uri? = intent?.data
        if (Intent.ACTION_VIEW == appLinkAction) {
            appLinkData?.lastPathSegment?.also{ mtipId ->
                Uri.parse("https://m-tip.app/dashboard")
                    .buildUpon()
                    .appendPath(mtipId)
                    .build().also { appData ->
                        (appData)
                    }
            }
        }
    }



}
