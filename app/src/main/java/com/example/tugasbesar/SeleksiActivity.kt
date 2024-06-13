package com.example.tugasbesar
import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.tugasbesar.databinding.ActivityHalamanawallBinding

class SeleksiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_seleksi)

        val airasia: ImageView = findViewById(R.id.imageView1AA)

        airasia.setOnClickListener {
            // Create an Intent to navigate to LoginActivity
            val intent = Intent(this, Trip::class.java)

            // Start the LoginActivity
            startActivity(intent)
        }

    }

}
