package main.java.Part1.ObjectsAndClasses.Arithmetic;

public class Arithmetic {
    private int a;
    private int b;

    public Arithmetic(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public int Sum() {
        return a + b;
    }
    public int Multiplication() {
        return a * b;
    }
    public int Min() {
        return (a <= b) ? a : b;
    }
    public int Max() {
        return (a >= b) ? a : b;
    }

}
