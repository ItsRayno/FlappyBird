package Controller;

import Model.Bird;
import Model.Obstacle;

import java.awt.*;
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
    Collide collideCheck;


    public GameTimer(Bird bird, Vector<Obstacle> obstacles, Collide collideCheck) {
        this.bird = bird;
        this.obstacles = obstacles;
        this.collideCheck = collideCheck;
    }

    @Override
    public void run() {
        while(running){
            try {
                sleep(20);
                bird.setyPos(bird.getyPos()+2);
                obstacles.get(0).setxPos(obstacles.get(0).getxPos()-3);
                if (obstacles.get(0).getxPos() < -10){
                    obstacles.get(0).setxPos(680);
                }

                if(Collide()){
                }


            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
    public boolean Collide(){
        boolean check;
        Rectangle r1 = new Rectangle(bird.getxPos(),bird.getyPos(),bird.getBirdWidth(),bird.getBirdHeight());
        Rectangle r2 = new Rectangle(obstacles.get(0).getxPos(),obstacles.get(0).getyPos(),obstacles.get(0).getRecWidth(),obstacles.get(0).getRecHeight());

        if (r1.intersects(r2)){
            check = true;
        }else{
            check = false;
        }
        return check;
    }

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

}
