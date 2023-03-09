package com.ivettepinto.firstproject;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ivettepinto.firstproject.game.GameRunner;
import com.ivettepinto.firstproject.game.GamingConsole;

public class App03GamingSpringBeans {
	public static void main(String[] args) {
		try(var context = 
				new AnnotationConfigApplicationContext(GamingConfiguration.class)){
			context.getBean(GamingConsole.class).up();
			context.getBean(GameRunner.class).run();
		}
	}

}
