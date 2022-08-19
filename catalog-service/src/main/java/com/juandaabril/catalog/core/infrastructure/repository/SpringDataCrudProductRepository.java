package com.juandaabril.catalog.core.infrastructure.repository;

import com.juandaabril.catalog.core.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataCrudProductRepository extends JpaRepository<Product, Long> {
}
