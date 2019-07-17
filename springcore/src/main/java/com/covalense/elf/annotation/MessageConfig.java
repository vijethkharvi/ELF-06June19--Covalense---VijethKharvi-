package com.covalense.springcore.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.covalese.springcore.bean.MessegeBean;

@Configuration
public class MessageConfig {
	@Bean
	@Scope("prototype")
	public MessegeBean getMessegeBean() {
		MessegeBean messegeBean = new MessegeBean();
		messegeBean.setMessage("hello Kundapura");
		return messegeBean;
	}

}
