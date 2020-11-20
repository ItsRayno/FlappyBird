package Model;

import java.awt.*;

/**
 * @author KRISTOPHER CONCHA LEON BENJAMIN
 * @version 1.0
 * @Date 18.11.2020
 */
public class Bird extends Rectangle {
     int xPos = 50;
     int yPos = 50;
     int with = 50;
     int height = 35;


    public Bird(){

    }
    public Bird(int xPo, int yPo, int with, int height) {
        this.xPos = xPo;
        this.yPos = yPos;
        this.with = with;
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

    public int getBirdWidth() {
        return with;
    }

    public void setWidth(int with) {
        this.with = with;
    }


    public int getBirdHeight() {
        return height;
    }

    public void setBirdHeight(int height) {
        this.height = height;
    }
}
