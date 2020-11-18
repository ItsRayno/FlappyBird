package View;

import Model.Bird;
import Model.Obstacle;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Vector;

/**
 * @author KRISTOPHER CONCHA LEON BENJAMIN
 * @version 1.0
 * @Date 18.11.2020
 */
public class Draw extends JLabel {
    Bird bird;
    Vector<Obstacle> obstacles;

    private BufferedImage img_bird;
    public Draw(Bird bird, Vector<Obstacle> obstacles) {
        this.bird = bird;
        this.obstacles = obstacles;

        try {

            img_bird = ImageIO.read(new File("C:\\Users\\Kristopher\\Desktop\\Informatik\\JavaScriptFREI\\FlappyBird\\img\\bird.jpg"));
        } catch (IOException ex) {
        }
    }


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_OFF);

        g.drawImage(img_bird,bird.getxPo(),bird.getyPos(),null);
        g.setColor(Color.RED);
        g.fillRect(obstacles.get(0).getxPos(),0,100,200);









        repaint();
    }

}
