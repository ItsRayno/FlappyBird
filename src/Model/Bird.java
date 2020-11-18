package Model;

/**
 * @author KRISTOPHER CONCHA LEON BENJAMIN
 * @version 1.0
 * @Date 18.11.2020
 */
public class Bird {
     int xPo = 50;
     int yPos = 50;


    public Bird(){

    }
    public Bird(int xPo, int yPos) {
        this.xPo = xPo;
        this.yPos = yPos;
    }

    public int getxPo() {
        return xPo;
    }

    public void setxPo(int xPo) {
        this.xPo = xPo;
    }

    public int getyPos() {
        return yPos;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
    }
}
