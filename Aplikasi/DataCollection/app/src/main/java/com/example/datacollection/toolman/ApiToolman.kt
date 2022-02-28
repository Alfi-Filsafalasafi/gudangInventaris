package com.example.datacollection.toolman

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiToolman {
    private val BASE_URL = "http://localhost:8000/api/toolman"
    private var retrofit: Retrofit? = null

    internal val apiToolman: Retrofit
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
