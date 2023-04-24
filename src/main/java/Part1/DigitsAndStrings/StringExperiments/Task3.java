package main.java.Part1.DigitsAndStrings.StringExperiments;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        String safe = searchAndReplaceDiamonds("Credit card number <4008 1234 5678> 8912", "***");
        System.out.println(safe);
        
    }
    public static String searchAndReplaceDiamonds(String text, String placeholder){
        return text.replaceAll("\\D[ 0-9]{14}\\D", placeholder);
    }
}
