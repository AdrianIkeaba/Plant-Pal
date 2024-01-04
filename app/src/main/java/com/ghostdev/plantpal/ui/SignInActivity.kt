package com.ghostdev.plantpal.ui

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.HideReturnsTransformationMethod
import android.text.method.PasswordTransformationMethod
import android.view.View
import android.view.View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
import android.widget.Button
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast
import com.ghostdev.plantpal.R
import com.ghostdev.plantpal.databinding.ActivitySignInBinding
import com.google.android.material.textfield.TextInputLayout

@Suppress("DEPRECATION")
class SignInActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySignInBinding
    private lateinit var createAccountText: TextView
    private lateinit var signUpButton: Button
    private lateinit var progressIndicator: ProgressBar
    private lateinit var backButton: ImageView
    private lateinit var forgotPassword: TextView
    private lateinit var passwordTextField: TextInputLayout
    private lateinit var rememberMe: CheckBox
    private var seePasswordClickCount = 0
    private var rememberMeBoolean = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignInBinding.inflate(layoutInflater)
        setContentView(binding.root)
        window?.decorView?.systemUiVisibility = SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN or View.SYSTEM_UI_FLAG_LAYOUT_STABLE
        window?.statusBarColor = Color.TRANSPARENT

        createAccountText = binding.createAccountText
        signUpButton = binding.signinButton
        progressIndicator = binding.circularProgressIndicator
        backButton = binding.backButton
        forgotPassword = binding.forgotPassword
        passwordTextField = binding.passwordEdit
        rememberMe = binding.rememberMeCheckBox

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

        rememberMe.setOnClickListener {
            rememberMeBoolean = rememberMeBoolean.not()
        }


        createAccountText.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
            finish()
        }

        signUpButton.setOnClickListener {
            progressIndicator.visibility = View.VISIBLE
        }

        backButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        forgotPassword.setOnClickListener {
            val intent = Intent(this, ForgotPasswordActivity::class.java)
            startActivity(intent)
            finish()
        }


    }
}