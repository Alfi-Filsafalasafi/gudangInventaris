<?php

namespace App\Http\Controllers;

use App\Pengembalian;
use Illuminate\Http\Request;

class PengembalianController extends Controller
{
    /**
     * Display a listing of the resource.
     *
     * @return \Illuminate\Http\Response
     */
    public function index()
    {
        return Pengembalian::all();
    }

    /**
     * Show the form for creating a new resource.
     *
     * @return \Illuminate\Http\Response
     */
    public function create(request $request)
    {
        $Pengembalian = new Pengembalian;
        $Pengembalian->id_pinjam = $request->id_pinjam;
        $Pengembalian->jumlah = $request->jumlah;
        $pengembalian->tanggal = $request->tanggal;
        $Pengembalian->save();

        return "Data Berhasil di tambah";
    }

    /**
     * Store a newly created resource in storage.
     *
     * @param  \Illuminate\Http\Request  $request
     * @return \Illuminate\Http\Response
     */
    public function store(Request $request)
    {
        $Pengembalian = new Pengembalian;
        $Pengembalian->id_pinjam = $request->id_pinjam;
        $Pengembalian->jumlah = $request->jumlah;
        $Pengembalian->tanggal = $request->tanggal;
        $Pengembalian->save();

        return "Data Berhasil di tambah";
    }

    /**
     * Display the specified resource.
     *
     * @param  \App\Pengembalian  $pengembalian
     * @return \Illuminate\Http\Response
     */
    public function show(Pengembalian $pengembalian)
    {
        //
    }

    /**
     * Show the form for editing the specified resource.
     *
     * @param  \App\Pengembalian  $pengembalian
     * @return \Illuminate\Http\Response
     */
    public function edit(Pengembalian $pengembalian)
    {
        //
    }

    /**
     * Update the specified resource in storage.
     *
     * @param  \Illuminate\Http\Request  $request
     * @param  \App\Pengembalian  $pengembalian
     * @return \Illuminate\Http\Response
     */
    public function update(Request $request, Pengembalian $pengembalian)
    {
        $id_pinjam = $request->id_pinjam;
        $jumlah = $request->jumlah;
        $tanggal = $request->tanggal;
        
        $pengembalian = Pengembalian::find($id_pengembalian);
        $pengembalian->id_pinjam = $id_pinjam;
        $pengembalian->jumlah = $jumlah;
        $pengembalian->tanggal = $tanggal;
        $pengembalian->save();

        return "Data berhasil di update";
    }

    /**
     * Remove the specified resource from storage.
     *
     * @param  \App\Pengembalian  $pengembalian
     * @return \Illuminate\Http\Response
     */
    public function destroy(Pengembalian $pengembalian)
    {
        //
    }
}
