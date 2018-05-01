package com.freelance.spring.springferrari;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringFerrariApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringFerrariApplication.class, args);
	}
}
