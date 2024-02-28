package Part3.Lesson_3_1_6;

import Part3.Lesson_3_1_6.Obstacle.Obstacle;
import Part3.Lesson_3_1_6.Obstacle.Treadmill;
import Part3.Lesson_3_1_6.Obstacle.Wall;
import Part3.Lesson_3_1_6.Players.Cat;
import Part3.Lesson_3_1_6.Players.Human;
import Part3.Lesson_3_1_6.Players.JumpRun;
import Part3.Lesson_3_1_6.Players.Robot;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<JumpRun> players = new ArrayList<JumpRun>();
        players.add(new Cat(2, 10));
        players.add(new Human(1, 100));
        players.add(new Robot(3, 300));

        List<Obstacle> obstacles = new ArrayList<Obstacle>();
        obstacles.add(new Wall(3));
        obstacles.add(new Treadmill(1));

        for (JumpRun p : players) {
            if (p.jump((Wall) obstacles.get(0))) p.run((Treadmill) obstacles.get(1));
        }

    }
}
