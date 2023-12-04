package com.vatsal.learnspringframwork.example.f1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
class SomeClass{
	private SomeDependency someDependecy;
	
	public SomeClass(SomeDependency someDependecy) {
		super();
		this.someDependecy = someDependecy;
		System.out.println("All dependcy are ready");
	}
	
	@PostConstruct
	public void initialize() {
		someDependecy.getReady();
	}
	
	@PreDestroy
	public void cleanup(){
		System.out.println("cleanup");
	}
}

@Component
class SomeDependency{
	
	public void getReady() {
		System.out.println("some logic using some dependecy");
	}
}

@Configuration
@ComponentScan
public class PrePostannotaionContextLuncherApplication {
	
	public static void main(String args[]) {
		
		try(var context= new AnnotationConfigApplicationContext(PrePostannotaionContextLuncherApplication.class)){
	
		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
	}

}
}
