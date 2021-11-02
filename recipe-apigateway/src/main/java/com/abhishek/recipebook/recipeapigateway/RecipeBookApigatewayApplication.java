package com.abhishek.recipebook.recipeapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import brave.sampler.Sampler;

@SpringBootApplication
public class RecipeBookApigatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(RecipeBookApigatewayApplication.class, args);
	}

	@Bean
	public Sampler defaultSampler() {
		return Sampler.ALWAYS_SAMPLE;
	}
}
