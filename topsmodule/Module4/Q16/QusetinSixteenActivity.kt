package com.example.topsmodule.Module4.Q16

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import com.example.topsmodule.R
import com.example.topsmodule.databinding.ActivityQusetinSixteenBinding

class QusetinSixteenActivity : AppCompatActivity() {


    lateinit var binding: ActivityQusetinSixteenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQusetinSixteenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.seekbar1.setOnSeekBarChangeListener(colorSeekBarChangeListener)
    }
    private val colorSeekBarChangeListener = object : SeekBar.OnSeekBarChangeListener{
        override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
            val red = binding.seekbar1.progress
            val green = binding.seekbar2.progress
            val blue = binding.seekbar3.progress

            binding.textView.text="SeekBar Values : $red, $green, $blue"

            when(seekBar){
                binding.seekbar1 -> window.decorView.setBackgroundColor(Color.rgb(red,green,blue))
                binding.seekbar2 -> window.decorView.setBackgroundColor(Color.rgb(red,green,blue))
                binding.seekbar3 -> window.decorView.setBackgroundColor(Color.rgb(0,0,blue))
            }
        }
        override fun onStartTrackingTouch(seekBar: SeekBar?) {}
        override fun onStopTrackingTouch(seekBar: SeekBar?) {}
    }
}