package pl.waw.sgh.shapes;

public class Circle extends Shape {
    public Circle(double parA) {
        super(parA);
    }

    public double calcSurface() {
        return Math.PI*Math.pow(parA,2);
    }
}
