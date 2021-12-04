package com.example.mtip

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        val myWebView: WebView = findViewById(R.id.tvwebView)
        myWebView.loadUrl("http://m-tip.app/dashboard")
        finish()

        }

    }
