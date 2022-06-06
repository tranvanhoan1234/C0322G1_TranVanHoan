package cong_ty_abc.severis;

import cong_ty_abc.model.NhanVienSanXuat;
import cong_ty_abc.uitl.read_writer.ReadEndWriter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NhanVienSanXuatSeveris implements Severis{
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

    @Override
    public void add() {
        List<NhanVienSanXuat>list= ReadEndWriter.readFileSanXuat();
        System.out.println("thêm mã nhân viên san xuất");
        Integer maNhanVien= Integer.valueOf(scanner.nextLine());
        System.out.println("thêm nhân viên san xuất");
        Integer luongCoBan = Integer.valueOf(scanner.nextLine());
        System.out.println("thêm nhân viên san xuất");
        String hoTen=scanner.nextLine();
        System.out.println("thêm nhân viên san xuất");
        String ngaySinh=scanner.nextLine();
        System.out.println("thêm nhân viên san xuất");
        String diaChi=scanner.nextLine();
        System.out.println("thêm nhân viên san xuất");
        Integer soSanPham= Integer.valueOf(scanner.nextLine());
        System.out.println("thêm nhân viên san xuất");
        Integer giaMoiSanPham= Integer.valueOf(scanner.nextLine());
        NhanVienSanXuat nhanVienSanXuat=new NhanVienSanXuat(maNhanVien,luongCoBan,hoTen,ngaySinh,diaChi,soSanPham,giaMoiSanPham);
        list.add(nhanVienSanXuat);
        ReadEndWriter.writeSanXuat(list);
    }

    @Override
    public void delete() {

    }

    @Override
    public void search() {

    }
}
