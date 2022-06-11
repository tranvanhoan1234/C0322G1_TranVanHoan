package ss10_stack_queue.bai_tap.decimal_convert_binary;

import java.util.Scanner;
import java.util.Stack;

public class ConvertDecimalBoBinary {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số thập phân ♠ⁿ : ");
        int number = Integer.parseInt(scanner.nextLine());
        while (number != 0) {
            int num = number % 2;

            stack.push(num);
            number /= 2;
        }
        System.out.println("số nhị phân ☻");
        while (!(stack.isEmpty())) {
            System.out.println(stack.pop());
        }
    }
}
