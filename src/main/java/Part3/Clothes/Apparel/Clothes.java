package Part3.Clothes.Apparel;

import Part3.Clothes.Enum.Color;
import Part3.Clothes.Enum.Size;

public abstract class Clothes {
    public Size size;
    public int price;
    public Color color;

    public Clothes(Size size, int price, Color color) {
        this.size = size;
        this.price = price;
        this.color = color;
    }

    public void dressMan() {
    }

    public void dressWoman() {
    }
}
