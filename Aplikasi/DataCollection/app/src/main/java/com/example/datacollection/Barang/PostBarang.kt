package com.example.datacollection.Barang

class PostBarang(
    val nama_barang: String,
    val merk: String,
    val jumlah_baik: Int,
    val jumlah_buruk: Int,
    val total: Int
) {

    private val id_barang: Int? = null

    val created_at: String? = null

    val updated_at: String? = null

    fun getId_barang(): Int {
        return id_barang!!
    }


}
