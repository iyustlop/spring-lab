package com.freelance.spring.springlab.controller;

import com.freelance.spring.springlab.business.Jug;
import com.freelance.spring.springlab.repository.JugRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
public class JugController {

    @Autowired
    private JugRepository jugRepository;

    @RequestMapping("/jug")
    public Iterable<Jug> getJugs() {
        return jugRepository.findAll();
    }

    @RequestMapping("/jug/{id}")
    public Jug jugId(@PathVariable Long id) {
        return jugRepository.findOne(id);
    }
}
