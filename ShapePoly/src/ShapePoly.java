import java.util.Collections;
import java.util.LinkedList;

public class ShapePoly {
    public static void main(String[] args){
        LinkedList<Shape> shapes = new LinkedList<>();

        shapes.add(new Rectangle(4, 5, "Red"));
        shapes.add(new Triangle(47, 57, "Blue"));
        shapes.add(new Rectangle(44, 50, "Red"));
        shapes.add(new Triangle(8, 9, "White"));
        shapes.add(new Circle(35, "Black"));
        shapes.add(new Triangle(14, 54, "Pink"));
        shapes.add(new Rectangle(43, 34, "Purple"));
        shapes.add(new Circle(5, "Orange"));


        Collections.sort(shapes, Collections.reverseOrder());
        for(Shape s: shapes){
            System.out.println(s);
        }

    }
}
