/*
SQLyog Enterprise Trial - MySQL GUI v7.11 
MySQL - 5.7.26-log : Database - covalense_db
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

CREATE DATABASE /*!32312 IF NOT EXISTS*/`covalense_db` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `covalense_db`;

/*Table structure for table `customer` */

DROP TABLE IF EXISTS `customer`;

CREATE TABLE `customer` (
  `Id` int(11) NOT NULL,
  `FirstName` varchar(120) DEFAULT NULL,
  `LastName` varchar(150) DEFAULT NULL,
  `contactNumber` bigint(10) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `city` varchar(100) DEFAULT NULL,
  `state` varchar(100) DEFAULT NULL,
  `country` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `customer` */

insert  into `customer`(`Id`,`FirstName`,`LastName`,`contactNumber`,`address`,`city`,`state`,`country`) values (10,'vijeth','kharvi',NULL,'kundapura','udupi',NULL,NULL);

/*Table structure for table `products` */

DROP TABLE IF EXISTS `products`;

CREATE TABLE `products` (
  `product_ID` int(11) NOT NULL,
  `product_Name` varchar(150) DEFAULT NULL,
  `price` double DEFAULT NULL,
  `color` varchar(100) DEFAULT NULL,
  `weight` double DEFAULT NULL,
  PRIMARY KEY (`product_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `products` */

/*Table structure for table `student` */

DROP TABLE IF EXISTS `student`;

CREATE TABLE `student` (
  `rollNum` int(11) NOT NULL,
  `firstName` varchar(120) DEFAULT NULL,
  `lastname` varchar(100) DEFAULT NULL,
  `subject` varchar(150) DEFAULT NULL,
  `totalMarks` double DEFAULT NULL,
  PRIMARY KEY (`rollNum`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `student` */

/*Table structure for table `student_info` */

DROP TABLE IF EXISTS `student_info`;

CREATE TABLE `student_info` (
  `rollNum` int(11) NOT NULL,
  `name` varchar(120) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `gender` varchar(120) DEFAULT NULL,
  `mobileNo` bigint(20) DEFAULT NULL,
  `emailId` varchar(150) DEFAULT NULL,
  PRIMARY KEY (`rollNum`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `student_info` */

/*Table structure for table `student_otherinfo` */

DROP TABLE IF EXISTS `student_otherinfo`;

CREATE TABLE `student_otherinfo` (
  `rollNum` int(11) NOT NULL,
  `fatherName` varchar(120) DEFAULT NULL,
  `motherName` varchar(100) DEFAULT NULL,
  `religion` varchar(120) DEFAULT NULL,
  `nationality` varchar(120) DEFAULT NULL,
  PRIMARY KEY (`rollNum`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `student_otherinfo` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
