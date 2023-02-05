package com.company.delivery.models;

import jakarta.persistence.*;

@Entity
@Table(name = "Customers")
public class CustomerModel extends UserModel {
    @Column(length = 14)
    private String cpf;

    /*
    + selectSales()
    + buyFood()
    + viewMenu()
    + makePayment()
    + addToCart()
    + deleteFromToCart()
     */
}
