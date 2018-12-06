package com.spring.examples;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import com.spring.examples.beans.TraingleV01;

public class DrawingApplicationV01 {

	public static void main(String[] args) {
		TraingleV01 trangle = new TraingleV01();
		BeanFactory bfDep = new XmlBeanFactory(new FileSystemResource("spring.xml")); // Implementation of Bean Factory
				                                      // Configure bean factory using XML File
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("spring.xml");
		TraingleV01 traingle = (TraingleV01)beanFactory.getBean("traingle");
		traingle.draw();

		//https://stackoverflow.com/questions/5231371/springs-xmlbeanfactory-is-deprecated
	}

}
