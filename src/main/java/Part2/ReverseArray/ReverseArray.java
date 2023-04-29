package Part2.ReverseArray;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ReverseArray {

    public static String[] reverse(String[] strings) {
        //TODO: Напишите код, который меняет порядок расположения элементов внутри массива на обратный.
        String temp = "";
        for (int i = 0; i < strings.length / 2; i++) {
            temp = strings[i];
            strings[i] = strings[strings.length - 1 - i];
            strings[strings.length - 1 - i] = temp;
        }
        return strings;
    }

}