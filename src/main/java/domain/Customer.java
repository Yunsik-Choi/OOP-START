package domain;

public class Customer {
    private Money money;

    public Customer(final GiftCard giftCard, final Point point) {
        this.money = new Money(giftCard, point);
    }

    public void payFor(Product product) {
        product.payBy(money);
    }
}
