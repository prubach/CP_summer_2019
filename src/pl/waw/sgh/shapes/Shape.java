package pl.waw.sgh.shapes;

public abstract class Shape implements Comparable<Shape> {

    double parA;
    double parB;

/*    public Shape() {
    }
    */
    public Shape(double parA, double parB) {
        setParams(parA, parB);
    }

    public Shape(double parA) {
        setParams(parA, 0);
    }

    public void setParams(double parA, double parB) {
        this.parA = parA;
        this.parB = parB;
    }

    public abstract double calcSurface();

    public int compareTo(Shape shape) {
        // compare the Double value of our surface with the surface of the given shape
        return Double.valueOf(calcSurface()).compareTo(shape.calcSurface());
    }


    @Override
    public String toString() {
        return "Shape[parA=" + parA + ", parB=" +parB + "]";
    }
}
