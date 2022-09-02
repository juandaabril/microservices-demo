package com.juandaabril.basket.core.domain;

import java.math.BigDecimal;

public class Product {
    private String id;
    private String name;
    private BigDecimal unitPrice;
    private BigDecimal oldUnitPrice;
    private BigDecimal quantity;
    private String pictureUrl;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public BigDecimal getOldUnitPrice() {
        return oldUnitPrice;
    }

    public void setOldUnitPrice(BigDecimal oldUnitPrice) {
        this.oldUnitPrice = oldUnitPrice;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }
}
