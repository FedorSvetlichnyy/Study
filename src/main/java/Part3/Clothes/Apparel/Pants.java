package Part3.Clothes.Apparel;

import Part3.Clothes.Enum.Color;
import Part3.Clothes.Interfaces.MenClothes;
import Part3.Clothes.Interfaces.WomenClothes;
import Part3.Clothes.Enum.Size;

public class Pants extends Clothes implements MenClothes, WomenClothes {
    public Pants(Size size, int price, Color color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужские штаны: " + size.getDescription() + ", цена " + price +
                ", цвет " + color.getColor());
    }

    @Override
    public void dressWoman() {
        System.out.println("Женские штаны: " + size.getDescription() + ", цена " + price +
                ", цвет " + color.getColor());
    }
}
