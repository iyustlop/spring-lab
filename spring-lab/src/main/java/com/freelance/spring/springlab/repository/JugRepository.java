package com.freelance.spring.springlab.repository;

import com.freelance.spring.springlab.business.Jug;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

@RestResource(path="jug", rel= "jugs")
public interface JugRepository extends CrudRepository<Jug,Long> {
}
