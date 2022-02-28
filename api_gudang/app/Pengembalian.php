<?php

namespace App;

use Illuminate\Database\Eloquent\Model;

class Pengembalian extends Model
{
    Protected $table = "pengembalians" ;
    Protected $primarykey = 'id_pengembalian';
    Protected $fillable = ['id_pengembalian','id_pinjam','jumlah','tanggal'];
}
