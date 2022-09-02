package com.juandaabril.basket.http;

import com.juandaabril.basket.core.infrastructure.repository.SpringDataBasketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class GetBasketController {

    @Autowired
    private SpringDataBasketRepository springDataBasketRepository;

    @GetMapping("/api/basket/customer/{id}")
    public Flux<BasketResponse> getBasket(@PathVariable String id) {
        return springDataBasketRepository.findAll()
                .map(basket -> new BasketResponse(basket.getId(), basket.getUserId()));
    }

    public static class BasketResponse {
        public String id;
        public String userId;

        public BasketResponse(String id, String userId) {
            this.id = id;
            this.userId = userId;
        }
    }
}
