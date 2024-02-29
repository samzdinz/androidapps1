package com.example.aplikasipertamabagicode

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class WelcomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        val btnSignIn = this.findViewById<TextView>(R.id.btn_sign_in)

        btnSignIn.setOnClickListener {
            startActivity(Intent(this@WelcomeActivity, MainActivity::class.java))
        }

    }
}