package com.juandaabril.catalog.core.actions;

import com.juandaabril.catalog.core.domain.Category;
import com.juandaabril.catalog.core.domain.CategoryRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class GetAllCategories {

    private CategoryRepository categoryRepository;

    public GetAllCategories(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<Category> invoke() {
        return this.categoryRepository.findAll();
    }
}
