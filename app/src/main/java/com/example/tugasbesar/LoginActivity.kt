package com.example.tugasbesar

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.Firebase
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.auth

class LoginActivity : AppCompatActivity() {
    private val SECOND_ACTIVITY_TAG = "LoginActivity"

    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        Log.d(SECOND_ACTIVITY_TAG, "LOGIN PAGE")
        val emailInput = findViewById<EditText>(R.id.editTextEmail)
        val passwordInput = findViewById<EditText>(R.id.editTextPassword)
        val loginButton = findViewById<Button>(R.id.btnLogin)
        val registerButton = findViewById<Button>(R.id.btnSignUp)
        val lupakatasandi = findViewById<TextView>(R.id.textView9)

        lupakatasandi.setOnClickListener {
            val intent = Intent(this, LupaKataSandiActivity::class.java)
            startActivity(intent)
            Log.e(SECOND_ACTIVITY_TAG, "LupaKataSandi Page")
        }

        registerButton.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
            Log.e(SECOND_ACTIVITY_TAG, "FORGOT PAGE")
        }
        auth = Firebase.auth

        loginButton.setOnClickListener {
            val email = emailInput.text.toString().trim()
            val password = passwordInput.text.toString().trim()

            if (email.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Please enter email and password", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            auth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(this) { task ->
                    if (task.isSuccessful) {
                        Log.d(SECOND_ACTIVITY_TAG, "Login successful!")
                        Toast.makeText(this, "Login successful!", Toast.LENGTH_SHORT).show()
                        val intent = Intent(this, MainMenuActivity::class.java)
                        startActivity(intent)
                    } else {
                        Log.w(SECOND_ACTIVITY_TAG, "Login failed", task.exception)
                        Toast.makeText(this, "Invalid email or password", Toast.LENGTH_SHORT).show()
                    }
                }
        }
    }
}