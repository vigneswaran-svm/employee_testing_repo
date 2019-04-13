package com.spring.rest.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@EnableJpaRepositories("com.spring.rest.api")
@EntityScan("com.spring.rest.api.model")
@SpringBootApplication
public class SpringRestJpaApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRestJpaApiApplication.class, args);
	}

}
