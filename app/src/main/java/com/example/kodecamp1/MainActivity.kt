package com.example.kodecamp1


import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val know = resources.getStringArray(R.array.Dedication_array)
        val randomKnow = know.random()

        @SuppressLint("SetTextI18n")
        fun random(): String? {
            val knowMoreButton: Button = findViewById(R.id.button)
            //Button Functionality


            val listener = View.OnClickListener{
                    knowMoreButton.text = randomKnow
                }

            knowMoreButton.setOnClickListener(listener)

        return randomKnow
        }
        random()
    }
}