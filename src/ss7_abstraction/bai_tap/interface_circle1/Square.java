package ss7_abstraction.bai_tap.interface_circle2;

public class Square extends Rectangle {
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return super.getWidth();
    }

    public void setSide(double side) {
        super.setWidth(side);
    }

    public void setWidth(double width) {
        this.setSide(width);
    }

    public void setLength(double length) {
        this.setSide(length);
    }

    public double getArea() {
        return this.getSide() * this.getSide();
    }

    public double getPerimeter() {
        return this.getSide() * 4.0D;
    }

    public void resize(double percent) {
        this.setSide(this.getSide() * percent);
    }

    public String toString() {
        return "Side = " + this.getSide() + "\nArea = " + this.getArea() + "\nPerimeter = " + this.getPerimeter() + "\n";
    }
}
