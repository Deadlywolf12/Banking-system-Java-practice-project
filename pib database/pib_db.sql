-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 11, 2023 at 11:51 AM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `pib_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `card`
--

CREATE TABLE `card` (
  `id` int(11) NOT NULL,
  `cardNum` int(11) NOT NULL,
  `cardTitle` varchar(256) NOT NULL,
  `cardCvc` int(11) NOT NULL,
  `cardType` varchar(256) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `card`
--

INSERT INTO `card` (`id`, `cardNum`, `cardTitle`, `cardCvc`, `cardType`) VALUES
(1, 614701292, 'jason', 140, 'Visa'),
(2, 69817975, 'deadly', 639, 'Visa'),
(4, 377517730, 'HARRY', 679, 'Visa');

-- --------------------------------------------------------

--
-- Table structure for table `pib_data`
--

CREATE TABLE `pib_data` (
  `u_Name` varchar(256) DEFAULT NULL,
  `password` varchar(256) DEFAULT NULL,
  `balance` varchar(11) DEFAULT NULL,
  `cardStatus` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `pib_data`
--

INSERT INTO `pib_data` (`u_Name`, `password`, `balance`, `cardStatus`) VALUES
('jason', '[1, 2, 3, 1, 2, 3, 1, 2, 3]', '31', 1),
('deadly', '[1, 2, 3, 1, 2, 3, 1, 2, 3]', '800', 0),
('harry', '[1, 2, 3, 1, 2, 3, 1, 2, 3]', '2300', 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `card`
--
ALTER TABLE `card`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `cardNum` (`cardNum`),
  ADD UNIQUE KEY `cardCvc` (`cardCvc`);

--
-- Indexes for table `pib_data`
--
ALTER TABLE `pib_data`
  ADD UNIQUE KEY `name` (`u_Name`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `card`
--
ALTER TABLE `card`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
