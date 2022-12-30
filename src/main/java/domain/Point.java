package domain;

public class Point {
    private int value;

    public Point(int value) {
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
