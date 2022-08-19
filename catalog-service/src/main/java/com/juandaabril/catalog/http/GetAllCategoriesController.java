package com.juandaabril.catalog.http;

import com.juandaabril.catalog.core.actions.GetAllCategories;
import com.juandaabril.catalog.core.domain.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GetAllCategoriesController {

    @Autowired
    private GetAllCategories getAllCategories;

    @GetMapping("/api/category/get-all-categories")
    public List<Category> handle() {
        return this.getAllCategories.invoke();
    }
}
