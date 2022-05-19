package ss10_stack_queue.bai_tap.queue;

import java.util.Map;
import java.util.TreeMap;

public class DisplayQueue {
    public static void main(String[] args) {
        String string = "HakahaJtDlKhped";
        string = string.toUpperCase();
        Map<Character, Integer> map = new TreeMap<>();
        for (int i = 0; i < string.length(); i++) {
            if (!map.containsKey(string.charAt(i))) {
                map.put(string.charAt(i), 1);
            } else {
                map.put(string.charAt(i), (map.get(string.charAt(i)) + 1));
            }
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}

