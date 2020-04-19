package com.dobby.petclinic.model;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Table(name = "types")
public class PetType implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Integer id;

    @Column(name = "name")
    private String name;
}
