package domain;

public class Product {
    private int price;
    private int stock;

    public Product(final int price, final int stock) {
        this.price = price;
        this.stock = stock;
    }

    public boolean isSoldOut() {
        return stock < 5;
    }

    public void minusStock() {
        stock -= 1;
    }

    public void payBy(GiftCard giftCard) {
        giftCard.minus(price);
    }
}
