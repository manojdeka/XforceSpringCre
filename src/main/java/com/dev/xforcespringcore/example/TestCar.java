package com.dev.xforcespringcore.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestCar {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = 
				new ClassPathXmlApplicationContext(
						"/car.xml");
		Car c = context.getBean("car",Car.class);
		c.getEngine().start();
	}

}
