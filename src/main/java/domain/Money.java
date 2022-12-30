package domain;

public class Money {
    private GiftCard giftCard;
    private Point point;

    public Money(GiftCard giftCard, Point point) {
        this.giftCard = giftCard;
        this.point = point;
    }

    public void minus(int price) {
        giftCard.minus(price);
    }
}
