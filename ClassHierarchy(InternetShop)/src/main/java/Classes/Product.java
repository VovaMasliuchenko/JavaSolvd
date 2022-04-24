package Classes;

import Enums.SizeChart;
import Enums.TypeOfProduct;

public abstract class Product {

    protected String color;
    protected Integer price;
    protected TypeOfProduct typeProduct;
    protected SizeChart sizeProduct;

    Product() {
    }

    public Product(TypeOfProduct typeProduct, String color, SizeChart sizeProduct, Integer price) {
        this.typeProduct = typeProduct;
        this.color = color;
        this.sizeProduct = sizeProduct;
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public TypeOfProduct getType() {
        return typeProduct;
    }

    public String getColor() {
        return color;
    }

    public SizeChart getSize() {
        return sizeProduct;
    }

    public Integer getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Classes.Product" +
                "\nType: " + typeProduct +
                "\nColor: " + color +
                "\nSize: " + sizeProduct +
                "\nPrice: " + price;
    }
}
