package Part3.Three_one_three;

public class Dog extends Animal{

    @Override
    public void run(int a) {
        if (a<0){
            System.out.println("¬ведите число больше или равно 0");
        } else if (a>500) {
            System.out.println("—обака столько не пробежит. ¬ведите число до 200");
        } else System.out.println("—обака пробежала " +  a + " " + "м.");
    }

    @Override
    public void swim(int a) {
        if (a<0){
            System.out.println("¬ведите число больше или равно 0");
        } else if (a>10) {
            System.out.println("—обака столько не проплывет. ¬ведите число до 10");
        } else System.out.println("—обака проплыла " +  a + " " + "м.");
    }

}
