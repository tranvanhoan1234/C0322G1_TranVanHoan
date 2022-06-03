package luyen_thuat_toan;

import java.sql.Array;
import java.util.Arrays;

public class GiaiSoAm {
    public static void main(String[] args) {

        int[] a = {-1, 150, 190, 170, -1, -1, 160, 180};
  a(a);
    }

    public static void a(int[]a) {

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < i; j++) {

                if (a[i] != -1 && a[j] != -1) {

                    if (a[i] > a[j]) {
                        int temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;

                    }
                }
            }

        }
        System.out.println(Arrays.toString(a));
    }
}

