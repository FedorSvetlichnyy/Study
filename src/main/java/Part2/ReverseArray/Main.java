package Part2.ReverseArray;

import java.util.Arrays;

public class Main {

    // используя данный метод, вы можете использовать ваши методы, и проверить их работу на разных
    // значений для проверки и отладки
    public static void main(String[] args) {
        String line = (String) "Каждый охотник желает знать, где сидит фазан";
        String lineWithoutPunctuation = line.replace(",", "");
        String[] reversLine = lineWithoutPunctuation.split(" ");
        ReverseArray reverseArray = new ReverseArray();
        reverseArray.reverse(reversLine);
        System.out.println(Arrays.toString(reversLine));
    }
}
