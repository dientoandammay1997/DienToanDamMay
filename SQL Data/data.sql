USE [master]
GO
/****** Object:  Database [duongnxpk00662_ASM_Java2]    Script Date: 06/07/2016 5:49:43 CH ******/
CREATE DATABASE [duongnxpk00662_ASM_Java2]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'duongnxpk00662_lab6_7', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL12.MSSQLSERVER\MSSQL\DATA\duongnxpk00662_lab6_7.mdf' , SIZE = 4096KB , MAXSIZE = UNLIMITED, FILEGROWTH = 1024KB )
 LOG ON 
( NAME = N'duongnxpk00662_lab6_7_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL12.MSSQLSERVER\MSSQL\DATA\duongnxpk00662_lab6_7_log.ldf' , SIZE = 1024KB , MAXSIZE = 2048GB , FILEGROWTH = 10%)
GO
ALTER DATABASE [duongnxpk00662_ASM_Java2] SET COMPATIBILITY_LEVEL = 120
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [duongnxpk00662_ASM_Java2].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [duongnxpk00662_ASM_Java2] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [duongnxpk00662_ASM_Java2] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [duongnxpk00662_ASM_Java2] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [duongnxpk00662_ASM_Java2] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [duongnxpk00662_ASM_Java2] SET ARITHABORT OFF 
GO
ALTER DATABASE [duongnxpk00662_ASM_Java2] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [duongnxpk00662_ASM_Java2] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [duongnxpk00662_ASM_Java2] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [duongnxpk00662_ASM_Java2] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [duongnxpk00662_ASM_Java2] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [duongnxpk00662_ASM_Java2] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [duongnxpk00662_ASM_Java2] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [duongnxpk00662_ASM_Java2] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [duongnxpk00662_ASM_Java2] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [duongnxpk00662_ASM_Java2] SET  DISABLE_BROKER 
GO
ALTER DATABASE [duongnxpk00662_ASM_Java2] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [duongnxpk00662_ASM_Java2] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [duongnxpk00662_ASM_Java2] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [duongnxpk00662_ASM_Java2] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [duongnxpk00662_ASM_Java2] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [duongnxpk00662_ASM_Java2] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [duongnxpk00662_ASM_Java2] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [duongnxpk00662_ASM_Java2] SET RECOVERY FULL 
GO
ALTER DATABASE [duongnxpk00662_ASM_Java2] SET  MULTI_USER 
GO
ALTER DATABASE [duongnxpk00662_ASM_Java2] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [duongnxpk00662_ASM_Java2] SET DB_CHAINING OFF 
GO
ALTER DATABASE [duongnxpk00662_ASM_Java2] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [duongnxpk00662_ASM_Java2] SET TARGET_RECOVERY_TIME = 0 SECONDS 
GO
ALTER DATABASE [duongnxpk00662_ASM_Java2] SET DELAYED_DURABILITY = DISABLED 
GO
EXEC sys.sp_db_vardecimal_storage_format N'duongnxpk00662_ASM_Java2', N'ON'
GO
USE [duongnxpk00662_ASM_Java2]
GO
/****** Object:  Table [dbo].[ChucVu]    Script Date: 06/07/2016 5:49:44 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ChucVu](
	[MaChucVu] [int] IDENTITY(1,1) NOT NULL,
	[TenChucVu] [nvarchar](30) NOT NULL,
	[MoTa] [nvarchar](30) NULL,
 CONSTRAINT [PK_ChucVu] PRIMARY KEY CLUSTERED 
(
	[MaChucVu] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[GioiTinh]    Script Date: 06/07/2016 5:49:44 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[GioiTinh](
	[MaGioiTinh] [bit] NOT NULL,
	[GioiTinh] [nvarchar](10) NOT NULL,
 CONSTRAINT [PK_GioiTinh] PRIMARY KEY CLUSTERED 
(
	[MaGioiTinh] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[KhachHang]    Script Date: 06/07/2016 5:49:44 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[KhachHang](
	[MaKhachHang] [int] IDENTITY(1,1) NOT NULL,
	[TenKhachHang] [nvarchar](50) NULL,
	[GioiTinh] [bit] NULL,
	[NgaySinh] [date] NULL,
	[DiaChi] [nvarchar](50) NULL,
	[SDT] [nchar](11) NULL,
 CONSTRAINT [PK_KhachHang] PRIMARY KEY CLUSTERED 
(
	[MaKhachHang] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[LoaiSanPham]    Script Date: 06/07/2016 5:49:44 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[LoaiSanPham](
	[MaLoai] [int] IDENTITY(1,1) NOT NULL,
	[TenLoai] [nvarchar](50) NOT NULL,
	[MoTa] [nvarchar](50) NULL,
 CONSTRAINT [PK_LoaiSanPham] PRIMARY KEY CLUSTERED 
(
	[MaLoai] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[LuotDangNhap]    Script Date: 06/07/2016 5:49:44 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[LuotDangNhap](
	[MaDangNhap] [int] IDENTITY(1,1) NOT NULL,
	[LuotDangNhap] [int] NOT NULL,
 CONSTRAINT [PK_LuotDangNhap] PRIMARY KEY CLUSTERED 
(
	[MaDangNhap] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[NhanVien]    Script Date: 06/07/2016 5:49:44 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NhanVien](
	[MaNhanVien] [int] IDENTITY(1,1) NOT NULL,
	[TenNhanVien] [nvarchar](50) NOT NULL,
	[GioiTinh] [bit] NOT NULL,
	[NgaySinh] [date] NOT NULL,
	[DiaChi] [nvarchar](50) NOT NULL,
	[SoCMND] [nchar](12) NOT NULL,
	[SDT] [nchar](11) NULL,
	[NgayVaoLam] [date] NOT NULL,
	[MaChucVu] [int] NOT NULL,
 CONSTRAINT [PK_NhanVien] PRIMARY KEY CLUSTERED 
(
	[MaNhanVien] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Quyen]    Script Date: 06/07/2016 5:49:44 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Quyen](
	[MaQuyen] [int] IDENTITY(1,1) NOT NULL,
	[TenQuyen] [nvarchar](30) NOT NULL,
	[MoTa] [nvarchar](50) NULL,
 CONSTRAINT [PK_Quyen] PRIMARY KEY CLUSTERED 
(
	[MaQuyen] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[SanPham]    Script Date: 06/07/2016 5:49:44 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[SanPham](
	[MaSanPham] [int] IDENTITY(1,1) NOT NULL,
	[TenSanPham] [nvarchar](50) NOT NULL,
	[MoTa] [nvarchar](50) NULL,
	[GiaSanPham] [money] NOT NULL,
	[SoLuong] [int] NOT NULL,
	[MaLoai] [int] NOT NULL,
 CONSTRAINT [PK_SanPham] PRIMARY KEY CLUSTERED 
(
	[MaSanPham] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[TaiKhoan]    Script Date: 06/07/2016 5:49:44 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[TaiKhoan](
	[MaTaiKhoan] [int] IDENTITY(1,1) NOT NULL,
	[TenTaiKhoan] [nvarchar](30) NOT NULL,
	[MatKhau] [nvarchar](30) NOT NULL,
	[MaQuyen] [int] NOT NULL,
 CONSTRAINT [PK_NguoiDung] PRIMARY KEY CLUSTERED 
(
	[MaTaiKhoan] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
INSERT [dbo].[GioiTinh] ([MaGioiTinh], [GioiTinh]) VALUES (0, N'Nữ')
INSERT [dbo].[GioiTinh] ([MaGioiTinh], [GioiTinh]) VALUES (1, N'Nam')
SET IDENTITY_INSERT [dbo].[LoaiSanPham] ON 

INSERT [dbo].[LoaiSanPham] ([MaLoai], [TenLoai], [MoTa]) VALUES (1, N'Loại 1', N'')
INSERT [dbo].[LoaiSanPham] ([MaLoai], [TenLoai], [MoTa]) VALUES (2, N'Loại 2', N'')
INSERT [dbo].[LoaiSanPham] ([MaLoai], [TenLoai], [MoTa]) VALUES (3, N'Loại 3', N'')
INSERT [dbo].[LoaiSanPham] ([MaLoai], [TenLoai], [MoTa]) VALUES (4, N'Loại 4', N'')
INSERT [dbo].[LoaiSanPham] ([MaLoai], [TenLoai], [MoTa]) VALUES (5, N'Loại 5', N'')
INSERT [dbo].[LoaiSanPham] ([MaLoai], [TenLoai], [MoTa]) VALUES (6, N'Loai 6', N'')
INSERT [dbo].[LoaiSanPham] ([MaLoai], [TenLoai], [MoTa]) VALUES (7, N'Loai 7', N'')
INSERT [dbo].[LoaiSanPham] ([MaLoai], [TenLoai], [MoTa]) VALUES (11, N'Loai 7', N'')
SET IDENTITY_INSERT [dbo].[LoaiSanPham] OFF
SET IDENTITY_INSERT [dbo].[LuotDangNhap] ON 

INSERT [dbo].[LuotDangNhap] ([MaDangNhap], [LuotDangNhap]) VALUES (1, 19)
SET IDENTITY_INSERT [dbo].[LuotDangNhap] OFF
SET IDENTITY_INSERT [dbo].[Quyen] ON 

INSERT [dbo].[Quyen] ([MaQuyen], [TenQuyen], [MoTa]) VALUES (1, N'Admin', N'Admin')
INSERT [dbo].[Quyen] ([MaQuyen], [TenQuyen], [MoTa]) VALUES (2, N'IT', N'IT')
INSERT [dbo].[Quyen] ([MaQuyen], [TenQuyen], [MoTa]) VALUES (3, N'Nhân Viên', N'Nhân Viên')
INSERT [dbo].[Quyen] ([MaQuyen], [TenQuyen], [MoTa]) VALUES (4, N'Khách Hàng', N'Khách Hàng')
SET IDENTITY_INSERT [dbo].[Quyen] OFF
SET IDENTITY_INSERT [dbo].[SanPham] ON 

INSERT [dbo].[SanPham] ([MaSanPham], [TenSanPham], [MoTa], [GiaSanPham], [SoLuong], [MaLoai]) VALUES (1, N'san pham moi', N'', 10.0000, 10, 1)
INSERT [dbo].[SanPham] ([MaSanPham], [TenSanPham], [MoTa], [GiaSanPham], [SoLuong], [MaLoai]) VALUES (2, N'san pham moi', N'', 10.0000, 10, 2)
INSERT [dbo].[SanPham] ([MaSanPham], [TenSanPham], [MoTa], [GiaSanPham], [SoLuong], [MaLoai]) VALUES (3, N'san pham moi', N'', 10.0000, 10, 3)
INSERT [dbo].[SanPham] ([MaSanPham], [TenSanPham], [MoTa], [GiaSanPham], [SoLuong], [MaLoai]) VALUES (4, N'san pham moi', N'', 10.0000, 10, 4)
INSERT [dbo].[SanPham] ([MaSanPham], [TenSanPham], [MoTa], [GiaSanPham], [SoLuong], [MaLoai]) VALUES (5, N'san pham moi', N'san pham moi', 10.0000, 10, 4)
INSERT [dbo].[SanPham] ([MaSanPham], [TenSanPham], [MoTa], [GiaSanPham], [SoLuong], [MaLoai]) VALUES (6, N'san pham moi', N'san pham moi', 100.0000, 10, 4)
INSERT [dbo].[SanPham] ([MaSanPham], [TenSanPham], [MoTa], [GiaSanPham], [SoLuong], [MaLoai]) VALUES (7, N'san pham moi', N'san pham moi', 100.0000, 100, 4)
INSERT [dbo].[SanPham] ([MaSanPham], [TenSanPham], [MoTa], [GiaSanPham], [SoLuong], [MaLoai]) VALUES (8, N'san pham moi', N'san pham moi', 100.0000, 100, 6)
INSERT [dbo].[SanPham] ([MaSanPham], [TenSanPham], [MoTa], [GiaSanPham], [SoLuong], [MaLoai]) VALUES (9, N'san pham moi', N'san pham moi', 100.0000, 100, 7)
INSERT [dbo].[SanPham] ([MaSanPham], [TenSanPham], [MoTa], [GiaSanPham], [SoLuong], [MaLoai]) VALUES (10, N'san pham moi', N'san pham moi 1', 100.0000, 100, 7)
INSERT [dbo].[SanPham] ([MaSanPham], [TenSanPham], [MoTa], [GiaSanPham], [SoLuong], [MaLoai]) VALUES (11, N'san pham moi', N'san pham moi 1', 123.0000, 100, 7)
INSERT [dbo].[SanPham] ([MaSanPham], [TenSanPham], [MoTa], [GiaSanPham], [SoLuong], [MaLoai]) VALUES (12, N'san pham moi', N'san pham moi 1', 123.0000, 12345, 7)
SET IDENTITY_INSERT [dbo].[SanPham] OFF
SET IDENTITY_INSERT [dbo].[TaiKhoan] ON 

INSERT [dbo].[TaiKhoan] ([MaTaiKhoan], [TenTaiKhoan], [MatKhau], [MaQuyen]) VALUES (1, N'admin', N'admin', 1)
INSERT [dbo].[TaiKhoan] ([MaTaiKhoan], [TenTaiKhoan], [MatKhau], [MaQuyen]) VALUES (2, N'it', N'it', 2)
INSERT [dbo].[TaiKhoan] ([MaTaiKhoan], [TenTaiKhoan], [MatKhau], [MaQuyen]) VALUES (3, N'nhanvien', N'123', 3)
INSERT [dbo].[TaiKhoan] ([MaTaiKhoan], [TenTaiKhoan], [MatKhau], [MaQuyen]) VALUES (4, N'khachhang', N'123', 4)
SET IDENTITY_INSERT [dbo].[TaiKhoan] OFF
ALTER TABLE [dbo].[KhachHang]  WITH CHECK ADD  CONSTRAINT [FK_KhachHang_GioiTinh] FOREIGN KEY([GioiTinh])
REFERENCES [dbo].[GioiTinh] ([MaGioiTinh])
GO
ALTER TABLE [dbo].[KhachHang] CHECK CONSTRAINT [FK_KhachHang_GioiTinh]
GO
ALTER TABLE [dbo].[NhanVien]  WITH CHECK ADD  CONSTRAINT [FK_NhanVien_ChucVu] FOREIGN KEY([MaChucVu])
REFERENCES [dbo].[ChucVu] ([MaChucVu])
GO
ALTER TABLE [dbo].[NhanVien] CHECK CONSTRAINT [FK_NhanVien_ChucVu]
GO
ALTER TABLE [dbo].[NhanVien]  WITH CHECK ADD  CONSTRAINT [FK_NhanVien_GioiTinh] FOREIGN KEY([GioiTinh])
REFERENCES [dbo].[GioiTinh] ([MaGioiTinh])
GO
ALTER TABLE [dbo].[NhanVien] CHECK CONSTRAINT [FK_NhanVien_GioiTinh]
GO
ALTER TABLE [dbo].[SanPham]  WITH CHECK ADD  CONSTRAINT [FK_SanPham_LoaiSanPham] FOREIGN KEY([MaLoai])
REFERENCES [dbo].[LoaiSanPham] ([MaLoai])
GO
ALTER TABLE [dbo].[SanPham] CHECK CONSTRAINT [FK_SanPham_LoaiSanPham]
GO
ALTER TABLE [dbo].[TaiKhoan]  WITH CHECK ADD  CONSTRAINT [FK_TaiKhoan_Quyen] FOREIGN KEY([MaQuyen])
REFERENCES [dbo].[Quyen] ([MaQuyen])
GO
ALTER TABLE [dbo].[TaiKhoan] CHECK CONSTRAINT [FK_TaiKhoan_Quyen]
GO
USE [master]
GO
ALTER DATABASE [duongnxpk00662_ASM_Java2] SET  READ_WRITE 
GO
