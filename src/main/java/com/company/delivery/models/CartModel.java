package com.company.delivery.models;

import javax.persistence.*;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Carts")
public class CartModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private float totalPrice;

    @OneToMany(targetEntity = ProductModel.class)
    private List<ProductModel> products;

//    @OneToOne(targetEntity = CustomerModel.class)
//    private CustomerModel customer;
}