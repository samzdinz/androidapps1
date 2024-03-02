package com.example.aplikasipertamabagicode

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.aplikasipertamabagicode.databinding.ActivitySignUpBinding

class SignUpActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySignUpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivitySignUpBinding.inflate((layoutInflater))
        val view = binding.root
        setContentView(view)

        with(binding) {
            btnSignup.setOnClickListener {
                startActivity(Intent(this@SignUpActivity, SignInActivity::class.java))
            }
            tvSignin.setOnClickListener {
                startActivity(Intent(this@SignUpActivity, SignInActivity::class.java))
            }
            tvBtnBack.setOnClickListener {
                startActivity(Intent(this@SignUpActivity, SignInActivity::class.java))
            }
        }
    }
}