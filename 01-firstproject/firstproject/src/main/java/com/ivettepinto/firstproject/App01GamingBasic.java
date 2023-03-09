package com.ivettepinto.firstproject;

import com.ivettepinto.firstproject.game.GameRunner;
import com.ivettepinto.firstproject.game.PacmanGame;

public class App01GamingBasic {

	public static void main(String[] args) {
		//var game = new MarioGame();
		//var game = new SuperContraGame();
		var game = new PacmanGame();
		
		var gameRunner = new GameRunner(game);
		gameRunner.run();
	}

}
