<?php

namespace App;

use Illuminate\Database\Eloquent\Model;

class Peminjaman extends Model
{
    Protected $table = "peminjamans" ;
    Protected $primarykey = 'id_pinjam';
    Protected $fillable = ['id_barang','jumlah','produsen', 'ruangan', 'tanggal', 'keterangan'];
}
