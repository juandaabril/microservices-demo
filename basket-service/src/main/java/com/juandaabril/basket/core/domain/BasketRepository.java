package com.juandaabril.basket.core.domain;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface BasketRepository {
    Mono<Basket> findById(String id);
    Mono<Basket> save(Basket basket);
    Flux<Basket> findAll();
}
