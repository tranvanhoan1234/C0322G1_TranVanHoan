package ss12_java_collection_framework.bai_tap.controller;

import ss12_java_collection_framework.bai_tap.severis.ProductManage;

import java.util.Scanner;

public class DisplayProduct {
    private static ProductManage productManage = new ProductManage();
    private static Scanner scanner = new Scanner(System.in);

    public void displayProducts() {
        while (true) {
            System.out.println("--------menu--------");
            System.out.println("xin mời chọn chức năng"
                    + "\n1.displayProduct"
                    + "\n2.addProduct"
                    + "\n3.editProduct"
                    + "\n4.searchProduct"
                    + "\n5.deleteProduct"
                    + "\n6.shortProduct"
                    + "\n7.thoát chương trình");
            int choice = Integer.valueOf(scanner.nextLine());
            switch (choice) {
                case 1:
                    productManage.displayProduct();
                    break;
                case 2:
                    productManage.addProduct();
                    break;
                case 3:
                    productManage.editProduct();
                    break;
                case 4:
                    productManage.search();
                    break;
                case 5:
                    productManage.deleteProduct();
                    break;
                case 6:
                    productManage.sortProduct();
                    break;
                case 7:
                    System.exit(6);
                    return;
                default:
                    System.out.println("nhập không đúng hãy nhập lại");
            }
        }
    }
}
