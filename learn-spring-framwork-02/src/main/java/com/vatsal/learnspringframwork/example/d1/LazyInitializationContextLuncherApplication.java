package com.vatsal.learnspringframwork.example.d1;



import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
class ClassA{
	
}

@Component
@Lazy
class ClassB{
	private ClassA classA;
	
	public ClassB(ClassA classA) {
		System.out.println("some initialization logic");
		this.classA = classA;
	}
	
	public void doSomething() {
		System.out.println("do something");
	}
}



@Configuration
@ComponentScan
public class LazyInitializationContextLuncherApplication {
	
	public static void main(String args[]) {
		
		try(var context= new AnnotationConfigApplicationContext(LazyInitializationContextLuncherApplication.class)){
		
			System.out.println("Initialization of context is completed");
			
			context.getBean(ClassB.class).doSomething();
		
	}
		
}
}
