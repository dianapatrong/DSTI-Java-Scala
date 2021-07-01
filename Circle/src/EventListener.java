import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.security.Key;

public class EventListener implements KeyListener {
    private Circle target;
    private Canvas binded;

    public EventListener(Circle target, Canvas binded) {
        this.target = target;
        this.binded = binded;
        this.binded.addKeyListener(this);
    }

    public Circle getTarget() {
        return target;
    }

    public void setTarget(Circle target) {
        this.target = target;
    }

    public Canvas getBinded() {
        return binded;
    }

    public void setBinded(Canvas binded) {
        this.binded = binded;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch(e.getKeyCode()){
            case KeyEvent.VK_LEFT:
                this.target.setX(this.target.getX()-5);
                break;
            case KeyEvent.VK_RIGHT:
                this.target.setX(this.target.getX()+5);
                break;
            case KeyEvent.VK_UP:
                this.target.setY(this.target.getY()-5);
                break;
            case KeyEvent.VK_DOWN:
                this.target.setY(this.target.getY()+55);
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}


