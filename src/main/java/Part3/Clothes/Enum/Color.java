package Part3.Clothes.Enum;

public enum Color {
    BLACK ("׸����"),
    RED ("�������"),
    WHITE ("�����"),
    BLUE ("�������");
    private String color;

    Color(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }

}
