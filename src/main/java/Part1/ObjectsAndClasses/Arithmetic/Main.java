package Part1.ObjectsAndClasses.Arithmetic;

public class Main {
    public static void main(String[] args) {
        Arithmetic arithmetic = new Arithmetic(3,12);

        System.out.println("����� ����� �����: " + arithmetic.sum());
        System.out.println("������������ ����� �����: " + arithmetic.multiplication());
        System.out.println("������������ �� ���� �����: " + arithmetic.max());
        System.out.println("������������ �� ���� �����: " + arithmetic.min());

    }
}
