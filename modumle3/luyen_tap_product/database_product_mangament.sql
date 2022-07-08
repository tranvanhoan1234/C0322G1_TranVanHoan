	drop database if exists product_management;
	create database product_management;
	use product_management;
    
    create table category(
    id_danh_muc int primary key auto_increment,
    ten_danh_muc varchar(250)
    );
    
	create table product(
	id_product int primary key auto_increment,
	ten_san_pham varchar(255),
	gia double,
	so_luong int,
	mau_sac varchar(255),
    mo_ta varchar(250),
    id_danh_muc int,
    foreign key (id_danh_muc) references category (id_danh_muc)
	);
    
    insert into category (ten_danh_muc ) values('xe cộ');
	insert into category (ten_danh_muc) values('sach');
	insert into category (ten_danh_muc) values('Đồ điện tử');
	insert into category (ten_danh_muc) values('Quần Áo');
	insert into product (ten_san_pham,gia,so_luong,mau_sac,mo_ta, id_danh_muc) values('xe bò',20000,2,'cam','chạy siêu nhanh 200km/h', 1);
	insert into product (ten_san_pham,gia,so_luong,mau_sac,mo_ta, id_danh_muc) values('sach',30000,10,'den','toan chuyện hay', 2);
	insert into product (ten_san_pham,gia,so_luong,mau_sac,mo_ta, id_danh_muc) values('sach1',123,10,'den','toan chuyện hay', 3);
	insert into product (ten_san_pham,gia,so_luong,mau_sac,mo_ta, id_danh_muc) values('sach2',234,10,'den','toan chuyện hay', 2);
	insert into product (ten_san_pham,gia,so_luong,mau_sac,mo_ta, id_danh_muc) values('sach3',43534,10,'den','toan chuyện hay', 1);
	insert into product (ten_san_pham,gia,so_luong,mau_sac,mo_ta, id_danh_muc) values('sach4',345,10,'den','toan chuyện hay', 4);
	insert into product (ten_san_pham,gia,so_luong,mau_sac,mo_ta, id_danh_muc) values('sach4',345,10,'den','toan chuyện hay', 4);
	insert into product (ten_san_pham,gia,so_luong,mau_sac,mo_ta, id_danh_muc) values('sach4',345,10,'den','toan chuyện hay', 4);
	insert into product (ten_san_pham,gia,so_luong,mau_sac,mo_ta, id_danh_muc) values('sach4',345,10,'den','toan chuyện hay', 4);
	insert into product (ten_san_pham,gia,so_luong,mau_sac,mo_ta, id_danh_muc) values('sach4',345,10,'den','toan chuyện hay', 4);
	insert into product (ten_san_pham,gia,so_luong,mau_sac,mo_ta, id_danh_muc) values('sach4',345,10,'den','toan chuyện hay', 4);
	insert into product (ten_san_pham,gia,so_luong,mau_sac,mo_ta, id_danh_muc) values('sach4',345,10,'den','toan chuyện hay', 4);
	insert into product (ten_san_pham,gia,so_luong,mau_sac,mo_ta, id_danh_muc) values('sach4',345,10,'den','toan chuyện hay', 4);
	insert into product (ten_san_pham,gia,so_luong,mau_sac,mo_ta, id_danh_muc) values('sach4',345,10,'den','toan chuyện hay', 4);
	insert into product (ten_san_pham,gia,so_luong,mau_sac,mo_ta, id_danh_muc) values('sach4',345,10,'den','toan chuyện hay', 4);
	insert into product (ten_san_pham,gia,so_luong,mau_sac,mo_ta, id_danh_muc) values('sach4',345,10,'den','toan chuyện hay', 4);
	insert into product (ten_san_pham,gia,so_luong,mau_sac,mo_ta, id_danh_muc) values('sach4',345,10,'den','toan chuyện hay', 4);
	insert into product (ten_san_pham,gia,so_luong,mau_sac,mo_ta, id_danh_muc) values('sach4',345,10,'den','toan chuyện hay', 4);
	insert into product (ten_san_pham,gia,so_luong,mau_sac,mo_ta, id_danh_muc) values('sach4',345,10,'den','toan chuyện hay', 4);
	