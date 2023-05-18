package com.h2square.libraryprac_bart

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        profileImg.setOnClickListener{
            val myIntent = Intent(this,ViewProfile::class.java)
            startActivity(myIntent)
        }
    }
}