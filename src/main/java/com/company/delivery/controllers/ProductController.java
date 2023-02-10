package com.company.delivery.controllers;

import com.company.delivery.models.ProductModel;
import com.company.delivery.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    public ProductModel addProduct(ProductModel product) {
        return productService.saveProduct(product);
    }
}
