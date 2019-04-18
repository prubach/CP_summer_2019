package pl.waw.sgh.shapes;

import java.util.Comparator;

public class ShapeComparator implements Comparator<Shape> {
    @Override
    public int compare(Shape shape1, Shape shape2) {
        Double sumPars1 = Double.valueOf(shape1.parA+shape1.parB);
        Double sumPars2 = Double.valueOf(shape2.parA+shape2.parB);
        return sumPars1.compareTo(sumPars2);
    }
}
