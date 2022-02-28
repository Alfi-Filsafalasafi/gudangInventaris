package com.example.datacollection.Barang

import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

import com.example.datacollection.JsonPlaceHolderApi
import com.example.datacollection.R

import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class TambahBarang : AppCompatActivity() {

    private var EdtNama: EditText? = null
    private var EdtJmlBaik: EditText? = null
    private var EdtJmlBuruk: EditText? = null
    private var EdtMerk: EditText? = null
    private var EdtTanggal: EditText? = null
    private val EdtNaa: TextView? = null
    private var jsonPlaceHolderApi: JsonPlaceHolderApi? = null
    private var BtnTambah: Button? = null

    private var namaku: String? = null
    private var merk: String? = null
    private var jumlah_baik: Int = 0
    private var jumlah_buruk: Int = 0
    private val total: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tambahanb)

        EdtNama = findViewById(R.id.EdtNama)
        EdtMerk = findViewById(R.id.EdtMerk)
        EdtJmlBaik = findViewById(R.id.EdtJmlBaik)
        EdtJmlBuruk = findViewById(R.id.EdtJmlBuruk)
        EdtTanggal = findViewById(R.id.EdtTanggal)


        BtnTambah = findViewById(R.id.BtnTambah)

        val retrofit = Retrofit.Builder()
            .baseUrl("http://127.0.0.1:8000/api/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        jsonPlaceHolderApi = retrofit.create(JsonPlaceHolderApi::class.java)

        BtnTambah!!.setOnClickListener { createPost() }

    }

    private fun createPost() {

        namaku = EdtNama!!.text.toString()
        merk = EdtMerk!!.text.toString()
        jumlah_baik = Integer.parseInt(EdtJmlBaik!!.text.toString())
        jumlah_buruk = Integer.parseInt(EdtJmlBuruk!!.text.toString())

        val postbarang =
            PostBarang(namaku!!, merk!!, jumlah_baik, jumlah_buruk, jumlah_baik + jumlah_buruk)
        val call = jsonPlaceHolderApi!!.createdPost(postbarang)
        call.enqueue(object : Callback<PostBarang> {
            override fun onResponse(call: Call<PostBarang>, response: Response<PostBarang>) {
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
                    "Data Barang = " + postResponse!!.nama_barang + "Berhasil di tambah",
                    Toast.LENGTH_SHORT
                ).show()

            }

            override fun onFailure(call: Call<PostBarang>, t: Throwable) {
                Toast.makeText(this@TambahBarang, "" + t.message, Toast.LENGTH_SHORT).show()
            }
        })
    }
}
