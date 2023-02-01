package com.company.delivery.models;

import jakarta.persistence.*;

@Entity
@Table(name = "Salesman")
public class SalesmanModel extends UserModel {
    @Column(length = 11)
    private String cpf;
}
