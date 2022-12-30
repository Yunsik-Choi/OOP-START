package domain;

import java.time.LocalDateTime;

public class Point implements Money {
    private int value;
    private LocalDateTime expiredDate;

    public Point(int value) {
        this.value = value;
        this.expiredDate = LocalDateTime.now().plusMonths(3L);
    }

    public void minus(int price) {
        if (expiredDate.isBefore(LocalDateTime.now())) {
            throw new RuntimeException("포인트가 만료됐습니다.");
        }
        int originBalance = value;
        int productPrice = price;
        int remainBalance = originBalance - productPrice;

        if (remainBalance < 0) {
            throw new RuntimeException("잔액이 부족합니다.");
        }
        value = remainBalance;
    }
}
