package com.company.delivery.DTOs;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.UUID;

@Data
public class OrderResponseDTO {

    private UUID id;

    @NotBlank
    @Size(max = 60)
    private String name;

    @NotBlank
    private String category;

    private String subCategory;

    @NotBlank
    private float price;

    private int quantity;
}
