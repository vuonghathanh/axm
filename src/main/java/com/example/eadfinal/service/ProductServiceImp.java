package com.example.eadfinal.service;

import com.example.eadfinal.entity.ProductEntity;
import com.example.eadfinal.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImp implements ProductService {
    @Autowired
    ProductRepo productRepo;

    @Override
    public Page<ProductEntity> getAllProduct(int pageNumber) {
        Pageable pageable = PageRequest.of(pageNumber - 1 , 5);
        return productRepo.findAll(pageable);
    }
}
