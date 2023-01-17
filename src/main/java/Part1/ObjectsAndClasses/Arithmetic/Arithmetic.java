package Part1.ObjectsAndClasses.Arithmetic;

public class Arithmetic {
    private int a;
    private int b;

    public Arithmetic(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public int sum() {
        return a + b;
    }
    public int multiplication() {
        return a * b;
    }
    public int min() {
        return (a <= b) ? a : b;
    }
    public int max() {
        return (a >= b) ? a : b;
    }

}
