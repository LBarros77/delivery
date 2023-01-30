package com.company.delivery.DTOs;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class UserDto {
    @NotBlank
    @Size(max = 60)
    private String name;

    @NotBlank
    @Size(max = 150)
    private String email;

    @NotBlank
    @Size(max = 16)
    private String password;

    @NotBlank
    @Size(max = 220)
    private String address;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
