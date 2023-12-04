package com.vatsal.learnspringframwork.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("com.vatsal.learnspringframwork.game")
public class GamingAppLuncherApplication {
	
	public static void main(String args[]) {
		
		try(var context= new AnnotationConfigApplicationContext(GamingAppLuncherApplication.class)){
	
			context.getBean(GamingConsole.class).up();
			context.getBean(GameRunner.class).run();
		
		}
	}

}
