package com.example.eadfinal.service;

import com.example.eadfinal.entity.SaleEntity;
import org.springframework.data.domain.Page;

public interface SaleService {
    Page<SaleEntity> getAllSale(int pageNumber);
}
