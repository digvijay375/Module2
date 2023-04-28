package com.example.topsmodule.Module3.Q5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.topsmodule.R
import com.example.topsmodule.databinding.ActivityQusetionFivthLoginBinding

class QusetionFivthLoginActivity : AppCompatActivity() {
    lateinit var binding: ActivityQusetionFivthLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQusetionFivthLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSignup.setOnClickListener {
            var intent = Intent (this,QuestionFivthRegisterActivity::class.java)
            startActivity(intent)
        }
        binding.btnForget.setOnClickListener {
            Toast.makeText(applicationContext, "User Forget Password", Toast.LENGTH_SHORT).show()
        }
        binding.btnLogin.setOnClickListener {
            Toast.makeText(applicationContext,"User Login SuccessFull",Toast.LENGTH_SHORT).show()
            var intent = Intent (this,QuestionFifthHomePage::class.java)
            startActivity(intent)
        }
    }
}