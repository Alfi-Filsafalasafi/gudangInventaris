<?php

use Illuminate\Http\Request;

/*
|--------------------------------------------------------------------------
| API Routes
|--------------------------------------------------------------------------
|
| Here is where you can register API routes for your application. These
| routes are loaded by the RouteServiceProvider within a group which
| is assigned the "api" middleware group. Enjoy building your API!
|
*/

Route::middleware('auth:api')->get('/user', function (Request $request) {
    return $request->user();
});
Route::get('pengembalian', 'PengembalianController@index');
Route::post('/pengembalian', 'PengembalianController@store');
Route::get('peminjaman', 'PeminjamanController@index');
Route::post('/peminjaman', 'PeminjamanController@store');
Route::get('barang', 'BarangController@index');
Route::post('/barang', 'BarangController@store');
Route::get('toolman', 'ToolmanController@index');
Route::post('/toolman', 'ToolmanController@store');
