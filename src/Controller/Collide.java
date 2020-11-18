package Controller;

import Model.Bird;
import Model.Obstacle;

import java.net.CookieHandler;
import java.util.Observable;
import java.util.Vector;

/**
 * @author KRISTOPHER CONCHA LEON BENJAMIN
 * @version 1.0
 * @Date 18.11.2020
 */
public class Collide {
    Bird bird;
    Vector<Obstacle> obstacles;

    public Collide(Bird bird, Vector<Obstacle> obstacles) {
        this.obstacles = obstacles;
        this.bird = bird;
    }
    public Collide(){

    }

    public boolean BirdInFrame(){
        boolean check = false;
        if(bird.getyPos()>551){
            check = true;
        }else{
            check = false;
        }
        return check;

    }
    public boolean BirdHitObsatcle(){
        boolean check = false;
        for (int i = 0; i < obstacles.size(); i++) {
            if(bird.getyPos() == obstacles.get(i).getyPos() && bird.getxPos() == obstacles.get(i).getxPos()){
                check = true;
            } else{
                check = false;
            }

        }
        return check;
    }

}
