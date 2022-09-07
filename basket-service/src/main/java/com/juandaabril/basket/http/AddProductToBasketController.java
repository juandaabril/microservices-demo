package com.juandaabril.basket.http;

import com.juandaabril.basket.core.application.AddProductToBasket;
import com.juandaabril.basket.core.domain.Basket;
import com.juandaabril.basket.core.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.math.BigDecimal;

@RestController
public class AddProductToBasketController {

    @Autowired
    private AddProductToBasket addProductToBasket;

    @PutMapping("/api/basket")
    public Mono<Basket> handle(@RequestBody Request request) {
        return addProductToBasket.invoke(request.userId, request.product.toProduct());
    }

    public static class Request {
        public String userId;
        public ProductRequest product;
    }

    public static class ProductRequest {
        public String id;
        public String name;
        public BigDecimal unitPrice;
        public BigDecimal oldUnitPrice;
        public BigDecimal quantity;
        public String pictureUrl;

        public Product toProduct() {
            Product product = Product.createFrom(
                    id,
                    name,
                    unitPrice,
                    oldUnitPrice,
                    quantity,
                    pictureUrl
            );

            return product;
        }
    }
}
