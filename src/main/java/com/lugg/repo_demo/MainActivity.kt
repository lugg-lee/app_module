package com.lugg.repo_demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lugg.mylib.Utils

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Utils.log("on create: hello")
    }
}