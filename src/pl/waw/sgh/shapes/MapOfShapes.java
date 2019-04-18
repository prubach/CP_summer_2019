package pl.waw.sgh.shapes;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MapOfShapes {

    public static void main(String[] args) {
        Map<String, Shape> myMapShape = new HashMap<>();
        myMapShape.put("C1", new Circle(5));
        myMapShape.put("R1", new Rectangle(7, 8));
        myMapShape.put("C2", new Circle(6));

        Circle c2  = (Circle)myMapShape.get("C2");
        System.out.println("c2: " + c2);

        System.out.println();
        for (String k : myMapShape.keySet()) {
            System.out.println(k + " is " + myMapShape.get(k));
        }

        Collection shapes = myMapShape.values();

    }
}
