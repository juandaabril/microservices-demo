package com.juandaabril.catalog.core.actions;

import com.juandaabril.catalog.core.domain.Category;
import com.juandaabril.catalog.core.domain.CategoryRepository;
import com.juandaabril.catalog.core.domain.Product;
import com.juandaabril.catalog.core.domain.ProductRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.Optional;

import static com.juandaabril.catalog.core.domain.Category.*;


@Service
@Transactional
public class CreateProduct {

    private CategoryRepository categoryRepository;
    private ProductRepository productRepository;

    public CreateProduct(CategoryRepository categoryRepository, ProductRepository productRepository) {
        this.categoryRepository = categoryRepository;
        this.productRepository = productRepository;
    }

    public void invoke(Long categoryId, String description, BigDecimal price, String pictureFileName, String pictureUrl) {
        Optional<Category> category = this.categoryRepository.findById(categoryId);
        if (category.isEmpty()) {
            throw new CategoryNotFound();
        }

        Product product = Product.create(categoryId, description, price, pictureFileName, pictureUrl);

        this.productRepository.save(product);
    }
}
