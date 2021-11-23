package com.te.springcorewithanotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.te.springcorewithanotations.bean.Mobile;

public class MobileTest {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("mobileConfig.xml");
		
		Mobile bean = applicationContext.getBean(Mobile.class);
		
		System.out.println("call all the methods");
		System.out.println(bean.getMobo().getModel());
		System.out.println(bean.getMobo().getRam());
		
	}
	
	
}
