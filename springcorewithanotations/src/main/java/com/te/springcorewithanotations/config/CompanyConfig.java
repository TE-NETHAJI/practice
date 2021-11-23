package com.te.springcorewithanotations.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.te.springcorewithanotations.bean.Company;

@Configuration
@ComponentScan("com.te.springcorewithanotations.bean")
public class CompanyConfig {
	
	@Bean("cone")
	public Company getCompany() {

		return new Company("yahama", "RX100");

	}
	@Bean("ct")
	public Company getCompanyTwo() {
		return new Company("RE", "classic 500");

	}

}
