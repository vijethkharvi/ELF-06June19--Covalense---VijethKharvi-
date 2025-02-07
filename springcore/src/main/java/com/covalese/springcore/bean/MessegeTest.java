package com.covalese.springcore.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import lombok.extern.java.Log;

@Log
public class MessegeTest {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
		MessegeBean messageBean = (MessegeBean) applicationContext.getBean("MessegeBean");
		log.info(messageBean.getMessage());
	}

}
