package com.example.topsmodule.Module3.Q5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.topsmodule.R
import com.example.topsmodule.databinding.ActivityQuestionFivthRegisterBinding

class QuestionFivthRegisterActivity : AppCompatActivity() {

    lateinit var binding: ActivityQuestionFivthRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityQuestionFivthRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSignup.setOnClickListener {
            Toast.makeText(applicationContext,"User Regiter SuccessFull",Toast.LENGTH_SHORT).show()
            var intent = Intent (this,QuestionFifthHomePage::class.java)
            startActivity(intent)
        }
        binding.btnLogin.setOnClickListener {
            var intent = Intent (this,QusetionFivthLoginActivity::class.java)
            startActivity(intent)
        }
        binding.btnHelp.setOnClickListener {
            Toast.makeText(applicationContext,"User Need Help",Toast.LENGTH_SHORT).show()
        }
    }
}