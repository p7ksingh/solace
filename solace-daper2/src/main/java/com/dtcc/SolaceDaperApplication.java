package com.dtcc;

import java.util.function.Supplier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SolaceDaperApplication {

	public static void main(String[] args) {
		SpringApplication.run(SolaceDaperApplication.class, args);
	}

	@Bean
	public Supplier<String> producer() {
		return () -> "say Hi! to producer method ";
	}

}
