package com.example.datacollection

import com.example.datacollection.Barang.PostBarang
import com.example.datacollection.peminjaman.PostPeminjaman
import com.example.datacollection.pengembalian.PostPengembalian
import com.example.datacollection.toolman.PostToolman

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface JsonPlaceHolderApi {

    @POST("barang")
    fun createdPost(@Body post: PostBarang): Call<PostBarang>

    @POST("toolman")
    fun createdPost(@Body postToolman: PostToolman): Call<PostToolman>

    @POST("pengembalian")
    fun createdPost(@Body postPengembalian: PostPengembalian): Call<PostPengembalian>

    @POST("peminjaman")
    fun createdPost(@Body postPeminjaman: PostPeminjaman): Call<PostPeminjaman>
}