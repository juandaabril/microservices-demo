package com.juandaabril.catalog.http;

import com.juandaabril.catalog.core.actions.CreateProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@RestController
public class CreateProductController {

    @Autowired
    private CreateProduct createProduct;

    @PostMapping("/api/product/create-product")
    public void handle(@RequestBody @Valid ProductRequest request) {
        this.createProduct.invoke(
                request.categoryId,
                request.description,
                request.price,
                request.pictureFileName,
                request.pictureUrl
        );
    }

    public static class ProductRequest {
        @NotNull
        public Long categoryId;
        @NotEmpty
        public String description;
        @NotNull
        public BigDecimal price;
        public String pictureFileName;

        public String pictureUrl;

    }
}
