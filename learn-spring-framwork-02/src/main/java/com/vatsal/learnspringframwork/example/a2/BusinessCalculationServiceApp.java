package com.vatsal.learnspringframwork.example.a2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan
public class BusinessCalculationServiceApp {
	public static void main(String []args) {
		try(var context = new AnnotationConfigApplicationContext(BusinessCalculationServiceApp.class)){
			System.out.println(context.getBean(BusinessCalculationService.class).findMax());
		}
	}
}
