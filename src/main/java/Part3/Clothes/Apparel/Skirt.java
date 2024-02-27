package Part3.Clothes.Apparel;

import Part3.Clothes.Enum.Color;
import Part3.Clothes.Interfaces.WomenClothes;
import Part3.Clothes.Enum.Size;

public class Skirt extends Clothes implements WomenClothes {
    public Skirt(Size size, int price, Color color) {
        super(size, price, color);
    }

    @Override
    public void dressWoman() {
        System.out.println("Женская юбка: " + size.getDescription() + ", цена " + price +
                ", цвет " + color.getColor());
    }
}
