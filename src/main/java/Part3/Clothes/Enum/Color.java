package Part3.Clothes.Enum;

public enum Color {
    BLACK ("Чёрный"),
    RED ("Красный"),
    WHITE ("Белый"),
    BLUE ("Голубой");
    private String color;

    Color(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }

}
