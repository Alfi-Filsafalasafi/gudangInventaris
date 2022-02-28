package com.example.datacollection.Barang

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiBarang {
    private val BASE_URL = "http://localhost:8000/api/barang"
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
