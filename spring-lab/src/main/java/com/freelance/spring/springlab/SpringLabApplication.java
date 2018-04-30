package com.freelance.spring.springlab;

import com.freelance.spring.springlab.business.Jug;
import com.freelance.spring.springlab.business.Parts;
import com.freelance.spring.springlab.repository.JugRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SpringBootApplication
public class SpringLabApplication {

	@Autowired
	private JugRepository jugRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringLabApplication.class, args);
	}

	@PostConstruct
	public void init() {
        List<Jug> list = new ArrayList<>();

        Set<Parts> parts = new HashSet<>();
        parts.add(new Parts("123-567","HeadLigths"));
        parts.add(new Parts("234-678","Hood"));

		Jug jug = new Jug();
		jug.setManufacturer("ferrari");
		jug.setModel("288");
		jug.setYear("1980");
		jug.setParts(parts);
        list.add(jug);

        jug = new Jug();
        jug.setManufacturer("porsche");
        jug.setModel("930");
        jug.setYear("1978");
        jug.setParts(null);
        list.add(jug);

        jugRepository.save(list);
	}
}
