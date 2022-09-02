package com.juandaabril.basket.core.infrastructure.repository;

import com.juandaabril.basket.core.domain.Basket;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;

public interface SpringDataBasketRepository extends ReactiveMongoRepository<Basket, String> {
    Mono<Basket> findByUserId(String userId);

}
