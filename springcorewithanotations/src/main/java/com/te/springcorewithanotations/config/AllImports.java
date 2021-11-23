package com.te.springcorewithanotations.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({EmployeeConfigAurowire.class})
@ComponentScan("com.te.springcorewithanotations.beans")
public class AllImports {

}
