package Controller;

import Model.Bird;
import Model.Obstacle;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

/**
 * @author KRISTOPHER CONCHA LEON BENJAMIN
 * @version 1.0
 * @Date 18.11.2020
 */
public class KeyHandler implements KeyListener {
    Bird bird;

    public KeyHandler(Bird bird, Vector<Obstacle> obstacles) {
        this.bird = bird;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_SPACE){
            bird.setyPos(bird.getyPos()-70);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
