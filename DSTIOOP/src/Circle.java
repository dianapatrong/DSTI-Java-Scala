import java.lang.Math.*;
import java.util.Objects;

public class Circle {
    private int x, y;
    private int radius;

    public Circle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
         if (x > 0) this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        if (y > 0)  this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        if (radius > 0) this.radius = radius;
    }

    public double circumference(){
        return 2 * Math.PI * this.radius;
    }

    public double area(){
        return Math.PI * this.radius * this.radius;
    }

    public float diameter(){
        return this.radius * this.radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "x=" + x +
                ", y=" + y +
                ", radius=" + radius +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        final Circle circle = (Circle) obj;
        return radius == circle.radius;
    }
}
