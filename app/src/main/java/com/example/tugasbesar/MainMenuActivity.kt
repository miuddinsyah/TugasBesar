package com.example.tugasbesar

import android.app.DatePickerDialog
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.DatePicker
import android.widget.EditText
import android.widget.Switch
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import java.util.*
import com.example.tugasbesar.databinding.ActivityHalamanawallBinding

class MainMenuActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHalamanawallBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityHalamanawallBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val button = findViewById<Button>(R.id.button)
        val switchPulangPergi: Switch = binding.switch1
        val tanggalPulang: EditText = binding.tanggalPulang
        val tanggalPergi: EditText = binding.tanggalPergi
        tanggalPulang.visibility = View.GONE
        switchPulangPergi.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                tanggalPulang.visibility = View.GONE
            } else {
                tanggalPulang.visibility = View.VISIBLE
            }
        }

        val datepergiListener = DatePickerDialog.OnDateSetListener { _, year, month, day ->
            val calendar = Calendar.getInstance()
            calendar.set(year, month, day)
            val selectedDate = "${day}/${month + 1}/${year}"
            tanggalPergi.setText(selectedDate)
        }
        val datepulangListener = DatePickerDialog.OnDateSetListener { _, year, month, day ->
            val calendar = Calendar.getInstance()
            calendar.set(year, month, day)
            val selectedDate = "${day}/${month + 1}/${year}"
            tanggalPulang.setText(selectedDate)
        }

        tanggalPergi.setOnClickListener {
            val calendar = Calendar.getInstance()
            DatePickerDialog(
                this,
                datepergiListener,
                calendar.get(Calendar.YEAR),
                calendar.get(Calendar.MONTH),
                calendar.get(Calendar.DAY_OF_MONTH)
            ).show()
        }

        tanggalPulang.setOnClickListener {
            val calendar = Calendar.getInstance()
            DatePickerDialog(
                this,
                datepulangListener,
                calendar.get(Calendar.YEAR),
                calendar.get(Calendar.MONTH),
                calendar.get(Calendar.DAY_OF_MONTH)
            ).show()
        }
        button.setOnClickListener {
            // Create an Intent to navigate to LoginActivity
            val intent = Intent(this, SeleksiActivity::class.java)

            // Start the LoginActivity
            startActivity(intent)
        }
    }

}