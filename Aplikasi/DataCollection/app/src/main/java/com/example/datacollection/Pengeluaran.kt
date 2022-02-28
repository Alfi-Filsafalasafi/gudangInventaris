package com.example.datacollection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_pengeluaran.*

class Pengeluaran : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pengeluaran)

        btnKeluarkan.setOnClickListener {
            Toast.makeText(this, "Koneksi Gagal", Toast.LENGTH_SHORT).show();
        }
    }
}
