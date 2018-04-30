package com.freelance.spring.springlab.business;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Parts {
    @Id
    @GeneratedValue
    private Long id;
    private String partNumber;
    private String description;

    public Parts(String partNumber, String description) {
        this.partNumber = partNumber;
        this.description = description;
    }
}
