package com.spring.examples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.examples.beans.TraingleV03;

public class DrawingApplicationV03 {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("springV03.xml");
		//BeanFactory beanFactory = new ClassPathXmlApplicationContext("spring.xml");
		//Traingle traingle = (Traingle)beanFactory.getBean("traingle");
		TraingleV03 traingle = (TraingleV03)context.getBean("traingle");
		traingle.draw();
	

	
	}

}
