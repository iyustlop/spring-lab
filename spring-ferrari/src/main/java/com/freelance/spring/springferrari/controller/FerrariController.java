package com.freelance.spring.springferrari.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FerrariController {
	
	@Value("${models}") String models;
	
	@RequestMapping("/")
	  public @ResponseBody String getHeroe() {
	    String[] modelsArray = models.split(",");
	    int i = (int)Math.round(Math.random() * (modelsArray.length - 1));
	    return modelsArray[i];
	  }

}
