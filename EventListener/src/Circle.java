import java.awt.*;

public class Circle {
    private int x;
    private int y;
    private int radius;
    private Color color;

    public Circle(int x, int y, int radius, Color color) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.color = color;
    }

    public void draw(Graphics g){
        g.setColor(this.color);
        g.fillOval(this.x,this.y,this.radius*2, this.radius*2);
    }
}
