package ss7_abstraction.thuc_hanh.interface_comparable;

public class Cricle extends Shape {
    private double radius = 1.0;

    public Cricle() {
    }

    public Cricle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Cricle : " +
                "radius : " + radius +
                "diện tích : " + getArea() +
                "chu vi : " + getPerimeter() +
                "color : "+ this.getColor()+
                "true||false"+this.isFilled();

    }
}

