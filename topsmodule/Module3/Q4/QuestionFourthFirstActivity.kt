package com.example.topsmodule.Module3.Q4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.topsmodule.R
import com.example.topsmodule.databinding.ActivityQuestionFourthFirstBinding

class QuestionFourthFirstActivity : AppCompatActivity() {

    lateinit var  binding: ActivityQuestionFourthFirstBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuestionFourthFirstBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSubmit.setOnClickListener {
            var intent = Intent (this,QuestionFourthSecondActivtiy::class.java)

            val name = binding.etName.text.toString()
            val fname = binding.etFatherName.toString()
            val age = binding.etAge.toString()

            intent.putExtra("name",name)
            intent.putExtra("fname",fname)
            intent.putExtra("age",age)

            startActivity(intent)
        }
    }
}