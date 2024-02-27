package Part3.Clothes;

import Part3.Clothes.Apparel.Clothes;

public class Studio {
    public void dress (Clothes[] arr){
        for (Clothes i: arr) {
            i.dressMan();
            i.dressWoman();
        }
    }
}
