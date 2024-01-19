package com.vgt.homeapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.vgt.mylibrary.Toaster

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toaster.simpleToast(this,"do something")
    }
}