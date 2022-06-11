package bai_tap_nho_1.uitl.check_exception;

import java.util.Scanner;

public class CheckException {
    static Scanner scanner = new Scanner(System.in);

    public static Integer checkExForParseInteger() {
        while (true) {
            try {
                int value1 = Integer.parseInt(scanner.nextLine());
                return value1;
            } catch (IllegalArgumentException a) {
                System.err.println("Error đúng định dang: " + a.getMessage());
                a.printStackTrace();
            } catch (Exception e) {
                System.err.println("Error: nhập sai định dang " + e.getMessage());
                e.printStackTrace();
            }
        }
    }

}
