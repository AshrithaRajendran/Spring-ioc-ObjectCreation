package com.jsp;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;


public class Driver {

	public static void main(String[] args) {
	ClassPathResource cpr=new ClassPathResource("mycore.xml");
	BeanFactory bfact=new XmlBeanFactory(cpr);
		Cat c=(Cat) bfact.getBean("myCat");
		 bfact.getBean("myBat");
//		bfact.getBean("mydog");

	
	
	
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	