package main.java.Part1.DigitsAndStrings.StringExperiments;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        String text = scanner.nextLine();

        /*StringTokenizer Str = new StringTokenizer(text);
        String string1 = Str.nextToken(" ");
        String string2 = Str.nextToken(" ");
        String string3 = Str.nextToken(" ");*/
        int value = text.indexOf(' ');
        String surname = text.substring(0, value);
        String text2 = text.substring(value + 1);
        int value2 = text2.indexOf(' ');
        String name = text2.substring(0, value2);
        String patronymic = text2.substring(value + 1);

        System.out.println("Surname: " + surname + "\n"
                + "Name: " + name + "\n"
                + "Patronymic: " + patronymic);
    }
}