package com.company.delivery.models;

import javax.persistence.*;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Products")
public class ProductModel implements Serializable {
    private static final long serialVersionUID = 1L;

//    private String[] CATEGORIES = {"Lanche", "Bebida"};
//    private String[][] SUB_CATEGORIES = {
//            {"Salgado", "Doce", "Outros"},
//            {"Gelada", "Quente", "Natural", "Outros"}
//    };

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false, length = 100)
    private String name;

    @Column(length = 80)
    private String category;

    @Column(length = 80)
    private String subCategory;

    private float price;

    private int quantity;

//    @ManyToOne(targetEntity = SalesmanModel.class)
//    private SalesmanModel salesman;
//
//    @ManyToMany(targetEntity = CustomerModel.class)
//    private CustomerModel customer;
}