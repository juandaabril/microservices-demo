package com.juandaabril.basket.core.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document
public class Basket {

    @Id
    private String id;
    private String userId;

    private List<Product> products;

    public Basket() {
    }

    public Basket(String id, String userId, List<Product> products) {
        this.id = id;
        this.userId = userId;
        this.products = products;
    }

    public static Basket createEmptyBasket(String userId) {
        Basket basket = new Basket(null, userId, new ArrayList<>());
        return basket;
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }
    public String getId() {
        return id;
    }

    public String getUserId() {
        return userId;
    }

    public List<Product> getProducts() {
        return products;
    }
}
