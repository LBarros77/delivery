package com.company.delivery.models;

import javax.persistence.*;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Customers")
public class CustomerModel extends UserModel {
    @Column(length = 14)
    private String cpf;

//    @OneToMany(targetEntity = ProductModel.class)
//    @JoinColumn(name = "Buy", referencedColumnName = "id")
//    private List<ProductModel> products;

    @OneToOne(targetEntity = CartModel.class)
    @JoinColumn(name = "Has", referencedColumnName = "id")
    private CartModel Cart;
}
