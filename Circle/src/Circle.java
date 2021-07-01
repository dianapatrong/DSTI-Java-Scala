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

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        if (x > CircleCanva.WIDTH){
            this.x=0;
        }
        else if( x<0){
            this.x = CircleCanva.WIDTH;
        }
        this.x = x;

    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        if (y > CircleCanva.HEIGHT){
            this.y=0;
        }
        else if(y<0){
            this.y = CircleCanva.HEIGHT;
        }
        this.y = y;
    }

    public int getRadius() {
        return this.radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Color getColor() {
        return this.color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
