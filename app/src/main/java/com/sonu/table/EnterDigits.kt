package com.sonu.table

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class EnterDigits : AppCompatActivity() {
    lateinit var digit:EditText
    lateinit var button:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_enter_digits)
        digit=findViewById(R.id.edtDigit)
        button=findViewById(R.id.btnNext)
        button.setOnClickListener {
        val intent=Intent(this,Display::class.java)
           intent.putExtra("digit",digit.text.toString())

            startActivity(intent)
            finish()
        }
    }
}