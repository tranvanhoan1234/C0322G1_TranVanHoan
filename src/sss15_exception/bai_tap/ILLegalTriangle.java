package sss15_exception.bai_tap;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ILLegalTriangle {
    public static void main(String[] args) {
        do {
            Scanner scanner = new Scanner(System.in);

            try {
                System.out.println("Nhập cạnh a của tam giác");
                Integer a = Integer.valueOf(scanner.nextLine());
                System.out.println("Nhập cạnh b của tam giác");
                Integer b = Integer.valueOf(scanner.nextLine());
                System.out.println("Nhập cạnh c của tam giác");
                Integer c = Integer.valueOf(scanner.nextLine());
                for (int i = 0; i < 6; i++) {
                    if (a + b > c) {
                        System.out.println("là hình tam giác ");
                        System.out.println("-----------");
                        break;
                    }
                    if (a + b < c) {
                        System.out.println("không phai tam giác ");
                        break;
                    }
                    if (a < b + c) {
                        System.out.println("không phải tam giác");
                        break;
                    }
                }
            } catch (NumberFormatException e) {
                System.err.println(e.getMessage());

            } catch (InputMismatchException e) {
                System.err.println(e.getMessage());

            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        } while (true);
    }
}
