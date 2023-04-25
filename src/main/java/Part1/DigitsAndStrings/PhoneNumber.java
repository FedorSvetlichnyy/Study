package main.java.Part1.DigitsAndStrings;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class PhoneNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the PhoneNumber: ");
        String firstPhoneDigit = scanner.nextLine();

        String phoneWithoutSymbol = firstPhoneDigit.replaceAll("\\D", "");

        String phoneReplaceFirstDigit8on7 = phoneWithoutSymbol.replaceFirst("8", "7");

        int phoneLength = phoneReplaceFirstDigit8on7.length();
        if (phoneLength == 10) {
            String phoneOn9 = phoneReplaceFirstDigit8on7.substring(0, 1);
            int x = parseInt(phoneOn9);
            if (x == 9) {
                String correctPhone = '7' + phoneReplaceFirstDigit8on7.substring(0);
                System.out.println(correctPhone);
            } else {
                System.out.println("Invalid number format: first 9 (8 or 7)");
            }

        } else if (phoneLength > 11 || phoneLength < 10) {
            System.out.println("Invalid number format: not 11");
        } else {
            String phoneOn9 = phoneReplaceFirstDigit8on7.substring(0, 1);
            int x = parseInt(phoneOn9);
            if (x == 9) {
                System.out.println("Invalid number format: first not 8 or 7");
            } else {
                System.out.println(phoneReplaceFirstDigit8on7);
            }

        }
    }
}
