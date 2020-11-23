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
    private BufferedImage img_DownPipe;
    public Draw(Bird bird, Vector<Obstacle> obstacles) {
        this.bird = bird;
        this.obstacles = obstacles;

        try {
            img_bird = ImageIO.read(new File("./img/bird.png"));
            img_UpPipe = ImageIO.read(new File("./img/UpPipe.png"));
            img_DownPipe = ImageIO.read(new File("./img/pipe.png"));

        } catch (IOException ex) {
        }
    }


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_OFF);


        g.setColor(Color.RED);
        g.drawImage(img_UpPipe,obstacles.get(0).getxPos(),obstacles.get(0).getyPos(),obstacles.get(0).getRecWidth(),obstacles.get(0).getRecHeight(),null);
        g.drawImage(img_DownPipe,obstacles.get(0).getxPos(),obstacles.get(0).getyPos()+325,obstacles.get(0).getRecWidth(),obstacles.get(0).getRecHeight()+200,null);
        g.drawImage(img_UpPipe,obstacles.get(1).getxPos(),obstacles.get(1).getyPos(),obstacles.get(1).getRecWidth(),obstacles.get(1).getRecHeight(),null);
        g.drawImage(img_UpPipe,obstacles.get(2).getxPos(),obstacles.get(2).getyPos(),obstacles.get(2).getRecWidth(),obstacles.get(2).getRecHeight(),null);



        g.drawImage(img_bird,bird.getxPos(),bird.getyPos(),null);

        repaint();
    }


}
