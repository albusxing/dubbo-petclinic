package com.dobby.petclinic.dao.model;


import lombok.Data;

import javax.persistence.*;

@Data
@Table(name = "types")
public class PetType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Integer id;

    @Column(name = "name")
    private String name;
}
