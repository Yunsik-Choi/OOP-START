package domain;

public class Product {
    private int price;
    private int stock;

    public Product(final int price, final int stock) {
        this.price = price;
        this.stock = stock;
    }

    public int getPrice() {
        return price;
    }

    public boolean isStockLessThanOne() {
        return stock < 1;
    }

    public void minusStock() {
        stock -= 1;
    }
}
