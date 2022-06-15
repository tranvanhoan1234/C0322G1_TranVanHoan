drop database if exists QuanLyBanHang;
create database if not exists QuanLyBanHang;
use QuanLyBanHang;
create table Customer (
c_id int auto_increment,
c_name varchar(255),
c_age int,
primary key (c_id)
);

create table oder (
o_id int auto_increment,
c_id int,
o_date date,
o_total_price double,
primary key (o_id),
foreign key (c_id) references Customer(c_id)
);

create table product (
p_id int auto_increment,
p_name varchar(255),
p_price double,
primary key (p_id)
);

create table oder_detail (
o_id int,
p_id int,
od_quantity int,
foreign key (o_id) references oder(o_id),
foreign key (p_id) references product(p_id)
);
insert into Customer ( c_Name,c_Age)
value ('Minh Quan',10),('Ngoc Oanh',20),('Hong Ha',50);
insert into oder( c_id,o_Date ,o_total_price)
value (1,'2006-3-21',Null),(2,'2006-3-23',null),(1,	'2006-3-16',null);
insert into Product(p_name,p_price)
value ('May Giat',3),('Tu Lanh',5),('Dieu Hoa',7),('Quat',1),('Bep Dien',2);
insert into Oder_Detail( o_id,p_id,od_quantity)
value( 1,1,3),(1,3,7),(1,4,2),(2,1,1),(3,1,8),(2,5,4),(2,3,3);
