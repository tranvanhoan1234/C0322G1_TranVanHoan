package thi.severis;

import key_study.uitl.check_exception.CheckException;
import thi.model.SoDaiHan;
import thi.uitl.check_exception.IvaliHouseException;
import thi.uitl.read_end_writer.ReadEndWriter;

import java.util.List;
import java.util.Scanner;

public class SoTietKiemDaiHanImpl implements Severis {
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        List <SoDaiHan> soDaiHan= ReadEndWriter.readFileDaiHan();
        for (SoDaiHan soDaiHan1:soDaiHan) {
            System.out.println(soDaiHan1);
        }
    }
//    public SoDaiHan(Integer maSoSo, Integer maKhachHang, String ngayMoSo, String thoiGianBatDauGui, Integer soTienGui, Integer laiXuat, String kyHan, String uuDai) {

    @Override
    public void add() {
       List <SoDaiHan> soDaiHan= ReadEndWriter.readFileDaiHan();
        System.out.println("thêm");
        Integer maSoSo =  IvaliHouseException.checkExForParseInteger();
        System.out.println("thêm");
        Integer maKhachHang =  IvaliHouseException.checkExForParseInteger();
        System.out.println("thêm");
        String ngayMoSo = scanner.nextLine();
        System.out.println("thêm");
        String thoiGianBatDauGui = scanner.nextLine();
        System.out.println("thêm");
        Integer soTienGui =  IvaliHouseException.checkExForParseInteger();
        System.out.println("thêm");
        Integer laiXuat =  IvaliHouseException.checkExForParseInteger();
        System.out.println("thêm");
        String kyHan = null;
        while (kyHan == null) {
            System.out.println("thời hạn : \n" +
                    "1.1 năm,\n" +
                    "2.3 năm,\n" +
                    "3.5 năm, \n" + "4.10 năm,\n");
            Integer choice =  IvaliHouseException.checkExForParseInteger();
            switch (choice) {
                case 1:
                    kyHan = "Diamond";
                    break;
                case 2:
                    kyHan = "Platinium";
                    break;
                case 3:
                    kyHan = "Gold";
                    break;
                case 4:
                    kyHan = "Silver";
                    break;
                case 5:
                    kyHan = "Member";
                    break;
                default:
                    System.out.println("nhập sai xin nhập đúng yêu cầu");
            }
        }
//            public SoDaiHan(Integer maSoSo, Integer maKhachHang, String ngayMoSo, String thoiGianBatDauGui, Integer soTienGui, Integer laiXuat, String kyHan) {

            System.out.println("thêm");
        String uuDai = scanner.nextLine();
        SoDaiHan soDaiHan1 =new SoDaiHan(maSoSo,maKhachHang,ngayMoSo,thoiGianBatDauGui,soTienGui,laiXuat,kyHan);
   soDaiHan.add(soDaiHan1);
   ReadEndWriter.writeDaiHan(soDaiHan);
    }

    @Override
    public void delete() {

    }
//    @Override
//    public void DisplaySoTietKiem() {
//        List<NhanVienQuanLy> nhanVienQuanLIES = ReadEndWriter.readFileQuanLy();
//        for (NhanVienQuanLy congTyABC : nhanVienQuanLIES) {
//            System.out.println(congTyABC);
//
//        }
//    }
//    public int check() {
//        List<NhanVienQuanLy> nhanVienQuanLIES = ReadEndWriter.readFileQuanLy();
//        int id = 1; // gán id = 1
//        if (nhanVienQuanLIES.isEmpty()) { //kiểm tra nếu rỗng return 1;
//            return id;
//        } else {
//            for (NhanVienQuanLy item : nhanVienQuanLIES) {  //duyệt mảng
//                if (id < item.getMaNhanVien()) { //nếu id < id hiện tại
//                    id = item.getMaNhanVien(); // gán lại id
//                }
//            }
//            return (id + 1); //trả về id + thêm 1
//
//        }
//    }
//
//
//    @Override
//    public void add() {
//        List<NhanVienQuanLy> nhanVienQuanLIES = ReadEndWriter.readFileQuanLy();
//        Integer maNhanVien = check();
//        System.out.println("thêm lương cơ bản nhân viên quản lý: ");
//        Integer luongCoBan = Integer.valueOf(scanner.nextLine());
//        System.out.println("thêm họ tên nhân viên quản lý: ");
//        String hoTen = scanner.nextLine();
//        System.out.println("thêm ngày sinh nhân viên quản lý: ");
//        String ngaySinh = scanner.nextLine();
//        while (!key_study.uitl.regex.Regex.yearRegex(String.valueOf(ngaySinh))) {
//            System.err.print("nhập không đúng xin nhập lại : ");
//            ngaySinh = scanner.nextLine();
//        }
//        System.out.println("thêm nhân địa chỉ viên quản lý: ");
//        String diaChi = scanner.nextLine();
//        System.out.println("thêm nhân hệ số lương viên quản lý: ");
//        Integer heSoLuong = Integer.valueOf(scanner.nextLine());
//        NhanVienQuanLy nhanVienQuanLy = new NhanVienQuanLy(maNhanVien, luongCoBan, hoTen, ngaySinh, diaChi, heSoLuong);
//        nhanVienQuanLIES.add(nhanVienQuanLy);
//        ReadEndWriter.writeQuanLy(nhanVienQuanLIES);
//    }
////    public NhanVienQuanLy(Integer maNhanVien, Integer luongCoBan, String hoTen, String ngaySinh, String diaChi) {
//
//
//    @Override
//    public void delete() {
//        List<NhanVienQuanLy> nhanVienQuanLIES = ReadEndWriter.readFileQuanLy();
//        System.out.println("nhập id muốn xóa: ");
//        int id = Integer.parseInt(scanner.nextLine());
//        for (int i = 0; i < nhanVienQuanLIES.size(); i++) {
//            try {
//                if (nhanVienQuanLIES.get(i).getMaNhanVien() == id) {
//                    System.out.println("1.yes\n" + "2. no\n");
//                    int choice = Integer.parseInt(scanner.nextLine());
//                    switch (choice) {
//                        case 1:
//                            nhanVienQuanLIES.remove(nhanVienQuanLIES.get(i));
//                            break;
//                        case 2:
//                            System.out.println("quay lại ct");
//                            break;
//                    }
//                    break;
//                }
//                throw new NotFoundEmployeeException("khoogn tồn tại");
//            } catch (NotFoundEmployeeException e) {
//                e.printStackTrace();
//            }
//
//        } ReadEndWriter.writeQuanLy(nhanVienQuanLIES);
//    }
//
//
//    @Override
//    public void search() {
//        List<NhanVienQuanLy> nhanVienQuanLIES = ReadEndWriter.readFileQuanLy();
//        System.out.println("nhập mã sản phẩm muốn tìm: ");
//        Integer maNhanVien = Integer.valueOf(scanner.nextLine());
//        for (int i = 0; i < nhanVienQuanLIES.size(); i++) {
//            if (nhanVienQuanLIES.get(i).getMaNhanVien().equals(maNhanVien)) {
//                System.out.println(nhanVienQuanLIES.get(i));
//
//            }
//
//        }
//    }
}
