package ss14_sorting_algorithms.bai_tap;

import java.util.Arrays;

public class InsertionSortIllustration {

    public static void insertSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
//          key = phần tử chèn vào trong danh sách con
            int key = arr[i];
//           Vị trí của phần tử cuối cùng ở danh sách con
            int j = i - 1;
//            Di chuyển các phần tử của arr [0..i-1], đó là
//            lớn hơn key, đến một vị trí phía trước
//            vị trí hiện tại của họ
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];

                j--;
            }
            arr[j + 1] = key;
            System.out.println("lần thứ " + i + Arrays.toString(arr));
        }
    }

    public static void main(String[] args) {
        int[] a = {2, 5, 3, 4, 1};
        insertSort(a);
    }
}
