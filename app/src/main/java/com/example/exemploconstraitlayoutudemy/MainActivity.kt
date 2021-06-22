package com.example.exemploconstraitlayoutudemy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_exercicio)

        if (supportActionBar != null) {
            supportActionBar!!.hide()
        }
    }
}