package com.vatsal.learnspringframwork.example.h1;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vatsal.learnspringframwork.game.GameRunner;


public class XmlConfiguratoinContextLuncherApplication {
	
	public static void main(String args[]) {
		
		try(var context= new ClassPathXmlApplicationContext("contextCofiguration.xml")){
	
		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		
		System.out.println(context.getBean("name"));
		System.out.println(context.getBean("age"));
		GameRunner a = (GameRunner) context.getBean("gamerunner");
		a.run();
		
		
	
		}
		

}
}
