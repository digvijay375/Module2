package com.example.topsmodule.Module3.Q3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.topsmodule.R
import com.example.topsmodule.databinding.ActivityQuestionThirdBinding

class QuestionThirdActivity : AppCompatActivity() {

    lateinit var binding: ActivityQuestionThirdBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuestionThirdBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSecondNavigation.setOnClickListener {
            var intent = Intent(this,QuestionThirdSecondActivity::class.java)
            startActivity(intent)
        }
    }
}