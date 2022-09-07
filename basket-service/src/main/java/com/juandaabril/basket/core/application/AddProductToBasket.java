package com.juandaabril.basket.core.application;

import com.juandaabril.basket.core.domain.Basket;
import com.juandaabril.basket.core.domain.BasketRepository;
import com.juandaabril.basket.core.domain.Product;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class AddProductToBasket {

    private BasketRepository basketRepository;

    public AddProductToBasket(BasketRepository basketRepository) {
        this.basketRepository = basketRepository;
    }

    public Mono<Basket> invoke(String userId, Product product) {
        return basketRepository.findByUserId(userId)
                .defaultIfEmpty(Basket.createEmptyBasket(userId))
                .flatMap(basket -> createOrUpdateBasket(basket, product));

    }

    private Mono<Basket> createOrUpdateBasket(Basket basket, Product product) {
        basket.addProduct(product);

        return basketRepository.save(basket);
    }
}
