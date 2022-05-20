package ss10_stack_queue.bai_tap;

import java.util.Scanner;
import java.util.Stack;

public class Bracket {
    public static void main(String[] args) {
        Stack<String> bStack = new Stack<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập chuỗi kí tự: ");
        String s1 = scanner.nextLine();

        String[] strings = s1.split("");
        for (String str : strings) {
            if (str.equals("(")) {
                bStack.push(str);
            }
            if (str.equals(")")) {
                if (bStack.empty()) {
                    bStack.push("34");
                    break;
                }
                bStack.pop();
            }
        }
        if (bStack.size() == 0) {
            System.out.println("Well");
        } else {
            System.out.println("???");
        }
    }

}
