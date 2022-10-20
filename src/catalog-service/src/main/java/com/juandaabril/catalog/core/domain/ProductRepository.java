package com.juandaabril.catalog.core.domain;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ProductRepository {
    public void save(Product product);
    public Optional<Product> findById(UUID id);
    public List<Product> findAll();
    public void deleteById(UUID id);
}
