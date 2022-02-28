package com.example.datacollection.toolman

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

class TambahToolman : AppCompatActivity() {

    private var EdtNama: EditText? = null
    private var EdtPass: EditText? = null
    private var EdtJK: EditText? = null
    private var Edttanggal: EditText? = null
    private var EdtJurusan: EditText? = null

    private var jsonPlaceHolderApi: JsonPlaceHolderApi? = null
    private var BtnTambah: Button? = null

    private var namaku: String? = null
    private var password: String? = null
    private var jenis_kelamin: String? = null
    private var tanggal: String? = null
    private var jurusan: String? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tool)

        EdtNama = findViewById(R.id.EdtNama)
        EdtPass = findViewById(R.id.EdtPassword)
        EdtJK = findViewById(R.id.EdtJK)
        Edttanggal = findViewById(R.id.EdtTanggal)
        EdtJurusan = findViewById(R.id.EdtJurusan)


        BtnTambah = findViewById(R.id.BtnTambahTool)

        val retrofit = Retrofit.Builder()
            .baseUrl("http://127.0.0.1:8000/api/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        jsonPlaceHolderApi = retrofit.create(JsonPlaceHolderApi::class.java)

        BtnTambah!!.setOnClickListener { createPost() }

    }

    private fun createPost() {

        namaku = EdtNama!!.text.toString()
        password = EdtPass!!.text.toString()
        jenis_kelamin = EdtJK!!.text.toString()
        tanggal = Edttanggal!!.text.toString()
        jurusan = EdtJurusan!!.text.toString()

        val postToolman = PostToolman(namaku, password, jenis_kelamin, tanggal, jurusan)
        val call = jsonPlaceHolderApi!!.createdPost(postToolman)
        call.enqueue(object : Callback<PostToolman> {
            override fun onResponse(call: Call<PostToolman>, response: Response<PostToolman>) {
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
                    "Data Barang = " + postResponse!!.nama + "Berhasil di tambah",
                    Toast.LENGTH_SHORT
                ).show()

            }

            override fun onFailure(call: Call<PostToolman>, t: Throwable) {
                Toast.makeText(this@TambahToolman, "" + t.message, Toast.LENGTH_SHORT).show()
            }
        })
    }
}

