package com.ivettepinto.learningspringframework01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ivettepinto.learningspringframework01.game.GameRunner;
import com.ivettepinto.learningspringframework01.game.GamingConsole;
import com.ivettepinto.learningspringframework01.game.PacmanGame;

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
