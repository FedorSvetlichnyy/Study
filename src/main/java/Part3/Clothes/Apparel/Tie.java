package Part3.Clothes.Apparel;

import Part3.Clothes.Enum.Color;
import Part3.Clothes.Interfaces.MenClothes;
import Part3.Clothes.Enum.Size;

public class Tie extends Clothes implements MenClothes {
    public Tie(Size size, int price, Color color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("������� �������: " + size.getDescription() + ", ���� " + price +
                ", ���� " + color.getColor());
    }
}
