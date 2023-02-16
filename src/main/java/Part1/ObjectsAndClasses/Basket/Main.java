package main.java.Part1.ObjectsAndClasses.Basket;

public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("Milk", 40);
        basket.add("Butter", 30, 1, 5);
        basket.print("Milk");
    }
}
