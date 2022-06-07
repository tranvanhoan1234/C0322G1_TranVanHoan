package bai_tap_nho_1.service;

import bai_tap_nho_1.modol.Strudent;
import bai_tap_nho_1.uitl.ComparatoNgayStudent;
import bai_tap_nho_1.uitl.InterfaceComparetor;
import bai_tap_nho_1.uitl.read_end_write.ReadEndWrite;
import bai_tap_nho_1.uitl.regex.Regex;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StudentImpl implements Service {
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        List<Strudent> truongHocs = ReadEndWrite.readFileStudent();
        for (Strudent strudent : truongHocs) {
            System.out.println(strudent);
        }

    }

    //    public Strudent(Integer id, Integer ten, Integer gioiTinh, Integer diaChi, Integer maSinhVien, Integer diemTrungBinh) {
    public int check() {
        List<Strudent> strudents = ReadEndWrite.readFileStudent();
        int id = 1; // gán id = 1
        if (strudents.isEmpty()) { //kiểm tra nếu rỗng return 1;
            return id;
        } else {
            for (Strudent item : strudents) {  //duyệt mảng
                if (id < item.getId()) { //nếu id < id hiện tại
                    id = item.getId(); // gán lại id
                }
            }
            return (id + 1); //trả về id + thêm 1

        }
    }

    @Override
    public void add() {
        List<Strudent> truongHocs = ReadEndWrite.readFileStudent();

        Integer id = check();
        System.out.println("thêm ten học sinh");
        String ten = scanner.nextLine();
        System.out.println("thêm ngay sinh học sinh");
        String ngaySinh =scanner.nextLine();
        while (!Regex.yearRegex(String.valueOf(ngaySinh))) {
            System.err.print("nhập không đúng xin nhập lại : ");
            ngaySinh = scanner.nextLine();
        }
        System.out.println("thêm gioi tinh học sinh");
        String gioiTinh = scanner.nextLine();
        System.out.println("thêm dia chi học sinh");
        String diaChi = scanner.nextLine();
        System.out.println("thêm ma sinh vien học sinh");
        Integer maSinhVien = Integer.valueOf(scanner.nextLine());
        System.out.println("thêm diem trung binh học sinh");
        Integer diemTrungBinh = Integer.valueOf(scanner.nextLine());
        Strudent student = new Strudent(id, ten, ngaySinh, gioiTinh, diaChi, maSinhVien, diemTrungBinh);
        truongHocs.add(student);
        ReadEndWrite.writeStudent(truongHocs);
    }

    @Override
    public void delete() {
        List<Strudent> truongHocs = ReadEndWrite.readFileStudent();
        System.out.println("nhập id muốn xóa: ");

        int id = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < truongHocs.size(); i++) {

            if (truongHocs.get(i).getId() == id) {
                System.out.println("1.yes\n" + "2. no\n");
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        truongHocs.remove(truongHocs.get(i));
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
            break;

        }
        ReadEndWrite.writeStudent(truongHocs);
    }

    @Override
    public void sort() {
        List<Strudent> truongHocs = ReadEndWrite.readFileStudent();
        Collections.sort(truongHocs, new InterfaceComparetor());

        System.out.println("hiển thị danh sách structer: ");
        for (Strudent itemp : truongHocs) {
            System.out.println(itemp);

        }
        System.out.println("đã sắp xếp theo tên: ");
        ReadEndWrite.writeStudent(truongHocs);
        ReadEndWrite.writeStudent(truongHocs);
        display();
    }

    public void sapXeptheoNgay() {
        List<Strudent> truongHocs = ReadEndWrite.readFileStudent();
        Collections.sort(truongHocs, new ComparatoNgayStudent());

        System.out.println("hiển thị danh sách structer: ");
        for (Strudent itemp : truongHocs) {
            System.out.println(itemp);
        }
        System.out.println("đã sắp xếp theo tên: ");
        ReadEndWrite.writeStudent(truongHocs);
        ReadEndWrite.writeStudent(truongHocs);
        display();
    }

    @Override
    public void edit() {
        List<Strudent> truongHocs = ReadEndWrite.readFileStudent();
        System.out.println("nhap id muon sua: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < truongHocs.size(); i++) {
            if (truongHocs.get(i).getId() == id) {
                Integer id1 = check();

                System.out.println("sửa ten học sinh");
                String ten = scanner.nextLine();

                System.out.println("sửa ngay sinh học sinh");
                String ngaySinh = scanner.nextLine();
                while (!key_study.uitl.regex.Regex.yearRegex(String.valueOf(ngaySinh))) {
                    System.err.print("sửa không đúng xin nhập lại : ");
                    ngaySinh = scanner.nextLine();
                }
                System.out.println("sửa gioi tinh học sinh");
                String gioiTinh = scanner.nextLine();

                System.out.println("sửa dia chi học sinh");
                String diaChi = scanner.nextLine();

                System.out.println("sửa ma sinh vien học sinh");
                Integer maSinhVien = Integer.valueOf(scanner.nextLine());

                System.out.println("sửa diem trung binh học sinh");
                Integer diemTrungBinh = Regex.checkRegexInterger();

                Strudent student = new Strudent(id1, ten, ngaySinh, gioiTinh, diaChi, maSinhVien, diemTrungBinh);
                truongHocs.set(i, student);
                break;
            }
        }
    }
}
