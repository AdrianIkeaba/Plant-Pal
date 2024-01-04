package com.ghostdev.plantpal.ui

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import com.ghostdev.plantpal.databinding.ActivityEnterOtpBinding

@Suppress("DEPRECATION")
class EnterOtpActivity : AppCompatActivity() {
    private lateinit var binding: ActivityEnterOtpBinding
    private lateinit var backButton: ImageView
    private lateinit var verifyOtpButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEnterOtpBinding.inflate(layoutInflater)
        setContentView(binding.root)
        window?.decorView?.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN or View.SYSTEM_UI_FLAG_LAYOUT_STABLE
        window?.statusBarColor = Color.TRANSPARENT

        backButton = binding.backButton
        verifyOtpButton = binding.verifyOtpButton

        backButton.setOnClickListener {
            val intent = Intent(this, SignInActivity::class.java)
            startActivity(intent)
            finish()
        }

        verifyOtpButton.setOnClickListener {
            val intent = Intent(this, NewPasswordActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

}