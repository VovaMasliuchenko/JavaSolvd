package Classes;

public class Purchases extends Product {

    protected Integer dateOfPurchase;
    private Integer quantity;

    Purchases() {
    }

    public Purchases(String type, String color, String size, Integer dateOfPurchase, Integer quantity, Integer price) {
        this.type = type;
        this.color = color;
        this.size = size;
        this.dateOfPurchase = dateOfPurchase;
        this.quantity = quantity;
        this.price = price;
    }

    public void setDateOfPurchase(Integer dateOfPurchase) {
        this.dateOfPurchase = dateOfPurchase;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getDateOfPurchase() {
        return dateOfPurchase;
    }

    public Integer getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Check" +
                "\nType: " + type +
                "\nColor: " + color +
                "\nSize: " + size +
                "\nDate of purchase: " + dateOfPurchase +
                "\nQuantity: " + quantity +
                "\nPrice: " + price;
    }
}
