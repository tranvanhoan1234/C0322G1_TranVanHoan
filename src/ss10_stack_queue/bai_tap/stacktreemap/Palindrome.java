package ss10_stack_queue.bai_tap.stacktreemap;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        String string = " Able was I ere I saw Elba";
        boolean flag = true;
        Stack<String> stack = new Stack<>();
        Queue<String> queue = new ArrayDeque<>();
        for (int i = 0; i < string.length(); i++) {
            stack.push(string.charAt(i) + "");
            queue.offer(string.charAt(i) + "");
        }
        for (int i = 0; i < string.length(); i++) {
            if (stack.pop().equalsIgnoreCase(queue.poll())) {
                flag = false;
            } else {
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("\"" + string + "\" is palindrome!");
        } else {
            System.out.println("\"" + string + "\" is NOT palindrome!");
        }
    }
}
