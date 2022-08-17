CREATE DATABASE  IF NOT EXISTS `daw_cl3` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `daw_cl3`;
-- MySQL dump 10.13  Distrib 8.0.21, for Win64 (x86_64)
--
-- Host: localhost    Database: daw_cl3
-- ------------------------------------------------------
-- Server version	8.0.21

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `tb_programador`
--

DROP TABLE IF EXISTS `tb_programador`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tb_programador` (
  `cod_programador` int NOT NULL AUTO_INCREMENT,
  `nom_programador` varchar(25) DEFAULT NULL,
  `ape_programador` varchar(25) DEFAULT NULL,
  `dni_programador` int DEFAULT NULL,
  `num_hijos` int DEFAULT NULL,
  `sueldo` double DEFAULT NULL,
  `cod_proyecto` int DEFAULT NULL,
  PRIMARY KEY (`cod_programador`),
  KEY `FK02` (`cod_proyecto`),
  CONSTRAINT `FK02` FOREIGN KEY (`cod_proyecto`) REFERENCES `tb_proyecto` (`cod_proyecto`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_programador`
--

LOCK TABLES `tb_programador` WRITE;
/*!40000 ALTER TABLE `tb_programador` DISABLE KEYS */;
INSERT INTO `tb_programador` VALUES (1,'Josue','Chupica',76863332,2,2000,2),(2,'Daniel','Chupica',7,85236974,12000,4),(3,'Wilmer','Ortiz',78945632,7,1520,4),(4,'Benjamin','Chupica',78945612,2,1200,1);
/*!40000 ALTER TABLE `tb_programador` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_proyecto`
--

DROP TABLE IF EXISTS `tb_proyecto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tb_proyecto` (
  `cod_proyecto` int NOT NULL AUTO_INCREMENT,
  `nom_proyecto` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`cod_proyecto`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_proyecto`
--

LOCK TABLES `tb_proyecto` WRITE;
/*!40000 ALTER TABLE `tb_proyecto` DISABLE KEYS */;
INSERT INTO `tb_proyecto` VALUES (1,'Investigación'),(2,'Comunitario'),(3,'Social'),(4,'Productivos');
/*!40000 ALTER TABLE `tb_proyecto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'daw_cl3'
--

--
-- Dumping routines for database 'daw_cl3'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-08-17 12:02:15
