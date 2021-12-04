package com.example.mtip

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.content.res.Configuration
import android.icu.text.DateFormat.DAY
import android.icu.util.MeasureUnit.DAY
import android.os.Build
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import android.widget.PopupWindow
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    lateinit var tvChoices:TextView
    lateinit var btnUssd:Button
    lateinit var btnWhatsapp:Button
    lateinit var btnWebsite:Button
    lateinit var btnLogin:Button
    lateinit var tvwebView:WebView

//
//    override fun onConfigurationChanged(newConfig: Configuration) {
//        super.onConfigurationChanged(newConfig)
//        val nightModeFlags = resources.configuration.uiMode and Configuration.UI_MODE_NIGHT_MASK
//
//        if (nightModeFlags == Configuration.UI_MODE_NIGHT_NO){
//            applyDayNight(OnDayNightStateChanged.DAY)
//        }else{
//            applyDayNight(OnDayNightStateChanged.NIGHT)
//        }
//    }
//    private fun applyDayNight(state: Int){
//        if (state == OnDayNightStateChanged.DAY){
//            //apply day colors for your views
//        }else{
//            //apply night colors for your views
//        }
//    }

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
            finish()
        }


        var btnLogin=findViewById<Button>(R.id.btnLogin).setOnClickListener {
            var intent=Intent(this,LoginActivity::class.java)
            startActivity(intent)
            finish()
        }

        var btnWhatsapp=findViewById<Button>(R.id.btnWhatsapp).setOnClickListener {
            intent= Intent(this,WhatsappActivity::class.java)
            startActivity(intent)
            finish()
        }

        var btnWebsite=findViewById<Button>(R.id.btnWebsite).setOnClickListener {
            intent= Intent(this,WebsiteActivity::class.java)
            startActivity(intent)
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

    }

    }

class OnDayNightStateChanged {

}














