package com.company.delivery.services;

import com.company.delivery.models.SalesmanModel;
import com.company.delivery.repositories.ISalesmanRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalesmanService {

    private final ISalesmanRepository salesmanRepository;

    public SalesmanService(ISalesmanRepository salesmanRepository) {
        this.salesmanRepository = salesmanRepository;
    }

    @Transactional
    public SalesmanModel save(SalesmanModel salesmanModel) {
        return salesmanRepository.save(salesmanModel);
    }

    @Override
    public List<SalesmanModel> getAllUsers() {
        return salesmanRepository.findAll();
    }
}
