package Part2.task8;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Apple apple = new Apple();
        Orange orange = new Orange();
        Box<Apple> boxApple = new Box<>(apple);
        Box<Orange> boxOrange = new Box<>(orange);
        Apple apple2 = new Apple();
        Orange orange2 = new Orange();
        boxApple.add(apple2);
        boxOrange.add(orange2);

        System.out.println(boxApple.getWeight()); //2.0
        System.out.println(boxOrange.getWeight()); //3.0

        System.out.println(boxApple.compare(boxOrange)); //false
        Apple apple3 = new Apple();
        boxApple.add(apple3);
        System.out.println(boxApple.compare(boxOrange)); //true

        Box<Apple> boxApple2 = new Box<>(apple);
        System.out.println(boxApple2.getWeight()); //1.0
        boxApple2.addAllFromBox(boxApple);
        System.out.println(boxApple.getWeight()); //4.0
        System.out.println(boxApple2.getWeight()); //0.0
        System.out.println(boxOrange.getWeight());//3.0
        //boxOrange.addAllFromBox(boxApple); ошибка - в коробку c €блоками нельз€ пересыпать апельсины



    }
}