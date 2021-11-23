package com.te.springcorewithanotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.te.springcorewithanotations.bean.Pet;
import com.te.springcorewithanotations.config.PetConfig;

public class PetTest {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(PetConfig.class);
		
		
		Pet pet =context.getBean(Pet.class);
		
		System.out.println(pet.getName());
		pet.getAnimal().eat();
		pet.getAnimal().sound();
		pet.getAnimal().type();
	}

}
