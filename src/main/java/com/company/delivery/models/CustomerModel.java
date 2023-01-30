package com.company.delivery.models;

import jakarta.persistence.Column;

public class CustomerModel extends UserModel {
    @Column(length = 14)
    private String cnpj;
}
