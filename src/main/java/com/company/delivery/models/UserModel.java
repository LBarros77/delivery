package com.company.delivery.models;

import javax.persistence.*;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class UserModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false, length = 60)
    private String name;

    @Column(nullable = false, length = 150)
    private String email;

    @Column(length = 220)
    private String address;

    @Column(nullable = false, length = 16)
    private String password;
}
