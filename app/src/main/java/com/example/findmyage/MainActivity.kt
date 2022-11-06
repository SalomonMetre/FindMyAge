package com.example.findmyage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun computeAge(view: View){
        var messageText=findViewById<TextView>(R.id.messageText)
        var yearOfBirth=findViewById<TextView>(R.id.inputText).text.toString().toInt()
        var age= Calendar.getInstance().get(Calendar.YEAR) - yearOfBirth
        messageText.text="Your age is $age"
    }
}