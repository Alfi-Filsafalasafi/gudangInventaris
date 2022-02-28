package com.example.datacollection.pengembalian

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

import androidx.appcompat.app.AppCompatActivity

import com.example.datacollection.JsonPlaceHolderApi
import com.example.datacollection.R
import com.example.datacollection.toolman.PostToolman

import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class TambahPengembalian : AppCompatActivity() {
    private var IDPinjam: Int = 0
    private var jumlah: Int = 0
    private var tanggal: String? = null

    private var edtIDPinjam: EditText? = null
    private var edtjumlah: EditText? = null
    private var edtTanggal: EditText? = null
    private var jsonPlaceHolderApi: JsonPlaceHolderApi? = null
    private var btnTambah: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pengembalian)

        edtIDPinjam = findViewById(R.id.EdtIDPinjam)
        edtjumlah = findViewById(R.id.EdtJumlah)
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

        jumlah = Integer.parseInt(edtjumlah!!.text.toString())
        IDPinjam = Integer.parseInt(edtIDPinjam!!.text.toString())
        tanggal = edtTanggal!!.text.toString()


        val postPengembalian = PostPengembalian(IDPinjam, jumlah, tanggal)
        val call = jsonPlaceHolderApi!!.createdPost(postPengembalian)
        call.enqueue(object : Callback<PostPengembalian> {
            override fun onResponse(
                call: Call<PostPengembalian>,
                response: Response<PostPengembalian>
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
                    "Data ID Pinjam = " + postResponse!!.id_pinjam + "Berhasil dikembalikan",
                    Toast.LENGTH_SHORT
                ).show()

            }

            override fun onFailure(call: Call<PostPengembalian>, t: Throwable) {
                Toast.makeText(this@TambahPengembalian, "" + t.message, Toast.LENGTH_SHORT).show()
            }
        })
    }
}
