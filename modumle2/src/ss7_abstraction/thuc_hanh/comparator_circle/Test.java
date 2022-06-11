package ss7_abstraction.thuc_hanh.comparator_circle;

import javafx.scene.shape.Circle;

import java.util.Arrays;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        Circle[] circle =new Circle[3];
        circle [0]=new Circle(5.5);
        circle [1]=new Circle();
        circle [2]=new Circle(4,4.2,3.4);

        System.out.println("Pre-sorted:");
        for (Circle circle1 : circle) {
            System.out.println(circle1);
        }

        Comparator circleComparator = new CircleComparator();
        Arrays.sort(circle, circleComparator);

        System.out.println("After-sorted:");
        for (Circle circle1 : circle) {
            System.out.println(circle1);
        }
    }
}
