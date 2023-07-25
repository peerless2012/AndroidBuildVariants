package com.peerless2012.abv

import ShareCode
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.peerless2012.abv.impl.ImplPlugin

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val shareText = findViewById<TextView>(R.id.main_share)
        shareText.text = "Share is ${ShareCode.SHARED_CODE}"
        val implText = findViewById<TextView>(R.id.main_impl)
        implText.text = "Impl is ${ImplPlugin.getImpl().impl()}"
    }
}