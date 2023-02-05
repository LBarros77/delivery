package com.company.delivery.repositories;

import com.company.delivery.models.SalesmanModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ISalesmanRepository extends JpaRepository<SalesmanModel, UUID> {
}
