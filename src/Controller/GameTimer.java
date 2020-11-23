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
        while (!running){
            try {
                sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        while(running){
            try {
                sleep(10);

                bird.setyPos(bird.getyPos()+2); // Runterfallen
                obstacles.get(0).setxPos(obstacles.get(0).getxPos()-3);
                obstacles.get(1).setxPos(obstacles.get(1).getxPos()-3);
                obstacles.get(2).setxPos(obstacles.get(2).getxPos()-3);

                if (obstacles.get(0).getxPos() < -10){
                    obstacles.get(0).setxPos(1200);
                }
                if (obstacles.get(1).getxPos() < -10){
                    obstacles.get(1).setxPos(1200);
                }
                if (obstacles.get(2).getxPos() < -10){
                    obstacles.get(2).setxPos(1200);
                }

                if(Collide()){
                    running = false;
                }


            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        run();
    }
    public boolean Collide(){
        boolean check;
        Rectangle r1 = new Rectangle(bird.getxPos(),bird.getyPos(),bird.getBirdWidth(),bird.getBirdHeight());
        Rectangle r2 = new Rectangle(obstacles.get(0).getxPos(),obstacles.get(0).getyPos(),obstacles.get(0).getRecWidth(),obstacles.get(0).getRecHeight());
        Rectangle r3 = new Rectangle(obstacles.get(1).getxPos(),obstacles.get(1).getyPos(),obstacles.get(1).getRecWidth(),obstacles.get(1).getRecHeight());
        Rectangle r4 = new Rectangle(obstacles.get(2).getxPos(),obstacles.get(2).getyPos(),obstacles.get(2).getRecWidth(),obstacles.get(2).getRecHeight());
        Rectangle r5 = new Rectangle(obstacles.get(0).getxPos(),obstacles.get(0).getyPos()+325,obstacles.get(0).getRecWidth(),obstacles.get(0).getRecHeight()+200);
        Rectangle r6 = new Rectangle(obstacles.get(1).getxPos(),obstacles.get(1).getyPos()+325,obstacles.get(1).getRecWidth(),obstacles.get(1).getRecHeight()+200);
        Rectangle r7 = new Rectangle(obstacles.get(2).getxPos(),obstacles.get(2).getyPos()+325,obstacles.get(2).getRecWidth(),obstacles.get(2).getRecHeight()+200);

        if (r1.intersects(r2) || r1.intersects(r3) || r1.intersects(r4) || r1.intersects(r5) || r1.intersects(r6) || r1.intersects(r7)){
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
