package main.java.Part1.ObjectsAndClasses.Elevator;

public class Elevator {
    private int currentFloor;
    private final int minFloor;
    private final int maxFloor;

    public Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
        this.currentFloor = 1;
    }

    public int getCurrentFloor() {
        return this.currentFloor;
    }
    public int getMinFloor() {
        return this.minFloor;
    }
    public int getMaxFloor() {
        return this.maxFloor;
    }

    public void moveDown() {
        this.currentFloor--;
    }

    public void moveUp() {
        this.currentFloor++;
    }

    public void move(int floor) {
        if (floor > getMaxFloor() || floor < getMinFloor()){
            System.out.println("You entered the wrong floor.");
            return;
        }
        if (floor > getCurrentFloor()) {
            for (int y = getCurrentFloor(); y < floor; y++) {
                moveUp();
                System.out.println(getCurrentFloor());
            }
        }
        if (floor < getCurrentFloor()) {
            int z = getCurrentFloor() - floor;
            for (int x = 0; x < z; x++) {
                moveDown();
                System.out.println(getCurrentFloor());
            }
        }

    }


}
