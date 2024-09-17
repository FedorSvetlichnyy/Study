package Part3.Three_one_three;

public abstract class Animal {

    public static int numberOfAnimal = 0;

    public Animal(){
        numberOfAnimal++;
    }

    public abstract void run(int a);

    public abstract void swim(int a);
}
