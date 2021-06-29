import java.lang.Math;

public class Point {
    private int x;
    private int y;

    public Point(){
        this.x=0;
        this.y=0;
    }

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void setX(int x){
        this.x = x;
    }

    public int getX(){
        return this.x;
    }

    public  void setY(int y){
        this.y =y;
    }

    public int getY(){
        return this.y;
    }

    @Override
    public String toString(){
        return "("+this.x+","+this.y+")";
    }

    public int[] getXY(){
        return new int[] {this.x, this.y};
    }

    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }

    public double distance(int x, int y){
        // return Math.hypot(this.x-x, this.y-y)
        return Math.sqrt(Math.pow(this.x-x, 2)+Math.pow(this.y-y, 2));

    }

    public double distance(Point p){
        return this.distance(p.x, p.y);
    }

    public double distance(){
        return this.distance(0,0);
    }
}
