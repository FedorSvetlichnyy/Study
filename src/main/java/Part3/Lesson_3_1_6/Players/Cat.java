package Part3.Lesson_3_1_6.Players;

import Part3.Lesson_3_1_6.Obstacle.Treadmill;
import Part3.Lesson_3_1_6.Obstacle.Wall;

public class Cat implements JumpRun{
    private int jumpHeight;
    private int runLength;

    public int getJumpHeight() {
        return jumpHeight;
    }

    public int getRunLength() {
        return runLength;
    }

    public Cat(int jumpHeight, int runLength){
        this.jumpHeight = jumpHeight;
        this.runLength = runLength;
    }
    public boolean run(Treadmill t) {
        if (runLength<t.getLength()){
            System.out.println("Cat not run");
            return false;
        } else {
            System.out.println("Cat run");
            return true;
        }
    };
    public boolean jump(Wall w) {
        if (jumpHeight<w.getHeight()){
            System.out.println("Cat not jump");
            return false;
        } else {
            System.out.println("Cat jump");
            return true;
        }
    };
}
