package pl.waw.sgh.obj;

public class PlayWithRectangle {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.setParams(3.0,4.0);
        System.out.println("R1 surface: " + r1.calcSurface());
    }
}
