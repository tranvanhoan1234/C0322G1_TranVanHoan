drop database case_furama_jsp_servlet;
create database case_furama_jsp_servlet;
use case_furama_jsp_servlet;
create table position (
position_id int primary key auto_increment,
position_name varchar(45),
`status` bit(1) default 0
);
create table education_degree(
education_degree_id int primary key auto_increment,
education_degree_name varchar(45),
`status` bit(1) default 0
);
create table division(
division_id int primary key auto_increment,
division_name varchar(45),
`status` bit(1) default 0
);

create table `user`(
username varchar(45) primary key ,
`password` varchar(45),
`status` bit(1) default 0
);
create table `role` (
role_id  int primary key auto_increment,
role_name varchar(255),
`status` bit(1) default 0
);
create table user_role(
username varchar(45),
foreign key (username) references `user`(username) ,
role_id int ,
foreign key (role_id) references `role`(role_id),
`status` bit(1) default 0
);
create table employee(
employee_id int primary key auto_increment ,
employee_name varchar(45),
employee_birthday date,
employee_id_card varchar(45),
employee_salary double,
employee_phone varchar(45),
employee_email varchar(45),
employee_address varchar(45),
position_id int,
foreign key (position_id) references position (position_id),
education_degree_id int,
foreign key (education_degree_id) references education_degree (education_degree_id),
division_id int,
foreign key (division_id) references division (division_id),
username varchar(225),
foreign key (username) references `user`(username),
`status` bit(1) default 0
);
create table customer_type(
customer_type_id int primary key auto_increment,
customer_type_name varchar(45),
`status` bit(1) default 0
);
create table customer(
customer_id int primary key auto_increment,
customer_name varchar(45),
customer_birthday date,
customer_gender bit(1),
customer_id_card varchar(45),
customer_phone varchar(45),
customer_email varchar(45),
customer_address varchar(45),
customer_type_id int,
foreign key (customer_type_id) references customer_type(customer_type_id),
`status` bit(1) default 0
);
create table service_type (
service_type_id int primary key auto_increment,
service_type_name varchar(45),
`status` bit(1) default 0
);
create table rent_type(
rent_type_id int primary key auto_increment,
rent_type_name varchar(45),
rent_type_cost double,
`status` bit(1) default 0
);
create table service(
service_id int primary key auto_increment,
service_name varchar(45),
service_area int,
service_cost double,
service_max_people int,
standard_room varchar(45),
description_other_convenience varchar(45),
pool_area double,
number_of_floors int,
rent_type_id int,
foreign key (rent_type_id) references rent_type(rent_type_id),
service_type_id int,
foreign key (service_type_id) references service_type(service_type_id),
`status` bit(1) default 0
);
create table contract(
contract_id int primary key auto_increment,
contract_start_date datetime,
contract_end_date datetime,
contract_deposi double,
contract_total_money double,
employee_id int,
foreign key (employee_id) references employee(employee_id),
customer_id int,
foreign key (customer_id) references customer(customer_id),
service_id int,
foreign key (service_id) references service(service_id),
`status` bit(1) default 0
);
create table attach_service(
attach_service_id int primary key auto_increment,
attach_service_name varchar(45),
attach_service_cost double,
attach_service_unit int,
`status` bit(1) default 0
);
create table contract_detail(
contract_detail_id int,
contract_id int,
quantity int,
attach_service_id int,
foreign key (attach_service_id) references attach_service (attach_service_id),
`status` bit(1) default 0
);
