package com.ivettepinto.firstproject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ivettepinto.firstproject.game.GameRunner;
import com.ivettepinto.firstproject.game.GamingConsole;
import com.ivettepinto.firstproject.game.PacmanGame;

@Configuration
public class GamingConfiguration {
	
	@Bean
	public GamingConsole game() {
		return new PacmanGame();
	}
	
	@Bean
	public GameRunner gameRunner(GamingConsole game) {
		return new GameRunner(game);
	}
}
