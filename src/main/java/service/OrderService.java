package service;

import domain.Customer;
import domain.Product;

public class OrderService {

    public void order(Customer customer, Product product) {
        // 상품 관리 로직
        product.minusStock();

        // 상품 결제 로직
        customer.payFor(product);
    }
}
