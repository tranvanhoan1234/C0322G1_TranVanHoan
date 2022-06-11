package company_abc.controller;

import company_abc.severis.MapInterface;
import company_abc.severis.SuDungArray;
import company_abc.severis.SuDungArrayLinkedList;
import company_abc.severis.SuDungArrayList;

import java.util.Scanner;

public class DisplayCompany {
    private Scanner scanner = new Scanner(System.in);
    SuDungArray suDungArray = new SuDungArray();
    SuDungArrayList suDungArrayList = new SuDungArrayList();
    SuDungArrayLinkedList suDungArrayLinkedList = new SuDungArrayLinkedList();
    MapInterface mapInterface = new MapInterface();

    public void displayCompany() {
        while (true) {
            System.out.println("---------hiên thị chức năng---------\n"
                    + "1.array \n"
                    + "2.arraylist\n"
                    + "3.arraylinkedlist\n"
                    + "4 sắp xếp \n"
                    + "5.hiển thị dạng máp \n"
                    + "6 thoát");
            Integer choice = Integer.valueOf(scanner.nextLine());
            switch (choice) {
                case 1:
                    suDungArray.displayArrayList();
                    break;
                case 2:
                    suDungArrayList.displayArrayList();
                    break;
                case 3:
                    suDungArrayLinkedList.displayArrayList();
                    break;
                case 4:
                    displaySapXep();
                    break;
                case 5:
                    mapInterface.displayMap();
                    break;
                case 6:
                    System.exit(6);
                    break;
                default:
                    System.out.println("nhập không đúng xin nhập lại: ");
                    break;
            }
        }
    }

    public void displaySapXep() {

        while (true) {
            System.out.println("1.sắp xếp theo lương\n"
                    + "2.sắp xếp theo tên\n" +
                    "3.quay lại menu");
            Integer choice = Integer.valueOf(scanner.nextLine());
            switch (choice) {
                case 1:
                    suDungArrayLinkedList.sapXepTheoLuong();
                    break;
                case 2:
                    suDungArrayLinkedList.sapXepTheoTen();
                case 3:
                    return;
                default:
                    System.out.println("nhập không đúng xin nhập lại");
            }
        }
    }
}

