public class Line {
    private Point begin;
    private Point end;

    public Line(Point begin, Point end){
        this.begin = begin;
        this.end = end;
    }

    public Line(int x1, int y1, int x2, int y2){
        this.begin = new Point(x1,y1);
        this.end = new Point(x2, y2);
    }

    public Point getBegin() {
        return this.begin;
    }

    public void setBegin(Point begin){
        this.begin = begin;
    }

    public Point getEnd() {
        return this.end;
    }

    public void setEnd(Point end){
        this.end = end;
    }

    public int getBeginX(){
        return this.begin.getX();
    }

    public void setBeginX(int x){
        this.begin.setX(x);
    }

    public int getBeginY(){
        return this.begin.getY();
    }

    public void setBeginY(int y){
        this.begin.setY(y);
    }
    public int[] getBeginXY(){
        return this.begin.getXY();
    }

    public void setBeginXY(int x, int y){
        this.begin.setXY(x,y);
    }

    public int getEndX(){
        return this.end.getX();
    }

    public void setEndX(int x){
        this.end.setX(x);
    }

    public int getEndY(){
        return this.end.getY();
    }

    public void setEndY(int y){
        this.end.setY(y);
    }

    public int[] getEndXY(){
        return this.end.getXY();
    }

    public void setEndXY(int x,int y){
        this.end.setXY(x,y);
    }

    @Override
    public String toString(){
        return "Line[begin="+this.begin.toString()+", end="+this.end.toString()+", length="+ this.getLength()+"]";
    }

    public double getLength(){
        return this.begin.distance(this.end);
    }
}
