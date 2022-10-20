package com.juandaabril.basket.core.infrastructure.repository;

import com.juandaabril.basket.core.domain.Basket;
import com.juandaabril.basket.core.domain.BasketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public class ReactiveBasketRepository implements BasketRepository {

    @Autowired
    private SpringDataBasketRepository springDataBasketRepository;


    @Override
    public Mono<Basket> save(Basket basket) {
        return springDataBasketRepository.save(basket);
    }

    @Override
    public Flux<Basket> findAll() {
        return springDataBasketRepository.findAll();
    }

    @Override
    public Mono<Basket> findByUserId(String userId) {
        return springDataBasketRepository.findByUserId(userId);
    }
}
