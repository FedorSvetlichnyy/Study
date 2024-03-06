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

        // ���� ������� 4�4 � �������
        try {
            testArray (a);
        } catch (MyArraySizeException | MyArrayDataException e) {
            // ���������� ����������
            System.out.println(e.getMessage());
        }

        System.out.println();
        // ���� ������� 3�4 (�� 4�4)
        try {
            testArray (b);
        } catch (MyArraySizeException | MyArrayDataException e) {
            // ���������� ����������
            System.out.println(e.getMessage());
        }

        System.out.println();
        // ���� ������� � �������� (��������� �� �����)
        try {
            testArray (c);
        } catch (MyArraySizeException | MyArrayDataException e) {
            // ���������� ����������
            System.out.println(e.getMessage());
        }

    }

    public static void testArray (String[][] a) throws MyArraySizeException, MyArrayDataException{
        if (a.length !=4 | a[0].length!=4) {
            throw new MyArraySizeException("������ �� 4�4.");
        }

        if(!isNumeric(a)){
            throw new MyArrayDataException("������ �������� �� �����.");
        }

        int summArray = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                summArray += Integer.valueOf(a[i][j]);
            }
        }
        System.out.println("����� ���� ���� �������: " + summArray);
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
            System.out.println("������ � ������: " + "[" + x + "] [" + y + "]");
            return false;
        }
    }
}
