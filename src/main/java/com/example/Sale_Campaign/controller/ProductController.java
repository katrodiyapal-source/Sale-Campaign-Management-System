package com.example.Sale_Campaign.controller;

import com.example.Sale_Campaign.dto.GetProductDto;
import com.example.Sale_Campaign.model.Product;
import com.example.Sale_Campaign.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("product")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("getProduct")
    public GetProductDto getProducts(@RequestParam int pageNo, @RequestParam int pageSize){

        Pageable pages = PageRequest.of(pageNo,pageSize);
       return productService.getProducts(pages);

    }

    @PostMapping("addProduct")
    public void addProduct(@RequestBody Product product){
        productService.addProduct(product);
    }

    @PostMapping("addProducts")
    public void addProducts(@RequestBody List<Product> productList){
        productService.addProducts(productList);
    }
}
