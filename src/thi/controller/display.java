package thi.controller;

import cong_ty_abc.severis.NhanVienQuanLyImpl;
import cong_ty_abc.severis.NhanVienSanXuatImpl;

import java.util.Scanner;

public class display {
    private Scanner sc = new Scanner(System.in);

    public void diplayDanhSachCongTy() {


        boolean flag = true;
        do {
            System.out.println("---------- VEHICLE MANAGER MENU ----------");
            System.out.println("1.nhân viên quản lí" + "\n" +
                    "2. nhân viên san xuất " + "\n" +
                    "3. Exit" + "\n");
            System.out.print("Your choice: ");
            int choice;
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    displayNhanVienQuanLy();
                    break;
                case 2:
                    displaySanXuat();
                    break;
                case 3:
                    System.exit(3);
                default:
                    System.out.println("---------- nhập không đúng xin vui lòng nhập lại ----------");
                    break;
            }
        } while (flag);
    }

    public void displayNhanVienQuanLy() {
        NhanVienQuanLyImpl nhanVienQuanLy = new NhanVienQuanLyImpl();
        boolean flag = true;
        int choice;
        do {
            System.out.println("---------- Nhan vIÊN QUAN LÝ ----------");
            System.out.println("1. Display" + "\n" +
                    "2. Add " + "\n" +
                    "3. Delete " + "\n" +
                    "4. Search" + "\n" +
                    "5. Exit" + "\n");
            System.out.print("Your choice: ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    nhanVienQuanLy.display();
                    break;
                case 2:
                    nhanVienQuanLy.add();
                    break;
                case 3:
                    nhanVienQuanLy.delete();
                    break;
                case 4:
                    nhanVienQuanLy.search();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("---------- nahajp k đúng chọn lại ----------");
                    break;
            }
        } while (flag);
    }

    public void displaySanXuat() {
        NhanVienSanXuatImpl nhanVienQuanLySeveris = new NhanVienSanXuatImpl();
        boolean flag = true;
        int choice;
        do {
            System.out.println("---------- Nhan vIÊN san xuất ----------");
            System.out.println("1. Display" + "\n" +
                    "2. Add " + "\n" +
                    "3. Delete " + "\n" +
                    "4. Search" + "\n" +
                    "5. quay lại" + "\n");
            System.out.print("Your choice: ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    nhanVienQuanLySeveris.display();
                    break;
                case 2:
                    nhanVienQuanLySeveris.add();
                    break;
                case 3:
                    nhanVienQuanLySeveris.delete();
                    break;
                case 4:
                    nhanVienQuanLySeveris.search();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("---------- nhập không đúng chọn lại ----------");
                    break;
            }
        } while (flag);
    }

}
