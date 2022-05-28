package ss17_io_binary_file.bai_tap.controller;

import ss17_io_binary_file.bai_tap.severis.ProductionManger;

import java.util.Scanner;

public class DisplayProduction {
    private Scanner scanner = new Scanner(System.in);
    private ProductionManger productionManger = new ProductionManger();

    public void displayProduction() {
        do {
            System.out.println("-----------displayProduction---------------");
            System.out.println("menu\n" +
                    "1.add\n" +
                    "2.display\n" +
                    "3.sort");
            Integer choice = Integer.valueOf(scanner.nextLine());
            switch (choice) {
                case 1:
                    productionManger.add();
                    break;
                case 2:
                    productionManger.display();
                    break;
                case 3:
                    productionManger.search();
                    break;
                case 4:
                    System.exit(4);
                default:
                    System.out.println("nhập không đúng xin nhập lại :");

            }
        } while (true);
    }
}

