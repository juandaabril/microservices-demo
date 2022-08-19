package com.juandaabril.catalog.core.infrastructure.repository;

import com.juandaabril.catalog.core.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataCrudCategoryRepository extends JpaRepository<Category, Long> {
}
