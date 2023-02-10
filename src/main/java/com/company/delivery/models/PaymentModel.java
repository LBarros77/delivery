package com.company.delivery.models;

import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

@Data
@Entity(name = "Payments")
public class PaymentModel {

    @Id
    @OneToOne
    @JoinColumn(
            foreignKey = @ForeignKey(name = "curtomer_id", value = ConstraintMode.NO_CONSTRAINT)
    )
    private UUID curtomerId;

    private String nameCard;
    private String type;
    private String cardNumber;
    private boolean status;
}
