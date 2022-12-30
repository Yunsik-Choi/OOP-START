package domain;

public class Customer {
    private GiftCard giftCard;

    public Customer(final GiftCard giftCard) {
        this.giftCard = giftCard;
    }

    public void payFor(Product product) {
        int originBalance = giftCard.getValue();
        int productPrice = product.getPrice();
        int remainBalance = originBalance - productPrice;

        if (remainBalance < 0) {
            throw new RuntimeException("잔액이 부족합니다.");
        }
        giftCard.setValue(remainBalance);
    }
}
