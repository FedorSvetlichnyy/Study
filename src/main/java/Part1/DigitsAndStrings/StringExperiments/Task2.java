package main.java.Part1.DigitsAndStrings.StringExperiments;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        String text = scanner.nextLine();

        StringTokenizer Str = new StringTokenizer(text);
        String string1 = Str.nextToken(" ");
        String string2 = Str.nextToken(" ");
        String string3 = Str.nextToken(" ");
        System.out.println("Surname: " + string1 + "\n"
                + "Name: " + string2 + "\n"
                + "Patronymic: " + string3);
    }
}