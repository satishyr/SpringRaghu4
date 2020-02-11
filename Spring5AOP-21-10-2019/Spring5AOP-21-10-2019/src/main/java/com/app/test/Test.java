package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.config.AppConfig;
import com.app.service.EmployeeService;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);
		EmployeeService es=ac.getBean("employeeService",EmployeeService.class);
		
		es.getOneEmp();//b.class method
		
		
		
		
		
		
		
		
	}
}
