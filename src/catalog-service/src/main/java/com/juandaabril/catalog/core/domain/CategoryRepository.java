package com.juandaabril.catalog.core.domain;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface CategoryRepository {
    public List<Category> findAll();
    public  Optional<Category> findById(UUID id);
}
