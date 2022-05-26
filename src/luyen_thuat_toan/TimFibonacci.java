package luyen_thuat_toan;

public class TimFibonacci {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
        System.out.println(fibonacci(i));
        }
    }

    public static int fibonacci(int n) {
        int m = 0;
        int fist = 1;
        int next = 1;
        if (n < 0) {
            return -1;
        } else if (n == 0 || n == 1) {
            return n;
        } else {
            for (int i = 2; i < n; i++) {
                m = fist;
                fist = next;
                next = m + fist;
            }

        }
        return next;
    }
}