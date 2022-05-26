package ss7_abstraction.bai_tap.interface_circle2;

public class Square extends Rectangle implements Colorable {

    public Square() {
    }
    public Square(double width, double length) {
        super(width, length);
    }

    public Square(double width, double length, String color, boolean filled) {
        super(width, length, color, filled);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {

        Shape[] shapes = new Shape[]{new Rectangle(6, 10), new Circle(4), new Square(1, 3)};
        Shape[] shapes1 = shapes;
        int var4 = shapes.length;

        for (int var1 = 0; var1 < var4; ++var1) {
            Shape s = shapes1[var1];
            if (s instanceof Square) {
                ((Square) s).howToColor();
            }

            System.out.println(s.toString());
        }

    }
    @Override
    public void howToColor() {
        System.out.println("Color all four sides : ");
    }

}



