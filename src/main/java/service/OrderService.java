package service;

import domain.Customer;
import domain.Product;

public class OrderService {

    public void order(Customer customer, Product product) {
        product.sellTo(customer);
    }
}
