package fauzia.spring.core.service;

import fauzia.spring.core.repository.ProductRepository;
import lombok.Getter;
import org.springframework.stereotype.Component;

@Component
public class ProductService {
    @Getter
    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository){
        this.productRepository = productRepository;
    }
}
