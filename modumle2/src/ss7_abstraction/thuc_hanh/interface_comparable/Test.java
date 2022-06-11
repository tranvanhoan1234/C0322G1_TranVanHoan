package ss7_abstraction.thuc_hanh.interface_comparable;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle("thuận chó điên",true,5.5);
        circles[1] = new ComparableCircle();
        circles[2] = new ComparableCircle("xanh lá cây",false,10.4);

        System.out.println("Pre-sorted:");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }

        Arrays.sort(circles);

        System.out.println("After-sorted:");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }
    }
}
