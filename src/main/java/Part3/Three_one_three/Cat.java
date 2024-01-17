package Part3.Three_one_three;

public class Cat extends Animal {

    @Override
    public void run(int a) {
        if (a<0){
            System.out.println("Введите число больше или равно 0");
        } else if (a>200) {
            System.out.println("Кот столько не пробежит. Введите число до 200");
        } else System.out.println("Кот пробежал " +  a + " " + "м.");
    }

    @Override
    public void swim(int a) {
        System.out.println("Кот не плавает");
    }

    //test
    public static void main(String[] args) {
        System.out.println(numberOfAnimal);
        Animal cat = new Cat();
        cat.swim(5);
        cat.run(100);
        System.out.println(numberOfAnimal);
        Dog dog = new Dog();
        dog.run(3);
        dog.swim(5);
        System.out.println(numberOfAnimal);
        Tiger tiger = new Tiger();
        tiger.run(7);
        tiger.swim(6);
        System.out.println(numberOfAnimal);

        Animal[] animal = new Animal[3];
        animal[0] = new Dog();
        animal[1] = new Cat();
        animal[2] = new Tiger();

        for (Animal a: animal){
            a.run(4);
            a.swim(4);
        }
        System.out.println(numberOfAnimal);
    }
}
