package com.example.datacollection

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.datacollection.Barang.TambahBarang
import com.example.datacollection.Barang.Tambahanb
import com.example.datacollection.peminjaman.Peminjaman
import com.example.datacollection.peminjaman.TambahPeminjaman
import com.example.datacollection.pengembalian.Pengembalian
import com.example.datacollection.pengembalian.TambahPengembalian
import com.example.datacollection.toolman.TambahToolman
import com.example.datacollection.toolman.tool
import kotlinx.android.synthetic.main.activity_transaksi.*

class Transaksi : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transaksi)

        pnjm.setOnClickListener {
            val intent = Intent (this, TambahPeminjaman::class.java)
            startActivity(intent)
        }

        kmbli.setOnClickListener {
            val intent = Intent( this, TambahPengembalian::class.java)
            startActivity(intent)
        }

        txt_pnjm.setOnClickListener {
            val intent = Intent ( this, TambahPeminjaman::class.java)
            startActivity(intent)
        }

        txt_kmbli.setOnClickListener {
            val intent = Intent(this, TambahPengembalian::class.java)
            startActivity(intent)
        }

        tmbh.setOnClickListener {
            val intent = Intent(this, TambahBarang::class.java)
            startActivity(intent)
        }

        txt_tmbh.setOnClickListener {
            val intent = Intent(this, TambahBarang::class.java)
            startActivity(intent)
        }

        pengeluaran.setOnClickListener {
            val intent = Intent(this, Pengeluaran::class.java)
            startActivity(intent)
        }

        txt_pengeluaran.setOnClickListener {
            val intent = Intent(this, Pengeluaran::class.java)
            startActivity(intent)
        }

            txt_tmbhtoolman.setOnClickListener {
                val intent = Intent(this, TambahToolman::class.java)
                startActivity(intent)
            }
    }
}
