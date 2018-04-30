package com.freelance.spring.springlab.repository;

import com.freelance.spring.springlab.business.Parts;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

@RestResource(path = "part", rel="part")
public interface PartsRepository extends CrudRepository<Parts,Long> {
}
