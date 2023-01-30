package main.java.Part1.ObjectsAndClasses.Computer;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer("Russia", "PK Home",
                new CPU(1.9, 4, "Intel", 10),
                new RAM("DDR4", 6, 20),
                new HDD("SSD", 120, 80),
                new Display(21.1, "VA", 100),
                new Keyboard("mechanical", false, 20));
        System.out.println(computer);

    }
}
