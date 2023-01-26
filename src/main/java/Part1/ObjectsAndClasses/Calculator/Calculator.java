package main.java.Part1.ObjectsAndClasses.Calculator;

public class Calculator {
    private static int a;
    private static int b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void calculate(Operation operation) {
        System.out.println(operation.action(a, b));
        //return operation1.action(Calculator.getA(), Calculator.getB());
    }

    /*public static int getA() {
        return a;
    }

    public static int getB() {
        return b;
    }*/
}

enum Operation {
    ADD {
        public int action(int a, int b) {
            return a + b;
        }
    },
    SUBTRACT {
        public int action(int a, int b) {
            return a - b;
        }
    },
    MULTIPLY {
        public int action(int a, int b) {
            return a * b;
        }
    };
    public abstract int action(int a, int b);
}
