public abstract class Shape implements Comparable<Shape>{
    private String color;

    public Shape(String color){
        this.color = color;
    }

    @Override
    public String toString() {
        return " an area of: " + this.getArea();
    }

    public abstract double getArea();

    @Override
    public int compareTo(Shape t){
        if (this.getArea() < t.getArea()){
            return -1;
        }
        else if (this.getArea() > t.getArea()){
            return 1;
        }
        return 0;
    }
}
