CREATE DATABASE  IF NOT EXISTS `foodorderdb` /*!40100 DEFAULT CHARACTER SET utf8 */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `foodorderdb`;
-- MySQL dump 10.13  Distrib 8.0.18, for macos10.14 (x86_64)
--
-- Host: 127.0.0.1    Database: foodorderdb
-- ------------------------------------------------------
-- Server version	8.0.18

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
-- Table structure for table `T9901_GOOGLE_TR_CODES`
--

DROP TABLE IF EXISTS `T9901_GOOGLE_TR_CODES`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `T9901_GOOGLE_TR_CODES` (
  `No` int(11) NOT NULL,
  `LANGUAGE_NAME` varchar(25) DEFAULT NULL,
  `NATIVE_LANGUAGE_NAME` varchar(50) DEFAULT NULL,
  `CODE` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`No`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `T9901_GOOGLE_TR_CODES`
--

LOCK TABLES `T9901_GOOGLE_TR_CODES` WRITE;
/*!40000 ALTER TABLE `T9901_GOOGLE_TR_CODES` DISABLE KEYS */;
INSERT INTO `T9901_GOOGLE_TR_CODES` VALUES (1,'Afrikaans','Afrikaans','af'),(2,'Albanian','Shqip','sq'),(3,'Arabic','عربي','ar'),(4,'Armenian','Հայերէն','hy'),(5,'Azerbaijani','آذربایجان دیلی','az'),(6,'Basque','Euskara','eu'),(7,'Belarusian','Беларуская','be'),(8,'Bulgarian','Български','bg'),(9,'Catalan','Català','ca'),(10,'Chinese (Simplified)','中文简体','zh-CN'),(11,'Chinese (Traditional)','中文繁體','zh-TW'),(12,'Croatian','Hrvatski','hr'),(13,'Czech','Čeština','cs'),(14,'Danish','Dansk','da'),(15,'Dutch','Nederlands','nl'),(16,'English','English','en'),(17,'Estonian','Eesti keel','et'),(18,'Filipino','Filipino','tl'),(19,'Finnish','Suomi','fi'),(20,'French','Français','fr'),(21,'Galician','Galego','gl'),(22,'Georgian','ქართული','ka'),(23,'German','Deutsch','de'),(24,'Greek','Ελληνικά','el'),(25,'Haitian Creole','Kreyòl ayisyen','ht'),(26,'Hebrew','עברית','iw'),(27,'Hindi','हिन्दी','hi'),(28,'Hungarian','Magyar','hu'),(29,'Icelandic','Íslenska','is'),(30,'Indonesian','Bahasa Indonesia','id'),(31,'Irish','Gaeilge','ga'),(32,'Italian','Italiano','it'),(33,'Japanese','日本語','ja'),(34,'Korean','한국어','ko'),(35,'Latvian','Latviešu','lv'),(36,'Lithuanian','Lietuvių kalba','lt'),(37,'Macedonian','Македонски','mk'),(38,'Malay','Malay','ms'),(39,'Maltese','Malti','mt'),(40,'Norwegian','Norsk','no'),(41,'Persian','فارسی','fa'),(42,'Polish','Polski','pl'),(43,'Portuguese','Português','pt'),(44,'Romanian','Română','ro'),(45,'Russian','Русский','ru'),(46,'Serbian','Српски','sr'),(47,'Slovak','Slovenčina','sk'),(48,'Slovenian','Slovensko','sl'),(49,'Spanish','Español','es'),(50,'Swahili','Kiswahili','sw'),(51,'Swedish','Svenska','sv'),(52,'Thai','ไทย','th'),(53,'Turkish','Türkçe','tr'),(54,'Ukrainian','Українська','uk'),(55,'Urdu','اردو','ur'),(56,'Vietnamese','Tiếng Việt','vi'),(57,'Welsh','Cymraeg','cy'),(58,'Yiddish','ייִדיש','yi');
/*!40000 ALTER TABLE `T9901_GOOGLE_TR_CODES` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-12-14 14:17:21
