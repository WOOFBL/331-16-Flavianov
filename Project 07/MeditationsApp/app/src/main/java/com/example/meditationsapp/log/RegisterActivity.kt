package com.example.meditationsapp.log

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.meditationsapp.R
import com.example.meditationsapp.other_pages.HomeActivity
import com.example.meditationsapp.database.DBHelper  // 🔹 Подключаем SQLite

class RegisterActivity : AppCompatActivity() {

    private lateinit var usernameField: EditText
    private lateinit var emailField: EditText
    private lateinit var passwordField: EditText
    private lateinit var confirmPasswordField: EditText
    private lateinit var registerButton: Button
    private lateinit var captchaButton: Button
    private var captchaPassed = false
    private lateinit var dbHelper: DBHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        dbHelper = DBHelper(this)
        usernameField = findViewById(R.id.username)
        emailField = findViewById(R.id.email)
        passwordField = findViewById(R.id.password)
        confirmPasswordField = findViewById(R.id.confirm_password)
        registerButton = findViewById(R.id.register_button)
        captchaButton = findViewById(R.id.captcha_button)

        // Капча: подтверждаем, что пользователь не робот
        captchaButton.setOnClickListener {
            captchaPassed = true
            Toast.makeText(this, "Капча пройдена!", Toast.LENGTH_SHORT).show()
        }

        // Обработчик кнопки регистрации
        registerButton.setOnClickListener {
            registerUser()
        }
    }

    private fun registerUser() {
        val username = usernameField.text.toString()
        val email = emailField.text.toString()
        val password = passwordField.text.toString()
        val confirmPassword = confirmPasswordField.text.toString()

        if (username.isEmpty() || email.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
            Toast.makeText(this, "Заполните все поля!", Toast.LENGTH_SHORT).show()
            return
        }

        if (password != confirmPassword) {
            Toast.makeText(this, "Пароли не совпадают!", Toast.LENGTH_SHORT).show()
            return
        }

        if (!captchaPassed) {
            Toast.makeText(this, "Пройдите капчу!", Toast.LENGTH_SHORT).show()
            return
        }

        dbHelper.insertUser(username, email, password)

        Toast.makeText(this, "Регистрация успешна!", Toast.LENGTH_SHORT).show()
        startActivity(Intent(this, HomeActivity::class.java))
        finish()
    }
}