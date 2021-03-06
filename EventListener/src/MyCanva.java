import java.awt.*;

public class MyCanva extends Canvas {

    private Circle myCircle;

    public MyCanva(){
        this.setBackground(Color.black);
        this.setVisible(true);
    }

    public void addCircle(Circle c){
        this.myCircle = c;
        this.myCircle.addSurface(this);
        this.addKeyListener(this.myCircle);
        this.addMouseListener(this.myCircle);
        this.addMouseMotionListener(this.myCircle);
    }

    @Override
    public void paint(Graphics g){
        super.paint(g);
        if (this.myCircle != null ){
            this.myCircle.draw(g);
        }

    }



}
