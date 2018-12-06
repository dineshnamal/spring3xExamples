package com.spring.examples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.examples.beans.TraingleV04;

public class DrawingApplicationV04 {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("springV04.xml");
	
		TraingleV04 traingle = (TraingleV04)context.getBean("traingle");
		traingle.draw();
	

	
	}

}
