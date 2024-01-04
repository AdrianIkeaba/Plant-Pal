package com.ghostdev.plantpal.ui

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import com.ghostdev.plantpal.R
import com.ghostdev.plantpal.databinding.ActivityForgotPasswordBinding

@Suppress("DEPRECATION")
class ForgotPasswordActivity : AppCompatActivity() {
    private lateinit var binding: ActivityForgotPasswordBinding
    private lateinit var backButton: ImageView
    private lateinit var sendOTPButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityForgotPasswordBinding.inflate(layoutInflater)
        setContentView(binding.root)
        window?.decorView?.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN or View.SYSTEM_UI_FLAG_LAYOUT_STABLE
        window?.statusBarColor = Color.TRANSPARENT

        backButton = binding.backButton
        sendOTPButton = binding.sendOtpButton

        backButton.setOnClickListener {
            val intent = Intent(this, SignInActivity::class.java)
            startActivity(intent)
            finish()
        }

        sendOTPButton.setOnClickListener {
            val intent = Intent(this, EnterOtpActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}