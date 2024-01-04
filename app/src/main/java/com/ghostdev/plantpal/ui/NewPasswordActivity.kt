package com.ghostdev.plantpal.ui

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.ghostdev.plantpal.databinding.ActivityNewPasswordBinding

@Suppress("DEPRECATION")
class NewPasswordActivity : AppCompatActivity() {
    private lateinit var binding: ActivityNewPasswordBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNewPasswordBinding.inflate(layoutInflater)
        setContentView(binding.root)
        window?.decorView?.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN or View.SYSTEM_UI_FLAG_LAYOUT_STABLE
        window?.statusBarColor = Color.TRANSPARENT

        binding.saveNewPasswordButton.setOnClickListener {
            val intent = Intent(this, AllSetActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}