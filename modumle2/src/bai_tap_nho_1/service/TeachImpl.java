package bai_tap_nho_1.service;

import bai_tap_nho_1.modol.Teach;
import bai_tap_nho_1.uitl.CompaTeach;
import bai_tap_nho_1.uitl.read_end_write.ReadEndWrite;
import bai_tap_nho_1.uitl.regex.Regex;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TeachImpl implements Service {
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        List<Teach> teaches = ReadEndWrite.readFileTech();
        for (Teach teach : teaches) {
            System.out.println(teach);
        }
    }

    public int check() {
        List<Teach> teaches = ReadEndWrite.readFileTech();
        int id = 1; // gán id = 1
        if (teaches.isEmpty()) { //kiểm tra nếu rỗng return 1;
            return id;
        } else {
            for (Teach item : teaches) {  //duyệt mảng
                if (id < item.getId()) { //nếu id < id hiện tại
                    id = item.getId(); // gán lại id
                }
            }
            return (id + 1); //trả về id + thêm 1

        }
    }

    @Override
    public void add() {
        List<Teach> teaches = ReadEndWrite.readFileTech();

        Integer id = check();
        System.out.println("thêm tên teach");
        String ten = scanner.nextLine();
        System.out.println("thêm tên teach");
        String ngaySinh = scanner.nextLine();
        while (!key_study.uitl.regex.Regex.yearRegex(String.valueOf(ngaySinh))) {
            System.err.print("nhập không đúng xin nhập lại : ");
            ngaySinh = scanner.nextLine();
        }
        System.out.println("thêm giới tính teach");
        String gioiTinh = scanner.nextLine();

        System.out.println("thêm dịa chỉ teach");
        String diaChi = scanner.nextLine();

        System.out.println("them lop day teach");
        String lopDay = scanner.nextLine();

        System.out.println("them luong teach");
        Integer luongMotGio = Integer.valueOf(scanner.nextLine());

        System.out.println("them sô giờ trong tháng teach");
        Integer soGioDayTrongThang = Integer.valueOf(scanner.nextLine());

        Teach teach = new Teach(id, ten, ngaySinh, gioiTinh, diaChi, lopDay, luongMotGio, soGioDayTrongThang);
        teaches.add(teach);
        ReadEndWrite.writeTeach(teaches);
    }
//   String lopDay, Integer luongMotGio, Integer soGioDayTrongThang) {

    @Override
    public void delete() {
        List<Teach> teaches = ReadEndWrite.readFileTech();
        System.out.println("nhập id muốn xóa: ");

        int id = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < teaches.size(); i++) {

            if (teaches.get(i).getId() == id) {
                System.out.println("1.yes\n" + "2. no\n");
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        teaches.remove(teaches.get(i));
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
        ReadEndWrite.writeTeach(teaches);
    }

    @Override
    public void sort() {
        List<Teach> teaches = ReadEndWrite.readFileTech();
        Collections.sort(teaches, new CompaTeach());
        System.out.println("hiển thị danh sách teach: ");
        for (Teach itemp : teaches) {
            System.out.println(itemp);

        }
        System.out.println("da dc sap xếp theo ten: ");
        ReadEndWrite.writeTeach(teaches);
        display();
    }

    public void sapXepTheoNgay() {
        List<Teach> teaches = ReadEndWrite.readFileTech();
        Collections.sort(teaches, new CompaTeach());

        System.out.println("hiển thị danh sách structer: ");
        for (Teach itemp : teaches) {
            System.out.println(itemp);

        }
        System.out.println("đã sắp xếp theo tên: ");
        ReadEndWrite.writeTeach(teaches);

        display();
    }

    @Override
    public void edit() {
        List<Teach> teaches = ReadEndWrite.readFileTech();
        System.out.println("nhap id muon sua: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < teaches.size(); i++) {
            if (teaches.get(i).getId() == id) {
                Integer id1 = check();
                System.out.println("sửa tên học sinh");
                String ten = scanner.nextLine();
                System.out.println("sủa tên teach");
                String ngaySinh = scanner.nextLine();
                while (!Regex.yearRegex(String.valueOf(ngaySinh))) {
                    System.err.print("nhập không đúng xin nhập lại : ");
                    ngaySinh = scanner.nextLine();
                }
                System.out.println("sửa giới tính teach");
                String gioiTinh = scanner.nextLine();

                System.out.println("sửa dịa chỉ teach");
                String diaChi = scanner.nextLine();

                System.out.println("sửa lop day teach");
                String lopDay = scanner.nextLine();

                System.out.println("sửa luong teach");
                Integer luongMotGio = Integer.valueOf(scanner.nextLine());

                System.out.println("sửa sô giờ trong tháng teach");
                Integer soGioDayTrongThang = Integer.valueOf(scanner.nextLine());

                Teach teach = new Teach(id1, ten, ngaySinh, gioiTinh, diaChi, lopDay, luongMotGio, soGioDayTrongThang);
                teaches.add(teach);
                ReadEndWrite.writeTeach(teaches);
                break;
            }
        }
    }
}

