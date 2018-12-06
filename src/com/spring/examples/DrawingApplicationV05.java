package com.spring.examples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.examples.beans.TraingleV05;

public class DrawingApplicationV05 {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("springV05.xml");
	
		TraingleV05 traingle = (TraingleV05)context.getBean("traingle");
		traingle.draw();
	

	
	}

}
