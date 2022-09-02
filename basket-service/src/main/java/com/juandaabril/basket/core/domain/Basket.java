package com.juandaabril.basket.core.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
public class Basket {

    @Id
    private String id;
    private String userId;

    public Basket() {
    }

    public Basket(String userId) {
        this.userId = userId;
    }

    public String getId() {
        return id;
    }

    public String getUserId() {
        return userId;
    }
}
