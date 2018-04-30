package com.freelance.spring.springlab.business;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
public class Jug {
    @Id
    @GeneratedValue
    private Long id;
    private String manufacturer;
    private String model;
    private String year;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="jugId")
    private Set<Parts> parts;
}
