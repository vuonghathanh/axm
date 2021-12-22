package com.example.eadfinal.controller;

import com.example.eadfinal.entity.ProductEntity;
import com.example.eadfinal.entity.SaleEntity;
import com.example.eadfinal.service.ProductService;
import com.example.eadfinal.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class WebController {

    @Autowired
    ProductService productService;

    @Autowired
    SaleService saleService;

    @GetMapping({"/" , "/Product" })
    private String allproduct(Model model)
    {
        return listByPageAll(model,1);
    }

    @GetMapping({"/Sale"})
    private String allsale(Model model)
    {
        return listSaleByPageAll(model,1);
    }


    @GetMapping("/Product/page/{pageNumber}")
    public String listByPageAll(Model model , @PathVariable("pageNumber") int currentPage)
    {
        Page<ProductEntity> page = productService.getAllProduct(currentPage);
        long totalItems = page.getTotalElements();
        int totalPages = page.getTotalPages();
        List<ProductEntity> products = page.getContent();
        model.addAttribute("currentPage" , currentPage);
        model.addAttribute("totalItems",totalItems);
        model.addAttribute("totalPages",totalPages);
        model.addAttribute("products" , products);
        return "Product";
    }

    @GetMapping("/Sale/page/{pageNumber}")
    public String listSaleByPageAll(Model model , @PathVariable("pageNumber") int currentPage)
    {
        Page<SaleEntity> page = saleService.getAllSale(currentPage);
        long totalItems = page.getTotalElements();
        int totalPages = page.getTotalPages();
        List<SaleEntity> sales = page.getContent();
        model.addAttribute("currentPage" , currentPage);
        model.addAttribute("totalItems",totalItems);
        model.addAttribute("totalPages",totalPages);
        model.addAttribute("sales" , sales);
        return "Sale";
    }


}
