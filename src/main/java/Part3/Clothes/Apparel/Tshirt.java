package Part3.Clothes.Apparel;

import Part3.Clothes.Enum.Color;
import Part3.Clothes.Interfaces.MenClothes;
import Part3.Clothes.Interfaces.WomenClothes;
import Part3.Clothes.Enum.Size;

public class Tshirt extends Clothes implements MenClothes, WomenClothes {
    public Tshirt(Size size, int price, Color color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("������� ��������: " + size.getDescription() + ", ���� " + price +
                ", ���� " + color.getColor());
    }

    @Override
    public void dressWoman() {
        System.out.println("������� ��������: " + size.getDescription() + ", ���� " + price +
                ", ���� " + color.getColor());
    }
}
