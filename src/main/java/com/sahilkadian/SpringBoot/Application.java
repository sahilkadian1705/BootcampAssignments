package com.sahilkadian.SpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	@Autowired
	EmployeeDao employeeDao;

	public static void main(String[] args) {
		ApplicationContext ac=SpringApplication.run(Application.class, args);
		UserProperties properties=ac.getBean(UserProperties.class);
		System.out.println(properties.getId());
		System.out.println(properties.getName());
		System.out.println(properties.getDesignation());
	}
}
