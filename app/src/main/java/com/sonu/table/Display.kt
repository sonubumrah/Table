package com.sonu.table

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class Display : AppCompatActivity() {
    lateinit var txt1:TextView
    lateinit var txt2:TextView
    lateinit var txt3:TextView
    lateinit var txt4:TextView
    lateinit var txt5:TextView
    lateinit var txt6:TextView
    lateinit var txt7:TextView
    lateinit var txt8:TextView
    lateinit var txt9:TextView
    lateinit var txt10:TextView

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)
        txt1=findViewById(R.id.txt1)
        txt2=findViewById(R.id.txt2)
        txt3=findViewById(R.id.txt3)
        txt4=findViewById(R.id.txt4)
        txt5=findViewById(R.id.txt5)
        txt6=findViewById(R.id.txt6)
        txt7=findViewById(R.id.txt7)
        txt8=findViewById(R.id.txt8)
        txt9=findViewById(R.id.txt9)
        txt10=findViewById(R.id.txt10)
        var userinput:String? = intent.getStringExtra("digit")
        var v=1
        try{
            if (userinput != null) {
                v=userinput.toInt()
                txt1.text="$v * 1= "+(v*1).toString()
                txt2.text="$v * 2= "+(v*2).toString()
                txt3.text="$v * 3= "+(v*3).toString()
                txt4.text="$v * 4= "+(v*4).toString()
                txt5.text="$v * 5= "+(v*5).toString()
                txt6.text="$v * 6= "+(v*6).toString()
                txt7.text="$v * 7= "+(v*7).toString()
                txt8.text="$v * 8= "+(v*8).toString()
                txt9.text="$v * 9= "+(v*9).toString()
                txt10.text="$v * 10= "+(v*10).toString()
            }
            else{
                Toast.makeText(this, "enter valid input not null", Toast.LENGTH_SHORT).show()
            }
        }
        catch (E:Exception){
            Toast.makeText(this, "enter valid input", Toast.LENGTH_SHORT).show()

        }


    }
}


