package ss7_abstraction.bai_tap.interface_circle1;

import ss7_abstraction.thuc_hanh.interface_comparable.Cricle;

public class ResizeableTest {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        Circle cricle=new Circle();
        Square square=new Square();
        int random = (int) (Math.random() * 100.0D);
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(2, "BLUE", true);
        shapes[1] = new Rectangle(1, 2, "red", true);
        shapes[2] = new Square(1);
        System.out.println("----------- Before -----------");
        Shape[] shapes1 = shapes;
        for (Shape arr : shapes) {
            if (arr instanceof Circle) {
                System.out.println(arr);
                System.out.println("nguoc lai");
               cricle.resize(random);

            }
            if (arr instanceof Rectangle) {
                System.out.println(arr);
                System.out.println("nguoc lai");
                rectangle.resize(10);
            }
            if (arr instanceof Square) {
                System.out.println(arr);
                System.out.println("nguoc lai");
                square.resize(random);
            }
        }
    }
}

