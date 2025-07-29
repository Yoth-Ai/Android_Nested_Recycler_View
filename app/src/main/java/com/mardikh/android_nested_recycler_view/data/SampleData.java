package com.mardikh.android_nested_recycler_view.data;

import com.mardikh.android_nested_recycler_view.model.Category;
import com.mardikh.android_nested_recycler_view.model.Product;

import java.util.ArrayList;
import java.util.List;

public class SampleData {

    public static List<Category> getCategories() {
        List<Category> categories = new ArrayList<>();

        List<Product> electronics = new ArrayList<>();
        electronics.add(new Product("Phone", "$299"));
        electronics.add(new Product("Laptop", "$999"));
        electronics.add(new Product("Headphones", "$99"));

        List<Product> clothing = new ArrayList<>();
        clothing.add(new Product("T-Shirt", "$19"));
        clothing.add(new Product("Jeans", "$39"));
        clothing.add(new Product("Jacket", "$59"));

        categories.add(new Category("Electronics", electronics));
        categories.add(new Category("Clothing", clothing));

        return categories;
    }
}
