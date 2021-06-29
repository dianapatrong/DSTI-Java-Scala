public class Points {

    public static void main(String[] args){
        Point p1 = new Point(1,2);
        Point p2 = new Point(3,4);

        Line myLine = new Line(p1,p2);
        System.out.println(myLine);
    }
}
