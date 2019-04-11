package pl.waw.sgh.obj;

public class Rectangle {

    Double parA;
    double parB;

    public Rectangle() {
        parA = 5.0;
        parB = 6.0;
    }

    public Rectangle(double parA, double parB) {
        setParams(parA, parB);
    }

    public Rectangle(double parA) {
        this(parA, 0.0);
        //super(); // Call constructor of super class (parent)
        //this.parA = parA;
    }

    public void setParams(double parA, double b) {
        this.parA = parA;
        parB = b;
    }

    public double calcSurface() {
        return parA * parB;
    }


}
