package com.example.mtip

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class WhatsappActivity : AppCompatActivity() {

    lateinit var tvwebView3: WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_whatsapp)

        val myWebView: WebView = findViewById(R.id.tvwebView3)
        myWebView.loadUrl("http://wa.link/m-tip")
        finish()


    }}

