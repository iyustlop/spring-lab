package com.freelance.spring.springconfigclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class JugsPresentersController {

    @Value("${jugs-presentes}") String jugsPresentes;

    @RequestMapping("/jugs-presentes")
    public String showJugsPresentes(){
        return "Manufacturers: " + jugsPresentes;
    }
}
