package com.example.topsmodule.Module3.Q3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.topsmodule.R
import com.example.topsmodule.databinding.ActivityQuestionThirdSecondBinding

class QuestionThirdSecondActivity : AppCompatActivity() {

    lateinit var binding: ActivityQuestionThirdSecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuestionThirdSecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnFirstNavigation.setOnClickListener {
            var intent = Intent(this,QuestionThirdActivity::class.java)
            startActivity(intent)
        }
    }
}