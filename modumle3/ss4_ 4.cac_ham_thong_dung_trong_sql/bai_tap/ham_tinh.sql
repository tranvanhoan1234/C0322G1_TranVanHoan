use quanlysinhvien;
-- Hiển thị tất cả các thông tin môn học (bảng subject) có credit lớn nhất.
select *, max(credit) as max_credit
from `subject`
where credit;
-- Hiển thị các thông tin môn học có điểm thi lớn nhất.
select credit, max(mark) as diem_thi_lon_nhat
from `subject`
join mark on `subject`.subid =mark.subid
where mark;
-- Hiển thị các thông tin sinh viên và điểm trung bình của mỗi sinh viên, xếp hạng theo thứ tự điểm giảm dần
select student.studentid,student.studentname ,avg(mark) as diem_trung_binh_hoc_vien
from student
join mark on student.studentid=mark.studentid
group by studentid
order by studentid desc;