create database QLBanSach;

use QLBanSach;

create table Sach(
masach int auto_increment,
tensach varchar(255),
giaban decimal,
mota varchar(255),
anhbia text,
ngaycapnhat datetime,
soluongton int,
manhaxuatban int,
matacgia int,
machude int,

primary key (masach),
foreign key(manhaxuatban) references NhaXuatBan(manhaxuatban),
foreign key(matacgia) references TacGia(matacgia),
foreign key(machude) references ChuDe(machude)
);

create table NhaXuatBan(
manhaxuatban int auto_increment,
tennhaxuatban varchar(100),
diachi varchar(100),
dienthoai varchar(10),

primary key(manhaxuatban)
);

create table TacGia(
matacgia int auto_increment,
tentacgia varchar(100),
diachi varchar(100),
tieusu varchar(255),
dienthoai varchar(10),

primary key(matacgia)
);

create table Sach_TacGia(
masach int,
matacgia int,
vaitro varchar(100),
vitri varchar(100),

primary key(masach, matacgia),
foreign key(masach) references Sach(masach),
foreign key(matacgia) references TacGia(matacgia)
);

create table ChuDe(
machude int auto_increment,
tenchude varchar(255),

primary key(machude)
);

create table DonHang(
madonhang int auto_increment,
dathanhtoan boolean,
ngaygiao datetime,
ngaydat datetime,
tinhtranggh varchar(255),
makhachhang int,

primary key(madonhang),
foreign key(makhachhang) references KhachHang(makhachhang)
);

create table Sach_DonHang(
masach int,
madonhang int,
soluong int,
dongia decimal,

primary key(masach, madonhang),
foreign key(masach) references Sach(masach),
foreign key(madonhang) references DonHang(madonhang)
);

create table KhachHang(
makhachhang int auto_increment,
hoten varchar(100),
ngaysinh date,
gioitinh varchar(5),
dienthoai varchar(10),
diachi varchar(100),
email varchar(100),
matkhau varchar(20),
taikhoan varchar(20),

primary key(makhachhang)
);



