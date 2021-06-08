package com.example.noSDK

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import java.util.*

class FourthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth)

        var tv:TextView = findViewById(R.id.unsei)
        var btn:Button = findViewById(R.id.uranaiBtn)

        btn.setOnClickListener {
            var unsei = arrayOf("大吉","中吉","小吉","凶")

            var num = Random().nextInt(unsei.count())
            tv.text =unsei.get(num)
        }
    }
    fun onButtonTapped(view: View?){
        finish()
    }
}