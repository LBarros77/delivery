package com.company.delivery.models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "Carts")
public class CarttModel extends Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false, length = 100)
    Object name;

    @Column()
    float totalPrice;

    @Column()
    LocalDateTime createAt;

    @Column()
    LocalDateTime updateAt;
}