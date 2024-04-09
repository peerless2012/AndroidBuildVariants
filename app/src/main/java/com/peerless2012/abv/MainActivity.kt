package com.peerless2012.abv

import ShareCode
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.peerless2012.abv.impl.ImplPlugin
import com.peerless2012.abv.mock.Mock

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val urlText = findViewById<TextView>(R.id.main_url)
        urlText.text = "Url is ${Mock.Url}"
        val shareText = findViewById<TextView>(R.id.main_share)
        shareText.text = "Share is ${ShareCode.SHARED_CODE}"
        val implText = findViewById<TextView>(R.id.main_impl)
        implText.text = "Impl is ${ImplPlugin.getImpl().impl()}"
    }
}