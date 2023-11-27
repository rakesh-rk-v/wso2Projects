package com.jyo.SoapwithDb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.client.RestTemplate;
@ComponentScan("com.jyo.SoapwithDb")
@EntityScan("com.jyo.SoapwithDb.dao")
@EnableJpaRepositories("com.jyo.SoapwithDb.inter")
@SpringBootApplication
public class SoapwithDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(SoapwithDbApplication.class, args);
	}
	@Bean
    public RestTemplate getRestTemplate() {
       return new RestTemplate();
       }
}
