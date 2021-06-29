public class Rectangle extends Shape {
    private int height;
    private int width;

    public Rectangle(int height, int width, String color) {
        super(color);
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea() {
        return this.height*this.width;
    }

    @Override
    public String toString() {
        return "This Shape is a Rectangle with" + super.toString();
    }
}
