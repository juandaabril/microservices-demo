package com.juandaabril.catalog.core.domain;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name="Products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long categoryId;
    private String description;
    private BigDecimal price;
    private String pictureFileName;
    private String pictureUrl;

    public static Product create(Long categoryId, String description, BigDecimal price, String pictureFileName, String pictureUrl) {
        Product product = new Product();
        product.categoryId = categoryId;
        product.description = description;
        product.price = price;
        product.pictureFileName = pictureFileName;
        product.pictureUrl = pictureUrl;

        return product;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getPictureFileName() {
        return pictureFileName;
    }

    public void setPictureFileName(String pictureFileName) {
        this.pictureFileName = pictureFileName;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    public static class ProductNotFound extends RuntimeException {}
}
