package com.example.aplikasipertamabagicode

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class WelcomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        android.os.Handler().postDelayed(Runnable {
            val intent = Intent(
                this@WelcomeActivity,
                SignInActivity::class.java
            )
            startActivity(intent)
            finish()
        }, 2000)

    }
}