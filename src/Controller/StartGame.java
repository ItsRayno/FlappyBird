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

        Obstacle obstacleOne = new Obstacle();
        Obstacle obstacleTwo = new Obstacle();
        Obstacle obstacleThree = new Obstacle();

        obstacles.add(obstacleOne);
        obstacles.add(obstacleTwo);
        obstacles.add(obstacleThree);


        new GameFrame(bird,obstacles);
        GameTimer gTimer = new GameTimer(bird,obstacles);
        gTimer.run();


    }
}
