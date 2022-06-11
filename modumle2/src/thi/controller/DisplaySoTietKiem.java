package thi.controller;

import thi.severis.SoTietKiemDaiHanImpl;
import thi.severis.SoTietKiemNganHanImpl;
import thi.uitl.check_exception.IvaliHouseException;

import java.util.Scanner;

public class DisplaySoTietKiem {
    private Scanner sc = new Scanner(System.in);

    public void diplaySoTietKiem() {


        boolean flag = true;
        do {
            System.out.println("---------- quan ly so tiet kiem ----------");
            System.out.println("1.thêm mới sổ tiết kiêm" + "\n" +
                    "2.xóa sổ tiết kiêm " + "\n" +
                    "3. xem sổ tiết kiêm" + "\n" +
                    "4.exit");
            System.out.print("Your choice: ");
            int choice;
            choice = IvaliHouseException.checkExForParseInteger();
            switch (choice) {
                case 1:
                    displaydDaiHanNganHan();
                    break;
                case 2:

                    break;
                case 3:
                    System.exit(3);
                default:
                    System.out.println("---------- nhập không đúng xin vui lòng nhập lại ----------");
                    break;
            }
        } while (flag);
    }

    public void displaydDaiHanNganHan() {

        boolean flag = true;
        int choice;
        do {
            System.out.println("---------- danh sach dai ngan han ----------");
            System.out.println("1. dai han" + "\n" +
                    "2. ngan han " + "\n" +
                    "3. Exit" + "\n");
            System.out.print("Your choice: ");
            choice = IvaliHouseException.checkExForParseInteger();
            switch (choice) {
                case 1:
                    displayDaiHan();
                    break;
                case 2:
                    displayNganHan();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("---------- nahajp k đúng chọn lại ----------");
                    break;
            }
        } while (flag);
    }

    public void displayDaiHan() {
        SoTietKiemDaiHanImpl soTietKiemDaiHan = new SoTietKiemDaiHanImpl();
        boolean flag = true;
        int choice;
        do {
            System.out.println("---------- Nhan vIÊN san xuất ----------");
            System.out.println("1. Display" + "\n" +
                    "2. Add " + "\n" +
                    "3. Delete " + "\n" +
                    "4. quay lại" + "\n");
            System.out.print("Your choice: ");
            choice =  IvaliHouseException.checkExForParseInteger();
            switch (choice) {
                case 1:
                    soTietKiemDaiHan.display();
                    break;
                case 2:
                    soTietKiemDaiHan.add();
                    break;
                case 3:

                    break;
                case 4:
                    return;
                default:
                    System.out.println("---------- nhập không đúng chọn lại ----------");
                    break;
            }
        } while (flag);
    }

    public void displayNganHan() {

        boolean flag = true;
        int choice;
        do {
            System.out.println("---------- stk ngan han ----------");
            System.out.println("1.vô thời han" + "\n" +
                    "2. có thời hạn  " + "\n" +
                    "3. quay lại" + "\n");
            System.out.print("Your choice: ");
            choice =  IvaliHouseException.checkExForParseInteger();
            switch (choice) {
                case 1:
                    displayVoThoiHan();
                    break;
                case 2:
                    displayCoThoiHan();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("---------- nhập không đúng chọn lại ----------");
                    break;
            }
        } while (flag);
    }

    public void displayCoThoiHan() {
        SoTietKiemNganHanImpl soTietKiemNganHan = new SoTietKiemNganHanImpl();

        boolean flag = true;
        int choice;
        do {
            System.out.println("---------- co thoi han ----------");
            System.out.println("1. Display" + "\n" +
                    "2. Add " + "\n" +
                    "5. quay lại" + "\n");
            System.out.print("Your choice: ");
            choice =  IvaliHouseException.checkExForParseInteger();
            switch (choice) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:
                    return;
                default:
                    System.out.println("---------- nhập không đúng chọn lại ----------");
                    break;
            }
        } while (flag);
    }

    public void displayVoThoiHan() {
        SoTietKiemNganHanImpl soTietKiemNganHan = new SoTietKiemNganHanImpl();
        boolean flag = true;
        int choice;
        do {
            System.out.println("---------- vo thoi han ----------");
            System.out.println("1. Display" + "\n" +
                    "2. Add vo thoi han " + "\n" +
                    "3. quay lại" + "\n");
            System.out.print("Your choice: ");
            choice =  IvaliHouseException.checkExForParseInteger();
            switch (choice) {
                case 1:
                    soTietKiemNganHan.display();
                    break;
                case 2:
                    soTietKiemNganHan.add();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("---------- nhập không đúng chọn lại ----------");
                    break;
            }
        } while (flag);
    }

}
