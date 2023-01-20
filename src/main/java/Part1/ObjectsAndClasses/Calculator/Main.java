package main.java.Part1.ObjectsAndClasses.Calculator;

import static main.java.Part1.ObjectsAndClasses.Calculator.Operation.*;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(5, 5);

        calculator.calculate(ADD);
        calculator.calculate(SUBTRACT);
        calculator.calculate(MULTIPLY);

    }
}
