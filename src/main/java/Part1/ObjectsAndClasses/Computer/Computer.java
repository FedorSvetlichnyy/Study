package main.java.Part1.ObjectsAndClasses.Computer;

public class Computer {

    private CPU cpu;
    private RAM ram;
    private HDD hdd;
    private Display display;
    private Keyboard keyboard;

    private final String vendor;
    private final String name;

    public Computer(String vendor, String name, CPU cpu, RAM ram, HDD hdd, Display display, Keyboard keyboard) {
        this.vendor = vendor;
        this.name = name;
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
        this.display = display;
        this.keyboard = keyboard;
    }

    /*public Computer(String vendor, String name, CPU cpu, RAM ram, HDD hdd, Display display, Keyboard keyboard) {
        this.vendor = vendor;
        this.name = name;
        this.cpu = new CPU(cpu.getFrequency(), cpu.getCore(), cpu.getManufacturer(), cpu.getWeight());
        this.ram = new RAM(ram.getType(), ram.getSize(), ram.getWeight());
        this.hdd = new HDD(hdd.getType(), hdd.getSize(), hdd.getWeight());
        this.display = new Display(display.getDiagonal(), display.getType(), display.getWeight());
        this.keyboard = new Keyboard(keyboard.getType(), keyboard.isLight(), keyboard.getWeight());
    }*/

    public double calculateTotalWeight() {
        return cpu.getWeight() + ram.getWeight() + hdd.getWeight() + display.getWeight() + keyboard.getWeight();
    }

    public String toString(){
        return "Manufacturer: " + vendor + "\n"
                + "Name: " + name + "\n"
                + cpu
                + ram
                + hdd
                + display
                + keyboard
                +  "Total weight: " + calculateTotalWeight();
    }

}

final class CPU {

    private final double frequency;
    private final int core;
    private final String manufacturer;
    private final double weight;

    public CPU (double frequency, int core, String manufacturer, double weight){
        this.frequency = frequency;
        this.core = core;
        this.manufacturer = manufacturer;
        this.weight = weight;
    }
    public double getFrequency() {
        return frequency;
    }

    public int getCore() {
        return core;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public double getWeight() {
        return weight;
    }

    public String toString(){
        return "CPU frequency: " + getFrequency() + "\n"
                + "CPU core: " + getCore() + "\n"
                + "CPU manufacturer: " + getManufacturer() + "\n"
                + "CPU weight: " + getWeight() + "\n";
    }

}
final class RAM {

    private final String type;
    private final int size;
    private final double weight;

    public RAM (String type, int size, double weight){
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public int getSize() {
        return size;
    }

    public double getWeight() {
        return weight;
    }

    public String toString(){
        return "Memory Type: " + getType() + "\n"
                + "Memory Volume: " + getSize() + "\n"
                + "Memory weight: " + getWeight() + "\n";
    }

}
final class HDD {

    private final String type;
    private final int size;
    private final double weight;

    public HDD (String type, int size, double weight){
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public int getSize() {
        return size;
    }

    public double getWeight() {
        return weight;
    }

    public String toString(){
        return "HDD Type: " + getType() + "\n"
                + "HDD Volume: " + getSize() + "\n"
                + "HDD weight: " + getWeight() + "\n";
    }

}
final class Display {

    private final double diagonal;
    private final String type;
    private final double weight;

    public Display (double diagonal, String type, double weight){
        this.diagonal = diagonal;
        this.type = type;
        this.weight = weight;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public String getType() {
        return type;
    }

    public double getWeight() {
        return weight;
    }

    public String toString(){
        return "Display diagonal: " + getDiagonal() + "\n"
                + "Display type: " + getType() + "\n"
                + "Display weight: " + getWeight() + "\n";
    }

}
final class Keyboard {

    private final String type;
    private final boolean light;
    private final double weight;

    public Keyboard (String type, boolean light, double weight){
        this.type = type;
        this.light = light;
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public boolean isLight() {
        return light;
    }

    public double getWeight() {
        return weight;
    }

    public String toString(){
        return "Keyboard Type: " + getType() + "\n"
                + "Keyboard light: " + isLight() + "\n"
                + "Keyboard weight: " + getWeight() + "\n";
    }

}

