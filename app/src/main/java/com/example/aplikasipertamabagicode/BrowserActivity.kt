package com.example.aplikasipertamabagicode

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.aplikasipertamabagicode.databinding.ActivityBrowserBinding

class BrowserActivity : AppCompatActivity() {

    private val binding by lazy { ActivityBrowserBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val view = binding.root
        setContentView(view)

        val url = ("https://www.google.com")
        binding.wbBrowser.loadUrl(url)
        binding.wbBrowser.settings.javaScriptEnabled

    }
}