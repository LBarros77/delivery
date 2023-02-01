package com.company.delivery.models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "Products")
public class ProductModel extends Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false, length = 100)
    protected String name;

    @Column(length = 80)
    protected String category;

    @Column(length = 80)
    protected String subCategory;

    @Column()
    protected LocalDateTime createAt;

    @Column()
    protected LocalDateTime updateAt;
}