public class Triangle extends Shape{
    private int height;
    private int base;

    public Triangle(int height, int base, String color) {
        super(color);
        this.height = height;
        this.base = base;
    }
    @Override
    public double getArea() {
        return (this.base*this.height)/2;
    }

    @Override
    public String toString() {
        return "This Shape is a Triangle with" + super.toString();
    }
}
