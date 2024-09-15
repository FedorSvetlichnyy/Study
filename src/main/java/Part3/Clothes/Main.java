package Part3.Clothes;

import Part3.Clothes.Apparel.*;
import Part3.Clothes.Enum.Color;
import Part3.Clothes.Enum.Size;

public class Main {
    public static void main(String[] args) {
        Clothes[] arr = {
                new Tshirt(Size.S, 100, Color.BLACK),
                new Pants(Size.L, 50, Color.BLACK),
                new Tie(Size.M, 1000, Color.RED),
                new Skirt(Size.XXS, 20, Color.WHITE),
                new Skirt(Size.XS, 60, Color.BLUE)
        };
        Studio s = new Studio();
        s.dress(arr);
    }
}
