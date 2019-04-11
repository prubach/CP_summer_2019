package pl.waw.sgh.shapes;

public class Shape {

    double parA;
    double parB;

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

    public String toString() {
        return "Shape[parA=" + parA + ", parB=" +parB + "]";
    }
}
