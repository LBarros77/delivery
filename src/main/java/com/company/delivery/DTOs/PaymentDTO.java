package com.company.delivery.DTOs;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.UUID;

public class PaymentDTO {

    @NotBlank
    @NotNull
    private UUID curtomerId;

    @NotBlank
    @Size(min = 4, max = 220)
    private String nameCard;

    @NotBlank
    private String type;

    @NotBlank
    private String cardNumber;

    @NotBlank
    private boolean status;
}
