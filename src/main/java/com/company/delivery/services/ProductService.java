package com.company.delivery.services;

import com.company.delivery.models.ProductModel;
import com.company.delivery.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public ProductModel getProduct(UUID id) { return productRepository.findById(id).orElse(null); }

    public List<ProductModel> getProducts() { return productRepository.findAll(); }

    public ProductModel updateProduct(ProductModel product) {
        ProductModel productUpdated = this.getProduct(product.getId());

        productUpdated.setName(product.getName());
        productUpdated.setCategory(product.getCategory());
        productUpdated.setSubCategory(product.getSubCategory());
        productUpdated.setPrice(product.getPrice());
        productUpdated.setQuantity(product.getQuantity());

        return this.saveProduct(productUpdated);
    }

    public boolean deleteProduct(UUID id) {
        productRepository.deleteById(id);

        return !(this.getProduct(id) == null);
    }

    @Autowired
    public List<ProductModel> saveProducts(List<ProductModel> products) {
        return productRepository.saveAll(products);
    }

    @Transactional
    public ProductModel saveProduct(ProductModel product) {
        return productRepository.save(product);
    }

    // buyFood
}
