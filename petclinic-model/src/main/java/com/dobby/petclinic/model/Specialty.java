package com.dobby.petclinic.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;


@Data
@Table(name = "specialties")
public class Specialty implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @Column(name = "name")
    private String name;
}
