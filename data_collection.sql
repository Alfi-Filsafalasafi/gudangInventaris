-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 13 Apr 2020 pada 13.25
-- Versi Server: 10.1.30-MariaDB
-- PHP Version: 5.6.33

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `data_collection`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `barangs`
--

CREATE TABLE `barangs` (
  `id_barang` int(11) NOT NULL,
  `nama_barang` varchar(50) NOT NULL,
  `merk` varchar(50) NOT NULL,
  `jumlah_baik` int(11) NOT NULL,
  `jumlah_buruk` int(11) NOT NULL,
  `total` int(11) NOT NULL,
  `created_at` date NOT NULL,
  `updated_at` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `barangs`
--

INSERT INTO `barangs` (`id_barang`, `nama_barang`, `merk`, `jumlah_baik`, `jumlah_buruk`, `total`, `created_at`, `updated_at`) VALUES
(1, 'Mouse', 'Logitech', 11, 2, 13, '0000-00-00', '0000-00-00'),
(2, 'Headset', 'Pioneer', 9, 4, 13, '0000-00-00', '0000-00-00'),
(5, 'Camera', 'Canon', 3, 0, 3, '0000-00-00', '0000-00-00'),
(7, 'Tripod', 'Manfrotto', 1, 0, 1, '0000-00-00', '0000-00-00'),
(8, 'Laptop', 'acer', 2, 0, 2, '2020-04-11', '2020-04-11');

-- --------------------------------------------------------

--
-- Struktur dari tabel `peminjamans`
--

CREATE TABLE `peminjamans` (
  `id_pinjam` int(11) NOT NULL,
  `id_barang` int(11) NOT NULL,
  `jumlah` int(11) NOT NULL,
  `produsen` varchar(50) NOT NULL,
  `ruangan` varchar(20) NOT NULL,
  `tanggal` date NOT NULL,
  `keterangan` varchar(50) NOT NULL,
  `created_at` date NOT NULL,
  `updated_at` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `peminjamans`
--

INSERT INTO `peminjamans` (`id_pinjam`, `id_barang`, `jumlah`, `produsen`, `ruangan`, `tanggal`, `keterangan`, `created_at`, `updated_at`) VALUES
(1, 1, 2, 'Izzatul Afkarinah', 'D204', '2020-03-25', 'Sudah kembali', '0000-00-00', '0000-00-00'),
(2, 2, 2, 'Febyanti Elia U.I', 'Lab', '2020-03-26', 'Sudah kembali', '0000-00-00', '0000-00-00'),
(5, 5, 2, 'Anggun K.O', 'D203', '2020-03-27', 'Belum Kembali', '0000-00-00', '0000-00-00'),
(6, 7, 1, 'Alfi Filsafalasafi', 'D204', '2020-03-28', 'Sudah kembali', '0000-00-00', '0000-00-00'),
(7, 3, 12, 'Triwiyanti', 'D303', '2020-04-09', 'Sudah Kembali', '2020-04-11', '2020-04-11');

-- --------------------------------------------------------

--
-- Struktur dari tabel `pengembalians`
--

CREATE TABLE `pengembalians` (
  `id_pengembalian` int(11) NOT NULL,
  `id_pinjam` int(11) NOT NULL,
  `jumlah` int(11) NOT NULL,
  `tanggal` date NOT NULL,
  `updated_at` date NOT NULL,
  `created_at` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `pengembalians`
--

INSERT INTO `pengembalians` (`id_pengembalian`, `id_pinjam`, `jumlah`, `tanggal`, `updated_at`, `created_at`) VALUES
(1, 1, 2, '2020-03-29', '0000-00-00', '0000-00-00'),
(2, 2, 2, '2020-03-30', '0000-00-00', '0000-00-00'),
(3, 6, 1, '2020-03-31', '0000-00-00', '0000-00-00'),
(4, 1, 2, '0000-00-00', '0000-00-00', '0000-00-00'),
(5, 1, 2, '2020-03-14', '0000-00-00', '0000-00-00'),
(7, 1, 2, '0000-00-00', '2020-04-11', '2020-04-11'),
(8, 2, 11, '2010-11-12', '2020-04-10', '2020-04-10'),
(9, 1, 121, '0000-00-00', '2020-04-11', '2020-04-11'),
(10, 1, 121, '2020-03-03', '2020-04-11', '2020-04-11');

-- --------------------------------------------------------

--
-- Struktur dari tabel `toolmans`
--

CREATE TABLE `toolmans` (
  `id_toolman` int(11) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `password` varchar(30) NOT NULL,
  `jenis_kelamin` varchar(15) NOT NULL,
  `tanggal` date NOT NULL,
  `jurusan` varchar(50) NOT NULL,
  `created_at` date NOT NULL,
  `updated_at` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `toolmans`
--

INSERT INTO `toolmans` (`id_toolman`, `nama`, `password`, `jenis_kelamin`, `tanggal`, `jurusan`, `created_at`, `updated_at`) VALUES
(1, 'Pak Eric', '12345678', 'Laki-Laki', '2020-03-14', 'Rekayasa Perangkat Lunak', '0000-00-00', '0000-00-00'),
(2, 'Pak Agus', '8888888', 'Laki_laki', '2020-03-15', 'Teknik Komputer Jaringan', '0000-00-00', '0000-00-00'),
(5, 'Pak Arif', '45678967', 'Laki-:Laki', '2020-03-17', 'Multimedia', '0000-00-00', '0000-00-00'),
(6, 'Bu Veny', '76654389', 'Perempuan', '2020-03-18', 'Rekayasa Perangkat Lunak', '0000-00-00', '0000-00-00'),
(7, 'Pak Arifin', 'arifin', 'Laki_laki', '2020-04-01', 'APHP', '2020-04-11', '2020-04-11');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `barangs`
--
ALTER TABLE `barangs`
  ADD PRIMARY KEY (`id_barang`);

--
-- Indexes for table `peminjamans`
--
ALTER TABLE `peminjamans`
  ADD PRIMARY KEY (`id_pinjam`);

--
-- Indexes for table `pengembalians`
--
ALTER TABLE `pengembalians`
  ADD PRIMARY KEY (`id_pengembalian`);

--
-- Indexes for table `toolmans`
--
ALTER TABLE `toolmans`
  ADD PRIMARY KEY (`id_toolman`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `barangs`
--
ALTER TABLE `barangs`
  MODIFY `id_barang` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `peminjamans`
--
ALTER TABLE `peminjamans`
  MODIFY `id_pinjam` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `pengembalians`
--
ALTER TABLE `pengembalians`
  MODIFY `id_pengembalian` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `toolmans`
--
ALTER TABLE `toolmans`
  MODIFY `id_toolman` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
