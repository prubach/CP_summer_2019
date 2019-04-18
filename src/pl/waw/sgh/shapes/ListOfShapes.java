package pl.waw.sgh.shapes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListOfShapes {

    public static void main(String[] args) {

        //Shape[]

        Rectangle r1 = new Rectangle(4,5);
        List<Shape> myShapeList = new ArrayList<>();
        myShapeList.add(new Rectangle(5,6));
        myShapeList.add(new Circle(8));
        myShapeList.add(r1);

        myShapeList.add(1, new Circle(3));
        myShapeList.remove(0);
        System.out.println("Position of my rectangle: "
                + myShapeList.indexOf(new Rectangle(4,5)));
        System.out.println("Position of R1: "
                + myShapeList.indexOf(r1));

        //myShapeList.add

        for (Shape s : myShapeList) {
            System.out.println(s);
        }
        System.out.println();

        Collections.sort(myShapeList);
        for (Shape s : myShapeList) {
            System.out.println(s);
        }
    }
}
