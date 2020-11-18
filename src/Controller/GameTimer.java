package Controller;

import Model.Bird;
import Model.Obstacle;

import java.util.Vector;

/**
 * @author KRISTOPHER CONCHA LEON BENJAMIN
 * @version 1.0
 * @Date 18.11.2020
 */
public class GameTimer extends Thread{
    boolean running = true;
    Bird bird;
    Vector<Obstacle> obstacles;
    Collide collideCheck = new Collide();
    int freeze = 1;


    public GameTimer(Bird bird, Vector<Obstacle> obstacles, Collide collideCheck) {
        this.bird = bird;
        this.obstacles = obstacles;
        this.collideCheck = collideCheck;
    }

    @Override
    public void run() {
        while(running){
            try {
                sleep(10);
                bird.setyPos(bird.getyPos()+2);
                obstacles.get(0).setxPos(obstacles.get(0).getxPos()-3);
                if(collideCheck.BirdInFrame()){
                    System.out.println("Hey");
                }
                if(collideCheck.BirdHitObsatcle()){
                    System.out.println("No");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

}
