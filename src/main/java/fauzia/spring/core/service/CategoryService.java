package fauzia.spring.core.service;

import fauzia.spring.core.repository.CategoryRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CategoryService {
    @Getter
    private CategoryRepository categoryRepository;
    @Autowired
    public void setCategoryRepository(CategoryRepository categoryRepository){
        this.categoryRepository = categoryRepository;
    }
}
