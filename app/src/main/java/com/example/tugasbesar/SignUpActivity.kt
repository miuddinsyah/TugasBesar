package com.example.tugasbesar

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class SignUpActivity : AppCompatActivity() {

    private val THIRD_ACTIVITY_TAG = "REGISTER"
    private lateinit var Username: EditText
    private lateinit var email: EditText
    private lateinit var password: EditText
    private lateinit var TTL: EditText
    private lateinit var auth: FirebaseAuth
    private lateinit var database: DatabaseReference


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        Log.e(THIRD_ACTIVITY_TAG, "REGISTER PAGE")

        Username = findViewById(R.id.editTextUsername)
        email = findViewById(R.id.editTextisiemail)
        password = findViewById(R.id.editTextisipassword)
        TTL = findViewById(R.id.editTextTTL)

        auth = FirebaseAuth.getInstance()
        database = FirebaseDatabase.getInstance().reference

        val registerButton = findViewById<Button>(R.id.btnSignUp)

        registerButton.setOnClickListener{
            registerUser()
        }
    }

    private fun registerUser() {
        val email = email.text.toString().trim()
        val password = password.text.toString().trim()

        if (email.isEmpty()) {
            Toast.makeText(this, "Masukkan email", Toast.LENGTH_SHORT).show()
            return
        }

        if (password.isEmpty()) {
            Toast.makeText(this, "Masukkan password", Toast.LENGTH_SHORT).show()
            return
        }

        auth.createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    // Daftar Berhasil
                    Toast.makeText(this, "Registrasi Berhasil", Toast.LENGTH_SHORT).show()
                    val intent = Intent(this,LoginActivity::class.java)
                    startActivity(intent)
                    finish()
                } else {
                    //Daftar Gagal
                    Toast.makeText(this, "Registrasi Gagal: ${task.exception?.message}", Toast.LENGTH_SHORT).show()
                }
            }
    }
}
