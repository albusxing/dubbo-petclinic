package com.dobby.petclinic.dao.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.*;


@Data
@Table(name = "pets")
public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "birth_date")
    private Date birthDate;

    @JoinColumn(name = "type_id")
    private PetType type;

    private Owner owner;

    private Set<Visit> visits;



}
