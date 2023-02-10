package com.company.delivery.models;

import javax.persistence.*;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Salesmen")
public class SalesmanModel extends UserModel {
    @Column(length = 11)
    private String cnpj;

    @OneToMany(targetEntity = ProductModel.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "Manage", referencedColumnName = "id")
    private List<ProductModel> products;
}
