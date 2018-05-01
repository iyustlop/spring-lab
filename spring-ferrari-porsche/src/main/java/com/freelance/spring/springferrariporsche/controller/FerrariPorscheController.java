package com.freelance.spring.springferrariporsche.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class FerrariPorscheController {
	
	@Autowired DiscoveryClient client;
	
	@RequestMapping("/ferrarivsporsche")
	  public @ResponseBody String getDcVsMarvel() {
	    return 
	      getHeroe("SPRING-FERRARI") + " "
	      + getHeroe("SPRING-PORSCHE") + "."
	      ;
	  }
	  
	  public String getHeroe(String service) {
	    List<ServiceInstance> list = client.getInstances(service);
	    if (list != null && list.size() > 0 ) {
	      URI uri = list.get(0).getUri();
	  if (uri !=null ) {
	    return (new RestTemplate()).getForObject(uri,String.class);
	  }
	    }
	    return null;
	  }

}
