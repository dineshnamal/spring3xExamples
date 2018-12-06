package com.spring.examples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.examples.beans.TraingleV01;
import com.spring.examples.beans.TraingleV02;

public class DrawingApplicationV02 {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("springV02.xml");
		//BeanFactory beanFactory = new ClassPathXmlApplicationContext("spring.xml");
		//Traingle traingle = (Traingle)beanFactory.getBean("traingle");
		TraingleV02 traingle = (TraingleV02)context.getBean("traingle");
		traingle.draw();
	

	
	}

}
