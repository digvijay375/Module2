package com.example.topsmodule.Module3.Q2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.topsmodule.R
import com.example.topsmodule.databinding.ActivityQuestionSecondBinding

class QuestionSecondActivity : AppCompatActivity() {

    lateinit var binding: ActivityQuestionSecondBinding

    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuestionSecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnRed.setOnClickListener {
            binding.background.setBackgroundColor(R.color.red)
        }
        binding.btnBlue.setOnClickListener {
            binding.background.setBackgroundColor(R.color.blue)
        }
        binding.btnGreen.setOnClickListener {
            binding.background.setBackgroundColor(R.color.green)
        }
        binding.btnPink.setOnClickListener {
            binding.background.setBackgroundColor(R.color.pink)
        }
        binding.btnOrange.setOnClickListener {
            binding.background.setBackgroundColor(R.color.orange)
        }
        binding.btnViolet.setOnClickListener {
            binding.background.setBackgroundColor(R.color.voilet)
        }
        binding.btnYellow.setOnClickListener {
            binding.background.setBackgroundColor(R.color.yellow)
        }
    }
}