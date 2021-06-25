public class DSTIOOP {
    public static void main(String[] args){
        Circle myCircle  = new Circle( 1, 2, 3);
        Circle myCircle2  = new Circle( 1, 2, 3);

        System.out.println(myCircle);
        if (myCircle.equals(myCircle2)) System.out.println("Circles have the same radius");

    }
}
