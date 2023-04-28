package com.example.topsmodule.Module4.Q18

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Adapter
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import com.example.topsmodule.R
import com.example.topsmodule.databinding.ActivityQuestionEighteenBinding

class QuestionEighteen : AppCompatActivity() {

    lateinit var binding : ActivityQuestionEighteenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuestionEighteenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)

        var spinner : Spinner = binding.spinner
        val adapter = ArrayAdapter.createFromResource(this,R.array.spinner_options,android.R.layout.simple_spinner_dropdown_item)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter=adapter

        spinner.onItemSelectedListener=object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                val selectedItem = parent?.getItemAtPosition(position).toString()

                // Check if the default prompt text is selected
                if (selectedItem == getString(R.string.spinner_prompt)) {
                    // Show a toast message asking the user to select an option
                    Toast.makeText(applicationContext, "Please select an option", Toast.LENGTH_SHORT).show()
                } else {
                    // Start the activity for the selected item
                }

        }

            override fun onNothingSelected(parent: AdapterView<*>?) {
            }
        }

    }
}