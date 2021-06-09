-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Jun 09, 2021 at 03:15 PM
-- Server version: 10.4.17-MariaDB
-- PHP Version: 8.0.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `cateringJava`
--

-- --------------------------------------------------------

--
-- Table structure for table `menu_anakKost`
--

CREATE TABLE `menu_anakKost` (
  `id` int(11) NOT NULL,
  `hari` varchar(255) NOT NULL,
  `nama` varchar(255) NOT NULL,
  `jumlahKalori` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `menu_anakKost`
--

INSERT INTO `menu_anakKost` (`id`, `hari`, `nama`, `jumlahKalori`) VALUES
(2, 'hwheifhijij', 'Bintang', 'wrejif'),
(4, 'nwerfij', 'jjjowjeroj', 'rewk'),
(5, 'rijj', 'ijrwejj', 'rew');

-- --------------------------------------------------------

--
-- Table structure for table `transaksi`
--

CREATE TABLE `transaksi` (
  `nama` varchar(255) NOT NULL,
  `pilihPaket` varchar(255) NOT NULL,
  `durasiBerlangganan` varchar(255) NOT NULL,
  `metodePembayaran` varchar(255) NOT NULL,
  `id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `transaksi`
--

INSERT INTO `transaksi` (`nama`, `pilihPaket`, `durasiBerlangganan`, `metodePembayaran`, `id`) VALUES
('Bintang', 'Paket Bulking', 'Sebulan', 'GOPAY', 6),
('rger', 'Paket Diet', 'SeMinggu', 'OVO', 7),
('bintang', 'Paket Diet', 'SeMinggu', 'OVO', 8),
('bintang', 'Paket Diet', 'SeMinggu', 'OVO', 9);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `menu_anakKost`
--
ALTER TABLE `menu_anakKost`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `transaksi`
--
ALTER TABLE `transaksi`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `menu_anakKost`
--
ALTER TABLE `menu_anakKost`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `transaksi`
--
ALTER TABLE `transaksi`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
