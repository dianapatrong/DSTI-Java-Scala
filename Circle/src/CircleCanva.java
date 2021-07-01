import javax.swing.*;
import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CircleCanva extends Canvas{
    public static final int WIDTH = 800;
    public static final int HEIGHT = 600;
    private JFrame window;
    private Circle circle;
    private EventListener evl;

    public CircleCanva(String title){
        //Circle
        this.circle = new Circle(50, Color.RED);

        //JFrame
        this.window = new JFrame();
        this.window.setTitle(title);
        this.window.setSize(WIDTH, HEIGHT);
        this.window.setResizable(false);
        this.window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.window.add(this);
        this.window.setVisible(true);
        this.evl = new EventListener(circle, this);


        //Canva
        this.setBackground(Color.black);
    }

    public void start(){
        while(true){
            try {
                this.repaint();
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(CircleCanva.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static void main(String[] args){
        CircleCanva cnv = new CircleCanva("Circle App");
        cnv.start();
    }
    public void paint(Graphics g){
        super.paint(g);
        if (this.circle != null){
            this.circle.draw(g);
        }
    }
}
