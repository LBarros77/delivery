package com.company.delivery.services;

import com.company.delivery.DTOs.PaymentDTO;
import com.company.delivery.repositories.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServer {

    @Autowired
    private PaymentRepository paymentRepository;

    @Autowired
    private PaymentDTO paymentDTO;


}
