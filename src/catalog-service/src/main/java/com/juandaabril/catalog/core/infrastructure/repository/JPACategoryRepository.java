package com.juandaabril.catalog.core.infrastructure.repository;

import com.juandaabril.catalog.core.domain.Category;
import com.juandaabril.catalog.core.domain.CategoryRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public class JPACategoryRepository implements CategoryRepository {

   private SpringDataCrudCategoryRepository repository;

    public JPACategoryRepository(SpringDataCrudCategoryRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Category> findAll() {
        return this.repository.findAll();
    }

    @Override
    public Optional<Category> findById(UUID id) {
        return this.repository.findById(id);
    }
}
