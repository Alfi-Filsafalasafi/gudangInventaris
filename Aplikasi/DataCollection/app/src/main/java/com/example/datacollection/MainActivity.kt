package com.example.datacollection

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rprt.setOnClickListener {
            val intent = Intent (this, Laporan::class.java)
            startActivity(intent)
        }

        trnsks.setOnClickListener {
            val intent = Intent(this, Transaksi::class.java)
            startActivity(intent)
        }
//
        keluar.setOnClickListener {
            val intent = Intent( this, Login::class.java)
            startActivity(intent)
        }

    }
}
