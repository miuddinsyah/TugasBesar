package com.example.tugasbesar

import android.widget.EditText
import android.widget.Switch
import androidx.constraintlayout.widget.ConstraintLayout

class ActivityHalamanawallBinding private constructor(
    rootView: ConstraintLayout
) {
    val switch1: Switch = rootView.findViewById(R.id.switch1)
    val tanggalPulang: EditText = rootView.findViewById(R.id.tanggalPulang)
    val tanggalPergi: EditText = rootView.findViewById(R.id.tanggalPergi)

    fun setOnCheckedChangeListener(listener: (isChecked: Boolean) -> Unit) {
        switch1.setOnCheckedChangeListener { _, isChecked -> listener.invoke(isChecked) }
    }

    fun setTanggalPergiClickListener(listener: () -> Unit) {
        tanggalPergi.setOnClickListener { listener.invoke() }
    }

    fun setTanggalPulangClickListener(listener: () -> Unit) {
        tanggalPulang.setOnClickListener { listener.invoke() }
    }

    companion object {
        fun bind(rootView: ConstraintLayout): ActivityHalamanawallBinding {
            return ActivityHalamanawallBinding(rootView)
        }
    }
}

