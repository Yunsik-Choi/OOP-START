package domain;

public class Customer {
    private Card card;
    private Point point;

    public Customer(final Card card, final Point point) {
        this.card = card;
        this.point = point;
    }

    public Card getCard() {
        return card;
    }
}
