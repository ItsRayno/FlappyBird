package View;

import Controller.KeyHandler;
import Model.Bird;
import Model.Obstacle;

import javax.swing.*;
import java.awt.*;
import java.util.Vector;

/**
 * @author KRISTOPHER CONCHA LEON BENJAMIN
 * @version 1.0
 * @Date 18.11.2020
 */
public class GameFrame{


    public GameFrame(Bird bird, Vector<Obstacle> obstacles){
        JFrame frame = new JFrame("Flappy Bird");
        frame.setSize(680,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.addKeyListener(new KeyHandler(bird,obstacles));

        Draw z = new Draw(bird,obstacles);
        z.setBounds(0, 0, 680, 600);
        z.setVisible(true);
        frame.add(z);

        frame.requestFocus();
        frame.setVisible(true);
    }
}
