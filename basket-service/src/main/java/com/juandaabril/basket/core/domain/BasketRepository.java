package com.juandaabril.basket.core.domain;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface BasketRepository {
    Mono<Basket> save(Basket basket);
    Flux<Basket> findAll();
    Mono<Basket> findByUserId(String userId);
}
