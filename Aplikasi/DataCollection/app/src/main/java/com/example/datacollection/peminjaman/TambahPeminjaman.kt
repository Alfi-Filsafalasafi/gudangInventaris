package com.example.datacollection.peminjaman

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

import androidx.appcompat.app.AppCompatActivity

import com.example.datacollection.JsonPlaceHolderApi
import com.example.datacollection.R

import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class TambahPeminjaman : AppCompatActivity() {
    private var IDBarang: Int = 0
    private var jumlah: Int = 0
    private var produsen: String? = null
    private var ruangan: String? = null
    private var tanggal: String? = null
    private var keterangan: String? = null

    private var edtIDBarang: EditText? = null
    private var edtjumlah: EditText? = null
    private var edtProdusen: EditText? = null
    private var edtRuangan: EditText? = null
    private var edtTanggal: EditText? = null
    private val edtKeterangan: EditText? = null
    private var jsonPlaceHolderApi: JsonPlaceHolderApi? = null
    private var btnTambah: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_peminjaman)

        edtIDBarang = findViewById(R.id.EdtKodeBarang)
        edtjumlah = findViewById(R.id.EdtJumlah)
        edtProdusen = findViewById(R.id.EdtProdusen)
        edtRuangan = findViewById(R.id.EdtRuangan)
        edtTanggal = findViewById(R.id.EdtTanggal)

        btnTambah = findViewById(R.id.BtnTambah)

        val retrofit = Retrofit.Builder()
            .baseUrl("http://127.0.0.1:8000/api/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        jsonPlaceHolderApi = retrofit.create(JsonPlaceHolderApi::class.java)

        btnTambah!!.setOnClickListener { createPost() }


    }

    private fun createPost() {


        produsen = edtProdusen!!.text.toString()
        ruangan = edtKeterangan!!.text.toString()
        jumlah = Integer.parseInt(edtjumlah!!.text.toString())
        IDBarang = Integer.parseInt(edtIDBarang!!.text.toString())
        tanggal = edtTanggal!!.text.toString()
        keterangan = edtKeterangan.text.toString()

        val postPeminjaman =            PostPeminjaman(IDBarang, jumlah, produsen, ruangan, "2010-10-10", "Sudah Kembali")
        val call = jsonPlaceHolderApi!!.createdPost(postPeminjaman)
        call.enqueue(object : Callback<PostPeminjaman> {
            override fun onResponse(
                call: Call<PostPeminjaman>,
                response: Response<PostPeminjaman>
            ) {
                if (!response.isSuccessful) {
                    Toast.makeText(
                        applicationContext,
                        "Penambahan terhambat dengan code =  " + response.code(),
                        Toast.LENGTH_SHORT
                    ).show()
                }
                val postResponse = response.body()

                Toast.makeText(
                    applicationContext,
                    "Data ID Barang = " + postResponse!!.id_barang + "Berhasil dikembalikan",
                    Toast.LENGTH_SHORT
                ).show()

            }

            override fun onFailure(call: Call<PostPeminjaman>, t: Throwable) {
                Toast.makeText(this@TambahPeminjaman, "" + t.message, Toast.LENGTH_SHORT).show()
            }
        })
    }
}
