package cong_ty_abc.severis;

import cong_ty_abc.model.CongTyABC;
import cong_ty_abc.model.NhanVienSanXuat;
import cong_ty_abc.uitl.check_exception.NotFoundEmployeeException;
import cong_ty_abc.uitl.read_writer.ReadEndWriter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NhanVienSanXuatImpl implements Severis {
    private List<CongTyABC> listss = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        listss.clear();
        ReadEndWriter.readFileEmployee(listss);
        for (CongTyABC nhanVienSanXuat : listss) {
            System.out.println(nhanVienSanXuat);
        }
    }

    //    public NhanVienSanXuat(Integer maNhanVien, Integer luongCoBan, String hoTen, String ngaySinh, String diaChi, Integer soSanPham, Integer giaMoiSanPham) {
    public int check() {
        ReadEndWriter.readFileEmployee(listss);

        int id = 1; // gán id = 1
        if (listss.isEmpty()) { //kiểm tra nếu rỗng return 1;
            return id;
        } else {
            for (CongTyABC item : listss) {  //duyệt mảng
                if (id < item.getMaNhanVien()) { //nếu id < id hiện tại
                    id = item.getMaNhanVien(); // gán lại id
                }
            }
            return (id + 1); //trả về id + thêm 1

        }
}
    @Override
    public void add() {
        listss.clear();
        ReadEndWriter.readFileEmployee(listss);
        Integer maNhanVien = check();
        System.out.println("thêm luong co ban nhân viên san xuất");
        Integer luongCoBan = Integer.valueOf(scanner.nextLine());
        System.out.println("thêm ho ten nhân viên san xuất");
        String hoTen = scanner.nextLine();
        System.out.println("thêm nhân viên san xuất");
        String ngaySinh = scanner.nextLine();
        while (!key_study.uitl.regex.Regex.yearRegex(String.valueOf(ngaySinh))) {
            System.err.print("nhập không đúng xin nhập lại : ");
            ngaySinh = scanner.nextLine();
        }
        System.out.println("thêm nhân viên san xuất");
        String diaChi = scanner.nextLine();
        System.out.println("thêm nhân viên san xuất");
        Integer soSanPham = Integer.valueOf(scanner.nextLine());
        System.out.println("thêm nhân viên san xuất");
        Integer giaMoiSanPham = Integer.valueOf(scanner.nextLine());
        NhanVienSanXuat nhanVienSanXuat = new NhanVienSanXuat(maNhanVien, luongCoBan, hoTen, ngaySinh, diaChi, soSanPham, giaMoiSanPham);
        listss.add(nhanVienSanXuat);
        ReadEndWriter.writeSanXuat(listss);
    }

    @Override
    public void delete() {
        listss.clear();
        ReadEndWriter.readFileEmployee(listss);
        System.out.println("nhập id muốn xóa: ");

        int id = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < listss.size(); i++) {
//            try {
                if (listss.get(i).getMaNhanVien() == id) {
                    System.out.println("1.yes\n" + "2. no\n");
                    int choice = Integer.parseInt(scanner.nextLine());
                    switch (choice) {
                        case 1:
                            listss.remove(listss.get(i));
                            break;
                        case 2:
                            System.out.println("quay lại ct");
                            break;
                        case 3:
                            return;
                        default:
                            System.out.println("k thấy xin nhập lại");
                    }
                }
//                throw new NotFoundEmployeeException("khoogn tồn tại");
//            } catch (NotFoundEmployeeException e) {
//                e.printStackTrace();
//            }

            break;

        }
        ReadEndWriter.writeSanXuat(listss);
    }

    @Override
    public void search() {
        listss.clear();
        ReadEndWriter.readFileEmployee(listss);
        System.out.println("nhập ten sản phẩm muốn tìm: ");
        String name = scanner.nextLine();
        for (int i = 0; i < listss.size(); i++) {
            if (listss.get(i).getHoTen().contains(name)) {
                System.out.println(listss.get(i));

            }

        }

    }

    }

