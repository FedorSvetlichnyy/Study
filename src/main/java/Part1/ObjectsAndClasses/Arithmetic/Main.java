package Part1.ObjectsAndClasses.Arithmetic;

public class Main {
    public static void main(String[] args) {
        Arithmetic arithmetic = new Arithmetic(3,12);

        System.out.println("Сумма чисел равна: " + arithmetic.sum());
        System.out.println("Произведение чисел равно: " + arithmetic.multiplication());
        System.out.println("Максимальное из двух чисел: " + arithmetic.max());
        System.out.println("Миниимальное из двух чисел: " + arithmetic.min());

    }
}
