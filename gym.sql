-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 09, 2022 at 01:44 PM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `gym`
--

-- --------------------------------------------------------

--
-- Table structure for table `client_member`
--

CREATE TABLE `client_member` (
  `C_ID` int(11) NOT NULL,
  `C_Fname` varchar(100) NOT NULL,
  `C_Lname` varchar(100) NOT NULL,
  `C_Age` int(11) NOT NULL,
  `C_Address` varchar(100) NOT NULL,
  `C_Gender` varchar(15) NOT NULL,
  `C_ContactNUmber` int(11) NOT NULL,
  `C_Email` varchar(50) NOT NULL,
  `C_Password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `group_fitness_classes`
--

CREATE TABLE `group_fitness_classes` (
  `FC_ID` int(11) NOT NULL,
  `FloorNum` int(11) NOT NULL,
  `Class_Session_Start` int(11) NOT NULL,
  `Class_Session_End` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `instructor`
--

CREATE TABLE `instructor` (
  `Ins_ID` int(11) NOT NULL,
  `Ins_Fname` varchar(100) NOT NULL,
  `Ins_Lname` varchar(100) NOT NULL,
  `Ins_ContactNumber` int(11) NOT NULL,
  `Ins_Email` varchar(100) NOT NULL,
  `Ins_Password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `membership_type`
--

CREATE TABLE `membership_type` (
  `M_ID` int(11) NOT NULL,
  `M_Name` varchar(100) NOT NULL,
  `M_StartPeriod` date NOT NULL,
  `M_EndPeriod` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `payment`
--

CREATE TABLE `payment` (
  `Pay_ID` int(11) NOT NULL,
  `Date` date NOT NULL,
  `Amount` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `schedule`
--

CREATE TABLE `schedule` (
  `Session_Type` varchar(50) NOT NULL,
  `Date` date NOT NULL,
  `Time_Start` time NOT NULL,
  `Time_End` time NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `client_member`
--
ALTER TABLE `client_member`
  ADD UNIQUE KEY `C_ID` (`C_ID`);

--
-- Indexes for table `group_fitness_classes`
--
ALTER TABLE `group_fitness_classes`
  ADD UNIQUE KEY `FC_ID` (`FC_ID`);

--
-- Indexes for table `instructor`
--
ALTER TABLE `instructor`
  ADD UNIQUE KEY `Ins_ID` (`Ins_ID`);

--
-- Indexes for table `membership_type`
--
ALTER TABLE `membership_type`
  ADD UNIQUE KEY `M_ID` (`M_ID`);

--
-- Indexes for table `payment`
--
ALTER TABLE `payment`
  ADD UNIQUE KEY `Pay_ID` (`Pay_ID`);

--
-- Indexes for table `schedule`
--
ALTER TABLE `schedule`
  ADD UNIQUE KEY `Session_Type` (`Session_Type`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
