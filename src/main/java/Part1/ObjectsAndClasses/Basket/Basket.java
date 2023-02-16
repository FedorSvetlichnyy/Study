package main.java.Part1.ObjectsAndClasses.Basket;

public class Basket {

    private String items;
    private double totalWeight = 0;
    private int totalPrice = 0;

    public Basket() {
        items = "Список товаров: ";
    }

    public Basket(String items) {
        this();
        this.items = this.items + items;
    }
    public Basket(int totalPrice, double totalWeight, String items) {
        this();
        this.items = this.items + items;
        this.totalPrice = totalPrice;
        this.totalWeight = totalWeight;

    }

    public void add(String name, int price) {
        add(name, price, 1, 0);
    }

    public void add(String name, int price, int count, double weight) {
        boolean error = false;
        if (items.contains(name)) {
            error = true;
        }

        if (error) {
            System.out.println("Error occured :(");
            return;
        }
        totalPrice += price;
        totalWeight += weight;

        items = items + "\n" + name + " - " + count + " шт. - " + price
                + "\n" + "Общая стоимость товаров в корзине: " + totalPrice
                + "\n" + "Общий вес товаров в корзине: " + getTotalWeight();
    }
    public double getTotalWeight(){
        return totalWeight;
    }

    public void clear() {
        items = "";
    }

    public void print(String title) {
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            System.out.println(items);
        }
    }
}
