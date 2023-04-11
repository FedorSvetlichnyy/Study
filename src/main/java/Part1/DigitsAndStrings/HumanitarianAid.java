package main.java.Part1.DigitsAndStrings;

import java.util.Scanner;

public class HumanitarianAid {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input boxes: ");
        int box = scanner.nextInt();
        int container = box / 27;
        if (box % 27 > 0) {
            container++;
        }
        int truck = container / 12;
        if (container % 12 > 0) {
            truck++;
        }

        int count = 1;
        int count2 = 1;
        for (int i = 1; i <= truck; i++) {
            System.out.println("Truck " + i + ":");
            for (int k = count2; k <= container; k++) {
                count2++;
                System.out.println("Container " + k + ":");
                for (int l = count; l <= box; l++) {
                    count++;
                    System.out.println("\t Box " + l);
                    if (count % 27 == 1) {
                        break;
                    }
                }
                if (count2 % 12 == 1) {
                    break;
                }
            }
        }

        System.out.println("Need: ");
        System.out.println("Truck - " + truck + " pc.");
        System.out.println("Container - " + container + " pc.");
    }
}
