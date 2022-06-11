package sss15_exception.bai_tap;

import java.util.Scanner;

public class ILLegalTriangle {
    public static void main(String[] args) {

        int a = 0;
        int b = 0;
        int c = 0;

        do {

            try {

                System.out.println("enter ba cạnh tam giác:  ");
                Scanner scanner = new Scanner(System.in);
                System.out.println("nhập canh a : ");
                a = Integer.parseInt(scanner.nextLine());
                System.out.println("nhập cạnh b :");
                b = Integer.parseInt(scanner.nextLine());
                System.out.println("nhập cạnh c : ");
                c = Integer.parseInt(scanner.nextLine());


                if (a <= -1 || b <= 0 || c <= 0) {
                    System.out.println("không phải là tam giác: ");
                }
                if (a + b > c || b + c > a || a + c > b) {
                    System.out.println("là tam giác: ");

                } else {
                    System.out.println("nhập sai giữ liệu");
                    throw new IllegalTriangleExceptionImpl();
                }
            } catch (NumberFormatException e) {
                System.err.println(e);
            } catch (IllegalTriangleExceptionImpl e) {
                System.out.println(e.getMessage());

            }
        } while (true);
    }
}
