import javax.swing.*;
import java.awt.*;

public class CircleApp extends JFrame {

    private MyCanva cnv;

    public CircleApp(String title, int width, int height){
        this.cnv = new MyCanva();
        this.cnv.addCircle(new Circle(width/2, height/2, 25, Color.RED));
        this.setTitle(title);
        this.setSize(width, height);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.add(this.cnv);
        this.setVisible(true);
    }
}
