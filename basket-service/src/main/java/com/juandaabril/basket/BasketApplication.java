package com.juandaabril.basket;

import com.juandaabril.basket.core.domain.Basket;
import com.juandaabril.basket.core.domain.Product;
import com.juandaabril.basket.core.infrastructure.repository.SpringDataBasketRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import reactor.core.publisher.Flux;

import java.math.BigDecimal;
import java.util.ArrayList;

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

		Basket basket1 = new Basket(null, "1", new ArrayList<>());
		Basket basket2 = new Basket(null, "2", new ArrayList<>());

		//String id, String name, BigDecimal unitPrice, BigDecimal oldUnitPrice, BigDecimal quantity, String pictureUrl) {
		basket1.addProduct(new Product("1", "demo", BigDecimal.TEN, BigDecimal.ZERO, new BigDecimal(2), "url"));
		basket1.addProduct(new Product("2", "aaa", BigDecimal.TEN, BigDecimal.ZERO, new BigDecimal(2), "url"));



		Flux.just(basket1, basket2)
				.flatMap(basket -> dataBasketRepository.save(basket))
				.subscribe(basket -> logger.info("basket" + basket.getId() +":"+ basket.getUserId()));
	}
}
