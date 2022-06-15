use quanlysinhvien;
-- Hiển thị tất cả các sinh viên có tên bắt đầu bảng ký tự ‘h’
select * 
from student
where StudentName like 'h%';
-- Hiển thị các thông tin lớp học có thời gian bắt đầu vào tháng 12.
select *
 from class
 where month(startdate)  like '12' ;
 -- Hiển thị tất cả các thông tin môn học có credit trong khoảng từ 3-5.
 select Credit 
 from `subject`
 where Credit between '3'and '5';
-- Thay đổi mã lớp(ClassID) của sinh viên có tên ‘Hung’ là 2.
update student
set studentname = 'Hung'
where classid =2;  
-- Hiển thị các thông tin: StudentName, SubName, Mark. Dữ liệu sắp xếp theo điểm thi (mark) giảm dần.
-- nếu trùng sắp theo tên tăng dần.

-- select student.StudentName,`subject`.SubName,mark from student , `subject` , mark
-- order by mark desc,`subject`.subname; 
select student.studentname, `subject`.subname, mark.Mark from student
join mark on student.studentid = mark.studentid
join subject on subject.subid = mark.subid
order by mark.mark desc, `subject`.subname;

 
