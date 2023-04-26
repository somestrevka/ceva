package com.koba.cevalev;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
@Entity
@Table(name = "apartments",
uniqueConstraints = {
@UniqueConstraint(columnNames = "id")
})
public class Apartment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String ownerName;

    public Apartment() {
    }
}