package pl.waw.sgh.shapes;

public class PlayWithShapes {

    public static void main(String[] args) {
        Shape s1 = new Shape(5);
        System.out.println(s1.toString());

        Rectangle r1 = new Rectangle(3,8);
        System.out.println(r1);
        System.out.println(r1.calcSurface());
    }
}
