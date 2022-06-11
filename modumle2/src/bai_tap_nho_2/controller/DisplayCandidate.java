package bai_tap_nho_2.controller;
import bai_tap_nho_2.versice.ExperinceImpl;
import bai_tap_nho_2.versice.FresherImpl;

import java.util.Scanner;

public class DisplayCandidate {

    private Scanner sc = new Scanner(System.in);
    public void displayCandidate() {
        boolean flag = true;
        do {
            System.out.println("---------- mời bạn chọn ----------");
            System.out.println("1.Experience" + "\n" +
                    "2. Fresher " + "\n" +
                    "3. Exit" + "\n");
            System.out.print("Your choice: ");
            int choice;
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    displayExperience();
                    break;
                case 2:
                    displayFresher();
                    break;
                case 3:
                    System.exit(3);
                default:
                    System.out.println("---------- chọn lại menu ----------");
                    break;
            }
        } while (flag);
    }

    public void displayExperience() {
        ExperinceImpl experince=new ExperinceImpl();
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
                    experince.display();
                    break;
                case 2:
                    experince.add();
                    break;
                case 3:
                    experince.delete();
                    break;
                case 4:
                    experince.search();
                    break;
                case 5:
                    break;
                case 6:
                    return;
                default:
                    System.out.println("---------- nahajp k đúng chọn lại ----------");
                    break;
            }
        } while (flag);
    }

    public void displayFresher() {
        FresherImpl fresher=new FresherImpl();
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
                    fresher.display();
                    break;
                case 2:
                    fresher.add();
                    break;
                case 3:
                    fresher.delete();
                    break;
                case 4:
                   fresher.search();
                    break;
                case 5:

                    break;
                case 6:
                    return;
                default:
                    System.out.println("---------- nhập không đúng chọn lại ----------");
                    break;
            }
        } while (flag);
    }

    public void displayDegree() {

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

                    break;
                case 2:
                    break;
                case 3:
                    return;
                default:
                    System.out.println("---------- nhập không đúng chọn lại ----------");
                    break;
            }
        } while (flag);
    }

    public void displaySpXepStudent() {

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
                    break;
                case 2:
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
