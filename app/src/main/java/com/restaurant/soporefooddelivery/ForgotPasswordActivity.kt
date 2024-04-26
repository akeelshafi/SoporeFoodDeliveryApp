package com.restaurant.soporefooddelivery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class ForgotPasswordActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)

        val nextBtn = findViewById<Button>(R.id.forgot_password_Btn)

        nextBtn.setOnClickListener { intent = Intent(this,LoginActivity::class.java)
        startActivity(intent)
            finish()

            Toast.makeText(this, "Password send to Registered Mobile Number", Toast.LENGTH_SHORT).show()}
    }
}