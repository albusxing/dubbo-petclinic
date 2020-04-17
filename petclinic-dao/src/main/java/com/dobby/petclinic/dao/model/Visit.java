package com.dobby.petclinic.dao.model;

import lombok.Data;
import javax.persistence.*;
import java.util.Date;

@Data
@Table(name = "visits")
public class Visit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Date date;

    private String description;

    private Pet pet;

}
