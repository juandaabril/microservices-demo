package com.juandaabril.basket.http;

import com.juandaabril.basket.core.domain.Basket;
import com.juandaabril.basket.core.infrastructure.repository.SpringDataBasketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class GetBasketByUserIdController {

    @Autowired
    private SpringDataBasketRepository springDataBasketRepository;

    @GetMapping("/api/basket/get-basket-by-userid/{id}")
    public Mono<Basket> getBasketByUserId(@PathVariable String id) {
        return springDataBasketRepository.findByUserId(id);
    }
}
