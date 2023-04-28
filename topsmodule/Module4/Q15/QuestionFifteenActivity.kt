package com.example.topsmodule.Module4.Q15

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioGroup
import com.example.topsmodule.R
import com.example.topsmodule.databinding.ActivityQuestionFifteenBinding

class QuestionFifteenActivity : AppCompatActivity() {

    lateinit var binding: ActivityQuestionFifteenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuestionFifteenBinding.inflate(layoutInflater)
        setContentView(binding.root)



        val radioButtonListner = RadioGroup.OnCheckedChangeListener{
            group: RadioGroup?, checkedId: Int ->
            when(checkedId){
                R.id.redRadioButton -> setColor(Color.RED)
                R.id.greenRadioButton -> setColor(Color.GREEN)
                R.id.blueRadioButton -> setColor(Color.BLUE)

            }

        }
        findViewById<RadioGroup>(R.id.colorRadioGroup).setOnCheckedChangeListener(radioButtonListner)
    }

    private fun setColor(color: Int) {
        binding.colorTextView.setBackgroundColor(color)

    }
}