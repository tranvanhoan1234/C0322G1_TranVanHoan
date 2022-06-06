package cong_ty_abc.severis;

import cong_ty_abc.model.CongTyABC;
import cong_ty_abc.model.NhanVienQuanLy;
import cong_ty_abc.uitl.read_writer.ReadEndWriter;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class NhanVienQuanLyImpl implements Severis {
    static Scanner scanner = new Scanner(System.in);


    //    public CongTyABC(Integer maNhanVien, Integer luongCoBan, String hoTen, String ngaySinh, String diaChi)
    //    Integer luongCoBan, Integer heSoLuong
    @Override
    public void display() {
        List<NhanVienQuanLy> nhanVienQuanLIES = ReadEndWriter.readFileQuanLy();
        for (NhanVienQuanLy congTyABC : nhanVienQuanLIES) {
            System.out.println(congTyABC);

        }
    }

    @Override
    public void add() {
        List<NhanVienQuanLy> nhanVienQuanLIES = ReadEndWriter.readFileQuanLy();

        System.out.println("thêm tên nhân viên quản lý: ");
        Integer maNhanVien = Integer.valueOf(scanner.nextLine());
        System.out.println("thêm lương cơ bản nhân viên quản lý: ");
        Integer luongCoBan = Integer.valueOf(scanner.nextLine());
        System.out.println("thêm họ tên nhân viên quản lý: ");
        String hoTen = scanner.nextLine();
        System.out.println("thêm ngày sinh nhân viên quản lý: ");
        String ngaySinh = scanner.nextLine();
        System.out.println("thêm nhân địa chỉ viên quản lý: ");
        String diaChi = scanner.nextLine();
        System.out.println("thêm nhân hệ số lương viên quản lý: ");
        Integer heSoLuong = Integer.valueOf(scanner.nextLine());
        NhanVienQuanLy nhanVienQuanLy = new NhanVienQuanLy(maNhanVien, luongCoBan, hoTen, ngaySinh, diaChi, heSoLuong);
        nhanVienQuanLIES.add(nhanVienQuanLy);
        ReadEndWriter.writeQuanLy(nhanVienQuanLIES);
    }
//    public NhanVienQuanLy(Integer maNhanVien, Integer luongCoBan, String hoTen, String ngaySinh, String diaChi) {


    @Override
    public void delete() {
        List<NhanVienQuanLy> nhanVienQuanLIES = ReadEndWriter.readFileQuanLy();
        System.out.println("nhập id muốn xóa: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < nhanVienQuanLIES.size(); i++) {
            if (nhanVienQuanLIES.get(i).getMaNhanVien() == id) {
                System.out.println("1.yes\n" + "2. no\n");
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        nhanVienQuanLIES.remove(nhanVienQuanLIES.get(i));
                        break;
                    case 2:
                        System.out.println("quay lại ct");
                        break;
                }
                break;
            }
        } ReadEndWriter.writeQuanLy(nhanVienQuanLIES);
    }


    @Override
    public void search() {
        List<NhanVienQuanLy> nhanVienQuanLIES = ReadEndWriter.readFileQuanLy();
        System.out.println("nhập mã sản phẩm muốn tìm: ");
        Integer maNhanVien = Integer.valueOf(scanner.nextLine());
        for (int i = 0; i < nhanVienQuanLIES.size(); i++) {
            if (nhanVienQuanLIES.get(i).getMaNhanVien().equals(maNhanVien)) {
                System.out.println(nhanVienQuanLIES.get(i));

            }

        }
    }
}
