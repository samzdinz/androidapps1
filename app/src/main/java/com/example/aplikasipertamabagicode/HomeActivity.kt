package com.example.aplikasipertamabagicode

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.aplikasipertamabagicode.browser.BrowserActivity
import com.example.aplikasipertamabagicode.databinding.ActivityHomeBinding
import com.example.aplikasipertamabagicode.list.ListActivity

class HomeActivity : AppCompatActivity() {

    private val binding by lazy { ActivityHomeBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val view = binding.root
        setContentView(view)

        with(binding) {
            btnFinancial.setOnClickListener {
                startActivity(Intent(this@HomeActivity, BrowserActivity::class.java ))
                finish()
            }
            btnProfile.setOnClickListener {
                startActivity(Intent(this@HomeActivity, ListActivity::class.java ))
                finish()
            }
        }

    }
}