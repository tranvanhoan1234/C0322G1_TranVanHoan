package luyen_thuat_toan;

public class InDaySo3 {
    //    In dãy số 1, 2, 3, 5, 8, 13, ...n (n là số nhập vào từ bàn phím) (*)
    public static void main(String[] args) {

        int[] a = new int[100];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 100);
        }
        int count = 0;
        for (int i = 2; i < a.length; i++) {
            if (i % 2 == 0) {
                if (count < 2) {
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
