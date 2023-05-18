package com.h2square.libraryprac_bart

import android.Manifest
import android.content.Intent

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.bumptech.glide.Glide

import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions.with
import com.gun0912.tedpermission.PermissionListener
import com.gun0912.tedpermission.normal.TedPermission

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


        phoneBtn.setOnClickListener {
            val permissionListener = object: PermissionListener{
                override fun onPermissionGranted() {
                    val myUri = Uri.parse(number.toString())
                    val myIntent = Intent(Intent.ACTION_CALL,myUri)
                    startActivity(myIntent)
                }

                override fun onPermissionDenied(deniedPermissions: MutableList<String>?) {
                    Toast.makeText(this@MainActivity, "권한이 없어서 실패하였습니다.", Toast.LENGTH_SHORT).show()
                }

            }

            TedPermission.create()
                .setPermissionListener(permissionListener)
                .setDeniedMessage("전화권한이 필요합니다.[설정]에서 진행해주세요")
                .setPermissions(Manifest.permission.CALL_PHONE)
            .check()
        }
    }
}