package com.te.springcorewithanotations.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.te.springcorewithanotations.bean.Pet;
import com.te.springcorewithanotations.interfaces.Animal;
import com.te.springcorewithanotations.interfce.imple.Godzilla;
import com.te.springcorewithanotations.interfce.imple.Gorilla;

@Configuration
public class PetConfig {

	@Bean
	public Pet getPet() {
		Pet pet = new Pet();
		pet.setName("pumkin");
		return pet;

	}

	@Bean("gor")
	public Animal getGorilla() {
		return new Gorilla();

	}

	@Bean("god")
	public Animal getGodzilla() {
		return new Godzilla();

	}

}
