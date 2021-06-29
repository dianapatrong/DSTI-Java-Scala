public class Circle extends Shape {
    private int radius;

    public Circle(int radius, String color){
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea(){
        return Math.PI*Math.pow(this.radius,2);
    }

    @Override
    public String toString() {
        return "This Shape is a Circle with" + super.toString();
    }

}
