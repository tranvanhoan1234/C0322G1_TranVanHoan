package ss7_abstraction.bai_tap.interface_circle1;

public class Rectangle extends Shape implements IResize {
    private double width = 1.0D;
    private double length = 1.0D;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return this.length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return this.width * this.length;
    }

    public double getPerimeter() {
        return 2.0D * (this.width + this.length);
    }

    public void resize(double percent) {
        this.width *= percent;
        this.length *= percent;
        System.out.println(this);
    }
    public String toString() {
        return "Width = " + this.width + "\nLenght = " + this.length + "\nArea = " + this.getArea() + "\nPerimeter = " + this.getPerimeter() + "\n";
    }
}
