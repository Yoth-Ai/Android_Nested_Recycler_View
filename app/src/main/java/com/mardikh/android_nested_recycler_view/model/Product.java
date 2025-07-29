package com.mardikh.android_nested_recycler_view.model;

public class Product {
    private final String name;
    private final String price;

    public Product(String name, String price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }
}
