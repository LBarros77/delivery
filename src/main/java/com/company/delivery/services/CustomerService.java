package com.company.delivery.services;

import com.company.delivery.DTOs.OrderRequestDTO;
import com.company.delivery.DTOs.OrderResponseDTO;
import com.company.delivery.DTOs.PaymentDTO;
import com.company.delivery.models.CustomerModel;
import com.company.delivery.models.PaymentModel;
import com.company.delivery.models.ProductModel;
import com.company.delivery.repositories.CustomerRepository;
import com.company.delivery.repositories.PaymentRepository;
import com.company.delivery.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private PaymentRepository paymentRepository;

    @Autowired
    private OrderRequestDTO orderRequest;

    @Autowired
    private OrderResponseDTO orderResponse;

    @Autowired
    private PaymentDTO paymentDTO;

    @Autowired
    private ProductService productService;

    public CustomerModel getCustomer(UUID id) { return customerRepository.findById(id).orElse(null); }

    public List<ProductModel> selectSales() {
        return productService.getProducts();
    }

    public boolean buyFood(UUID id) {
        CustomerModel customer = getCustomer(id);

        PaymentModel payment = paymentRepository.findById(customer.getId()).orElse(null);

        if(payment != null) {
           payment.setStatus(true);

           paymentRepository.save(payment);

           return true;
        }

        return false;
    }
}
