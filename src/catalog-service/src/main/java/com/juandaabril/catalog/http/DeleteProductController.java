package com.juandaabril.catalog.http;

import com.juandaabril.catalog.core.actions.DeleteProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class DeleteProductController {

    @Autowired
    private DeleteProduct deleteProduct;

    @DeleteMapping("/catalog/product/delete-product/{id}")
    public void handle(@PathVariable UUID id) {
        this.deleteProduct.invoke(id);
    }
}
