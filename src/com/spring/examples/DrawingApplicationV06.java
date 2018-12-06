package com.spring.examples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.examples.beans.TraingleV06;

public class DrawingApplicationV06 {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("springV06.xml");
	
		TraingleV06 traingle = (TraingleV06)context.getBean("traingle.name");
		traingle.draw();
	

	
	}

}
