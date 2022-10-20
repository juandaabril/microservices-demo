package com.juandaabril.basket.core.domain;

import java.math.BigDecimal;

public class Product {
    private String id;
    private String name;
    private BigDecimal unitPrice;
    private BigDecimal oldUnitPrice;
    private BigDecimal quantity;
    private String pictureUrl;

    public Product() {
    }

    public Product(String id, String name, BigDecimal unitPrice, BigDecimal oldUnitPrice, BigDecimal quantity, String pictureUrl) {
        this.id = id;
        this.name = name;
        this.unitPrice = unitPrice;
        this.oldUnitPrice = oldUnitPrice;
        this.quantity = quantity;
        this.pictureUrl = pictureUrl;
    }

    public static Product createFrom(String productId, String name, BigDecimal unitPrice, BigDecimal oldUnitPrice, BigDecimal quantity, String pictureUrl) {
        Product product = new Product(
                productId,
                name,
                unitPrice,
                oldUnitPrice,
                quantity,
                pictureUrl
        );
        return product;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public BigDecimal getOldUnitPrice() {
        return oldUnitPrice;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }
}
