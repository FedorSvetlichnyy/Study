package main.java.Part1.DigitsAndStrings;

import static java.lang.Integer.parseInt;

public class StringToDigit {
    public static void main(String[] args) {
        String str1 = "12345";
        String str2 = "10";
        String str3 = "25059191";
        sumDigits(str1);
        sumDigits(str2);
        sumDigits(str3);

    }
    public static void sumDigits(String str){
        int x = parseInt(str);
        int sum = 0;
        while (x > 0) {
            sum = sum + x % 10;
            x = x / 10;
        }
        System.out.println(sum);
    }
}
