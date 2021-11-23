package com.te.springcorewithanotations.config;

import org.springframework.context.annotation.Bean;

import com.te.springcorewithanotations.bean.Message;
import com.te.springcorewithanotations.postprocessor.MyBeanFactoryPP;
import com.te.springcorewithanotations.postprocessor.MyBeanProcessor;

public class MessageConfigPost {
	
	@Bean("message")
	public Message getMsg() {
		Message bean = new Message();
		bean.setMsg("hello world");
		return bean;
		
	}
	
	@Bean("msg")
	public MyBeanProcessor getMBPP() {
		return new MyBeanProcessor();
		
	}
	
	public MyBeanFactoryPP getMBFPP() {
		return new MyBeanFactoryPP();
		
	}

}
