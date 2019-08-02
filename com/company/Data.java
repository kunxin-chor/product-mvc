package com.company;

import java.util.Vector;

public class Data {
    private String message;
    private Vector<Product> products;

    public Data(){
        products = new Vector<>();
        products.add(new Product("Wireless Mouse", "Mouse that don't need a wire", 59.99f));
        products.add(new Product("Wireless Keyboard", "Keyboard that don't need a wire", 59.99f));

    }
    private Product selectedProduct;
    public Vector<Product> getAllProducts() {
        return products;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setSelectedProduct(Product p) {
        selectedProduct = p;
    }

    public Product getSelectedProduct() {
        return selectedProduct;
    }
}

