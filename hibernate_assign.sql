-- phpMyAdmin SQL Dump
-- version 4.0.9
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Nov 24, 2018 at 02:42 pm
-- Server version: 5.6.14
-- PHP Version: 5.5.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `hibernate_assign`
--

-- --------------------------------------------------------

--
-- Table structure for table `CustomerComb`
--

CREATE TABLE IF NOT EXISTS `CustomerComb` (
  `customerId` int(11) NOT NULL,
  `customerName` varchar(255) NOT NULL,
  `customerAddress` varchar(255) NOT NULL,
  `creditScore` int(11) NOT NULL,
  `rewardPoints` int(11) NOT NULL,
  PRIMARY KEY (`customerId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `CustomerComb`
--

INSERT INTO `CustomerComb` (`customerId`, `customerName`, `customerAddress`, `creditScore`, `rewardPoints`) VALUES
(0, 'Someone', 'H no 1234, Street abc, City blank', 7, 6),
(1, 'abc', 'H no 1234, Street abc, City blank', 1, 2),
(2, 'b', 'H no 1234, Street abc, City blank', 4, 3);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
