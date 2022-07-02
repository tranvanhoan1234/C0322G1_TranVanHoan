drop database if exists demo;
create database demo;
use demo;
create table product(
id int primary key auto_increment,
`name` varchar(255),
gia varchar(255),
mota varchar(255),
hang varchar(255)
);
insert into users(`name`,gia,mota,hang) values('keo ngot',20000,'vip','kinh do');
insert into users(`name`, gia,mota,hang) values('keo chua','30000','ngon','lac duong');