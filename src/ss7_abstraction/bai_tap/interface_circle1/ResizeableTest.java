package ss7_abstraction.bai_tap.interface_circle1;

public class Resizeable extends Rectangle{
    public static void main(String[] args) {
        int random = (int)(Math.random() * 100.0D);
        Shape[] shapes = new Shape[]{new Circle(5.3D), new Rectangle(10.0D, 3.0D), null};
        shapes[2] = new Circle(((Rectangle)shapes[1]).getWidth());
        System.out.println("----------- Before -----------");
        Shape[] shapes1 = shapes;
        int var4 = shapes.length;

        int var5;
        Shape s;
        for(var5 = 0; var5 < var4; ++var5) {
            s = shapes1[var5];
            System.out.println(s.toString());
        }

        System.out.println("After");
        shapes1 = shapes;
        var4 = shapes.length;

//        for(var5 = 0; var5 < var4; ++var5) {
//            s = var3[var5];
//            if (s instanceof Circle) {
//                ((Circle)s).resize((double)random);
//            } else if (s instanceof Square) {
//                ((Circle)s)resize ((double)random);
//            } else if (s instanceof Rectangle) {
//                ((Rectangle)s).resize((double)random);
//            }
//        }

        shapes1 = shapes;
        var4 = shapes.length;

        for(var5 = 0; var5 < var4; ++var5) {
            s = shapes1[var5];
            System.out.println(s.toString());
        }

    }

    @Override
    public void resize(double v) {

    }
}
