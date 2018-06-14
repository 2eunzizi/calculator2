package com.example.administrator.fourfunctioncalculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1 = findViewById<Button>(R.id.button1) as Button
        val button2 = findViewById<Button>(R.id.button2) as Button
        val button3 = findViewById<Button>(R.id.button3) as Button
        val button4 = findViewById<Button>(R.id.button4) as Button

        button1.setOnClickListener {
            val result: Int = editText2.text.toString().toInt() + editText1.text.toString().toInt()
            textView3.text = result.toString()
        }

        button2.setOnClickListener {
            val result: Int = editText2.text.toString().toInt() - editText1.text.toString().toInt()
            textView3.text = result.toString()
        }

        button3.setOnClickListener {
            val result: Int = editText2.text.toString().toInt() * editText1.text.toString().toInt()
            textView3.text = result.toString()
        }

        button4.setOnClickListener {
            val result: Int = editText2.text.toString().toInt() / editText1.text.toString().toInt()
            textView3.text = result.toString()
        }

    }
}
