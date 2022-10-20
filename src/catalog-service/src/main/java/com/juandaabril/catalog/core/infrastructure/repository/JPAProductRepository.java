package com.juandaabril.catalog.core.infrastructure.repository;

import com.juandaabril.catalog.core.domain.Product;
import com.juandaabril.catalog.core.domain.ProductRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public class JPAProductRepository implements ProductRepository {

    private SpringDataCrudProductRepository repository;

    public JPAProductRepository(SpringDataCrudProductRepository repository) {
        this.repository = repository;
    }

    @Override
    public void save(Product product) {
        this.repository.save(product);
    }

    @Override
    public Optional<Product> findById(UUID id) {
        return this.repository.findById(id);
    }

    @Override
    public List<Product> findAll() {
        return this.repository.findAll();
    }

    @Override
    public void deleteById(UUID id) {
        this.repository.deleteById(id);
    }
}
