package com.h2square.libraryprac_bart

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        profileImg.setOnClickListener{
            val myIntent = Intent(this,ViewProfile::class.java)
            startActivity(myIntent)
        }

    Glide.with(this).load("https://thumb.mtstarnews.com/06/2023/04/2023041517354946468_1.jpg/dims/optimize").into(lectureImage)

    }
}