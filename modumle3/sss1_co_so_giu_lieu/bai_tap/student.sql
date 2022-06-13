drop database if exists student;
create database student;
use student;
create table student(
id int auto_increment primary key,
`name` varchar(45),
`status` bit(1) default 0
);

create table teach(
id int not null,
`name` varchar(45),
age int not null,
country varchar(45) null,
primary key(id)
);

insert into student( `name`, status) value('trần văn hoàn',1);
insert into student( `name`) value('trần thị thuận');
