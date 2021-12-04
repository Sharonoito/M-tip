package com.example.mtip

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.Manifest
import android.Manifest.*
import android.Manifest.permission.CALL_PHONE
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.widget.Button
import android.widget.EditText
import androidx.core.app.ActivityCompat
import android.app.Activity


class GiveTipActivity : AppCompatActivity() {

    private lateinit var etCode:EditText
    private lateinit var btnCode:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_give_tip)

        etCode=findViewById(R.id.etCode)
        btnCode=findViewById(R.id.btnCode)

        callNumber( "*682%23")
        finish()
        btnCode.setOnClickListener {
            callNumber( "*682%23")

        }
    }

    fun callNumber(number: String): Boolean {
        val permissions = arrayOf<String>(Manifest.permission.CALL_PHONE)
        val intent = Intent(Intent.ACTION_CALL, Uri.parse("tel:$number"))
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE
            ) != PackageManager.PERMISSION_GRANTED
        ) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            ActivityCompat.requestPermissions(this,permissions,3453
            )
        } else {
            startActivity(intent)
            return true
        }
        return false
    }

}


