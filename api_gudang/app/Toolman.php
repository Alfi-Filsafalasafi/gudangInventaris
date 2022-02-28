<?php

namespace App;

use Illuminate\Database\Eloquent\Model;

class Toolman extends Model
{
    Protected $table = "toolmans" ;
    Protected $primarykey = 'id_toolman';
    Protected $fillable = ['id_toolman','nama','password', 'jenis_kelamin', 'tanggal', 'jurusan'];
}
