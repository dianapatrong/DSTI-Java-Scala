import java.util.LinkedList;

public class ShapePoly {
    public static void main(String[] args){
        LinkedList<Shape> shapes = new LinkedList<>();
        shapes.add(new Rectangle(4, 5, "Red"));
        shapes.add(new Triangle(4, 5, "Blue"));

        for(Shape s: shapes){
            System.out.println(s);
        }

    }
}
