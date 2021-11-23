package com.te.springcorewithanotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.te.springcorewithanotations.bean.Message;
import com.te.springcorewithanotations.config.MessageConfigPost;

public class MsgTest {
public static void main(String[] args) {
	ApplicationContext context = new AnnotationConfigApplicationContext(MessageConfigPost.class);
	
	Message bean = context.getBean("message",Message.class);
	bean.setMsg("Springcore");
	System.out.println(bean.getMsg()+ "util phase");
	
	((AbstractApplicationContext) context).close();
}
}
