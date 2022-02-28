package com.example.datacollection

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.datacollection.toolman.Tambaht
import kotlinx.android.synthetic.main.activity_laporan.*

class Laporan : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_laporan)


    txt_data.setOnClickListener {
        val intent = Intent(this, databarang::class.java)
        startActivity(intent)
    }

    rwyt.setOnClickListener {
        val intent = Intent(this, databarang::class.java)
        startActivity(intent)
    }

    txt_rwyt.setOnClickListener {
        val intent = Intent(this, Riwayat::class.java)
        startActivity(intent)
    }

    toolman.setOnClickListener {
        val intent = Intent(this, Tambaht::class.java)
        startActivity(intent)
    }

    txt_toolman.setOnClickListener {
        val intent = Intent(this, Tambaht::class.java)
        startActivity(intent)
    }

    }
}
