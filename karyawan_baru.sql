-- phpMyAdmin SQL Dump
-- version 4.4.14
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 05 Des 2023 pada 02.48
-- Versi Server: 5.6.26
-- PHP Version: 5.6.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_karyawan`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `karyawan_baru`
--

CREATE TABLE IF NOT EXISTS `karyawan_baru` (
  `Nama` varchar(255) NOT NULL,
  `NIK` varchar(255) NOT NULL,
  `Jenis Kelamin` varchar(255) NOT NULL,
  `Jabatan` varchar(255) NOT NULL,
  `Umur` int(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `karyawan_baru`
--

INSERT INTO `karyawan_baru` (`Nama`, `NIK`, `Jenis Kelamin`, `Jabatan`, `Umur`) VALUES
('Abe Sibarani', '82734237462', 'Laki-laki', 'Tester', 22);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
