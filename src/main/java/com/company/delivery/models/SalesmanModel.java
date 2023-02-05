package com.company.delivery.models;

import jakarta.persistence.*;

@Entity
@Table(name = "Salesman")
public class SalesmanModel extends UserModel {
    @Column(length = 11)
    private String cnpj;

    /*
    + viewFood(): str
    + addMenu(): boolean
    + addFood(foodId): boolean
    + deletFood(foodId, content): boolean
    + modifyMenu(menuId, conent): boolean
    + makeDeliver()
    + confirmeDeliver()
     */
}
