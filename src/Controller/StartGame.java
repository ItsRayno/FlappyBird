package Controller;

import Model.Bird;
import Model.Obstacle;
import View.GameFrame;

import java.util.Vector;

/**
 * @author KRISTOPHER CONCHA LEON BENJAMIN
 * @version 1.0
 * @Date 18.11.2020
 */
public class StartGame {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Vector<Obstacle> obstacles = new Vector<>();
        Collide checkCollide = new Collide(bird,obstacles);

        Obstacle obstacleOne = new Obstacle(600,0,70,200);
        Obstacle obstacleTwo = new Obstacle(1000,0,70,200);
        Obstacle obstacleThree = new Obstacle(1400,0,70,200);

        obstacles.add(obstacleOne);
        obstacles.add(obstacleTwo);
        obstacles.add(obstacleThree);


        new GameFrame(bird,obstacles);
        GameTimer gTimer = new GameTimer(bird,obstacles, checkCollide);

        gTimer.run();


    }
}
