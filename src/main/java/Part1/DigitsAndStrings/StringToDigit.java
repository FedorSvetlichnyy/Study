package Part1.DigitsAndStrings;

import static java.lang.Integer.parseInt;

public class StringToDigit {
    public static void main(String[] args) {
        String str1 = "12345";
        String str2 = "11";
        String str3 = "25059191";
        System.out.println(sumDigits(str1));
        System.out.println(sumDigits(str2));
        System.out.println(sumDigits(str3));

    }
    public static Integer sumDigits(String str){
        if (str == null) {
            return 0;
        }
        int x = parseInt(str);
        int sum = 0;
        while (x > 0) {
            sum = sum + x % 10;
            x = x / 10;
        }
        return sum;
    }
}
