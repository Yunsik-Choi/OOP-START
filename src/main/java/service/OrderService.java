package service;

import domain.Customer;
import domain.Product;

public class OrderService {

    public void order(Customer customer, Product product) {
        // 상품 관리 로직
        if (product.isStockLessThanOne()) {
            throw new RuntimeException("주문할 수 없는 상품입니다.");
        }
        product.minusStock();

        // 상품 결제 로직
        customer.payFor(product);
    }
}
