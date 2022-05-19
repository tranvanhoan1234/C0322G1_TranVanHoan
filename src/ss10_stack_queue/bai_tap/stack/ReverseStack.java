package ss10_stack_queue.bai_tap.stack;

import java.util.Scanner;
import java.util.Stack;

public class ReverseStack {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String mWord = "";
        Stack<Integer> stack = new Stack<>();

        System.out.println("nhập CÁI GÌ BẠN THÍCH ");

        String word = scanner.nextLine();
        for (int i = 0; i < word.length(); i++) {
            stack.push(Integer.valueOf(word.charAt(i) + ""));
        }
        System.out.println("CHUỖI ĐẢO mang");
        while (!stack.isEmpty()) {
            mWord += stack.pop();
        }
        System.out.println(mWord);

        System.out.println("--------------------------");

        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhap phan tu thu " + i + ": ");
            arr[i] = Integer.parseInt(scanner.nextLine());
        }

        System.out.println("Mảng ban đầu");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }

        System.out.println("Mảng sau khi đảo ngược");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}