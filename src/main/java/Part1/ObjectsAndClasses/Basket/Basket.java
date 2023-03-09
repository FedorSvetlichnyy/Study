package main.java.Part1.ObjectsAndClasses.Basket;

import java.text.DecimalFormat;

public class Basket {

    private String items;
    private double totalWeight = 0;
    private int totalPrice = 0;

    static int totalPriceAllBasket;
    static int totalItems;
    static int averageItemsPrice; //хотя лучше double, точнее будет
    static int countBasket = 0;

    public Basket() {
        items = "Список товаров: ";
        countBasket++;
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
        setTotalItems(count);
        setTotalPriceAllBasket(price);
        setAverageItemsPrice();

        items = items + "\n" + name + " - " + count + " шт. - " + price
                + "\n" + "Общая стоимость товаров в корзине: " + totalPrice
                + "\n" + "Общий вес товаров в корзине: " + getTotalWeight()
                + "\n" + "Общая стоимость всех товаров во всех корзинах: " + Basket.totalPriceAllBasket
                + "\n" + "Общее количество всех товаров во  всех корзинах: " + Basket.totalItems
                + "\n" + "Средняя цена товара во всех корзинах: " + Basket.averageItemsPrice
                + "\n" + "Средняя стоимости корзины:  " + averageBasketPrice();
    }

    public double getTotalWeight() {
        return totalWeight;
    }
    public int getTotalPrice() {
        return totalPrice;
    }

    public static void setTotalPriceAllBasket(int totalPriceAllBasket) {
        Basket.totalPriceAllBasket = Basket.totalPriceAllBasket + totalPriceAllBasket;
    }

    public static void setTotalItems(int totalItems) {
        Basket.totalItems = Basket.totalItems + totalItems;
    }

    public static void setAverageItemsPrice() {
        Basket.averageItemsPrice = totalPriceAllBasket / totalItems;
    }

    public static int averageBasketPrice() {
        return totalPriceAllBasket / countBasket;
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
