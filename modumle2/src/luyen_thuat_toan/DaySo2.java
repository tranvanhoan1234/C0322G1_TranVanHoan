package luyen_thuat_toan;

import java.util.Scanner;

public class DaySo2 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        In dãy số 1, 2, 3, 5, 8, 13, ...n (n là số nhập vào từ bàn phím) (*)
        int[] a = new int[100];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 100);
        }


        int count = 1;
        int n = 1;
        for (int i = 0; i < n; i++) {
            if (íPrime(i)) {
                System.out.println(i);
                count++;
            }
            if (count > 100) {
                break;
            } else {
                n++;
            }
        }
    }

    private static boolean íPrime(int n) {
        if (n < 2) {
            return false;
        } else if (n <= 3) {
            return true;
        } else {
            for (int j = 2; j < n; j++) {
                if (n % j == 0) {
                    return false;
                }
            }
        }
        return true;
    }

}

