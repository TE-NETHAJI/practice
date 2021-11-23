package com.te.springcorewithanotations.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.te.springcorewithanotations.bean.MoboCompany;

@Configuration
public class MoboCompanyConfig {
	
	@Bean
	public MoboCompany getMC() {
		return new MoboCompany("Oneplus 7", "android", 6, 50000.0);
		
	}

}
