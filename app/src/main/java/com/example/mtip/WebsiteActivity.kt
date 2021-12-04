package com.example.mtip

import android.content.Intent
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.webkit.WebView
import android.widget.Button
import android.widget.PopupWindow
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity



class WebsiteActivity : AppCompatActivity() {

    lateinit var tvwebView2: WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_website)

        val myWebView: WebView = findViewById(R.id.tvwebView2)
        myWebView.loadUrl("http://m-tip.app")
        finish()

    }


    }




