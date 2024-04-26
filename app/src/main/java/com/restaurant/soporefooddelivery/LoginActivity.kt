package com.restaurant.soporefooddelivery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

       val signup=findViewById<TextView>(R.id.signupText)
        val login = findViewById<Button>(R.id.logInBtn)
        val forgot = findViewById<TextView>(R.id.forgot_text)

        signup.setOnClickListener { intent= Intent(this,SignupPage::class.java)
            startActivity(intent)
            finish()
        }
        login.setOnClickListener { intent=Intent(this,MainActivity::class.java)
        startActivity(intent)
        finish()}

        forgot.setOnClickListener { intent = Intent(this,ForgotPasswordActivity::class.java)
        startActivity(intent)
        finish()}





    }
}