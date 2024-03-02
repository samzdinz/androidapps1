package com.example.aplikasipertamabagicode

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.aplikasipertamabagicode.databinding.ActivitySignInBinding

class SignInActivity : AppCompatActivity() {

    private  lateinit var binding: ActivitySignInBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivitySignInBinding.inflate((layoutInflater))
        val view = binding.root
        setContentView(view)

        with(binding) {
            btnLogin.setOnClickListener {
                val username = binding.etUsername.text.toString()
                val password = binding.etPassword.text.toString()

                if (username == "keyzie" && password == "1234") {
                    startActivity(Intent(this@SignInActivity, MainActivity::class.java))
                } else {
                    Toast.makeText(applicationContext, "Maaf ${username} atau ${password} invalid", Toast.LENGTH_LONG).show()
                }
            }

            tvSignup.setOnClickListener {
                startActivity(Intent(this@SignInActivity, SignUpActivity::class.java))
            }
        }
    }
}