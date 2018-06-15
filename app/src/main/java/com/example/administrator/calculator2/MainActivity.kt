package com.example.administrator.calculator2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1 = findViewById<Button>(R.id.button1) as Button
        val button2 = findViewById<Button>(R.id.button3) as Button
        val button3 = findViewById<Button>(R.id.button4) as Button
        val button4 = findViewById<Button>(R.id.button4) as Button
        val button5 = findViewById<Button>(R.id.button5) as Button
        val button6 = findViewById<Button>(R.id.button6) as Button




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

        button5.setOnClickListener {
            val result: Int = editText2.text.toString().toInt() % editText1.text.toString().toInt()
            textView3.text = result.toString()
        }

        button6.setOnClickListener {
            val result: Double = Math.sqrt (editText1.text.toString().toDouble())
            textView3.setText(result.toString())
        }


    }
}

