package com.dobby.petclinic.dao.model;

import lombok.Data;

import javax.persistence.*;


@Data
@Table(name = "specialties")
public class Specialty {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @Column(name = "name")
    private String name;
}
