import java.awt.*;

public class Circle {
    private int x;
    private int y;
    private int radius;
    private Color color;

    public Circle(int x, int y, int radius, Color color){
        this.x=x;
        this.y=y;
        this.radius = radius;
        this.color = color;
    }

    public Circle(int radius, Color color){
        this.radius = radius;
        this.color = color;

        this.x =(int) (Math.random()*(CircleCanva.WIDTH- radius*2));
        this.y = (int) (Math.random()*(CircleCanva.HEIGHT- radius*2));

    }

    public void draw(Graphics g){
        g.setColor(this.color);
        g.fillOval(this.x, this.y, this.radius*2, this.radius*2);
    }
}
