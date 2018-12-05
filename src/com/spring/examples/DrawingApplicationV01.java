package com.spring.examples;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import com.spring.examples.beans.Traingle;

public class DrawingApplicationV01 {

	public static void main(String[] args) {
		Traingle trangle = new Traingle();
		BeanFactory bfDep = new XmlBeanFactory(new FileSystemResource("spring.xml")); // Implementation of Bean Factory
				                                      // Configure bean factory using XML File
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("spring.xml");
		Traingle traingle = (Traingle)beanFactory.getBean("traingle");
		traingle.draw();

		//https://stackoverflow.com/questions/5231371/springs-xmlbeanfactory-is-deprecated
	}

}
