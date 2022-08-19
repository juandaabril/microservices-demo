package com.juandaabril.catalog.core.domain;

import java.util.List;
import java.util.Optional;

public interface CategoryRepository {
    public List<Category> findAll();
    public  Optional<Category> findById(Long id);
}
