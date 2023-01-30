package com.company.delivery.models;

import jakarta.persistence.Column;

public class SalesManModel extends UserModel {
    @Column(length = 11)
    private String cpf;
}
