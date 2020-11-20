package Model;
import java.awt.Rectangle;

/**
 * @author KRISTOPHER CONCHA LEON BENJAMIN
 * @version 1.0
 * @Date 18.11.2020
 */
public class Obstacle extends Rectangle{
     int xPos = 580;
     int yPos = 0;
     int width;
     int height;

     public Obstacle(){

     }
    public Obstacle(int xPos, int yPos, int width, int height) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.width = width;
        this.height = height;
    }

    public int getxPos() {
        return xPos;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
    }

    public int getRecWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getRecHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }


}
