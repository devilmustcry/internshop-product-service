package com.sandstorm.internshop.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "customers")
@Data
public class Customer {
    @Id
    @GeneratedValue
    @Column
    private Long id;

    @NotBlank
    @NotNull
    @Column
    private String username;

    @NotBlank
    @NotNull
    @Column
    private String password;

    @NotBlank
    @NotNull
    @Column
    private String name;
}