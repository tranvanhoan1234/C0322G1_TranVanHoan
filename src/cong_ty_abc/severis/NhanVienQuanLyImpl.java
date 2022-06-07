package cong_ty_abc.severis;

import cong_ty_abc.model.CongTyABC;
import cong_ty_abc.model.NhanVienQuanLy;
import cong_ty_abc.uitl.check_exception.NotFoundEmployeeException;
import cong_ty_abc.uitl.read_writer.ReadEndWriter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NhanVienQuanLyImpl implements Severis {
    static Scanner scanner = new Scanner(System.in);
private List<CongTyABC>congTyABCS=new ArrayList<>();

    //    public CongTyABC(Integer maNhanVien, Integer luongCoBan, String hoTen, String ngaySinh, String diaChi)
    //    Integer luongCoBan, Integer heSoLuong
    @Override
    public void display() {
        congTyABCS.clear();
        ReadEndWriter.readFileEmployee(congTyABCS);
        for (CongTyABC congTyABC : congTyABCS) {
            System.out.println(congTyABC);

        }
    }
    public int check() {
        ReadEndWriter.readFileEmployee(congTyABCS);
        int id = 1; // gán id = 1
        if (congTyABCS.isEmpty()) { //kiểm tra nếu rỗng return 1;
            return id;
        } else {
            for (CongTyABC item : congTyABCS) {  //duyệt mảng
                if (id < item.getMaNhanVien()) { //nếu id < id hiện tại
                    id = item.getMaNhanVien(); // gán lại id
                }
            }
            return (id + 1); //trả về id + thêm 1

        }
    }


    @Override
    public void add() {
        congTyABCS.clear();
        ReadEndWriter.readFileEmployee(congTyABCS);
        Integer id = check();
        System.out.println("thêm mã nhân viên");
        Integer maNhanVien= Integer.valueOf(scanner.nextLine());
        System.out.println("thêm lương cơ bản nhân viên quản lý: ");
        Integer luongCoBan = Integer.valueOf(scanner.nextLine());
        System.out.println("thêm họ tên nhân viên quản lý: ");
        String hoTen = scanner.nextLine();
        System.out.println("thêm ngày sinh nhân viên quản lý: ");
        String ngaySinh = scanner.nextLine();
        while (!key_study.uitl.regex.Regex.yearRegex(String.valueOf(ngaySinh))) {
            System.err.print("nhập không đúng xin nhập lại : ");
            ngaySinh = scanner.nextLine();
        }
        System.out.println("thêm nhân địa chỉ viên quản lý: ");
        String diaChi = scanner.nextLine();
        System.out.println("thêm nhân hệ số lương viên quản lý: ");
        Integer heSoLuong = Integer.valueOf(scanner.nextLine());
        NhanVienQuanLy nhanVienQuanLy = new NhanVienQuanLy(id,maNhanVien, hoTen, ngaySinh, diaChi,luongCoBan ,heSoLuong);
        congTyABCS.add(nhanVienQuanLy);
        ReadEndWriter.writeQuanLy(congTyABCS);
    }
//    public NhanVienQuanLy(Integer maNhanVien, Integer luongCoBan, String hoTen, String ngaySinh, String diaChi) {


    @Override
    public void delete() {
        congTyABCS.clear();
        ReadEndWriter.readFileEmployee(congTyABCS);
        System.out.println("nhập id muốn xóa: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < congTyABCS.size(); i++) {
//            try {
                if (congTyABCS.get(i).getMaNhanVien() == id) {
                    System.out.println("1.yes\n" + "2. no\n");
                    int choice = Integer.parseInt(scanner.nextLine());
                    switch (choice) {
                        case 1:
                            congTyABCS.remove(congTyABCS.get(i));
                            break;
                        case 2:
                            System.out.println("quay lại ct");
                            break;
                    }
                    break;
                }
//                throw new NotFoundEmployeeException("khoogn tồn tại");
//            } catch (NotFoundEmployeeException e) {
//                e.printStackTrace();
//            }

        } ReadEndWriter.readFileEmployee(congTyABCS);
    }


    @Override
    public void search() {
        congTyABCS.clear();
       ReadEndWriter.readFileEmployee(congTyABCS);
        System.out.println("nhập mã sản phẩm muốn tìm: ");
        Integer maNhanVien = Integer.valueOf(scanner.nextLine());
        for (int i = 0; i < congTyABCS.size(); i++) {
            if (congTyABCS.get(i).getMaNhanVien().equals(maNhanVien)) {
                System.out.println(congTyABCS.get(i));

            }

        }ReadEndWriter.readFileEmployee(congTyABCS);
    }
}
