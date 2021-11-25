package com.example.mtip

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.os.Build
import android.webkit.WebView
import android.widget.Button
import android.widget.PopupWindow
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    lateinit var tvUssd:TextView
    lateinit var btnLogin:Button
    lateinit var tvWhatsapp:TextView
    lateinit var tvChoices:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val window=PopupWindow(this)
        val view=layoutInflater.inflate(R.layout.activity_main,null)

        window.contentView=view
        var textView=view.findViewById<TextView>(R.id.tvChoices)

        var btnUssd=findViewById<Button>(R.id.btnUssd).setOnClickListener {
            var intent=Intent(this,GiveTipActivity::class.java)
            startActivity(intent)
        }
        var btnLogin=findViewById<Button>(R.id.btnLogin).setOnClickListener {
                var myWebView: WebView = findViewById(R.id.tvwebView)
                myWebView.loadUrl("http://m-tip.app/dashboard")
                finish()
        }

        var btnWhatsapp=findViewById<Button>(R.id.btnWhatsapp).setOnClickListener {
                var myWebView: WebView = findViewById(R.id.tvwebView)
                myWebView.loadUrl("https://wa.link/m-tip")
                finish()
        }

        var btnWebsite=findViewById<Button>(R.id.btnWebsite).setOnClickListener {
            var webView:WebView=findViewById(R.id.tvwebView)
            webView.loadUrl("https://m-tip.app")
           finish()
        }


        textView.setOnClickListener {
            window.showAsDropDown(textView)
        }
        //Check's that the api version meets the requirements
        if (Build.VERSION.SDK_INT >= 25) {
            //Sets up our shortcuts
            Shortcuts.setUp(applicationContext)
        }
//        val myWebView: WebView = findViewById(R.id.tvwebView)
//        myWebView.loadUrl("http://m-tip.app/dashboard")
//        finish()




    }

    }












//










