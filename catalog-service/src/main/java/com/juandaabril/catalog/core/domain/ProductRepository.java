package com.juandaabril.catalog.core.domain;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {
    public void save(Product product);
    public Optional<Product> findById(Long id);
    public List<Product> findAll();
    public void deleteById(Long id);
}
