import java.util.LinkedList;

public class PointInheritance {
    public static void main(String[] args){
        LinkedList<Point2D> shape = new LinkedList<>();
        shape.add(new Point2D(1,4));
        shape.add(new Point3D(1,3,5));
        shape.add(new Point2D(4,4));
        shape.add(new Point3D(2,6,5));
        shape.add(new Point2D(1,7));
        shape.add(new Point3D(1,9,5));
        shape.add(new Point3D(4,3,5));

        for (Point2D p: shape){
            System.out.println(p);
        }

    }
}
