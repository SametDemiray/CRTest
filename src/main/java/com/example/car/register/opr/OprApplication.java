package com.example.car.register.opr;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class OprApplication {

	public static void main(String[] args) {
		SpringApplication.run(OprApplication.class, args);


	}


	@Bean
	public ModelMapper BrandModelMapper(){
		return new ModelMapper();
	}

}
