package pl.waw.sgh.shapes;

public class Rectangle extends Shape implements PerimeterCalculation {

    public Rectangle(double parA, double parB) {
        super(parA, parB);
    }

    public double calcSurface() {
        return parA*parB;
    }

    @Override
    public double calcPerimeter() {
        return 2*parA+2*parB;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "parA=" + parA +
                ", parB=" + parB +
                '}';
    }
}
