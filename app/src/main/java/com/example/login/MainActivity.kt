package com.example.login

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun clickHandler(view: View) {
        Log.i("MainActivity-clickHandler","Button Clicked")
        var dialIntent: Intent=Intent(Intent.ACTION_DIAL, Uri.parse("tel:9847531304"))
        var webIntent:Intent=Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"))
        startActivity(webIntent)
    }
}