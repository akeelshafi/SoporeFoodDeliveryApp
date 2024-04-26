package com.restaurant.soporefooddelivery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class SignupPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup_page)

        val registerBtn = findViewById<Button>(R.id.registerBtn)

        registerBtn.setOnClickListener { intent = Intent(this,LoginActivity::class.java)
        startActivity(intent)
            finish()

            Toast.makeText(this, "Registered Successfully", Toast.LENGTH_SHORT).show()}
    }
}