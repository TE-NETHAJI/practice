package com.te.springcorewithanotations.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.te.springcorewithanotations.bean.Engine;

@Configuration
@ComponentScan("com.te.springcorewithanotations.config")
@Import({ CompanyConfig.class })
public class EngineConfig {

	@Bean("one")
	public Engine getEngine() {
		Engine engine = new Engine();
		engine.setCc(250);
		engine.setEngineType("petrol");
		engine.setRpm(650);
		return engine;
	}

	@Bean("two")
	public Engine getEngineTwo() {
		Engine engine = new Engine();
		engine.setCc(250);
		engine.setEngineType("petrol");
		engine.setRpm(650);
		return engine;
	}

}
