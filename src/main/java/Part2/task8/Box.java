package Part2.task8;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    private T fruit;
    ArrayList<T> box;

    public Box(T fruit) {
        this.fruit = fruit;
        this.box = new ArrayList<>();
        add(fruit);
    }

    public void add(T fruit) {
        this.box.add(fruit);
    }

    public float getWeight() {
        float mass = 0.0f;
        for (T i : box)
            mass = mass + i.getWeight();
        return mass;
    }

    public boolean compare(Box<?> anotherBox) {
        return Math.abs(this.getWeight() - anotherBox.getWeight()) < 0.0001;
    }

    public void addAllFromBox(Box<T> anotherBox){
        for (T t: this.box) {
            anotherBox.box.add(t);
        }
        this.box.clear();
    }

}