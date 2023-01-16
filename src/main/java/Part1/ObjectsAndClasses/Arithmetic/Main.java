package main.java.Part1.ObjectsAndClasses.Arithmetic;

public class Main {
    public static void main(String[] args) {
        Arithmetic arithmetic = new Arithmetic(3,12);

        System.out.println("Сумма чисел равна: " + arithmetic.Sum());
        System.out.println("Произведение чисел равно: " + arithmetic.Multiplication());
        System.out.println("Максимальное из двух чисел: " + arithmetic.Max());
        System.out.println("Миниимальное из двух чисел: " + arithmetic.Min());


    }
}
