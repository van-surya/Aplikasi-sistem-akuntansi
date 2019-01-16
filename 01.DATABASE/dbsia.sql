-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 16, 2019 at 07:48 PM
-- Server version: 10.1.36-MariaDB
-- PHP Version: 7.2.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dbsia`
--

-- --------------------------------------------------------

--
-- Table structure for table `akun`
--

CREATE TABLE `akun` (
  `no_akun2` varchar(3) NOT NULL,
  `nama_akun2` varchar(50) NOT NULL,
  `no_akun1` varchar(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `akun`
--

INSERT INTO `akun` (`no_akun2`, `nama_akun2`, `no_akun1`) VALUES
('111', 'KAS', '1'),
('112', 'PERSEDIAAN BARANG DAGANG KOPERASI', '1'),
('113', 'PERSEDIAAN PERLENGKAPAN KOPERASI', '1'),
('114', 'PERSEDIAAN PERLENGKAPAN RUANG GURU', '1'),
('115', 'PERSEDIAAN PERLENGKAPAN RUANG KOMPUTER', '1'),
('116', 'PERSEDIAAN PERLENGKAPAN LAB PRAKTIK', '1'),
('117', 'PERSEDIAAN PERLENGKAPAN OLAHRAGA', '1'),
('118', 'PERSEKOT BIAYA ASSURANSI SISWA', '1'),
('119', 'PERSEKOT BIAYA ASSURANSI GURU & TU', '1'),
('121', 'AKUM. PENYUSUTAN KENDARAAN', '1'),
('122', 'PERALATAN RUANG GURU', '1'),
('123', 'PERALATAN RUANG KOMPUTER', '1'),
('124', 'PERALATAN LAB PRAKTIK', '1'),
('125', 'PERALATAN OLAHRAGA', '1'),
('126', 'AKUM. PENYUSUTAN PERALATAN RUANG GURU', '1'),
('127', 'AKUM. PENYUSUTAN PERALATAN RUANG KOMPUTER', '1'),
('128', 'AKUM. PENYUSUTAN PERALATAN LAB PRAKTIK', '1'),
('129', 'AKUM. PENYUSUTAN PERALATAN OLAHRAGA', '1'),
('211', 'HUTANG DAGANG KOPERASI', '2'),
('311', 'MODAL', '2'),
('312', 'PRIVE', '3'),
('411', 'PENJUALAN KOPERASI', '4'),
('412', 'POTONGAN PENJUALAN', '4'),
('413', 'BIAYA ANGKUT PENJUALAN', '4'),
('414', 'RETUR PENJUALAN', '4'),
('511', 'PEMBELIAN', '5'),
('512', 'POTONGAN PEMBELIAN', '5'),
('513', 'RETUR PEMBELIAN', '5'),
('514', 'BIAYA ANGKUT PEMBELIAN', '5'),
('611', 'BIAYA GAJI GURU', '6'),
('612', 'BIAYA GAJI TU', '6'),
('613', 'BIAYA GAJI TUKANG KEBUN', '6'),
('614', 'BIAYA LISTRIK', '6'),
('615', 'BIAYA TELEPON', '6'),
('616', 'BIAYA AIR', '6'),
('617', 'BIAYA ASURANSI', '6'),
('618', 'BIAYA REPARASI PERALATAN DAN GEDUNG', '6'),
('620', 'BIAYA PENYUSUTAN KENDARAAN', '6'),
('621', 'BIAYA PENYUSUTAN PERALATAN RUANG GURU', '6'),
('622', 'BIAYA PENYUSUTAN PERALATAN RUANG KOMPUTER', '6'),
('623', 'BIAYA PENYUSUTAN PERALATAN LAB PRAKTIK', '6'),
('624', 'BIAYA PENYUSUTAN PERALATAN OLAHRAGA', '6'),
('625', 'BIAYA PERLENGKAPAN KOPERASI', '6'),
('626', 'BIAYA PERLENGKAPAN RUANG GURU', '6'),
('627', 'BIAYA PERLENGKAPAN RUANG KOMPUTER', '6'),
('628', 'BIAYA PERLENGKAPAN LAB PRAKTIK', '6'),
('629', 'BIAYA PERLENGKAPAN OLAHRAGA', '6');

-- --------------------------------------------------------

--
-- Table structure for table `golongan`
--

CREATE TABLE `golongan` (
  `no_akun1` varchar(2) NOT NULL,
  `nama_akun1` varchar(50) NOT NULL,
  `kd_posisi` varchar(9) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `jurnal_umum`
--

CREATE TABLE `jurnal_umum` (
  `tgl` date NOT NULL,
  `ref` varchar(100) NOT NULL,
  `no_akun2` varchar(3) NOT NULL,
  `nama_akun2` varchar(50) NOT NULL,
  `debit` int(11) NOT NULL,
  `kredit` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `jurnal_umum`
--

INSERT INTO `jurnal_umum` (`tgl`, `ref`, `no_akun2`, `nama_akun2`, `debit`, `kredit`) VALUES
('2018-02-01', '', '111', 'kas', 125000000, 0),
('2018-02-02', '', '310', 'modal koprasi', 0, 1000000),
('2018-02-02', '', '311', 'modal utama', 0, 124000000),
('2018-02-02', '', '625', 'perlengkapan koprasi', 200000, 0),
('2018-02-02', '', '111', 'kas', 0, 200000),
('2018-03-22', '', '128', 'penyusutan peralatan lab', 1200000, 0),
('2018-03-22', '', '111', 'kas', 0, 1200000),
('2018-04-10', '', '613', 'beban gaji tukang kebun', 800000, 0),
('2018-04-10', '', '611', 'beban gaji guru', 2900000, 0),
('2018-04-10', '', '612', 'beban gaji tu', 1300000, 0),
('2018-04-10', '', '111', 'kas', 0, 400000),
('2018-04-11', '', '129', 'penyusutan peralatan olahraga', 250000, 0),
('2018-04-11', '', '111', 'kas', 0, 250000),
('2018-04-12', '', '312', 'prive', 400000, 0),
('2018-04-10', '', '111', 'kas', 0, 400000),
('2018-05-01', '', '413', 'angkut penjual koprasi', 50000, 0),
('2018-05-01', '', '629', 'perlengkapan olahraga', 300000, 0),
('2018-05-01', '', '111', 'kas', 0, 350000),
('2018-05-05', '', '111', 'kas', 0, 1000000),
('2018-05-17', '', '617', 'beban biaya asuransi', 5700000, 0),
('2018-05-17', '', '111', 'kas', 0, 5700000),
('2018-11-01', '', '411', 'penjualan koprasi', 1700000, 0),
('2018-11-01', '', '111', 'kas', 0, 1700000);

-- --------------------------------------------------------

--
-- Table structure for table `kelompok`
--

CREATE TABLE `kelompok` (
  `kd_posisi` varchar(4) NOT NULL,
  `nama_posisi` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `kelompok`
--

INSERT INTO `kelompok` (`kd_posisi`, `nama_posisi`) VALUES
('1', 'DEBET'),
('2', 'KREDIT'),
('3', 'KREDIT'),
('4', 'KREDIT'),
('5', 'DEBET'),
('6', 'DEBET'),
('7', 'KREDIT'),
('8', 'DEBET');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `akun`
--
ALTER TABLE `akun`
  ADD PRIMARY KEY (`no_akun2`);

--
-- Indexes for table `golongan`
--
ALTER TABLE `golongan`
  ADD PRIMARY KEY (`no_akun1`);

--
-- Indexes for table `kelompok`
--
ALTER TABLE `kelompok`
  ADD PRIMARY KEY (`kd_posisi`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
