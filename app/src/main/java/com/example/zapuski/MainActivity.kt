package com.example.zapuski

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

private var number: Int = 0

class MainActivity : AppCompatActivity() {
    private lateinit var textview8 : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textview8 = findViewById(R.id.textView8)
        val preferences = getSharedPreferences("one", MODE_PRIVATE)
        val edit = preferences.edit()
        number = preferences.getInt("one", number)
        var count = number + 1
        number = count
        edit.putInt("one", number)
        edit.apply()
        textview8.text = number.toString()

    }
}