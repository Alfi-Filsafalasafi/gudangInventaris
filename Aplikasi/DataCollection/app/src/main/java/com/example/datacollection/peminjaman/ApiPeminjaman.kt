package com.example.datacollection.peminjaman

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiPeminjaman {
    private val BASE_URL = "http://localhost:8000/api/peminjaman"
    private var retrofit: Retrofit? = null

    internal val apiBarang: Retrofit
        get() {
            if (retrofit == null) {
                retrofit = Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
            }
            return retrofit
        }
}
