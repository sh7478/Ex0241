package com.example.ex0241.ex1;

public class ShoppingCart {
    private Product[] products = new Product[10];
    public ShoppingCart(Product[] products) {
        this.products = products;
    }

    public double calculateTotal() {
        int sum = 0;
        for (Product p : products) {
            sum += p.getPrice();
        }
    }
}
