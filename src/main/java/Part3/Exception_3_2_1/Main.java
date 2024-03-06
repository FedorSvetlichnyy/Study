package Part3.Exception_3_2_1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[][] a = new String[4][4];
        String[][] b = new String[3][4];
        String[][] c = new String[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
               a[i][j] = "2";
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                c[i][j] = "1";
            }
        }
        c[1][2] = "e";

        // тест массива 4х4 с цифрами
        try {
            testArray (a);
        } catch (MyArraySizeException | MyArrayDataException e) {
            // обработчик исключения
            System.out.println(e.getMessage());
        }

        System.out.println();
        // тест массива 3х4 (не 4х4)
        try {
            testArray (b);
        } catch (MyArraySizeException | MyArrayDataException e) {
            // обработчик исключения
            System.out.println(e.getMessage());
        }

        System.out.println();
        // тест массива с символом (отличного от цифры)
        try {
            testArray (c);
        } catch (MyArraySizeException | MyArrayDataException e) {
            // обработчик исключения
            System.out.println(e.getMessage());
        }

    }

    public static void testArray (String[][] a) throws MyArraySizeException, MyArrayDataException{
        if (a.length !=4 | a[0].length!=4) {
            throw new MyArraySizeException("Массив не 4х4.");
        }

        if(!isNumeric(a)){
            throw new MyArrayDataException("Массив содержит не число.");
        }

        int summArray = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                summArray += Integer.valueOf(a[i][j]);
            }
        }
        System.out.println("Сумма всех цифр массива: " + summArray);
    }
    public static boolean isNumeric(String[][] a) {
        int x = 0;
        int y = 0;
        try {
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    x = i;
                    y = j;
                    Integer.valueOf(a[i][j]);
                }
            }
            return true;
        } catch(NumberFormatException e){
            System.out.println("Ошибка в ячейке: " + "[" + x + "] [" + y + "]");
            return false;
        }
    }
}
