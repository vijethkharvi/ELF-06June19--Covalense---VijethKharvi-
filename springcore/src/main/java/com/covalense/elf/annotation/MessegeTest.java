package com.covalense.springcore.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.covalese.springcore.bean.MessegeBean;

public class MessegeTest {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(MessageConfig.class);
		((ConfigurableApplicationContext) context).registerShutdownHook();

		MessegeBean messegeBean1 = context.getBean(MessegeBean.class);
		MessegeBean messegeBean2 = context.getBean(MessegeBean.class);

		System.out.println("messege 1" + messegeBean1.getMessage());
		System.out.println("messege 2" + messegeBean2.getMessage());

		messegeBean2.setMessage("hello kharvikeri");
		System.out.println("messege 1" + messegeBean1.getMessage());
		System.out.println("messege 2" + messegeBean2.getMessage());

		System.out.println(messegeBean2.getMessage());
		((ConfigurableApplicationContext) context).close();

	}

}
