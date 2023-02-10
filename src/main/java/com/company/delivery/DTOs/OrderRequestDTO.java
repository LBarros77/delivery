package com.company.delivery.DTOs;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.UUID;

public class OrderRequestDTO {

    @NotBlank
    private UUID id;

    @NotBlank
    @Size(max = 60)
    private String name;

    @NotBlank
    private String category;

    private String subCategory;

    @NotBlank
    private float price;

    @NotBlank
    private int quantity;
}
