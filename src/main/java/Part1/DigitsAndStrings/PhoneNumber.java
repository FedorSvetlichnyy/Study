package main.java.Part1.DigitsAndStrings;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class PhoneNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the PhoneNumber: ");
        String phone = scanner.nextLine();

        String phone2 = phone.replaceAll("\\s", "");
        String phone3 = phone2.replaceAll("\\+", "");
        String phone4 = phone3.replaceAll("\\-", "");
        String phone5 = phone4.replaceAll("\\(", "");
        String phone6 = phone5.replaceAll("\\)", "");

        String phone7 = phone6.replaceFirst("8", "7");

        int dlina = phone7.length();
        if (dlina == 10) {
            try {
                String phone8 = phone7.substring(0, 1);
                int x = parseInt(phone8);
                if (x == 9) {
                    String newPhone = '7' + phone7.substring(0);
                    System.out.println(newPhone);
                } else {
                    System.out.println("Invalid number format: first 9 (8 or 7)");
                }
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage() + " Enter valid numder");
            }
        } else if (dlina > 11) {
            System.out.println("Invalid number format: not 11");
        } else if (dlina < 10) {
            System.out.println("Invalid number format: not 11");
        } else {
            try {
                String phone8 = phone7.substring(0, 1);
                int x = parseInt(phone8);
                if (x == 9) {
                    System.out.println("Invalid number format: first not 8 or 7");
                } else {
                    System.out.println(phone7);
                }
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage() + " Enter valid numder");
            }
        }
    }
}
