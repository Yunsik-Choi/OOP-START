package domain;

public class GiftCard {
    private int value;

    public GiftCard(int value) {
        this.value = value;
    }

    public void minus(int price) {
        int originBalance = value;
        int productPrice = price;
        int remainBalance = originBalance - productPrice;

        if (remainBalance < 0) {
            throw new RuntimeException("잔액이 부족합니다.");
        }
        value = remainBalance;
    }
}
