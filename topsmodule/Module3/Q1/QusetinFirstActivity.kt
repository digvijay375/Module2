package com.example.topsmodule.Module3.Q1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.topsmodule.R
import com.example.topsmodule.databinding.ActivityQuestionFirstBinding

class QusetinFirstActivity : AppCompatActivity() {

    lateinit var binding: ActivityQuestionFirstBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuestionFirstBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}