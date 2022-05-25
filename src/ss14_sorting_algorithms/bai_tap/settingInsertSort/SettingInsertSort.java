package ss14_sorting_algorithms.bai_tap.settingInsertSort;

import java.util.Arrays;

public class SettingInsertSort {
    public static void main(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {

            int key = arr[i];

            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;

        }   System.out.println("lần thứ "+ Arrays.toString(arr));
    }
}

