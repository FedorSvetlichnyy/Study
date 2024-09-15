package Part3.Clothes.Enum;

public enum Size {
    XXS (32, "������� ������"),
    XS (34, "�������� ������"),
    S (36, "�������� ������"),
    M (38, "�������� ������"),
    L (40, "�������� ������");

    private int euroSize;
    private String description;

    public String getDescription() {
        return description;
    }

    Size(int euroSize, String description) {
        this.euroSize = euroSize;
        this.description = description;
    }


}
