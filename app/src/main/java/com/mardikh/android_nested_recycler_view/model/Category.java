package com.mardikh.android_nested_recycler_view.model;

import java.util.List;

public class Category {
    private final String title;
    private final List<Product> productList;

    public Category(String title, List<Product> productList) {
        this.title = title;
        this.productList = productList;
    }

    public String getTitle() {
        return title;
    }

    public List<Product> getProductList() {
        return productList;
    }
}
