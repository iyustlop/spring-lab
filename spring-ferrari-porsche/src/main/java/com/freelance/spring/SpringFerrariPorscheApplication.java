package com.freelance.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringFerrariPorscheApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringFerrariPorscheApplication.class, args);
	}
}
