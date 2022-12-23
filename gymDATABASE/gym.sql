-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3325
-- Generation Time: Dec 23, 2022 at 06:38 AM
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
-- Table structure for table `attendance`
--

CREATE TABLE `attendance` (
  `ClientsNumber` int(11) NOT NULL,
  `C_ID` int(11) NOT NULL,
  `Username` varchar(100) NOT NULL,
  `Time in` varchar(50) NOT NULL,
  `Time out` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `attendance`
--

INSERT INTO `attendance` (`ClientsNumber`, `C_ID`, `Username`, `Time in`, `Time out`) VALUES
(1, 3, 'kevie', '12:18', '12:20'),
(2, 1, 'asd', '12:22', '12:22');

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
  `C_ContactNUmber` varchar(11) NOT NULL,
  `C_Username` varchar(50) NOT NULL,
  `C_Password` varchar(255) NOT NULL,
  `Mem_type` int(11) NOT NULL,
  `Payment_Status` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `client_member`
--

INSERT INTO `client_member` (`C_ID`, `C_Fname`, `C_Lname`, `C_Age`, `C_Address`, `C_Gender`, `C_ContactNUmber`, `C_Username`, `C_Password`, `Mem_type`, `Payment_Status`) VALUES
(1, 'john', 'capillanes', 1, 'asdas', 'Male', '12313', 'asd', '7815696ecbf1c96e6894b779456d330e', 1, 'paid'),
(3, 'kevin', 'intong', 19, 'davao', 'Male', '1234534123', 'kevie', 'c35bcc9c05b15415d82a0861592b1642', 0, 'paid'),
(6, 'grace marie', 'capillanes', 43, 'panabo city', 'Female', '09123435123', 'grace', '15e5c87b18c1289d45bb4a72961b58e8', 1, 'paid');

-- --------------------------------------------------------

--
-- Table structure for table `membership_type`
--

CREATE TABLE `membership_type` (
  `MemberType_ID` int(11) NOT NULL,
  `Type_name` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `membership_type`
--

INSERT INTO `membership_type` (`MemberType_ID`, `Type_name`) VALUES
(0, 'Daily'),
(1, 'Monthly');

-- --------------------------------------------------------

--
-- Table structure for table `payment`
--

CREATE TABLE `payment` (
  `C_ID` int(11) NOT NULL,
  `Payment_date` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `payment`
--

INSERT INTO `payment` (`C_ID`, `Payment_date`) VALUES
(1, '2022/12/21 10:33:19 AM'),
(2, '2022/12/12 07:58:33 PM'),
(3, '2022/12/21 12:08:39 PM'),
(4, '2022/12/21 12:51:49 PM'),
(5, '2022/12/21 05:25:15 PM'),
(6, '2022/12/21 05:45:28 PM');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `attendance`
--
ALTER TABLE `attendance`
  ADD PRIMARY KEY (`ClientsNumber`),
  ADD KEY `attendance_ibfk_1` (`C_ID`);

--
-- Indexes for table `client_member`
--
ALTER TABLE `client_member`
  ADD PRIMARY KEY (`C_ID`),
  ADD KEY `Mem_type` (`Mem_type`);

--
-- Indexes for table `membership_type`
--
ALTER TABLE `membership_type`
  ADD PRIMARY KEY (`MemberType_ID`);

--
-- Indexes for table `payment`
--
ALTER TABLE `payment`
  ADD PRIMARY KEY (`C_ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `attendance`
--
ALTER TABLE `attendance`
  MODIFY `ClientsNumber` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `client_member`
--
ALTER TABLE `client_member`
  MODIFY `C_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `membership_type`
--
ALTER TABLE `membership_type`
  MODIFY `MemberType_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `attendance`
--
ALTER TABLE `attendance`
  ADD CONSTRAINT `attendance_ibfk_1` FOREIGN KEY (`C_ID`) REFERENCES `client_member` (`C_ID`) ON DELETE CASCADE;

--
-- Constraints for table `client_member`
--
ALTER TABLE `client_member`
  ADD CONSTRAINT `client_member_ibfk_1` FOREIGN KEY (`Mem_type`) REFERENCES `membership_type` (`MemberType_ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
