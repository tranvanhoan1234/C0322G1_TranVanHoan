use quanlybanhang;
-- Hiển thị các thông tin  gồm oID, oDate, oPrice của tất cả các hóa đơn trong bảng Order
select oder.o_id,oder.o_date,oder.o_total_price from oder;
-- Hiển thị danh sách các khách hàng đã mua hàng, và danh sách sản phẩm được mua bởi các khách
select customer.c_name,product.p_name 
from customer
join oder on oder.c_id=customer.c_id
join oder_detail on oder_detail.o_id =oder.o_id
join product on product.p_id =oder_detail.p_id
group by p_name;

-- Hiển thị tên những khách hàng không mua bất kỳ một sản phẩm nào
    
select c_name from customer
where c_name not in (
	select customer.c_name from customer 
	join oder on customer.c_id = oder.c_id
	join oder_detail on oder.o_id = oder_detail.o_id
	join product on product.p_id = oder_detail.p_id
	group by customer.c_name
);
-- Hiển thị mã hóa đơn, ngày bán và giá tiền của từng hóa đơn (giá một hóa đơn được tính bằng tổng giá
 -- bán của từng loại mặt hàng xuất hiện trong hóa đơn. Giá bán của từng loại được tính = odQTY*pPrice)
 select oder.o_id, oder.o_date, sum(oder_detail.od_quantity*product.p_price) as total_price from oder
join oder_detail on oder.o_id = oder_detail.o_id
join product on product.p_id = oder_detail.p_id
group by oder.o_id;