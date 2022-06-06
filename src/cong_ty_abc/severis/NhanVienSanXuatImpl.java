package cong_ty_abc.severis;

import cong_ty_abc.model.NhanVienSanXuat;
import cong_ty_abc.uitl.check_exception.NotFoundEmployeeException;
import cong_ty_abc.uitl.read_writer.ReadEndWriter;
import cong_ty_abc.uitl.regex.Regex;
import key_study.uitl.check_exception.IvalidHoseEpception;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NhanVienSanXuatImpl implements Severis{
    static Scanner scanner=new Scanner(System.in);
    static List<NhanVienSanXuat>list=new ArrayList<>();
    @Override
    public void display() {
        List<NhanVienSanXuat>list= ReadEndWriter.readFileSanXuat();
        for (NhanVienSanXuat nhanVienSanXuat :list) {
            System.out.println(nhanVienSanXuat);
        }
    }
//    public NhanVienSanXuat(Integer maNhanVien, Integer luongCoBan, String hoTen, String ngaySinh, String diaChi, Integer soSanPham, Integer giaMoiSanPham) {
public int check() {
    List<NhanVienSanXuat>list= ReadEndWriter.readFileSanXuat();

    int id = 1; // gán id = 1
    if (list.isEmpty()) { //kiểm tra nếu rỗng return 1;
        return id;
    } else {
        for (NhanVienSanXuat item: list) {  //duyệt mảng
            if (id < item.getMaNhanVien()) { //nếu id < id hiện tại
                id = item.getMaNhanVien(); // gán lại id
            }
        }
        return (id + 1); //trả về id + thêm 1

    }
}
    @Override
    public void add() {
        List<NhanVienSanXuat>list= ReadEndWriter.readFileSanXuat();

        Integer maNhanVien= check();
        System.out.println("thêm luong co ban nhân viên san xuất");
        Integer luongCoBan = Integer.valueOf(scanner.nextLine());
        System.out.println("thêm ho ten nhân viên san xuất");
        String hoTen=scanner.nextLine();
        System.out.println("thêm ngay sinh nhân viên san xuất");
        String ngaySinh= String.valueOf(Regex.yearRegex(scanner.nextLine()));
        while (!key_study.uitl.regex.Regex.yearRegex(String.valueOf(ngaySinh))) {
            System.err.print("nhập không đúng xin nhập lại : ");
            ngaySinh = scanner.nextLine();
        }
        System.out.println("thêm dịa chỉ nhân viên san xuất");
        String diaChi=scanner.nextLine();
        System.out.println("thêm so san pham nhân viên san xuất");
        Integer soSanPham= Integer.valueOf(scanner.nextLine());
        System.out.println("thêm gia moi san phẩm nhân viên san xuất");
        Integer giaMoiSanPham= Integer.valueOf(scanner.nextLine());
        NhanVienSanXuat nhanVienSanXuat=new NhanVienSanXuat(maNhanVien,luongCoBan,hoTen,ngaySinh,diaChi,soSanPham,giaMoiSanPham);
        list.add(nhanVienSanXuat);
        ReadEndWriter.writeSanXuat(list);
    }

    @Override
    public void delete() {
        List<NhanVienSanXuat> list = ReadEndWriter.readFileSanXuat();
        System.out.println("nhập id muốn xóa: ");

            int id = Integer.parseInt(scanner.nextLine());

             for (int i = 0; i < list.size(); i++) {
                 try {     if (list.get(i).getMaNhanVien() == id) {
                     System.out.println("1.yes\n" + "2. no\n");
                     int choice = Integer.parseInt(scanner.nextLine());
                     switch (choice) {
                         case 1:
                             list.remove(list.get(i));
                             break;
                         case 2:
                             System.out.println("quay lại ct");
                             break;
                     }
                 }
                     throw new  NotFoundEmployeeException("khoogn tồn tại");
                 } catch (NotFoundEmployeeException e) {
                     e.printStackTrace();
                 }

                break;

        }
        ReadEndWriter.writeSanXuat(list);
    }

    @Override
    public void search() {
        List<NhanVienSanXuat>list= ReadEndWriter.readFileSanXuat();
        System.out.println("nhập ten sản phẩm muốn tìm: ");
        String name = scanner.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getHoTen().contains(name)) {
                System.out.println(list.get(i));

            }

        }

        }

    }

