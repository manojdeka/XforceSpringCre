package com.dev.xforcespringcore.springcode;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringCore {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = 
				new ClassPathXmlApplicationContext(
						"/person.xml");
		Person p = context.getBean("person",Person.class);
		p.getJob().doJob();
		
	}
}