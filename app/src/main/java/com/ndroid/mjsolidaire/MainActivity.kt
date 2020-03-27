package com.ndroid.mjsolidaire

import android.content.Intent
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ndroid.mjsolidaire.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()

        btnNewService.setOnClickListener {
            val intent = Intent(this,  NewServiceActivity::class.java)
            startActivity(intent)
        }


        btnMyServices.setOnClickListener {
            val intent = Intent(this, MyServicesActivity::class.java)
            startActivity(intent)
        }


    }
}
