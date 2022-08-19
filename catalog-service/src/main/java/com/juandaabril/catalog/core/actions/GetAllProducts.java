package com.juandaabril.catalog.core.actions;

import com.juandaabril.catalog.core.domain.Category;
import com.juandaabril.catalog.core.domain.CategoryRepository;
import com.juandaabril.catalog.core.domain.Product;
import com.juandaabril.catalog.core.domain.ProductRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class GetAllProducts {

    private ProductRepository productRepository;

    public GetAllProducts(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> invoke() {
        return this.productRepository.findAll();
    }
}
