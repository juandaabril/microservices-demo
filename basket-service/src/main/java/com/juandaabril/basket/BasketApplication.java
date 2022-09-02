package com.juandaabril.basket;

import com.juandaabril.basket.core.domain.Basket;
import com.juandaabril.basket.core.infrastructure.repository.SpringDataBasketRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import reactor.core.publisher.Flux;

@SpringBootApplication
public class BasketApplication implements CommandLineRunner {

	private final static Logger logger = LoggerFactory.getLogger(BasketApplication.class);
	@Autowired
	SpringDataBasketRepository dataBasketRepository;

	@Autowired
	ReactiveMongoTemplate reactiveMongoTemplate;

	public static void main(String[] args) {
		SpringApplication.run(BasketApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		reactiveMongoTemplate.dropCollection(Basket.class).subscribe();


		Flux.just(new Basket("1"), new Basket("2"))
				.flatMap(basket -> dataBasketRepository.save(basket))
				.subscribe(basket -> logger.info("basket" + basket.getId() +":"+ basket.getUserId()));
	}
}
