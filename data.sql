-- MySQL dump 10.13  Distrib 8.0.39, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: graduate
-- ------------------------------------------------------
-- Server version	8.0.39

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `ordermanage`
--

DROP TABLE IF EXISTS `ordermanage`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ordermanage` (
  `OrderId` varchar(20) NOT NULL,
  `UserId` varchar(15) DEFAULT NULL,
  `ScenicName` varchar(20) DEFAULT NULL,
  `date` datetime DEFAULT NULL,
  `price` int DEFAULT NULL,
  `TicketName` varchar(30) DEFAULT NULL,
  `TiclketClassfication` enum('全价票','半价票','免票') DEFAULT NULL,
  PRIMARY KEY (`OrderId`),
  KEY `userid` (`UserId`),
  KEY `ScenicName` (`ScenicName`),
  CONSTRAINT `ordermanage_ibfk_1` FOREIGN KEY (`UserId`) REFERENCES `user` (`UserId`),
  CONSTRAINT `ordermanage_ibfk_2` FOREIGN KEY (`ScenicName`) REFERENCES `scenic` (`ScenicName`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ordermanage`
--

LOCK TABLES `ordermanage` WRITE;
/*!40000 ALTER TABLE `ordermanage` DISABLE KEYS */;
INSERT INTO `ordermanage` VALUES ('100001','10001','八达岭长城','2025-03-13 21:31:11',20,'门票','半价票'),('100002','10003','青海湖','2025-03-13 21:31:20',120,'门票','全价票'),('100003','10001','百丈漈','2025-03-13 21:31:22',50,'门票','半价票'),('100004','10005','故宫博物院','2023-03-13 21:31:24',40,'门票','全价票'),('100005','10006','青海湖','2025-04-13 21:31:28',60,'门票','半价票'),('100006','10002','雁荡山风景区','2022-05-17 21:31:32',50,'灵峰','全价票'),('100007','10005','黄山风景区','2019-06-13 21:31:39',90,'门票','半价票'),('100008','10004','夫子庙','2025-03-13 21:31:51',15,'门票','半价票'),('100009','10006','七彩丹霞','2020-07-18 21:31:53',130,'门票','全价票');
/*!40000 ALTER TABLE `ordermanage` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `scenic`
--

DROP TABLE IF EXISTS `scenic`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `scenic` (
  `ScenicName` varchar(35) NOT NULL,
  `province` varchar(20) DEFAULT NULL,
  `city` varchar(20) DEFAULT NULL,
  `MaxLimit` int DEFAULT NULL,
  `ScenicID` int DEFAULT NULL,
  PRIMARY KEY (`ScenicName`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `scenic`
--

LOCK TABLES `scenic` WRITE;
/*!40000 ALTER TABLE `scenic` DISABLE KEYS */;
INSERT INTO `scenic` VALUES ('七彩丹霞','甘肃','张掖',30000,101),('八达岭长城','北京','北京',30000,102),('天一阁-月湖景区','浙江','宁波',8000,105),('夫子庙','江苏','南京',10000,107),('宁波罗蒙环球乐园','浙江','杭州',60000,109),('布达拉宫','西藏','拉萨',10000,131),('故宫博物院','北京','北京',65000,108),('百丈漈','浙江','温州',28000,103),('茶卡盐湖','青海','海西',30000,122),('雁荡山风景区','浙江','温州',50000,110),('青海湖','青海','海南州',25000,111),('鸣沙山·月牙泉','甘肃','酒泉',30000,112),('黄山风景区','安徽','黄山',35000,113);
/*!40000 ALTER TABLE `scenic` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `UserId` varchar(20) NOT NULL,
  `password` varchar(15) DEFAULT '123456',
  `name` varchar(20) DEFAULT NULL,
  `gender` enum('男','女') DEFAULT NULL,
  `age` int DEFAULT NULL,
  PRIMARY KEY (`UserId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES ('10001','123456','李白','男',11),('10002','123456','张无忌','男',20),('10003','123456','荆轲','女',18),('10004','123456','钟馗','男',54),('10005','123456','宫本武藏','男',40),('10006','123456','后羿','男',20),('10007','123456','马可波罗','男',11),('10008','123456','吴恒','男',53),('10010','123456','武则天','女',45),('10011','123456','太乙真人','男',20),('10012','123456','申公豹','男',21);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2026-10-15 16:07:57
