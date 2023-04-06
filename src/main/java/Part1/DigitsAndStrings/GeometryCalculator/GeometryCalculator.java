package main.java.Part1.DigitsAndStrings.GeometryCalculator;

import static java.lang.Math.abs;
import static java.lang.Math.sqrt;

public class GeometryCalculator {
    // метод должен использовать абсолютное значение radius
    public static double getCircleSquare(double radius) {
        return abs(Math.PI * Math.pow(radius, 2));
    }

    // метод должен использовать абсолютное значение radius
    public static double getSphereVolume(double radius) {
        return abs(4 * Math.PI * Math.pow(radius, 2));
    }

    public static boolean isTriangleRightAngled(double a, double b, double c) {
        if (a + b > c & b + c > a & a + c > b) {
            return true;
        }
        return false;
    }

    // перед расчетом площади рекомендуется проверить возможен ли такой треугольник
    // методом isTriangleRightAngled, если невозможен вернуть -1.0
    public static double getTriangleSquare(double a, double b, double c) {
        if(isTriangleRightAngled(a,b,c)){
            double p = (a + b + c) / 2;
            return sqrt(p * (p - a) * (p - b) * (p - c));
        }
        return -1.0;
    }
}
