<?php

namespace App\Http\Controllers;

use App\Toolman;
use Illuminate\Http\Request;

class ToolmanController extends Controller
{
    /**
     * Display a listing of the resource.
     *
     * @return \Illuminate\Http\Response
     */
    public function index()
    {
        return Toolman::all();
    }

    /**
     * Show the form for creating a new resource.
     *
     * @return \Illuminate\Http\Response
     */
    public function create()
    {
        
    }

    /**
     * Store a newly created resource in storage.
     *
     * @param  \Illuminate\Http\Request  $request
     * @return \Illuminate\Http\Response
     */
    public function store(Request $request)
    {
        $data = new Toolman();
        $data->nama = $request->nama;
        $data->password = $request->password;
        $data->jenis_kelamin = $request->jenis_kelamin;
        $data->tanggal = $request->tanggal;
        $data->jurusan = $request->jurusan;

        $data->save();

        return "Data Berhasil di tambah";
    }

    /**
     * Display the specified resource.
     *
     * @param  \App\Toolman  $toolman
     * @return \Illuminate\Http\Response
     */
    public function show(Toolman $toolman)
    {
        //
    }

    /**
     * Show the form for editing the specified resource.
     *
     * @param  \App\Toolman  $toolman
     * @return \Illuminate\Http\Response
     */
    public function edit(Toolman $toolman)
    {
        //
    }

    /**
     * Update the specified resource in storage.
     *
     * @param  \Illuminate\Http\Request  $request
     * @param  \App\Toolman  $toolman
     * @return \Illuminate\Http\Response
     */
    public function update(Request $request, Toolman $toolman)
    {
        //
    }

    /**
     * Remove the specified resource from storage.
     *
     * @param  \App\Toolman  $toolman
     * @return \Illuminate\Http\Response
     */
    public function destroy(Toolman $toolman)
    {
        //
    }
}
