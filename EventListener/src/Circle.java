import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Circle implements KeyListener, MouseListener {
    private int x;
    private int y;
    private int radius;
    private Color color;
    private Canvas support;

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

    public void addSurface(Canvas c){
        this.support = c;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch(e.getKeyCode()){
            case KeyEvent.VK_UP:
                this.y-=5;
                break;
            case KeyEvent.VK_DOWN:
                this.y+=5;
                break;
            case KeyEvent.VK_LEFT:
                this.x-=5;
                break;
            case KeyEvent.VK_RIGHT:
                this.x+=5;
                break;
            default:
                break;
        }
        this.support.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        int red= (int) (Math.random()*255);
        int blue=(int) (Math.random()*255);
        int green=(int) (Math.random()*255);
        this.color = new Color(red, blue, green);
        this.support.repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
