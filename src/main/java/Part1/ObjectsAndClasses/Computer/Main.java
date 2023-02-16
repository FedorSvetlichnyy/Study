package main.java.Part1.ObjectsAndClasses.Computer;

public class Main {
    public static void main(String[] args) {
        CPU cpu = new CPU(1.9, 4, "Intel", 10);
        RAM ram = new RAM("DDR4", 6, 20);
        HDD hdd = new HDD("SSD", 120, 80);
        Display display = new Display(21.1, "VA", 100);
        Keyboard keyboard = new Keyboard("mechanical", false, 20);

        Computer computer = new Computer("Russia", "PK Home", cpu, ram, hdd, display, keyboard);

        /*Computer computer = new Computer("Russia", "PK Home",
                new CPU(1.9, 4, "Intel", 10),
                new RAM("DDR4", 6, 20),
                new HDD("SSD", 120, 80),
                new Display(21.1, "VA", 100),
                new Keyboard("mechanical", false, 20));*/
        System.out.println(computer);

    }
}
