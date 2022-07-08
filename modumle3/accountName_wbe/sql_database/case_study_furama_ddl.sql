drop database if exists resort_furama;
create database resort_furama;
use resort_furama;
create table position (
position_id int primary key auto_increment,
position_name varchar(250),
`status` bit (1) default 0
);
create table education_degree(
education_degree_id int primary key auto_increment,
education_degree_name varchar(250),
`status` bit (1) default 0
);
create table division (
division_id int primary key auto_increment,
division_name varchar(250),
`status` bit (1) default 0
);

create table `user`(
user_name varchar(250) primary key,
`password` varchar(250),
`status` bit (1) default 0
);
create table `role`(
role_id int primary key auto_increment,
role_name varchar(255),
`status` bit (1) default 0
);
create table user_role (
role_id int ,
user_name varchar(255),
foreign key (role_id) references `role`(role_id),
foreign key (user_name) references `user`(user_name),

`status` bit (1) default 0
);
create table employee(
employee_id int primary key auto_increment,
employee_name varchar(250),
employee_date_of_birth date,
employee_id_car varchar(45),
employee_salary double,
employee_phone_number varchar(45),
employee_email varchar(45),
employee_address varchar(45),
position_id int,
education_degree_id int,
division_id int,
user_name varchar(255),
foreign key (user_name) references `user`(user_name),
foreign key (position_id) references position (position_id),
foreign key (education_degree_id) references education_degree (education_degree_id),
foreign key (division_id) references division (division_id),
`status` bit (1) default 0
);
create table customer_type (
customer_type_id int primary key auto_increment,
customer_type_name varchar(255),
`status` bit (1) default 0
);
create table customer(
customer_id int primary key auto_increment,
customer_name varchar(45),
customer_date_of_birth date,
customer_gender bit(1),
customer_id_car varchar(45),
customer_phone_number varchar (45),
customer_email varchar(45),
customer_address varchar(45),
customer_type_id int,
foreign key (customer_type_id) references customer_type(customer_type_id),
`status` bit (1) default 0
 );
 create table facility_type(
 facility_type_id int primary key auto_increment,
 facility_type_name varchar (45),
 `status` bit (1) default 0
 );
 create table rent_type(
 rent_type_id int primary key auto_increment,
 rent_type_name varchar(45),
  `status` bit (1) default 0
 );
 create table facility(
 facility_id int primary key auto_increment,
 facility_name varchar(45),
 facility_erea int,
 facility_cost double,
 facility_max_people int,
 facility_standard_room varchar(45),
 facility_description_other_convenience varchar(45),
 facility_pool_area double,
 facility_number_of_foors int,
 facility_free text,
 rent_type_id int,
facility_type_id int,
foreign key (rent_type_id) references rent_type(rent_type_id),
foreign key (facility_type_id) references facility_type(facility_type_id),
 `status` bit (1) default 0
 );
create table contract(
contract_id int auto_increment primary key,
contract_start_date datetime,
contract_end_date datetime,
contract_deposit double,
employee_id int,
customer_id int,
facility_id int,
foreign key (employee_id) references employee(employee_id),
foreign key (customer_id) references customer(customer_id),
foreign key (facility_id) references facility(facility_id),
`status` bit (1) default 0
);
create table attach_facility(
attach_facility_id int primary key auto_increment,
attach_facility_name varchar(45),
attach_facility_cost double,
attach_facility_unit varchar (10),
attach_facility_status varchar (45),
`status` bit (1) default 0
);
create table contract_detail(
contract_detail_id int auto_increment primary key,
contract_detail_quantity int,
attach_facility_id int,
contract_id int,
foreign key (attach_facility_id) references attach_facility(attach_facility_id),
foreign key (contract_id) references contract(contract_id),
`status` bit (1) default 0
);
insert into customer(customer_name,customer_date_of_birth,customer_gender,customer_id_car
,customer_phone_number,customer_email,customer_type_id) value(

);

 
