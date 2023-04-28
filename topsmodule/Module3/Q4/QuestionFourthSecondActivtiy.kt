package com.example.topsmodule.Module3.Q4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.topsmodule.R
import com.example.topsmodule.databinding.ActivityQuestionFourthSecondActivtiyBinding

class QuestionFourthSecondActivtiy : AppCompatActivity() {

    lateinit var binding: ActivityQuestionFourthSecondActivtiyBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivityQuestionFourthSecondActivtiyBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val name = intent.getStringExtra("name")
        val fname = intent.getStringExtra("fname")
        val age = intent.getStringExtra("age")

        binding.etName.setText(name)
        binding.etFatherName.setText(fname)
        binding.etAge.setText(age)
    }
}