package com.dobby.petclinic.dao.model;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;


@Data
@Table(name = "owners")
public class Owner implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;


    @Column(name = "address")
    private String address;

    @Column(name = "city")
    private String city;

    @Column(name = "telephone")
    private String telephone;


}
