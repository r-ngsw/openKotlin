package com.example.noSDK

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun onButtonTapped(view: View?){
        val intent = Intent(this, SecondActivity::class.java)
        startActivity(intent)
    }
    fun onButtonClick(view: View?){
        val intent = Intent(this, ThirdActivity::class.java)
        startActivity(intent)
    }
    fun onButtonUranai(view: View?){
        val intent = Intent(this, FourthActivity::class.java)
        startActivity(intent)
    }
}