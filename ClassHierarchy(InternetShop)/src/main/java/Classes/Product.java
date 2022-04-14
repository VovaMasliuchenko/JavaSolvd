package Classes;

public abstract class Product {

    protected String type;
    protected String color;
    protected String size;
    protected Integer price;

    Product() {
    }

    Product(String type, String color, String size, Integer price) {
        this.type = type;
        this.color = color;
        this.size = size;
        this.price = price;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public String getSize() {
        return size;
    }

    public Integer getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Classes.Product" +
                "\nType: " + type +
                "\nColor: " + color +
                "\nSize: " + size +
                "\nPrice: " + price;
    }
}
