package service;

import domain.Customer;
import domain.Product;

public class OrderService {

    public void order(Customer customer, Product product) {
        // 재고 감소 로직
        if (product.getStock() < 1) {
            throw new RuntimeException("재고가 1개 이상일 때만 주문할 수 있습니다.");
        }
        int remainStock = product.getStock() - 1;
        product.setStock(remainStock);

        // 카드 보유액 감소 로직
        int originBalance = customer.getCard().getBalance();
        int productPrice = product.getPrice();
        int remainBalance = originBalance - productPrice;

        if (remainBalance < 0) {
            throw new RuntimeException("잔액이 부족합니다.");
        }
        customer.getCard().setBalance(remainBalance);
    }
}
