-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: localhost    Database: db_dientoandammay
-- ------------------------------------------------------
-- Server version	5.7.15-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `chucvu`
--

DROP TABLE IF EXISTS `chucvu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `chucvu` (
  `MaChucVu` int(11) NOT NULL AUTO_INCREMENT,
  `TenChucVu` varchar(45) NOT NULL,
  `MoTa` text,
  PRIMARY KEY (`MaChucVu`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `chucvu`
--

LOCK TABLES `chucvu` WRITE;
/*!40000 ALTER TABLE `chucvu` DISABLE KEYS */;
INSERT INTO `chucvu` VALUES (1,'Giám đốc',NULL),(2,'IT',NULL),(3,'Quản lý',NULL),(4,'Nhân viên',NULL);
/*!40000 ALTER TABLE `chucvu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `gioitinh`
--

DROP TABLE IF EXISTS `gioitinh`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `gioitinh` (
  `MaGioiTinh` int(11) NOT NULL AUTO_INCREMENT,
  `GioiTinh` varchar(45) NOT NULL,
  PRIMARY KEY (`MaGioiTinh`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `gioitinh`
--

LOCK TABLES `gioitinh` WRITE;
/*!40000 ALTER TABLE `gioitinh` DISABLE KEYS */;
INSERT INTO `gioitinh` VALUES (0,'Nữ'),(1,'Nam');
/*!40000 ALTER TABLE `gioitinh` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `khachhang`
--

DROP TABLE IF EXISTS `khachhang`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `khachhang` (
  `MaKhachHang` int(11) NOT NULL AUTO_INCREMENT,
  `TenKhachHang` varchar(45) DEFAULT NULL,
  `GioiTinh` bit(2) DEFAULT NULL,
  `NgaySinh` date DEFAULT NULL,
  `DiaChi` varchar(45) DEFAULT NULL,
  `SDT` char(11) DEFAULT NULL,
  PRIMARY KEY (`MaKhachHang`),
  UNIQUE KEY `SDT_UNIQUE` (`SDT`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `khachhang`
--

LOCK TABLES `khachhang` WRITE;
/*!40000 ALTER TABLE `khachhang` DISABLE KEYS */;
INSERT INTO `khachhang` VALUES (1,'Nguyễn Văn An','','1997-11-25','Buôn Mê Thuột','01667855233'),(2,'Lê Anh Duy','','1997-10-15','Hồ Chí Minh','01665252584'),(3,'Trần Anh Thư','\0','1997-11-12','Buôn Mê Thuột','01689955897'),(4,'Nguyễn Mạnh Quân','','1997-05-16','Hà Nội','01667855945'),(6,'Hoàng Cẩm Nhung','\0','1997-10-10','Buôn Mê Thuột','01669987451'),(8,'Nguyễn Xuân Dương','','1997-08-17','Buôn Mê Thuột','01667852634'),(9,'Hoàng Long Phượng','','1997-06-16','Buôn Mê Thuột','01668759641'),(10,'Lê Thị Hoa','\0','1997-12-10','Hà Nội','01665987468'),(11,'Trần Hoa Mai','\0','1997-09-10','Hồ Chí Minh','01668744592'),(12,'Hồ Đức Huy','','1995-04-17','Buôn Mê Thuột','01666585426'),(13,'Trần Thị Thu Thủy','\0','1997-10-17','Buôn Mê Thuột','01665884334');
/*!40000 ALTER TABLE `khachhang` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `loaisanpham`
--

DROP TABLE IF EXISTS `loaisanpham`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `loaisanpham` (
  `MaLoai` int(11) NOT NULL AUTO_INCREMENT,
  `TenLoai` varchar(45) NOT NULL,
  `MoTa` text,
  PRIMARY KEY (`MaLoai`),
  UNIQUE KEY `TenLoai_UNIQUE` (`TenLoai`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `loaisanpham`
--

LOCK TABLES `loaisanpham` WRITE;
/*!40000 ALTER TABLE `loaisanpham` DISABLE KEYS */;
INSERT INTO `loaisanpham` VALUES (1,'Loại 1',' Mô tả loại 1'),(2,'Loại 2',''),(3,'Loại 3',''),(4,'Loại 4','Mô tả loại 4'),(5,'Loại 5','Mô tả loại 5'),(6,'Loại 6',''),(7,'Loại 7',''),(8,'Loại 8','Mô tả loại 8');
/*!40000 ALTER TABLE `loaisanpham` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nhanvien`
--

DROP TABLE IF EXISTS `nhanvien`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `nhanvien` (
  `MaNhanVien` int(11) NOT NULL AUTO_INCREMENT,
  `TenNhanVien` varchar(45) DEFAULT NULL,
  `GioiTinh` bit(2) DEFAULT NULL,
  `NgaySinh` date DEFAULT NULL,
  `DiaChi` varchar(45) DEFAULT NULL,
  `SoCMND` char(12) NOT NULL,
  `SDT` char(11) DEFAULT NULL,
  `NgayVaoLam` date DEFAULT NULL,
  `MaChucVu` int(11) NOT NULL,
  PRIMARY KEY (`MaNhanVien`),
  UNIQUE KEY `SoCMND_UNIQUE` (`SoCMND`),
  UNIQUE KEY `SDT_UNIQUE` (`SDT`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nhanvien`
--

LOCK TABLES `nhanvien` WRITE;
/*!40000 ALTER TABLE `nhanvien` DISABLE KEYS */;
INSERT INTO `nhanvien` VALUES (1,'Nguyễn Thiện Minh','','1997-05-12','Buôn Mê Thuột','241522368','01665954236','2015-10-15',3),(9,'Lê Phương Thảo','\0','1997-12-11','Hồ Chí Minh','241522645','01665234875','2015-11-23',1),(10,'Trần Kim Thư','\0','1997-10-14','Hà Nội','241522363','01668542528','2015-12-08',4),(11,'Hoàng Thùy Mai','\0','1997-11-25','Hồ Chí Minh','241522774','01669585742','2014-02-14',4),(12,'Lê Anh Quân','','1997-01-26','Hà Nội','241522365','01668549753','2015-10-28',4),(13,'Nguyễn Hoàng Long','','1997-03-17','Buôn Mê Thuột','241533628','01667852634','2015-11-14',4),(14,'Nguyễn Thúy Kiều','\0','1997-10-11','Hồ Chí Minh','241899773','01667546824','2015-12-11',3),(19,'Nguyễn Xuân Dương','','1997-08-17','Buôn Mê Thuột','241711888','01667852635','2015-10-10',2),(20,'Nguyễn Văn Thắng','','1996-08-17','Hà Nội','241522685','01668523497','2015-10-10',4),(21,'Hoàng Long Phượng','','1997-09-25','Buôn Mê Thuột','242515585','01665234879','2015-10-14',2),(23,'Nguyễn Thị Hoa','\0','1997-10-12','Hồ Chí Minh','241522361','01667542531','2015-09-11',4),(24,'Trần Mai Duyên','\0','1997-10-12','Hồ Chí Minh','241524975','01667541428','2015-11-13',4),(25,'Phạm Phương Nam','','1997-04-11','Buôn Mê Thuột','241744689','01668324975','2015-02-25',4);
/*!40000 ALTER TABLE `nhanvien` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `quyen`
--

DROP TABLE IF EXISTS `quyen`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `quyen` (
  `MaQuyen` int(11) NOT NULL AUTO_INCREMENT,
  `TenQuyen` varchar(45) NOT NULL,
  `MoTa` text,
  PRIMARY KEY (`MaQuyen`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `quyen`
--

LOCK TABLES `quyen` WRITE;
/*!40000 ALTER TABLE `quyen` DISABLE KEYS */;
INSERT INTO `quyen` VALUES (1,'Quản trị',NULL),(2,'Quản lý',NULL),(3,'Nhân viên',NULL),(4,'Khách hàng',NULL);
/*!40000 ALTER TABLE `quyen` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sanpham`
--

DROP TABLE IF EXISTS `sanpham`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sanpham` (
  `MaSanPham` int(11) NOT NULL AUTO_INCREMENT,
  `TenSanPham` varchar(45) DEFAULT NULL,
  `MoTa` text,
  `GiaSanPham` int(11) DEFAULT NULL,
  `SoLuong` int(11) DEFAULT NULL,
  `MaLoai` int(11) NOT NULL,
  PRIMARY KEY (`MaSanPham`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sanpham`
--

LOCK TABLES `sanpham` WRITE;
/*!40000 ALTER TABLE `sanpham` DISABLE KEYS */;
INSERT INTO `sanpham` VALUES (4,'Sản phẩm 1','mô tả sản phẩm 1',150000,999,8),(5,'Sản phẩm 2','mô tả sản phẩm 2',145000,250,3),(6,'Sản phẩm 3','mô tả sản phẩm 3',125000,6548,6),(7,'Sản phẩm 4','mô tả sản phẩm 4',123000,856,5),(8,'Sản phẩm 5','',134000,445,4),(9,'Sản phẩm 6','mô tả sản phẩm 6',148000,2348,2),(10,'Sản phẩm 7','mô tả sản phẩm 7',100000,459,7),(11,'Sản phẩm 8','mô tả sản phẩm 8',485000,1244,5),(12,'Sản phẩm 9','',198000,1285,6),(13,'Sản phẩm 10','mô tả sản phẩm 10',452000,485,3),(14,'Sản phẩm 11','',452000,1854,4),(15,'sản phẩm mới','mô tả sản phẩm mới',435000,1456,5),(16,'Sản phẩm 12','mô tả sản phẩm 12',185000,6548,6);
/*!40000 ALTER TABLE `sanpham` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `taikhoan`
--

DROP TABLE IF EXISTS `taikhoan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `taikhoan` (
  `MaTaiKhoan` int(11) NOT NULL AUTO_INCREMENT,
  `TenTaiKhoan` varchar(45) NOT NULL,
  `MatKhau` varchar(45) NOT NULL,
  `MaQuyen` int(11) NOT NULL,
  `LuotDangNhap` int(11) DEFAULT NULL,
  PRIMARY KEY (`MaTaiKhoan`),
  UNIQUE KEY `TenTaiKhoan_UNIQUE` (`TenTaiKhoan`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `taikhoan`
--

LOCK TABLES `taikhoan` WRITE;
/*!40000 ALTER TABLE `taikhoan` DISABLE KEYS */;
INSERT INTO `taikhoan` VALUES (1,'admin','admin',1,5),(2,'kieulethi123','kieu123',3,1),(7,'manhquan','quan123',3,1),(9,'tranthitham','tham1234',4,0),(11,'duongnguyen','duong123',1,0),(12,'hoathi113','hoathi311',3,0),(13,'minhnguyen','minh123',3,0),(14,'hoangle','hoang111',3,0),(15,'camnhung123','nhung123',2,0),(16,'dunghoang97','dung97',3,0),(17,'kieule','lekieu123',2,0);
/*!40000 ALTER TABLE `taikhoan` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-02-15 21:58:16
