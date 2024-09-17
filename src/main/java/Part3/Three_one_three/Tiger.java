package Part3.Three_one_three;

public class Tiger extends Animal{
    @Override
    public void run(int a) {
        if (a<0){
            System.out.println("¬ведите число больше или равно 0");
        } else System.out.println("“игр пробежал " +  a + " " + "м.");
    }

    @Override
    public void swim(int a) {
        if (a<0){
            System.out.println("¬ведите число больше или равно 0");
        } else System.out.println("“игр проплыл " +  a + " " + "м.");
    }
}
