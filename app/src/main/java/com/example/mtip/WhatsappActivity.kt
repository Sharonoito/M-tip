package com.example.mtip

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class WhatsappActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_whatsapp)
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
                Uri.parse("https://wa.link/m-tip")
                    .buildUpon()
                    .appendPath(mtipId)
                    .build().also { appData ->
                        (appData)
                    }
            }
        }
}}