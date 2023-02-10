package com.company.delivery.repositories;

import com.company.delivery.models.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface ProductRepository extends JpaRepository<ProductModel, UUID> {

    ProductModel findByName(String name);
}
