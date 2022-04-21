package com.rzs.apptest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var button : Button
    lateinit var edt_txt : EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edt_txt = findViewById(R.id.editTextNumber)
        button = findViewById(R.id.button)

        button.setOnClickListener {
            var number = edt_txt.text.toString()

            var prime = isPrime(number)

            if (prime){
                Toast.makeText(this, "is Primo", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this, "is Not Primo", Toast.LENGTH_LONG).show()
            }

        }

    }

    fun isPrime(textNum: String) : Boolean{
        var num = textNum.toInt()

        if (num < 2 ){
            return true
        }

        for (i in 2..num / 2) {
            // condition for nonprime number
            if (num % i == 0) {
                return false
                break
            }
        }
        return true


    }
}