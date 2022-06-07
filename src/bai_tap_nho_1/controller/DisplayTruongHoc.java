package bai_tap_nho_1.controller;

import bai_tap_nho_1.modol.Strudent;
import bai_tap_nho_1.modol.Teach;
import bai_tap_nho_1.service.StudentImpl;
import bai_tap_nho_1.service.TeachImpl;
import cong_ty_abc.severis.NhanVienQuanLyImpl;
import cong_ty_abc.severis.NhanVienSanXuatImpl;
import key_study.uitl.check_exception.CheckException;

import java.util.Scanner;

public class DisplayTruongHoc {

    private Scanner sc = new Scanner(System.in);

    public void diplayTruongHoc() {


        boolean flag = true;
        do {
            System.out.println("---------- mời bạn chọn ----------");
            System.out.println("1.student" + "\n" +
                    "2. teach " + "\n" +
                    "3. Exit" + "\n");
            System.out.print("Your choice: ");
            int choice;
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    displayStudent();
                    break;
                case 2:
                    displayTech();
                    break;
                case 3:
                    System.exit(3);
                default:
                    System.out.println("---------- chọn lại menu ----------");
                    break;
            }
        } while (flag);
    }

    public void displayStudent() {
        StudentImpl student = new StudentImpl();
        boolean flag = true;
        int choice;
        do {
            System.out.println("----------student ----------");
            System.out.println("1. Display" + "\n" +
                    "2. Add " + "\n" +
                    "3. Delete " + "\n" +
                    "4. sort" + "\n" +
                    "5. edit" + "\n" +
                    "6.exit");
            System.out.print("Your choice: ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    student.display();
                    break;
                case 2:
                    student.add();
                    break;
                case 3:
                    student.delete();
                    break;
                case 4:
                   displaySpXepStudent();
                    break;
                    case 5:
                    student.edit();
                    break;
                case 6:
                    return;
                default:
                    System.out.println("---------- nahajp k đúng chọn lại ----------");
                    break;
            }
        } while (flag);
    }

    public void displayTech() {
        TeachImpl teach = new TeachImpl();
        boolean flag = true;
        int choice;
        do {
            System.out.println("---------- teach ----------");
            System.out.println("1. Display" + "\n" +
                    "2. Add " + "\n" +
                    "3. Delete " + "\n" +
                    "4. sort" + "\n" +
                    "5. edit" + "\n" +
                    "6.exit");
            System.out.print("Your choice: ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    teach.display();
                    break;
                case 2:
                    teach.add();
                    break;
                case 3:
                    teach.delete();
                    break;
                case 4:
                  displaySpXep();
                    break;
                    case 5:
                    teach.edit();
                    break;
                case 6:
                    return;
                default:
                    System.out.println("---------- nhập không đúng chọn lại ----------");
                    break;
            }
        } while (flag);
    }  public void displaySpXep() {
        TeachImpl teach=new TeachImpl();
        boolean flag = true;
        int choice;
        do {
            System.out.println("---------- sắp xếp ----------");
            System.out.println("1. sắp xếp theo tên" + "\n" +
                    "2. sắp xếp theo ngày " + "\n" +
                    "3.exit");
            System.out.print("Your choice: ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    teach.sort();
                    break;
                case 2:
                    teach.sapXepTheoNgay();
                 break;
                case 3:
                    return;
                default:
                    System.out.println("---------- nhập không đúng chọn lại ----------");
                    break;
            }
        } while (flag);
    }public void displaySpXepStudent() {
       StudentImpl strudent=new StudentImpl();
        boolean flag = true;
        int choice;
        do {
            System.out.println("---------- sắp xếp ----------");
            System.out.println("1. sắp xếp theo tên" + "\n" +
                    "2. sắp xếp theo ngày " + "\n" +
                    "3.exit");
            System.out.print("Your choice: ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    strudent.sort();
                    break;
                case 2:
                    strudent.sapXeptheoNgay();
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
