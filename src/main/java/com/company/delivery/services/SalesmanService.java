package com.company.delivery.services;

import com.company.delivery.DTOs.OrderResponseDTO;
import com.company.delivery.models.ProductModel;

import com.company.delivery.models.SalesmanModel;
import com.company.delivery.repositories.ProductRepository;
import com.company.delivery.repositories.SalesmanRepository;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SalesmanService {

    @Autowired
    private SalesmanRepository salesmanRepository;
    @Autowired
    private ProductRepository productRepository;

    public List<OrderResponseDTO> viewFood() {
        return productRepository.findAll()
                .stream()
                .map(this::convertEntityToDto)
                .collect(Collectors.toList());
    }

    private OrderResponseDTO convertEntityToDto(ProductModel product) {
        OrderResponseDTO orderResponse = new OrderResponseDTO();

        orderResponse.setId(product.getId());
        orderResponse.setName(product.getName());
        orderResponse.setCategory(product.getCategory());
        orderResponse.setSubCategory(product.getSubCategory());
        orderResponse.setQuantity(product.getQuantity());
        orderResponse.setPrice(product.getPrice());

        return orderResponse;
    }

    @Transactional
    public SalesmanModel saveSalesman(SalesmanModel salesman) {
        return salesmanRepository.save(salesman);
    }
}
