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
    private BufferedImage img_UpPipe;
    public Draw(Bird bird, Vector<Obstacle> obstacles) {
        this.bird = bird;
        this.obstacles = obstacles;

        try {
            img_bird = ImageIO.read(new File("./img/bird.png"));
            img_UpPipe = ImageIO.read(new File("./img/UpPipe.png"));

        } catch (IOException ex) {
        }
    }


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_OFF);

        g.drawImage(img_bird,bird.getxPos(),bird.getyPos(),null);
        g.setColor(Color.RED);
        g.drawImage(img_UpPipe,obstacles.get(0).getxPos(),obstacles.get(0).getyPos(),obstacles.get(0).getRecWidth(),obstacles.get(0).getRecHeight(),null);

        repaint();
    }


}
