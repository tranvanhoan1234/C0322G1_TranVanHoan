package thi.severis;

import cong_ty_abc.model.NhanVienQuanLy;
import cong_ty_abc.uitl.check_exception.NotFoundEmployeeException;
import cong_ty_abc.uitl.read_writer.ReadEndWriter;

import java.util.List;

public class CacPT {
//    @Override
//    public void display() {
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
