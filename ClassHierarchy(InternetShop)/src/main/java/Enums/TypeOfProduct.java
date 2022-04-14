package Enums;

public enum TypeOfProduct {

    PANTS("Pants"),
    HOODIE("Hoodie"),
    SHIRT("Shirt"),
    SWEATSHIRT("Sweatshirt"),
    SOCKS("Socks"),
    CAP("Cap"),
    BELT("Belt");

    private final String value;

    TypeOfProduct(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
