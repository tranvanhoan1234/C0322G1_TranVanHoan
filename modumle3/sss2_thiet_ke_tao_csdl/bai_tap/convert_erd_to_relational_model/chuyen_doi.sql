 drop database bai_tap_quan_ly_don_hang;
 
create database bai_tap_quan_ly_don_hang;

use bai_tap_quan_ly_don_hang;
create table chi_tiet_phieu_xuat(
dg_xuat int,
sl_xuat int,
primary key(ma_phieu_xuat,ma_vat_tu),
foreign key (ma_phieu_xuat) references phieu_xuat(ma_phieu_xuat),
foreign key(ma_vat_tu) references vat_tu(ma_vat_tu)
);
create table vat_tu(
ma_vat_tu int auto_increment primary key,
ten_vat_tu varchar(45)
);
create table phieu_xuat(
ma_phieu_xuat int primary key auto_increment,
so_san_pham int auto_increment primary key,
ngay_xuat date,
chi_tiet_phieu_xuat int,
foreign key (chi_tiet_phieu_xuat) references chi_tiet_phieu_xuat(chi_tiet_phieu_xuat),
ma_vat_tu int,
foreign key (ma_vat_tu) references vat_tu(ma_vat_tu)
);
create table phieu_nhap(
ma_so_phieu_nhap int primary key auto_increment,
ngay_nhap int
);
create table chi_tiet_phieu_nhap(
dg_nhap int,
sl_nhap int,
ma_vat_tu int,
foreign key (ma_vat_tu) references vat_tu(ma_vat_tu),
ma_so_phieu_nhap int,
foreign key (ma_so_phieu_nhap) references phieu_nhap
);
create table don_dat_hang(
ma_so_don_hang int primary key auto_increment,
ngay_dat_hang date
);
create table chi_tiet_don_hang(
ma_vat_tu int,
foreign key (ma_vat_tu) references vat_tu(ma_vat_tu),
ma_so_don_hang int,
foreign key(ma_so_don_dat_hang) references don_dat_hang(ma_so_don_hang)
);