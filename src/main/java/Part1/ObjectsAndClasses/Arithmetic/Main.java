package main.java.Part1.ObjectsAndClasses.Arithmetic;

public class Main {
    public static void main(String[] args) {
        Arithmetic arithmetic = new Arithmetic(3,12);

        System.out.println("����� ����� �����: " + arithmetic.Sum());
        System.out.println("������������ ����� �����: " + arithmetic.Multiplication());
        System.out.println("������������ �� ���� �����: " + arithmetic.Max());
        System.out.println("������������ �� ���� �����: " + arithmetic.Min());


    }
}
