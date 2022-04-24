package Classes;

import Enums.SizeChart;
import Enums.TypeOfProduct;

public class Purchases extends Product {

    protected Integer dateOfPurchase;
    private Integer quantity;

    Purchases() {
    }

    public Purchases(TypeOfProduct typeProduct, String color, SizeChart sizeProduct, Integer dateOfPurchase, Integer quantity, Integer price) {
        this.typeProduct = typeProduct;
        this.color = color;
        this.sizeProduct = sizeProduct;
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
                "\nType: " + typeProduct +
                "\nColor: " + color +
                "\nSize: " + sizeProduct +
                "\nDate of purchase: " + dateOfPurchase +
                "\nQuantity: " + quantity +
                "\nPrice: " + price;
    }
}
