package com.dobby.petclinic.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;


@Data
@Table(name = "pets")
public class Pet implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "birth_date")
    private Date birthDate;

    @JoinColumn(name = "type_id")
    private Integer petTypeId;

    private Owner owner;

    private Set<Visit> visits;

    public boolean isNew() {
        return this.id == null;
    }




}
