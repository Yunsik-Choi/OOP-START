package service;

import domain.Customer;
import domain.Product;

public class OrderService {

    public void order(Customer customer, Product product) {
        // 상품 관리 로직
        if (product.getStock() < 1) {
            throw new RuntimeException("주문할 수 없는 상품입니다.");
        }
        int remainStock = product.getStock() - 1;
        product.setStock(remainStock);

        // 상품 결제 로직
        int originBalance = customer.getGiftCard().getValue();
        int productPrice = product.getPrice();
        int remainBalance = originBalance - productPrice;

        if (remainBalance < 0) {
            throw new RuntimeException("잔액이 부족합니다.");
        }
        customer.getGiftCard().setValue(remainBalance);
    }
}
