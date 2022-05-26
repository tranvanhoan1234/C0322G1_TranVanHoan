package luyen_thuat_toan;

import java.util.Scanner;

public class Algorithm {
    public static void main(String[] args) {
//        In dãy số 2, -4, 6, -8, 10 ... n (n là số nhập vào từ bàn phím) (*)
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số n : ");
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 2; i < n; i++) {
            if (i % 2 == 0) {
                if (count < 1) {
                    System.out.println(i);
                    count++;
                } else {
                    System.out.println("-" + i);
                    count = 0;
                }

            }

        }

    }
}



