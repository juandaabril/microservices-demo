package com.juandaabril.catalog.http;

import com.juandaabril.catalog.core.actions.GetAllProducts;
import com.juandaabril.catalog.core.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GetAllProductsController {

    @Autowired
    private GetAllProducts getAllProducts;

    @GetMapping("/api/product/get-all-products")
    public List<Product> handle() {
        return this.getAllProducts.invoke();
    }
}
