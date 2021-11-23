package com.te.springcorewithanotations.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import lombok.Data;

@Data
public class Message {
	public Message() {
		System.out.println("instantition phase");
	}

	private String msg;

	@PostConstruct
	public void init() {
		this.msg = "initPhase";
		System.out.println("init phase" + this.msg);
	}

	@PreDestroy
	public void destroy() {
		System.out.println("destroy phase");
	}

}
