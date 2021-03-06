package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.bean.CampusAddress;
import dmacc.bean.Student;


/**
 *@author roman-rggeleta@dmacc.edu
 *CIS175-Spring 2022
 *Mar 9, 2022
 */
@Configuration
public class BeanConfiguration {
	@Bean
	public Student student() {
		Student bean = new Student();
		bean.setName("Dr. Seuss");
		bean.setPhone("555-555-5555");
		bean.setMajor("Computer Sience");
		return bean;
	}
	
	@Bean
	public CampusAddress campusAddress() {
	CampusAddress bean = new CampusAddress("123 Main Street", "Des Moines", "IA");
	return bean;
	}

}
