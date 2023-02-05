package com.company.delivery.models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "Carts")
public class CartModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false, length = 100)
    private Object name;

    @Column()
    float totalPrice;

    @Column()
    private LocalDateTime createAt;

    @Column()
    private LocalDateTime updateAt;

    public UUID getId() {
        return id;
    }

    public Object getName() {
        return name;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public LocalDateTime getCreateAt() {
        return createAt;
    }

    public LocalDateTime getUpdateAt() {
        return updateAt;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setName(Object name) {
        this.name = name;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setCreateAt(LocalDateTime createAt) {
        this.createAt = createAt;
    }

    public void setUpdateAt(LocalDateTime updateAt) {
        this.updateAt = updateAt;
    }
}