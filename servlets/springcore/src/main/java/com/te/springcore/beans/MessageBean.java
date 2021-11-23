package com.te.springcore.beans;

import java.io.Serializable;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MessageBean implements Serializable{

	public MessageBean() {
		System.out.println("first phase");
	}

	private String msg;
	/*
	 * @Override public void afterPropertiesSet() throws Exception {
	 * System.out.println("intializing phase 2");
	 * 
	 * }
	 * 
	 * @Override public void destroy() throws Exception {
	 * System.out.println("4th phase");
	 * 
	 * }
	 */
	//@predestroy
	//@postinit
	public void myInit() {
		System.out.println(" my initphase");
	}
	
	public void myDestroy() {
		System.out.println("my destroy method");
	}
	
	


}
