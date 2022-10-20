package com.juandaabril.catalog.core.actions;

import com.juandaabril.catalog.core.domain.Product;
import com.juandaabril.catalog.core.domain.Product.ProductNotFound;
import com.juandaabril.catalog.core.domain.ProductRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;
import java.util.UUID;

@Service
@Transactional
public class DeleteProduct {

    private ProductRepository productRepository;

    public DeleteProduct(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void invoke(UUID id) {
        Optional<Product> product = this.productRepository.findById(id);
        if (product.isEmpty()) {
            throw new ProductNotFound();
        }

        this.productRepository.deleteById(id);
    }
}
