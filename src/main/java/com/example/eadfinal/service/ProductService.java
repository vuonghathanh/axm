package com.example.eadfinal.service;

import com.example.eadfinal.entity.ProductEntity;
import org.springframework.data.domain.Page;

public interface ProductService {
    Page<ProductEntity> getAllProduct(int pageNumber);
}
