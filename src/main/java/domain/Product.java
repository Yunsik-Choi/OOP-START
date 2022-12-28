package domain;

public class Product {
    private String productName;
    private int price;
    private int stock;

    public Product(final String productName, final int price, final int stock) {
        this.productName = productName;
        this.price = price;
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getPrice() {
        return price;
    }
}
