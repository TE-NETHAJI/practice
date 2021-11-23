package com.te.springcorewithanotations.postprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import com.te.springcorewithanotations.bean.Message;
import com.te.springcorewithanotations.bean.MessageBean;

public class MyBeanProcessor implements BeanPostProcessor {
	
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if(bean instanceof Message) {
			Message messageBean = (Message) bean;
			System.out.println(messageBean.getMsg()+" Before Instans");
		}
		return bean;
	}
	
	
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if(bean instanceof Message) {
			Message messageBean = (Message) bean;
			System.out.println(messageBean.getMsg()+" After Instan");
		}
		
		return bean;
	}

}
