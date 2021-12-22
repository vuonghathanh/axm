package com.example.eadfinal.service;

import com.example.eadfinal.entity.SaleEntity;
import com.example.eadfinal.repository.SaleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class SaleServiceImp implements SaleService {
    @Autowired
    SaleRepo saleRepo;

    @Override
    public Page<SaleEntity> getAllSale(int pageNumber) {
        Pageable pageable = PageRequest.of(pageNumber - 1 , 5);
        return saleRepo.findAll(pageable);
    }
}
