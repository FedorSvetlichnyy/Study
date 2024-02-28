package Part3.Lesson_3_1_6.Players;

import Part3.Lesson_3_1_6.Obstacle.Treadmill;
import Part3.Lesson_3_1_6.Obstacle.Wall;

public interface JumpRun {

    public boolean run(Treadmill t);
    public boolean jump(Wall w);
}
