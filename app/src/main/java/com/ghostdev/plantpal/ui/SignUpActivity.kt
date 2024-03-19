package com.ghostdev.plantpal.ui

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.text.method.HideReturnsTransformationMethod
import android.text.method.PasswordTransformationMethod
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.ghostdev.plantpal.R
import com.ghostdev.plantpal.databinding.ActivitySignUpBinding
import com.google.android.material.textfield.TextInputLayout

@Suppress("DEPRECATION")
class SignUpActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySignUpBinding
    private lateinit var loginAccountText: TextView
    private lateinit var signUpButton: Button
    private lateinit var progressIndicator: ProgressBar
    private lateinit var backButton: ImageView
    private lateinit var passwordTextField: TextInputLayout
    private var seePasswordClickCount = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)
        window?.decorView?.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN or View.SYSTEM_UI_FLAG_LAYOUT_STABLE
        window?.statusBarColor = Color.TRANSPARENT

        loginAccountText = binding.alreadyHaveAccount
        signUpButton = binding.signUpButton
        progressIndicator = binding.circularProgressIndicator
        backButton = binding.backButton
        passwordTextField = binding.passwordEdit

        passwordTextField.setEndIconOnClickListener {
            if (seePasswordClickCount == 0) {
                passwordTextField.setEndIconDrawable(R.drawable.passwordsee)
                seePasswordClickCount += 1

                //Show password
                binding.passwordEditText.transformationMethod = HideReturnsTransformationMethod.getInstance()
            } else if (seePasswordClickCount == 1) {
                passwordTextField.setEndIconDrawable(R.drawable.password)
                seePasswordClickCount -= 1

                //Hide password
                binding.passwordEditText.transformationMethod = PasswordTransformationMethod.getInstance()
            }
        }


        loginAccountText.setOnClickListener {
            val intent = Intent(this, SignInActivity::class.java)
            startActivity(intent)
            finish()
        }

        signUpButton.setOnClickListener {
            progressIndicator.visibility = View.VISIBLE
            val handler = Handler(Looper.getMainLooper())
            handler.postDelayed({
                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
                finish()
            }, 3000)

        }

        backButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}